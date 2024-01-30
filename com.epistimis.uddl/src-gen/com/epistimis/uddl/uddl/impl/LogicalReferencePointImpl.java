/**
 * generated by Xtext 2.33.0
 * Copyright (c) 2022 - 2024 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.uddl.impl;

import com.epistimis.uddl.uddl.LogicalLandmark;
import com.epistimis.uddl.uddl.LogicalReferencePoint;
import com.epistimis.uddl.uddl.LogicalReferencePointPart;
import com.epistimis.uddl.uddl.UddlPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Reference Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.uddl.impl.LogicalReferencePointImpl#getLandmark <em>Landmark</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.impl.LogicalReferencePointImpl#getReferencePointPart <em>Reference Point Part</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicalReferencePointImpl extends UddlElementImpl implements LogicalReferencePoint
{
  /**
   * The cached value of the '{@link #getLandmark() <em>Landmark</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLandmark()
   * @generated
   * @ordered
   */
  protected LogicalLandmark landmark;

  /**
   * The cached value of the '{@link #getReferencePointPart() <em>Reference Point Part</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferencePointPart()
   * @generated
   * @ordered
   */
  protected EList<LogicalReferencePointPart> referencePointPart;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LogicalReferencePointImpl()
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
    return UddlPackage.Literals.LOGICAL_REFERENCE_POINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LogicalLandmark getLandmark()
  {
    if (landmark != null && landmark.eIsProxy())
    {
      InternalEObject oldLandmark = (InternalEObject)landmark;
      landmark = (LogicalLandmark)eResolveProxy(oldLandmark);
      if (landmark != oldLandmark)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, UddlPackage.LOGICAL_REFERENCE_POINT__LANDMARK, oldLandmark, landmark));
      }
    }
    return landmark;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicalLandmark basicGetLandmark()
  {
    return landmark;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLandmark(LogicalLandmark newLandmark)
  {
    LogicalLandmark oldLandmark = landmark;
    landmark = newLandmark;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UddlPackage.LOGICAL_REFERENCE_POINT__LANDMARK, oldLandmark, landmark));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<LogicalReferencePointPart> getReferencePointPart()
  {
    if (referencePointPart == null)
    {
      referencePointPart = new EObjectContainmentEList<LogicalReferencePointPart>(LogicalReferencePointPart.class, this, UddlPackage.LOGICAL_REFERENCE_POINT__REFERENCE_POINT_PART);
    }
    return referencePointPart;
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
      case UddlPackage.LOGICAL_REFERENCE_POINT__REFERENCE_POINT_PART:
        return ((InternalEList<?>)getReferencePointPart()).basicRemove(otherEnd, msgs);
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
      case UddlPackage.LOGICAL_REFERENCE_POINT__LANDMARK:
        if (resolve) return getLandmark();
        return basicGetLandmark();
      case UddlPackage.LOGICAL_REFERENCE_POINT__REFERENCE_POINT_PART:
        return getReferencePointPart();
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
      case UddlPackage.LOGICAL_REFERENCE_POINT__LANDMARK:
        setLandmark((LogicalLandmark)newValue);
        return;
      case UddlPackage.LOGICAL_REFERENCE_POINT__REFERENCE_POINT_PART:
        getReferencePointPart().clear();
        getReferencePointPart().addAll((Collection<? extends LogicalReferencePointPart>)newValue);
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
      case UddlPackage.LOGICAL_REFERENCE_POINT__LANDMARK:
        setLandmark((LogicalLandmark)null);
        return;
      case UddlPackage.LOGICAL_REFERENCE_POINT__REFERENCE_POINT_PART:
        getReferencePointPart().clear();
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
      case UddlPackage.LOGICAL_REFERENCE_POINT__LANDMARK:
        return landmark != null;
      case UddlPackage.LOGICAL_REFERENCE_POINT__REFERENCE_POINT_PART:
        return referencePointPart != null && !referencePointPart.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //LogicalReferencePointImpl