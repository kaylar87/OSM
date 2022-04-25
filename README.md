# OSM

POJO folder - deserialization (convertion from JSON response body to Java classes).
TEST folder - assertions and validations. Each class extend its own Base class from utilities.AbstractBaseClasses folder.
utilities.AbstractBaseClasses folder - JSON request body, Request itself, plus some common "logic" and variables.
utilities.Environment and utilities.ConfigurationReader - allows to read Environment URL from resources.Environments.qa1-4.properties.
resources.Environments.qa1-4.properties - contains saved URL for QA1-4.
configuration.properties - can switch between environments by providing value.
utilities.ExcelUtil - methods to read from Excel files.
