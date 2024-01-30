/**
 * generated by Xtext 2.33.0
 * Copyright (c) 2022 - 2024 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.uddl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Platform Composite Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.uddl.PlatformCompositeQuery#getRealizes <em>Realizes</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.PlatformCompositeQuery#isIsUnion <em>Is Union</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.PlatformCompositeQuery#getComposition <em>Composition</em>}</li>
 * </ul>
 *
 * @see com.epistimis.uddl.uddl.UddlPackage#getPlatformCompositeQuery()
 * @model
 * @generated
 */
public interface PlatformCompositeQuery extends PlatformView
{
  /**
   * Returns the value of the '<em><b>Realizes</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Realizes</em>' reference.
   * @see #setRealizes(LogicalCompositeQuery)
   * @see com.epistimis.uddl.uddl.UddlPackage#getPlatformCompositeQuery_Realizes()
   * @model
   * @generated
   */
  LogicalCompositeQuery getRealizes();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.uddl.PlatformCompositeQuery#getRealizes <em>Realizes</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Realizes</em>' reference.
   * @see #getRealizes()
   * @generated
   */
  void setRealizes(LogicalCompositeQuery value);

  /**
   * Returns the value of the '<em><b>Is Union</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Union</em>' attribute.
   * @see #setIsUnion(boolean)
   * @see com.epistimis.uddl.uddl.UddlPackage#getPlatformCompositeQuery_IsUnion()
   * @model
   * @generated
   */
  boolean isIsUnion();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.uddl.PlatformCompositeQuery#isIsUnion <em>Is Union</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Union</em>' attribute.
   * @see #isIsUnion()
   * @generated
   */
  void setIsUnion(boolean value);

  /**
   * Returns the value of the '<em><b>Composition</b></em>' containment reference list.
   * The list contents are of type {@link com.epistimis.uddl.uddl.PlatformQueryComposition}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Composition</em>' containment reference list.
   * @see com.epistimis.uddl.uddl.UddlPackage#getPlatformCompositeQuery_Composition()
   * @model containment="true"
   * @generated
   */
  EList<PlatformQueryComposition> getComposition();

} // PlatformCompositeQuery