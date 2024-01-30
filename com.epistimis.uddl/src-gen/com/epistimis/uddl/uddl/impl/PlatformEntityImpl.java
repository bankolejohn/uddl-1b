/**
 * generated by Xtext 2.33.0
 * Copyright (c) 2022 - 2024 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.uddl.impl;

import com.epistimis.uddl.uddl.LogicalEntity;
import com.epistimis.uddl.uddl.PlatformComposition;
import com.epistimis.uddl.uddl.PlatformEntity;
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
 * An implementation of the model object '<em><b>Platform Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.uddl.impl.PlatformEntityImpl#getSpecializes <em>Specializes</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.impl.PlatformEntityImpl#getRealizes <em>Realizes</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.impl.PlatformEntityImpl#getComposition <em>Composition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlatformEntityImpl extends PlatformComposableElementImpl implements PlatformEntity
{
  /**
   * The cached value of the '{@link #getSpecializes() <em>Specializes</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpecializes()
   * @generated
   * @ordered
   */
  protected PlatformEntity specializes;

  /**
   * The cached value of the '{@link #getRealizes() <em>Realizes</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRealizes()
   * @generated
   * @ordered
   */
  protected LogicalEntity realizes;

  /**
   * The cached value of the '{@link #getComposition() <em>Composition</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComposition()
   * @generated
   * @ordered
   */
  protected EList<PlatformComposition> composition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PlatformEntityImpl()
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
    return UddlPackage.Literals.PLATFORM_ENTITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PlatformEntity getSpecializes()
  {
    if (specializes != null && specializes.eIsProxy())
    {
      InternalEObject oldSpecializes = (InternalEObject)specializes;
      specializes = (PlatformEntity)eResolveProxy(oldSpecializes);
      if (specializes != oldSpecializes)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, UddlPackage.PLATFORM_ENTITY__SPECIALIZES, oldSpecializes, specializes));
      }
    }
    return specializes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlatformEntity basicGetSpecializes()
  {
    return specializes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSpecializes(PlatformEntity newSpecializes)
  {
    PlatformEntity oldSpecializes = specializes;
    specializes = newSpecializes;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UddlPackage.PLATFORM_ENTITY__SPECIALIZES, oldSpecializes, specializes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LogicalEntity getRealizes()
  {
    if (realizes != null && realizes.eIsProxy())
    {
      InternalEObject oldRealizes = (InternalEObject)realizes;
      realizes = (LogicalEntity)eResolveProxy(oldRealizes);
      if (realizes != oldRealizes)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, UddlPackage.PLATFORM_ENTITY__REALIZES, oldRealizes, realizes));
      }
    }
    return realizes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicalEntity basicGetRealizes()
  {
    return realizes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRealizes(LogicalEntity newRealizes)
  {
    LogicalEntity oldRealizes = realizes;
    realizes = newRealizes;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UddlPackage.PLATFORM_ENTITY__REALIZES, oldRealizes, realizes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<PlatformComposition> getComposition()
  {
    if (composition == null)
    {
      composition = new EObjectContainmentEList<PlatformComposition>(PlatformComposition.class, this, UddlPackage.PLATFORM_ENTITY__COMPOSITION);
    }
    return composition;
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
      case UddlPackage.PLATFORM_ENTITY__COMPOSITION:
        return ((InternalEList<?>)getComposition()).basicRemove(otherEnd, msgs);
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
      case UddlPackage.PLATFORM_ENTITY__SPECIALIZES:
        if (resolve) return getSpecializes();
        return basicGetSpecializes();
      case UddlPackage.PLATFORM_ENTITY__REALIZES:
        if (resolve) return getRealizes();
        return basicGetRealizes();
      case UddlPackage.PLATFORM_ENTITY__COMPOSITION:
        return getComposition();
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
      case UddlPackage.PLATFORM_ENTITY__SPECIALIZES:
        setSpecializes((PlatformEntity)newValue);
        return;
      case UddlPackage.PLATFORM_ENTITY__REALIZES:
        setRealizes((LogicalEntity)newValue);
        return;
      case UddlPackage.PLATFORM_ENTITY__COMPOSITION:
        getComposition().clear();
        getComposition().addAll((Collection<? extends PlatformComposition>)newValue);
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
      case UddlPackage.PLATFORM_ENTITY__SPECIALIZES:
        setSpecializes((PlatformEntity)null);
        return;
      case UddlPackage.PLATFORM_ENTITY__REALIZES:
        setRealizes((LogicalEntity)null);
        return;
      case UddlPackage.PLATFORM_ENTITY__COMPOSITION:
        getComposition().clear();
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
      case UddlPackage.PLATFORM_ENTITY__SPECIALIZES:
        return specializes != null;
      case UddlPackage.PLATFORM_ENTITY__REALIZES:
        return realizes != null;
      case UddlPackage.PLATFORM_ENTITY__COMPOSITION:
        return composition != null && !composition.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PlatformEntityImpl
