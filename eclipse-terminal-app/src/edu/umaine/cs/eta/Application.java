/**
 * 
 */
package edu.umaine.cs.eta;

import java.util.Arrays;
import java.util.Map;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

/**
 * The entrance to the application. Note, the stop method will not be called
 * because the application will end after the start method finishes executing.
 * 
 * @author Mark Royer
 *
 */
public class Application implements IApplication {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.equinox.app.IApplication#start(org.eclipse.equinox.app.
	 * IApplicationContext)
	 */
	@Override
	public Object start(IApplicationContext context) throws Exception {

		System.out.println("Application start");

		String[] args = getArgs(context);

		try {

			if (args.length != 1)
				throw new Exception("Number of arguments doesn't equal 1.");

			int n = Integer.parseInt(args[0]);

			Fibonnacci cPi = new Fibonnacci();

			System.out.printf("The first %d Fibonacci numbers are: %s\n",
					n, Arrays.toString(cPi.calculate(n)));

		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(
					"This program requires the number of digits to be entered.");
		}

		System.out.println("Application done");

		return IApplication.EXIT_OK;
	}

	/**
	 * Display the program arguments one per line. Note, eclipse application
	 * arguments are not listed.
	 * 
	 * @param context
	 *            The application context (Not null)
	 */
	private String[] getArgs(IApplicationContext context) {
		final Map<?, ?> args = context.getArguments();
		final String[] appArgs = (String[]) args.get("application.args");
		System.out.printf("Application arguments are %s.\n",
				Arrays.toString(appArgs));

		return appArgs;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.equinox.app.IApplication#stop()
	 */
	@Override
	public void stop() {
		System.out.println("Stop application");

	}

}
