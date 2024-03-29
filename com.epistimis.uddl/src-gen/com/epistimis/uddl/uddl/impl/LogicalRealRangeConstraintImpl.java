/**
 * generated by Xtext 2.33.0
 * Copyright (c) 2022 - 2024 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.uddl.impl;

import com.epistimis.uddl.uddl.LogicalRealRangeConstraint;
import com.epistimis.uddl.uddl.UddlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Real Range Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.uddl.impl.LogicalRealRangeConstraintImpl#isLowerBoundInclusive <em>Lower Bound Inclusive</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.impl.LogicalRealRangeConstraintImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.impl.LogicalRealRangeConstraintImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link com.epistimis.uddl.uddl.impl.LogicalRealRangeConstraintImpl#isUpperBoundInclusive <em>Upper Bound Inclusive</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicalRealRangeConstraintImpl extends LogicalConstraintImpl implements LogicalRealRangeConstraint
{
  /**
   * The default value of the '{@link #isLowerBoundInclusive() <em>Lower Bound Inclusive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLowerBoundInclusive()
   * @generated
   * @ordered
   */
  protected static final boolean LOWER_BOUND_INCLUSIVE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isLowerBoundInclusive() <em>Lower Bound Inclusive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLowerBoundInclusive()
   * @generated
   * @ordered
   */
  protected boolean lowerBoundInclusive = LOWER_BOUND_INCLUSIVE_EDEFAULT;

  /**
   * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLowerBound()
   * @generated
   * @ordered
   */
  protected static final float LOWER_BOUND_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLowerBound()
   * @generated
   * @ordered
   */
  protected float lowerBound = LOWER_BOUND_EDEFAULT;

  /**
   * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpperBound()
   * @generated
   * @ordered
   */
  protected static final float UPPER_BOUND_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpperBound()
   * @generated
   * @ordered
   */
  protected float upperBound = UPPER_BOUND_EDEFAULT;

  /**
   * The default value of the '{@link #isUpperBoundInclusive() <em>Upper Bound Inclusive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUpperBoundInclusive()
   * @generated
   * @ordered
   */
  protected static final boolean UPPER_BOUND_INCLUSIVE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isUpperBoundInclusive() <em>Upper Bound Inclusive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUpperBoundInclusive()
   * @generated
   * @ordered
   */
  protected boolean upperBoundInclusive = UPPER_BOUND_INCLUSIVE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LogicalRealRangeConstraintImpl()
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
    return UddlPackage.Literals.LOGICAL_REAL_RANGE_CONSTRAINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isLowerBoundInclusive()
  {
    return lowerBoundInclusive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLowerBoundInclusive(boolean newLowerBoundInclusive)
  {
    boolean oldLowerBoundInclusive = lowerBoundInclusive;
    lowerBoundInclusive = newLowerBoundInclusive;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UddlPackage.LOGICAL_REAL_RANGE_CONSTRAINT__LOWER_BOUND_INCLUSIVE, oldLowerBoundInclusive, lowerBoundInclusive));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public float getLowerBound()
  {
    return lowerBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLowerBound(float newLowerBound)
  {
    float oldLowerBound = lowerBound;
    lowerBound = newLowerBound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UddlPackage.LOGICAL_REAL_RANGE_CONSTRAINT__LOWER_BOUND, oldLowerBound, lowerBound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public float getUpperBound()
  {
    return upperBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setUpperBound(float newUpperBound)
  {
    float oldUpperBound = upperBound;
    upperBound = newUpperBound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UddlPackage.LOGICAL_REAL_RANGE_CONSTRAINT__UPPER_BOUND, oldUpperBound, upperBound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isUpperBoundInclusive()
  {
    return upperBoundInclusive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setUpperBoundInclusive(boolean newUpperBoundInclusive)
  {
    boolean oldUpperBoundInclusive = upperBoundInclusive;
    upperBoundInclusive = newUpperBoundInclusive;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UddlPackage.LOGICAL_REAL_RANGE_CONSTRAINT__UPPER_BOUND_INCLUSIVE, oldUpperBoundInclusive, upperBoundInclusive));
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
      case UddlPackage.LOGICAL_REAL_RANGE_CONSTRAINT__LOWER_BOUND_INCLUSIVE:
        return isLowerBoundInclusive();
      case UddlPackage.LOGICAL_REAL_RANGE_CONSTRAINT__LOWER_BOUND:
        return getLowerBound();
      case UddlPackage.LOGICAL_REAL_RANGE_CONSTRAINT__UPPER_BOUND:
        return getUpperBound();
      case UddlPackage.LOGICAL_REAL_RANGE_CONSTRAINT__UPPER_BOUND_INCLUSIVE:
        return isUpperBoundInclusive();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case UddlPackage.LOGICAL_REAL_RANGE_CONSTRAINT__LOWER_BOUND_INCLUSIVE:
        setLowerBoundInclusive((Boolean)newValue);
        return;
      case UddlPackage.LOGICAL_REAL_RANGE_CONSTRAINT__LOWER_BOUND:
        setLowerBound((Float)newValue);
        return;
      case UddlPackage.LOGICAL_REAL_RANGE_CONSTRAINT__UPPER_BOUND:
        setUpperBound((Float)newValue);
        return;
      case UddlPackage.LOGICAL_REAL_RANGE_CONSTRAINT__UPPER_BOUND_INCLUSIVE:
        setUpperBoundInclusive((Boolean)newValue);
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
      case UddlPackage.LOGICAL_REAL_RANGE_CONSTRAINT__LOWER_BOUND_INCLUSIVE:
        setLowerBoundInclusive(LOWER_BOUND_INCLUSIVE_EDEFAULT);
        return;
      case UddlPackage.LOGICAL_REAL_RANGE_CONSTRAINT__LOWER_BOUND:
        setLowerBound(LOWER_BOUND_EDEFAULT);
        return;
      case UddlPackage.LOGICAL_REAL_RANGE_CONSTRAINT__UPPER_BOUND:
        setUpperBound(UPPER_BOUND_EDEFAULT);
        return;
      case UddlPackage.LOGICAL_REAL_RANGE_CONSTRAINT__UPPER_BOUND_INCLUSIVE:
        setUpperBoundInclusive(UPPER_BOUND_INCLUSIVE_EDEFAULT);
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
      case UddlPackage.LOGICAL_REAL_RANGE_CONSTRAINT__LOWER_BOUND_INCLUSIVE:
        return lowerBoundInclusive != LOWER_BOUND_INCLUSIVE_EDEFAULT;
      case UddlPackage.LOGICAL_REAL_RANGE_CONSTRAINT__LOWER_BOUND:
        return lowerBound != LOWER_BOUND_EDEFAULT;
      case UddlPackage.LOGICAL_REAL_RANGE_CONSTRAINT__UPPER_BOUND:
        return upperBound != UPPER_BOUND_EDEFAULT;
      case UddlPackage.LOGICAL_REAL_RANGE_CONSTRAINT__UPPER_BOUND_INCLUSIVE:
        return upperBoundInclusive != UPPER_BOUND_INCLUSIVE_EDEFAULT;
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
    result.append(" (lowerBoundInclusive: ");
    result.append(lowerBoundInclusive);
    result.append(", lowerBound: ");
    result.append(lowerBound);
    result.append(", upperBound: ");
    result.append(upperBound);
    result.append(", upperBoundInclusive: ");
    result.append(upperBoundInclusive);
    result.append(')');
    return result.toString();
  }

} //LogicalRealRangeConstraintImpl
