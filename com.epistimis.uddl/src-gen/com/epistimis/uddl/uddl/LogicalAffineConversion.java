/**
 * generated by Xtext 2.33.0
 * Copyright (c) 2022 - 2024 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.uddl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Affine Conversion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.uddl.LogicalAffineConversion#getConversionFactor <em>Conversion Factor</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.LogicalAffineConversion#getOffset <em>Offset</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.LogicalAffineConversion#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see com.epistimis.uddl.uddl.UddlPackage#getLogicalAffineConversion()
 * @model
 * @generated
 */
public interface LogicalAffineConversion extends LogicalConversion
{
  /**
   * Returns the value of the '<em><b>Conversion Factor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conversion Factor</em>' attribute.
   * @see #setConversionFactor(float)
   * @see com.epistimis.uddl.uddl.UddlPackage#getLogicalAffineConversion_ConversionFactor()
   * @model
   * @generated
   */
  float getConversionFactor();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.uddl.LogicalAffineConversion#getConversionFactor <em>Conversion Factor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Conversion Factor</em>' attribute.
   * @see #getConversionFactor()
   * @generated
   */
  void setConversionFactor(float value);

  /**
   * Returns the value of the '<em><b>Offset</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Offset</em>' attribute.
   * @see #setOffset(float)
   * @see com.epistimis.uddl.uddl.UddlPackage#getLogicalAffineConversion_Offset()
   * @model
   * @generated
   */
  float getOffset();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.uddl.LogicalAffineConversion#getOffset <em>Offset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Offset</em>' attribute.
   * @see #getOffset()
   * @generated
   */
  void setOffset(float value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(LogicalUnit)
   * @see com.epistimis.uddl.uddl.UddlPackage#getLogicalAffineConversion_Target()
   * @model
   * @generated
   */
  LogicalUnit getTarget();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.uddl.LogicalAffineConversion#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(LogicalUnit value);

} // LogicalAffineConversion
