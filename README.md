# eclipse-terminal-app

This project is an example Eclipse, feature-based, terminal
application that includes plugin tests.  This is a seed project for
creating terminal-based OSGI applications.

## Building

To build the project, use maven from the `eclipse-terminal-app.parent`
directory. Typing

```bash
mvn clean verify
```

will create zip files for Linux, Mac, and Windows in the
`eclipse-terminal-app.repository/target/products` folder.

## Running the Application

The zipped files containing the executable program are in the
`eclipse-terminal-app.repository/target/products` folder.  If the
build was successful, then there should be the following three zip
files.

```bash
eclipse-terminal-app.product-macosx.cocoa.x86_64.zip
eclipse-terminal-app.product-linux.gtk.x86_64.zip
eclipse-terminal-app.product-win32.win32.x86_64.zip
```

Unzip the version for the operating system you are running, and
execute the program `fib`.  For example, on Linux you would type

```bash
unzip eclipse-terminal-app.product-linux.gtk.x86_64.zip
```

which generates the `fib` folder.  To run the program `cd` into the
`fib` directory and execute the program by typing `fib`.  An example
run is shown below.

```bash
./fib 10
Activator start
Application start
Application arguments are [10].
The first 10 Fibonacci numbers are: [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
Application done
Activator stop
```

The program has additional output to indicate the plugin process.

## Implementation Details

This project is based on the OSGI (Eclipse RCP) framework. The project
is broken down into the following 5 subprojects.  This allows the final
build to only contain necessary binaries.

* `eclipse-terminal-app.parent`
* `eclipse-terminal-app`
* `eclipse-terminal-app.feature`
* `eclipse-terminal-app.repository`
* `eclipse-terminal-app.tests`

More details about each folder and why each one exists are outlined
below.

### eclipse-terminal-app.parent

This folder is an aggregating folder for ensuring that all of the
other project folders are built.  Using Maven (`mvn clean verify`)
from this directory results in the entire project being built, tested,
and zipped.

### eclipse-terminal-app

This folder contains the application code.  Since the application is a
plugin, you may also think of this folder as containing the main
plugin for the application.

The `src` folder contains 3 classes that may be of use for application
developers.

The **Activator** class contains methods that are called at the start
end stop of the application plugin.

The **Application** class is the actual start of the application.
This class also contains an example for parsing the program arguments.

The **Fibonacci** class is merely an example class to indicate that
additional Java classes might reside in the same package scope.

### eclipse-terminal-app.feature

| Feature  | A feature description of the project that can allow for an aggregate of plugins.  |

### eclipse-terminal-app.repository

| Build Target | This folder contains the product definition. This is
  where the built product is placed.  |

### eclipse-terminal-app.tests

| Tests  | This folder contains any JUnit tests for the plugin, which are not deployed with the built application.  |


## Requirements

The project requires Apache Maven 3.3.9 and Java 1.8 to build.

<!--  LocalWords:  OSGI RCP JUnit mvn cd src
 -->
