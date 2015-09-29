/**
 */
package visualizationDesignLanguage.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import visualizationDesignLanguage.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see visualizationDesignLanguage.VisualizationDesignLanguagePackage
 * @generated
 */
public class VisualizationDesignLanguageAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VisualizationDesignLanguagePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizationDesignLanguageAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = VisualizationDesignLanguagePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisualizationDesignLanguageSwitch<Adapter> modelSwitch =
		new VisualizationDesignLanguageSwitch<Adapter>() {
			@Override
			public Adapter caseDashboard(Dashboard object) {
				return createDashboardAdapter();
			}
			@Override
			public Adapter caseWindow(Window object) {
				return createWindowAdapter();
			}
			@Override
			public Adapter caseContainer(Container object) {
				return createContainerAdapter();
			}
			@Override
			public Adapter caseColumn(Column object) {
				return createColumnAdapter();
			}
			@Override
			public Adapter caseLine(Line object) {
				return createLineAdapter();
			}
			@Override
			public Adapter caseVisualization(Visualization object) {
				return createVisualizationAdapter();
			}
			@Override
			public Adapter caseCell(Cell object) {
				return createCellAdapter();
			}
			@Override
			public Adapter caseSource(Source object) {
				return createSourceAdapter();
			}
			@Override
			public Adapter caseConcern(Concern object) {
				return createConcernAdapter();
			}
			@Override
			public Adapter caseHowQualifier(HowQualifier object) {
				return createHowQualifierAdapter();
			}
			@Override
			public Adapter caseWhatQualifier(WhatQualifier object) {
				return createWhatQualifierAdapter();
			}
			@Override
			public Adapter caseIcon(Icon object) {
				return createIconAdapter();
			}
			@Override
			public Adapter caseColorization(Colorization object) {
				return createColorizationAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseThreshold(Threshold object) {
				return createThresholdAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link visualizationDesignLanguage.Dashboard <em>Dashboard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizationDesignLanguage.Dashboard
	 * @generated
	 */
	public Adapter createDashboardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizationDesignLanguage.Window <em>Window</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizationDesignLanguage.Window
	 * @generated
	 */
	public Adapter createWindowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizationDesignLanguage.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizationDesignLanguage.Container
	 * @generated
	 */
	public Adapter createContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizationDesignLanguage.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizationDesignLanguage.Column
	 * @generated
	 */
	public Adapter createColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizationDesignLanguage.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizationDesignLanguage.Line
	 * @generated
	 */
	public Adapter createLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizationDesignLanguage.Visualization <em>Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizationDesignLanguage.Visualization
	 * @generated
	 */
	public Adapter createVisualizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizationDesignLanguage.Cell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizationDesignLanguage.Cell
	 * @generated
	 */
	public Adapter createCellAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizationDesignLanguage.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizationDesignLanguage.Source
	 * @generated
	 */
	public Adapter createSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizationDesignLanguage.Concern <em>Concern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizationDesignLanguage.Concern
	 * @generated
	 */
	public Adapter createConcernAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizationDesignLanguage.HowQualifier <em>How Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizationDesignLanguage.HowQualifier
	 * @generated
	 */
	public Adapter createHowQualifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizationDesignLanguage.WhatQualifier <em>What Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizationDesignLanguage.WhatQualifier
	 * @generated
	 */
	public Adapter createWhatQualifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizationDesignLanguage.Icon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizationDesignLanguage.Icon
	 * @generated
	 */
	public Adapter createIconAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizationDesignLanguage.Colorization <em>Colorization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizationDesignLanguage.Colorization
	 * @generated
	 */
	public Adapter createColorizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizationDesignLanguage.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizationDesignLanguage.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizationDesignLanguage.Threshold <em>Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizationDesignLanguage.Threshold
	 * @generated
	 */
	public Adapter createThresholdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //VisualizationDesignLanguageAdapterFactory
