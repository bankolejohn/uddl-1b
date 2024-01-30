/**
 * generated by Xtext 2.33.0
 * Copyright (c) 2022 - 2024 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.uddl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.uddl.LogicalEntity#getSpecializes <em>Specializes</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.LogicalEntity#getRealizes <em>Realizes</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.LogicalEntity#getComposition <em>Composition</em>}</li>
 * </ul>
 *
 * @see com.epistimis.uddl.uddl.UddlPackage#getLogicalEntity()
 * @model
 * @generated
 */
public interface LogicalEntity extends LogicalComposableElement
{
  /**
   * Returns the value of the '<em><b>Specializes</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Specializes</em>' reference.
   * @see #setSpecializes(LogicalEntity)
   * @see com.epistimis.uddl.uddl.UddlPackage#getLogicalEntity_Specializes()
   * @model
   * @generated
   */
  LogicalEntity getSpecializes();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.uddl.LogicalEntity#getSpecializes <em>Specializes</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Specializes</em>' reference.
   * @see #getSpecializes()
   * @generated
   */
  void setSpecializes(LogicalEntity value);

  /**
   * Returns the value of the '<em><b>Realizes</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Realizes</em>' reference.
   * @see #setRealizes(ConceptualEntity)
   * @see com.epistimis.uddl.uddl.UddlPackage#getLogicalEntity_Realizes()
   * @model
   * @generated
   */
  ConceptualEntity getRealizes();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.uddl.LogicalEntity#getRealizes <em>Realizes</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Realizes</em>' reference.
   * @see #getRealizes()
   * @generated
   */
  void setRealizes(ConceptualEntity value);

  /**
   * Returns the value of the '<em><b>Composition</b></em>' containment reference list.
   * The list contents are of type {@link com.epistimis.uddl.uddl.LogicalComposition}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Composition</em>' containment reference list.
   * @see com.epistimis.uddl.uddl.UddlPackage#getLogicalEntity_Composition()
   * @model containment="true"
   * @generated
   */
  EList<LogicalComposition> getComposition();

} // LogicalEntity
