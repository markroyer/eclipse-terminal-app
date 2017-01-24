package edu.umaine.cs.eta;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * This class' start and stop method are called before and after the bundle is
 * activated.
 * 
 * @author Mark Royer
 *
 */
public class Activator implements BundleActivator {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext
	 * )
	 */
	@Override
	public void start(BundleContext bundleContext) throws Exception {

		System.out.println("Activator start");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(BundleContext bundleContext) throws Exception {

		System.out.println("Activator stop");

	}

}
