/**
 * generated by Xtext 2.33.0
 * Copyright (c) 2022 - 2024 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.uddl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Conversion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.uddl.LogicalConversion#getSource <em>Source</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.LogicalConversion#getDestination <em>Destination</em>}</li>
 * </ul>
 *
 * @see com.epistimis.uddl.uddl.UddlPackage#getLogicalConversion()
 * @model
 * @generated
 */
public interface LogicalConversion extends LogicalElement
{
  /**
   * Returns the value of the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference.
   * @see #setSource(LogicalUnit)
   * @see com.epistimis.uddl.uddl.UddlPackage#getLogicalConversion_Source()
   * @model
   * @generated
   */
  LogicalUnit getSource();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.uddl.LogicalConversion#getSource <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' reference.
   * @see #getSource()
   * @generated
   */
  void setSource(LogicalUnit value);

  /**
   * Returns the value of the '<em><b>Destination</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Destination</em>' reference.
   * @see #setDestination(LogicalUnit)
   * @see com.epistimis.uddl.uddl.UddlPackage#getLogicalConversion_Destination()
   * @model
   * @generated
   */
  LogicalUnit getDestination();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.uddl.LogicalConversion#getDestination <em>Destination</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Destination</em>' reference.
   * @see #getDestination()
   * @generated
   */
  void setDestination(LogicalUnit value);

} // LogicalConversion
