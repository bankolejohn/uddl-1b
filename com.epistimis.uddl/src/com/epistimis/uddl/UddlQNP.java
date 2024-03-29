package com.epistimis.uddl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
//import org.eclipse.xtext.xbase.scoping.XbaseQualifiedNameProvider;

import com.epistimis.uddl.uddl.ConceptualCharacteristic;
import com.epistimis.uddl.uddl.ConceptualCompositeQuery;
import com.epistimis.uddl.uddl.ConceptualEntity;
import com.epistimis.uddl.uddl.ConceptualQueryComposition;
import com.epistimis.uddl.uddl.LogicalCharacteristic;
import com.epistimis.uddl.uddl.LogicalCompositeQuery;
import com.epistimis.uddl.uddl.LogicalEntity;
import com.epistimis.uddl.uddl.LogicalMeasurement;
import com.epistimis.uddl.uddl.LogicalMeasurementAttribute;
import com.epistimis.uddl.uddl.LogicalQueryComposition;
import com.epistimis.uddl.uddl.PlatformCharacteristic;
import com.epistimis.uddl.uddl.PlatformCompositeQuery;
import com.epistimis.uddl.uddl.PlatformEntity;
import com.epistimis.uddl.uddl.PlatformQueryComposition;
import com.epistimis.uddl.uddl.PlatformStruct;
import com.epistimis.uddl.uddl.PlatformStructMember;
import com.google.inject.Inject;

public class UddlQNP  extends  DefaultDeclarativeQualifiedNameProvider  { // XbaseQualifiedNameProvider
	
	// Because the base class one is private
	@Inject
	protected IQualifiedNameConverter converter = new IQualifiedNameConverter.DefaultImpl();
	
	/**
	 * Determine the QualifiedName of obj relative to ctx
	 * @param obj
	 * @param ctx
	 * @return
	 */
	public <T extends EObject,U extends EObject> QualifiedName relativeQualifiedName(T obj, U ctx) {
		QualifiedName oName = getFullyQualifiedName(obj);
		QualifiedName ctxName = getFullyQualifiedName(ctx);
		
		int maxSegsToCompare = Math.min(oName.getSegmentCount(), ctxName.getSegmentCount());
		int skipSegs = -1;
		for (int i = 0; i < maxSegsToCompare; i++) {
			if (!oName.getSegment(i).equals(ctxName.getSegment(i))) {
				skipSegs = i;
				break;
			}
		}
		if (skipSegs > 0) {
			// Return only the name back to the common ancestor 
			return oName.skipFirst(skipSegs);
		} else {
			return oName;
		}
	}

	/**
	 * Return the QN of the object, potentially shortened by the specified prefix
	 * @param obj the object whose QN is to be returned. If the prefix matches the entire
	 * name, then return only the last segment. If the prefix ends with a wildcard,
	 * then match all prior segments.
	 * @param qnPrefix a prefix that may match part of the name of this object
	 * @return A Qualified name
	 */
	public QualifiedName minimalQualifiedName(EObject obj, String qnPrefix) {
		QualifiedName oName = getFullyQualifiedName(obj);
		String prefix2use = qnPrefix;
		if (qnPrefix.lastIndexOf('*') == qnPrefix.length()-1) {
			prefix2use = qnPrefix.substring(0,qnPrefix.length()-2);
		}
		QualifiedName testQN = converter.toQualifiedName(prefix2use);
		
		int ndx = 0;
		for (String seg: testQN.getSegments()) {
			// If there is a match failure at any point, return the entire oName
			if (!oName.getSegment(ndx).equals(seg)) {
				return oName;
			}
			ndx+=1;
		}
		// If we get here, we matched all the testQN segments.
		int testSegCnt = testQN.getSegmentCount();
		if (oName.getSegmentCount() == testSegCnt) {
			testSegCnt--; // reduce count by 1 so we return the last segment
		}
		return oName.skipFirst(testSegCnt);
		
	}

	/**
	 * Do these two QNs have a sequence of matching segments?
	 * @param aqn The first QualifiedName
	 * @param bqn The second QualifiedName
	 * @return true if the shorter of the two names completely matches a sequence of segments
	 * somewhere in the longer QN.  Note that the ignored segments in the longer QN could be
	 * at the beginning, at the end, or some of both.
	 */
	public boolean partialMatch(QualifiedName aqn, QualifiedName bqn) {
		if (aqn == null || bqn == null) {
			// For some reason this didn't resolve properly? In any case, it can't match
			return false;
		}
		int diff = aqn.getSegmentCount() - bqn.getSegmentCount();
		QualifiedName longer = aqn;
		QualifiedName shorter = bqn;
		if (diff < 0) {
			// swap the QNs
			longer = bqn;
			shorter = aqn;
			diff = -diff; 
		}
		if (diff >= 0) {
			// The test name may be an RQN - so skip as needed on the aqn - but it could also be that the 
			// test name is higher in the taxonomy - or both
			boolean found = false;
			int i = 0;
			// exit the loop if we find it or if we are done with the count
			while (!found && ( i < diff)) {
				if (longer.getSegment(i).equalsIgnoreCase(shorter.getFirstSegment())) {
					boolean partialFind = true;
					// We've found the start - keep going with the rest
					for (int j = i+1; j < shorter.getSegmentCount(); j++) {
						if (!longer.getSegment(j).equalsIgnoreCase(shorter.getSegment(j-i))) {
							partialFind = false;
							break;
						}
					}
					found = partialFind;
				}
				i++;
			}
			return found;
		} else {
			return false; // it can't possibly match
		}
	
	}

	/* Conceptual */
	public  QualifiedName qualifiedName(ConceptualCharacteristic obj) {
		ConceptualEntity ce = (ConceptualEntity) obj.eContainer();

		return getFullyQualifiedName(ce).append(obj.getRolename());	
	}

	public  QualifiedName qualifiedName(ConceptualQueryComposition obj) {
		ConceptualCompositeQuery ce = (ConceptualCompositeQuery) obj.eContainer();
		return getFullyQualifiedName(ce).append(obj.getRolename());	
	}
	
	/* Logical */
	public  QualifiedName qualifiedName(LogicalCharacteristic obj) {
		LogicalEntity ce = (LogicalEntity) obj.eContainer();
		return getFullyQualifiedName(ce).append(obj.getRolename());	
	}

	public  QualifiedName qualifiedName(LogicalMeasurementAttribute obj) {
		LogicalMeasurement ce = (LogicalMeasurement) obj.eContainer();
		return getFullyQualifiedName(ce).append(obj.getRolename());	
	}

	public  QualifiedName qualifiedName(LogicalQueryComposition obj) {
		LogicalCompositeQuery ce = (LogicalCompositeQuery) obj.eContainer();
		return getFullyQualifiedName(ce).append(obj.getRolename());	
	}
		
	/* Platform */
	public  QualifiedName qualifiedName(PlatformCharacteristic obj) {
		PlatformEntity ce = (PlatformEntity) obj.eContainer();
		return getFullyQualifiedName(ce).append(obj.getRolename());	
	}
	
	public  QualifiedName qualifiedName(PlatformQueryComposition obj) {
		PlatformCompositeQuery ce = (PlatformCompositeQuery) obj.eContainer();
		return getFullyQualifiedName(ce).append(obj.getRolename());	
	}

	public  QualifiedName qualifiedName(PlatformStructMember obj) {
		PlatformStruct ce = (PlatformStruct) obj.eContainer();
		return getFullyQualifiedName(ce).append(obj.getRolename());	
//		return QualifiedName.create(ce.getName(),obj.getRolename());		
	}
	

}
