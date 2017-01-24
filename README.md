# eclipse-terminal-app

This project is an example Eclipse, feature-based, terminal application that includes plugin tests.

## Implementation Details

This project is based on the OSGI (Eclipse RCP) framework.

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
