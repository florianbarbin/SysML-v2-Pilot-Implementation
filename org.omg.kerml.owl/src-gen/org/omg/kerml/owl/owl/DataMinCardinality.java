/**
 * generated by Xtext 2.18.0.M3
 */
package org.omg.kerml.owl.owl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Min Cardinality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.kerml.owl.owl.DataMinCardinality#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.omg.kerml.owl.owl.DataMinCardinality#getDataPropertyExpression <em>Data Property Expression</em>}</li>
 *   <li>{@link org.omg.kerml.owl.owl.DataMinCardinality#getDataRange <em>Data Range</em>}</li>
 * </ul>
 *
 * @see org.omg.kerml.owl.owl.OwlPackage#getDataMinCardinality()
 * @model
 * @generated
 */
public interface DataMinCardinality extends ClassExpression
{
  /**
   * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cardinality</em>' attribute.
   * @see #setCardinality(int)
   * @see org.omg.kerml.owl.owl.OwlPackage#getDataMinCardinality_Cardinality()
   * @model
   * @generated
   */
  int getCardinality();

  /**
   * Sets the value of the '{@link org.omg.kerml.owl.owl.DataMinCardinality#getCardinality <em>Cardinality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cardinality</em>' attribute.
   * @see #getCardinality()
   * @generated
   */
  void setCardinality(int value);

  /**
   * Returns the value of the '<em><b>Data Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Property Expression</em>' containment reference.
   * @see #setDataPropertyExpression(DataPropertyExpression)
   * @see org.omg.kerml.owl.owl.OwlPackage#getDataMinCardinality_DataPropertyExpression()
   * @model containment="true"
   * @generated
   */
  DataPropertyExpression getDataPropertyExpression();

  /**
   * Sets the value of the '{@link org.omg.kerml.owl.owl.DataMinCardinality#getDataPropertyExpression <em>Data Property Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Property Expression</em>' containment reference.
   * @see #getDataPropertyExpression()
   * @generated
   */
  void setDataPropertyExpression(DataPropertyExpression value);

  /**
   * Returns the value of the '<em><b>Data Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Range</em>' containment reference.
   * @see #setDataRange(DataRange)
   * @see org.omg.kerml.owl.owl.OwlPackage#getDataMinCardinality_DataRange()
   * @model containment="true"
   * @generated
   */
  DataRange getDataRange();

  /**
   * Sets the value of the '{@link org.omg.kerml.owl.owl.DataMinCardinality#getDataRange <em>Data Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Range</em>' containment reference.
   * @see #getDataRange()
   * @generated
   */
  void setDataRange(DataRange value);

} // DataMinCardinality