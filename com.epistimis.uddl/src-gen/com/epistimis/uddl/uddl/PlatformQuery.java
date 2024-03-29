/**
 * generated by Xtext 2.33.0
 * Copyright (c) 2022 - 2024 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.uddl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Platform Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.uddl.PlatformQuery#getRealizes <em>Realizes</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.PlatformQuery#getSpecification <em>Specification</em>}</li>
 * </ul>
 *
 * @see com.epistimis.uddl.uddl.UddlPackage#getPlatformQuery()
 * @model
 * @generated
 */
public interface PlatformQuery extends PlatformView
{
  /**
   * Returns the value of the '<em><b>Realizes</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Realizes</em>' reference.
   * @see #setRealizes(LogicalQuery)
   * @see com.epistimis.uddl.uddl.UddlPackage#getPlatformQuery_Realizes()
   * @model
   * @generated
   */
  LogicalQuery getRealizes();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.uddl.PlatformQuery#getRealizes <em>Realizes</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Realizes</em>' reference.
   * @see #getRealizes()
   * @generated
   */
  void setRealizes(LogicalQuery value);

  /**
   * Returns the value of the '<em><b>Specification</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Specification</em>' attribute.
   * @see #setSpecification(String)
   * @see com.epistimis.uddl.uddl.UddlPackage#getPlatformQuery_Specification()
   * @model
   * @generated
   */
  String getSpecification();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.uddl.PlatformQuery#getSpecification <em>Specification</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Specification</em>' attribute.
   * @see #getSpecification()
   * @generated
   */
  void setSpecification(String value);

} // PlatformQuery
