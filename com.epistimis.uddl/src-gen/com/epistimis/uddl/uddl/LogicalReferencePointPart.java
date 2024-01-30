/**
 * generated by Xtext 2.33.0
 * Copyright (c) 2022 - 2024 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.uddl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Reference Point Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.uddl.LogicalReferencePointPart#getAxis <em>Axis</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.LogicalReferencePointPart#getValue <em>Value</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.LogicalReferencePointPart#getValueTypeUnit <em>Value Type Unit</em>}</li>
 * </ul>
 *
 * @see com.epistimis.uddl.uddl.UddlPackage#getLogicalReferencePointPart()
 * @model
 * @generated
 */
public interface LogicalReferencePointPart extends EObject
{
  /**
   * Returns the value of the '<em><b>Axis</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Axis</em>' reference.
   * @see #setAxis(LogicalMeasurementSystemAxis)
   * @see com.epistimis.uddl.uddl.UddlPackage#getLogicalReferencePointPart_Axis()
   * @model
   * @generated
   */
  LogicalMeasurementSystemAxis getAxis();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.uddl.LogicalReferencePointPart#getAxis <em>Axis</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Axis</em>' reference.
   * @see #getAxis()
   * @generated
   */
  void setAxis(LogicalMeasurementSystemAxis value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see com.epistimis.uddl.uddl.UddlPackage#getLogicalReferencePointPart_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.uddl.LogicalReferencePointPart#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>Value Type Unit</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Type Unit</em>' reference.
   * @see #setValueTypeUnit(LogicalValueTypeUnit)
   * @see com.epistimis.uddl.uddl.UddlPackage#getLogicalReferencePointPart_ValueTypeUnit()
   * @model
   * @generated
   */
  LogicalValueTypeUnit getValueTypeUnit();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.uddl.LogicalReferencePointPart#getValueTypeUnit <em>Value Type Unit</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Type Unit</em>' reference.
   * @see #getValueTypeUnit()
   * @generated
   */
  void setValueTypeUnit(LogicalValueTypeUnit value);

} // LogicalReferencePointPart