/**
 * generated by Xtext 2.33.0
 * Copyright (c) 2022 - 2024 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.uddl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Platform Struct</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.uddl.PlatformStruct#getMember <em>Member</em>}</li>
 * </ul>
 *
 * @see com.epistimis.uddl.uddl.UddlPackage#getPlatformStruct()
 * @model
 * @generated
 */
public interface PlatformStruct extends PlatformDataType
{
  /**
   * Returns the value of the '<em><b>Member</b></em>' containment reference list.
   * The list contents are of type {@link com.epistimis.uddl.uddl.PlatformStructMember}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Member</em>' containment reference list.
   * @see com.epistimis.uddl.uddl.UddlPackage#getPlatformStruct_Member()
   * @model containment="true"
   * @generated
   */
  EList<PlatformStructMember> getMember();

} // PlatformStruct
