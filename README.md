# icd2

ICD2 is a Java-based tool for dating ice cores.

## Releases

This section will hold release information.

## Examples

The program loads CSV files that contain depth information.  The first
row of the CSV file must be a list of headers.  The rest of the file
should contain the data.  An example file can be found
[here](https://raw.githubusercontent.com/wiki/markroyer/icd2/991test1.csv).


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
