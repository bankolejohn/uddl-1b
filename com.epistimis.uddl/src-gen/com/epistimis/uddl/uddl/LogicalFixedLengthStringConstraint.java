/**
 * generated by Xtext 2.33.0
 * Copyright (c) 2022 - 2024 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.uddl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Fixed Length String Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.uddl.LogicalFixedLengthStringConstraint#getLength <em>Length</em>}</li>
 * </ul>
 *
 * @see com.epistimis.uddl.uddl.UddlPackage#getLogicalFixedLengthStringConstraint()
 * @model
 * @generated
 */
public interface LogicalFixedLengthStringConstraint extends LogicalStringConstraint
{
  /**
   * Returns the value of the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Length</em>' attribute.
   * @see #setLength(int)
   * @see com.epistimis.uddl.uddl.UddlPackage#getLogicalFixedLengthStringConstraint_Length()
   * @model
   * @generated
   */
  int getLength();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.uddl.LogicalFixedLengthStringConstraint#getLength <em>Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Length</em>' attribute.
   * @see #getLength()
   * @generated
   */
  void setLength(int value);

} // LogicalFixedLengthStringConstraint
