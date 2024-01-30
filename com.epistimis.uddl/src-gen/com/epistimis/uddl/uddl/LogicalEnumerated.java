/**
 * generated by Xtext 2.33.0
 * Copyright (c) 2022 - 2024 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.uddl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Enumerated</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.uddl.LogicalEnumerated#getStandardReference <em>Standard Reference</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.LogicalEnumerated#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see com.epistimis.uddl.uddl.UddlPackage#getLogicalEnumerated()
 * @model
 * @generated
 */
public interface LogicalEnumerated extends LogicalEnumeratedBase
{
  /**
   * Returns the value of the '<em><b>Standard Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Standard Reference</em>' attribute.
   * @see #setStandardReference(String)
   * @see com.epistimis.uddl.uddl.UddlPackage#getLogicalEnumerated_StandardReference()
   * @model
   * @generated
   */
  String getStandardReference();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.uddl.LogicalEnumerated#getStandardReference <em>Standard Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Standard Reference</em>' attribute.
   * @see #getStandardReference()
   * @generated
   */
  void setStandardReference(String value);

  /**
   * Returns the value of the '<em><b>Label</b></em>' containment reference list.
   * The list contents are of type {@link com.epistimis.uddl.uddl.LogicalEnumeratedBase}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' containment reference list.
   * @see com.epistimis.uddl.uddl.UddlPackage#getLogicalEnumerated_Label()
   * @model containment="true"
   * @generated
   */
  EList<LogicalEnumeratedBase> getLabel();

} // LogicalEnumerated