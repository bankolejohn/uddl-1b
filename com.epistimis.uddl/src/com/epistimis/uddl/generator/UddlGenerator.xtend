/*
 * generated by Xtext 2.33.0
 */
/*
 * Copyright (c) 2022 - 2024 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.generator

import com.epistimis.uddl.uddl.PlatformAssociation
import com.epistimis.uddl.uddl.PlatformComposableElement
import com.epistimis.uddl.uddl.PlatformDataType
import com.epistimis.uddl.uddl.PlatformEntity
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import com.epistimis.uddl.RealizedAssociation
import com.epistimis.uddl.RealizedDataType
import com.epistimis.uddl.RealizedEntity
import com.epistimis.uddl.RealizedComposableElement
import org.apache.log4j.Logger
import java.lang.invoke.MethodHandles

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class UddlGenerator extends AbstractGenerator {

	static Logger logger = Logger.getLogger(MethodHandles.lookup().lookupClass());

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {

		/**
		 * The first version of the generator will work directly from PlatformEntity - without queries. This will only collect all the realization
		 * info from a PlatformEntity -> LogicalEntity -> ConceptualEntity to determine what to generate.
		 */
		val elements = resource.allContents.toIterable.filter(PlatformComposableElement);

		/**
		 * Collect, for each pentity, all the realization info for each PlatformComposition it contains
		 * The focus here is identifying exactly what has been down-selected and what hasn't. 
		 */
		for (PlatformComposableElement elem : elements) {
			/**
			 * Some of these will be PlatformParticipants
			 */
			if (elem instanceof PlatformAssociation) {
				new RealizedAssociation(elem);
			} else if (elem instanceof PlatformDataType) {
				new RealizedDataType(elem);
			} else if (elem instanceof PlatformEntity) {
				new RealizedEntity(elem);
			} else {
				logger.warn("No processing available for type " + elem.class.toString);
			}
		}
		/**
		 * Now go back and link all the PlatformEntity types
		 * 
		 */
		RealizedComposableElement.linkTypes();

		/**
		 * 
		 * For now we do IDL and Protobuf and SQL at the structure level because, at this level, there 
		 * is no indication which language a software component will be generated in.
		 */
		try {
			val gen2 = new ProtobufDataStructureGenerator(RealizedComposableElement.allComposableElements);
			gen2.doGenerate(resource, fsa, context);
		}
		catch (Exception excp) {
			logger.error("Protobuf exception: " + excp.localizedMessage,excp); //(excp.stackTrace);
		}
		try {
			val gen1 = new IDLDataStructureGenerator(RealizedComposableElement.allComposableElements);
			gen1.doGenerate(resource, fsa, context);			
		}
		catch (Exception excp) {
			logger.error("IDL exception: " + excp.localizedMessage,excp); //(excp.stackTrace);
		}
		try {
			val gen3 = new RDBMSDataStructureGenerator(RealizedComposableElement.allComposableElements);
			gen3.doGenerate(resource, fsa, context);
		}
		catch (Exception excp) {
			logger.error("RDBMS exception: " + excp.localizedMessage,excp); //(excp.stackTrace);
		}



	/**
	 * Generating code from UDDL means generating data structures. To generate data structures we need to process both the UDDL and
	 * any queries/templates used.
	 * 
	 * To process a query, we must first parse the query string (from a C/L/P Query specification).
	 * 1) Identify all the SelectedEntity in the QueryStatement.  From those, identify the Entities referenced and map those to instances
	 * in the model. Note that we have to use scoping rules to find entities, working outward from where the Query was located in the model.
	 * 2) Once we've identified those instances, we have to map all the Characteristics in each of those referenced Entities. Those Characteristics
	 * may eventually be aliased in a Select, so leave room for that. Determine the cardinality of each of the Characteristics
	 * 3) Review the  ProjectedCharacteristicExpressions. SelectedEntityCharacteristicWildcardReference just pick up every characteristic from the specified Entity.
	 * ExplicitSelectedEntityCharacteristicReference picks up the specified characteristics. If they get an alias, set the alias, otherwise set the alias
	 * to the characteristic name. Note also that if there is no qualifying type, then there should only be 1 characteristic with that name (otherwise
	 * its an error). Find the correct characteristic - there should be exactly 1.
	 * 4) Review all the JoinExpressions - create mappings between the Entities based on these - and set the cardinality on each end of that mapping.
	 * Those cardinalities will be used to determine the ultimate cardinality of the resulting data structure. Joins are done via characteristic alias.
	 * The direction of the cardinality is based on which side uses a characteristic vs. a type. Characteristic to characteristic is also possible.
	 * We start with the SELECT
	 */
//	 val dataModels = resource.allContents.toIterable.filter(DataModel)
//	 val views = resource.allContents.toIterable.filter(ConceptualView)
//	 //SelectedEntities will be in the resource created from the query contents
//	 val selectedEntities = resource.allContents.toIterable.filter(SelectedEntity);
//	 		for (SelectedEntity entity: selectedEntities) {
//				// Need to find all the Entities that could be
//
//	 		}
	}
}
