/**
 * generated by Xtext 2.33.0
 * Copyright (c) 2022 - 2024 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.uddl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Platform Characteristic Path Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.uddl.PlatformCharacteristicPathNode#getProjectedCharacteristic <em>Projected Characteristic</em>}</li>
 * </ul>
 *
 * @see com.epistimis.uddl.uddl.UddlPackage#getPlatformCharacteristicPathNode()
 * @model
 * @generated
 */
public interface PlatformCharacteristicPathNode extends PlatformPathNode
{
  /**
   * Returns the value of the '<em><b>Projected Characteristic</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Projected Characteristic</em>' reference.
   * @see #setProjectedCharacteristic(PlatformCharacteristic)
   * @see com.epistimis.uddl.uddl.UddlPackage#getPlatformCharacteristicPathNode_ProjectedCharacteristic()
   * @model
   * @generated
   */
  PlatformCharacteristic getProjectedCharacteristic();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.uddl.PlatformCharacteristicPathNode#getProjectedCharacteristic <em>Projected Characteristic</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Projected Characteristic</em>' reference.
   * @see #getProjectedCharacteristic()
   * @generated
   */
  void setProjectedCharacteristic(PlatformCharacteristic value);

} // PlatformCharacteristicPathNode
