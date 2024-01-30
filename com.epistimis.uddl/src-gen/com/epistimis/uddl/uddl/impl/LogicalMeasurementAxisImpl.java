/**
 * generated by Xtext 2.33.0
 * Copyright (c) 2022 - 2024 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.uddl.impl;

import com.epistimis.uddl.uddl.ConceptualObservable;
import com.epistimis.uddl.uddl.LogicalMeasurementAxis;
import com.epistimis.uddl.uddl.LogicalMeasurementConstraint;
import com.epistimis.uddl.uddl.LogicalMeasurementSystemAxis;
import com.epistimis.uddl.uddl.LogicalValueTypeUnit;
import com.epistimis.uddl.uddl.UddlPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Measurement Axis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.uddl.impl.LogicalMeasurementAxisImpl#getRealizes <em>Realizes</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.impl.LogicalMeasurementAxisImpl#getMeasurementSystemAxis <em>Measurement System Axis</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.impl.LogicalMeasurementAxisImpl#getValueTypeUnit <em>Value Type Unit</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.impl.LogicalMeasurementAxisImpl#getConstraint <em>Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicalMeasurementAxisImpl extends LogicalElementImpl implements LogicalMeasurementAxis
{
  /**
   * The cached value of the '{@link #getRealizes() <em>Realizes</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRealizes()
   * @generated
   * @ordered
   */
  protected ConceptualObservable realizes;

  /**
   * The cached value of the '{@link #getMeasurementSystemAxis() <em>Measurement System Axis</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMeasurementSystemAxis()
   * @generated
   * @ordered
   */
  protected LogicalMeasurementSystemAxis measurementSystemAxis;

  /**
   * The cached value of the '{@link #getValueTypeUnit() <em>Value Type Unit</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueTypeUnit()
   * @generated
   * @ordered
   */
  protected EList<LogicalValueTypeUnit> valueTypeUnit;

  /**
   * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraint()
   * @generated
   * @ordered
   */
  protected EList<LogicalMeasurementConstraint> constraint;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LogicalMeasurementAxisImpl()
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
    return UddlPackage.Literals.LOGICAL_MEASUREMENT_AXIS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ConceptualObservable getRealizes()
  {
    if (realizes != null && realizes.eIsProxy())
    {
      InternalEObject oldRealizes = (InternalEObject)realizes;
      realizes = (ConceptualObservable)eResolveProxy(oldRealizes);
      if (realizes != oldRealizes)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, UddlPackage.LOGICAL_MEASUREMENT_AXIS__REALIZES, oldRealizes, realizes));
      }
    }
    return realizes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConceptualObservable basicGetRealizes()
  {
    return realizes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRealizes(ConceptualObservable newRealizes)
  {
    ConceptualObservable oldRealizes = realizes;
    realizes = newRealizes;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UddlPackage.LOGICAL_MEASUREMENT_AXIS__REALIZES, oldRealizes, realizes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LogicalMeasurementSystemAxis getMeasurementSystemAxis()
  {
    if (measurementSystemAxis != null && measurementSystemAxis.eIsProxy())
    {
      InternalEObject oldMeasurementSystemAxis = (InternalEObject)measurementSystemAxis;
      measurementSystemAxis = (LogicalMeasurementSystemAxis)eResolveProxy(oldMeasurementSystemAxis);
      if (measurementSystemAxis != oldMeasurementSystemAxis)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, UddlPackage.LOGICAL_MEASUREMENT_AXIS__MEASUREMENT_SYSTEM_AXIS, oldMeasurementSystemAxis, measurementSystemAxis));
      }
    }
    return measurementSystemAxis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicalMeasurementSystemAxis basicGetMeasurementSystemAxis()
  {
    return measurementSystemAxis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMeasurementSystemAxis(LogicalMeasurementSystemAxis newMeasurementSystemAxis)
  {
    LogicalMeasurementSystemAxis oldMeasurementSystemAxis = measurementSystemAxis;
    measurementSystemAxis = newMeasurementSystemAxis;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UddlPackage.LOGICAL_MEASUREMENT_AXIS__MEASUREMENT_SYSTEM_AXIS, oldMeasurementSystemAxis, measurementSystemAxis));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<LogicalValueTypeUnit> getValueTypeUnit()
  {
    if (valueTypeUnit == null)
    {
      valueTypeUnit = new EObjectResolvingEList<LogicalValueTypeUnit>(LogicalValueTypeUnit.class, this, UddlPackage.LOGICAL_MEASUREMENT_AXIS__VALUE_TYPE_UNIT);
    }
    return valueTypeUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<LogicalMeasurementConstraint> getConstraint()
  {
    if (constraint == null)
    {
      constraint = new EObjectContainmentEList<LogicalMeasurementConstraint>(LogicalMeasurementConstraint.class, this, UddlPackage.LOGICAL_MEASUREMENT_AXIS__CONSTRAINT);
    }
    return constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case UddlPackage.LOGICAL_MEASUREMENT_AXIS__CONSTRAINT:
        return ((InternalEList<?>)getConstraint()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case UddlPackage.LOGICAL_MEASUREMENT_AXIS__REALIZES:
        if (resolve) return getRealizes();
        return basicGetRealizes();
      case UddlPackage.LOGICAL_MEASUREMENT_AXIS__MEASUREMENT_SYSTEM_AXIS:
        if (resolve) return getMeasurementSystemAxis();
        return basicGetMeasurementSystemAxis();
      case UddlPackage.LOGICAL_MEASUREMENT_AXIS__VALUE_TYPE_UNIT:
        return getValueTypeUnit();
      case UddlPackage.LOGICAL_MEASUREMENT_AXIS__CONSTRAINT:
        return getConstraint();
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
      case UddlPackage.LOGICAL_MEASUREMENT_AXIS__REALIZES:
        setRealizes((ConceptualObservable)newValue);
        return;
      case UddlPackage.LOGICAL_MEASUREMENT_AXIS__MEASUREMENT_SYSTEM_AXIS:
        setMeasurementSystemAxis((LogicalMeasurementSystemAxis)newValue);
        return;
      case UddlPackage.LOGICAL_MEASUREMENT_AXIS__VALUE_TYPE_UNIT:
        getValueTypeUnit().clear();
        getValueTypeUnit().addAll((Collection<? extends LogicalValueTypeUnit>)newValue);
        return;
      case UddlPackage.LOGICAL_MEASUREMENT_AXIS__CONSTRAINT:
        getConstraint().clear();
        getConstraint().addAll((Collection<? extends LogicalMeasurementConstraint>)newValue);
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
      case UddlPackage.LOGICAL_MEASUREMENT_AXIS__REALIZES:
        setRealizes((ConceptualObservable)null);
        return;
      case UddlPackage.LOGICAL_MEASUREMENT_AXIS__MEASUREMENT_SYSTEM_AXIS:
        setMeasurementSystemAxis((LogicalMeasurementSystemAxis)null);
        return;
      case UddlPackage.LOGICAL_MEASUREMENT_AXIS__VALUE_TYPE_UNIT:
        getValueTypeUnit().clear();
        return;
      case UddlPackage.LOGICAL_MEASUREMENT_AXIS__CONSTRAINT:
        getConstraint().clear();
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
      case UddlPackage.LOGICAL_MEASUREMENT_AXIS__REALIZES:
        return realizes != null;
      case UddlPackage.LOGICAL_MEASUREMENT_AXIS__MEASUREMENT_SYSTEM_AXIS:
        return measurementSystemAxis != null;
      case UddlPackage.LOGICAL_MEASUREMENT_AXIS__VALUE_TYPE_UNIT:
        return valueTypeUnit != null && !valueTypeUnit.isEmpty();
      case UddlPackage.LOGICAL_MEASUREMENT_AXIS__CONSTRAINT:
        return constraint != null && !constraint.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //LogicalMeasurementAxisImpl
