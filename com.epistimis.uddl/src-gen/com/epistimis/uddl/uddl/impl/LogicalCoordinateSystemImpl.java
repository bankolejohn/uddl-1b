/**
 * generated by Xtext 2.33.0
 * Copyright (c) 2022 - 2024 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.uddl.impl;

import com.epistimis.uddl.uddl.LogicalCoordinateSystem;
import com.epistimis.uddl.uddl.LogicalCoordinateSystemAxis;
import com.epistimis.uddl.uddl.UddlPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Coordinate System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.uddl.impl.LogicalCoordinateSystemImpl#getAxisRelationshipDescription <em>Axis Relationship Description</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.impl.LogicalCoordinateSystemImpl#getAngleEquation <em>Angle Equation</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.impl.LogicalCoordinateSystemImpl#getDistanceEquation <em>Distance Equation</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.impl.LogicalCoordinateSystemImpl#getAxis <em>Axis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicalCoordinateSystemImpl extends LogicalElementImpl implements LogicalCoordinateSystem
{
  /**
   * The default value of the '{@link #getAxisRelationshipDescription() <em>Axis Relationship Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAxisRelationshipDescription()
   * @generated
   * @ordered
   */
  protected static final String AXIS_RELATIONSHIP_DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAxisRelationshipDescription() <em>Axis Relationship Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAxisRelationshipDescription()
   * @generated
   * @ordered
   */
  protected String axisRelationshipDescription = AXIS_RELATIONSHIP_DESCRIPTION_EDEFAULT;

  /**
   * The default value of the '{@link #getAngleEquation() <em>Angle Equation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAngleEquation()
   * @generated
   * @ordered
   */
  protected static final String ANGLE_EQUATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAngleEquation() <em>Angle Equation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAngleEquation()
   * @generated
   * @ordered
   */
  protected String angleEquation = ANGLE_EQUATION_EDEFAULT;

  /**
   * The default value of the '{@link #getDistanceEquation() <em>Distance Equation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDistanceEquation()
   * @generated
   * @ordered
   */
  protected static final String DISTANCE_EQUATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDistanceEquation() <em>Distance Equation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDistanceEquation()
   * @generated
   * @ordered
   */
  protected String distanceEquation = DISTANCE_EQUATION_EDEFAULT;

  /**
   * The cached value of the '{@link #getAxis() <em>Axis</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAxis()
   * @generated
   * @ordered
   */
  protected EList<LogicalCoordinateSystemAxis> axis;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LogicalCoordinateSystemImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return UddlPackage.Literals.LOGICAL_COORDINATE_SYSTEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getAxisRelationshipDescription()
  {
    return axisRelationshipDescription;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAxisRelationshipDescription(String newAxisRelationshipDescription)
  {
    String oldAxisRelationshipDescription = axisRelationshipDescription;
    axisRelationshipDescription = newAxisRelationshipDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UddlPackage.LOGICAL_COORDINATE_SYSTEM__AXIS_RELATIONSHIP_DESCRIPTION, oldAxisRelationshipDescription, axisRelationshipDescription));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getAngleEquation()
  {
    return angleEquation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAngleEquation(String newAngleEquation)
  {
    String oldAngleEquation = angleEquation;
    angleEquation = newAngleEquation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UddlPackage.LOGICAL_COORDINATE_SYSTEM__ANGLE_EQUATION, oldAngleEquation, angleEquation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDistanceEquation()
  {
    return distanceEquation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDistanceEquation(String newDistanceEquation)
  {
    String oldDistanceEquation = distanceEquation;
    distanceEquation = newDistanceEquation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UddlPackage.LOGICAL_COORDINATE_SYSTEM__DISTANCE_EQUATION, oldDistanceEquation, distanceEquation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<LogicalCoordinateSystemAxis> getAxis()
  {
    if (axis == null)
    {
      axis = new EObjectResolvingEList<LogicalCoordinateSystemAxis>(LogicalCoordinateSystemAxis.class, this, UddlPackage.LOGICAL_COORDINATE_SYSTEM__AXIS);
    }
    return axis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case UddlPackage.LOGICAL_COORDINATE_SYSTEM__AXIS_RELATIONSHIP_DESCRIPTION:
        return getAxisRelationshipDescription();
      case UddlPackage.LOGICAL_COORDINATE_SYSTEM__ANGLE_EQUATION:
        return getAngleEquation();
      case UddlPackage.LOGICAL_COORDINATE_SYSTEM__DISTANCE_EQUATION:
        return getDistanceEquation();
      case UddlPackage.LOGICAL_COORDINATE_SYSTEM__AXIS:
        return getAxis();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case UddlPackage.LOGICAL_COORDINATE_SYSTEM__AXIS_RELATIONSHIP_DESCRIPTION:
        setAxisRelationshipDescription((String)newValue);
        return;
      case UddlPackage.LOGICAL_COORDINATE_SYSTEM__ANGLE_EQUATION:
        setAngleEquation((String)newValue);
        return;
      case UddlPackage.LOGICAL_COORDINATE_SYSTEM__DISTANCE_EQUATION:
        setDistanceEquation((String)newValue);
        return;
      case UddlPackage.LOGICAL_COORDINATE_SYSTEM__AXIS:
        getAxis().clear();
        getAxis().addAll((Collection<? extends LogicalCoordinateSystemAxis>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case UddlPackage.LOGICAL_COORDINATE_SYSTEM__AXIS_RELATIONSHIP_DESCRIPTION:
        setAxisRelationshipDescription(AXIS_RELATIONSHIP_DESCRIPTION_EDEFAULT);
        return;
      case UddlPackage.LOGICAL_COORDINATE_SYSTEM__ANGLE_EQUATION:
        setAngleEquation(ANGLE_EQUATION_EDEFAULT);
        return;
      case UddlPackage.LOGICAL_COORDINATE_SYSTEM__DISTANCE_EQUATION:
        setDistanceEquation(DISTANCE_EQUATION_EDEFAULT);
        return;
      case UddlPackage.LOGICAL_COORDINATE_SYSTEM__AXIS:
        getAxis().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case UddlPackage.LOGICAL_COORDINATE_SYSTEM__AXIS_RELATIONSHIP_DESCRIPTION:
        return AXIS_RELATIONSHIP_DESCRIPTION_EDEFAULT == null ? axisRelationshipDescription != null : !AXIS_RELATIONSHIP_DESCRIPTION_EDEFAULT.equals(axisRelationshipDescription);
      case UddlPackage.LOGICAL_COORDINATE_SYSTEM__ANGLE_EQUATION:
        return ANGLE_EQUATION_EDEFAULT == null ? angleEquation != null : !ANGLE_EQUATION_EDEFAULT.equals(angleEquation);
      case UddlPackage.LOGICAL_COORDINATE_SYSTEM__DISTANCE_EQUATION:
        return DISTANCE_EQUATION_EDEFAULT == null ? distanceEquation != null : !DISTANCE_EQUATION_EDEFAULT.equals(distanceEquation);
      case UddlPackage.LOGICAL_COORDINATE_SYSTEM__AXIS:
        return axis != null && !axis.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (axisRelationshipDescription: ");
    result.append(axisRelationshipDescription);
    result.append(", angleEquation: ");
    result.append(angleEquation);
    result.append(", distanceEquation: ");
    result.append(distanceEquation);
    result.append(')');
    return result.toString();
  }

} //LogicalCoordinateSystemImpl
