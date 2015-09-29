/**
 */
package visualizationDesignLanguage.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import visualizationDesignLanguage.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see visualizationDesignLanguage.VisualizationDesignLanguagePackage
 * @generated
 */
public class VisualizationDesignLanguageSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VisualizationDesignLanguagePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizationDesignLanguageSwitch() {
		if (modelPackage == null) {
			modelPackage = VisualizationDesignLanguagePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case VisualizationDesignLanguagePackage.DASHBOARD: {
				Dashboard dashboard = (Dashboard)theEObject;
				T result = caseDashboard(dashboard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationDesignLanguagePackage.WINDOW: {
				Window window = (Window)theEObject;
				T result = caseWindow(window);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationDesignLanguagePackage.CONTAINER: {
				Container container = (Container)theEObject;
				T result = caseContainer(container);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationDesignLanguagePackage.COLUMN: {
				Column column = (Column)theEObject;
				T result = caseColumn(column);
				if (result == null) result = caseContainer(column);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationDesignLanguagePackage.LINE: {
				Line line = (Line)theEObject;
				T result = caseLine(line);
				if (result == null) result = caseContainer(line);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationDesignLanguagePackage.VISUALIZATION: {
				Visualization visualization = (Visualization)theEObject;
				T result = caseVisualization(visualization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationDesignLanguagePackage.CELL: {
				Cell cell = (Cell)theEObject;
				T result = caseCell(cell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationDesignLanguagePackage.SOURCE: {
				Source source = (Source)theEObject;
				T result = caseSource(source);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationDesignLanguagePackage.CONCERN: {
				Concern concern = (Concern)theEObject;
				T result = caseConcern(concern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationDesignLanguagePackage.HOW_QUALIFIER: {
				HowQualifier howQualifier = (HowQualifier)theEObject;
				T result = caseHowQualifier(howQualifier);
				if (result == null) result = caseConcern(howQualifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationDesignLanguagePackage.WHAT_QUALIFIER: {
				WhatQualifier whatQualifier = (WhatQualifier)theEObject;
				T result = caseWhatQualifier(whatQualifier);
				if (result == null) result = caseConcern(whatQualifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationDesignLanguagePackage.ICON: {
				Icon icon = (Icon)theEObject;
				T result = caseIcon(icon);
				if (result == null) result = caseHowQualifier(icon);
				if (result == null) result = caseConcern(icon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationDesignLanguagePackage.COLORIZATION: {
				Colorization colorization = (Colorization)theEObject;
				T result = caseColorization(colorization);
				if (result == null) result = caseHowQualifier(colorization);
				if (result == null) result = caseConcern(colorization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationDesignLanguagePackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = caseHowQualifier(property);
				if (result == null) result = caseConcern(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationDesignLanguagePackage.THRESHOLD: {
				Threshold threshold = (Threshold)theEObject;
				T result = caseThreshold(threshold);
				if (result == null) result = caseHowQualifier(threshold);
				if (result == null) result = caseConcern(threshold);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dashboard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dashboard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDashboard(Dashboard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Window</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Window</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWindow(Window object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainer(Container object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumn(Column object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLine(Line object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visualization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visualization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisualization(Visualization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCell(Cell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSource(Source object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcern(Concern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>How Qualifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>How Qualifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHowQualifier(HowQualifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>What Qualifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>What Qualifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhatQualifier(WhatQualifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Icon</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Icon</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIcon(Icon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Colorization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Colorization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColorization(Colorization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Threshold</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Threshold</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThreshold(Threshold object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //VisualizationDesignLanguageSwitch
