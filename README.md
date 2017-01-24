# eclipse-terminal-app

This project is an example Eclipse, feature-based, terminal
application that includes plugin tests.

## Implementation Details

This project is based on the OSGI (Eclipse RCP) framework. And
contains the following projects that together form the entire
application.

| Folder  | Type  | Description  |
|---|---|---|
| eclipse-terminal-app.parent  | Aggregate  | The parent directory for building the entire project. |
| eclipse-terminal-app  | Plugin  | This folder contains the Eclipse plugin.  |
| eclipse-terminal-app.feature  | Feature  | A feature description of the project that can allow for an aggregate of plugins.  |
| eclipse-terminal-app.repository  | Build Target | This folder contains the product definition. This is where the built product is placed.  |
| eclipse-terminal-app.tests  | Tests  | This folder contains any JUnit tests for the plugin, which are not deployed with the built application.  |

## Building

The project can be built most using maven from the
`eclipse-terminal-app.parent` directory. Typing

```bash
mvn clean verify
```

will create zip files for Linux, Mac, and Windows in the
`eclipse-terminal-app.repository/target/products` folder.

## Requirements

The project requires Apache Maven 3.3.9 and Java 1.8 to build.

<!--  LocalWords:  OSGI RCP JUnit mvn
 -->
