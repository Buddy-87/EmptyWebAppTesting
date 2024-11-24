# Template for the Web application testing

### Summary of key commands for using gradle

* Build the Entire Project

```commandline
./gradlew build
```

This command compiles, tests, and packages your project.
If there are issues with dependencies or code, they will surface here.

* Generate IntelliJ IDEA Files

```commandline
./gradlew idea
```  

This creates or updates IntelliJ IDEA-specific files like .idea/ and .iml for each module.
After running this, open your project in IntelliJ IDEA, and it should recognize all modules and dependencies.

* Clean Build (Remove Old Outputs):

```commandline
./gradlew clean build
```  

* Force Refresh Dependencies:

```commandline
./gradlew build --refresh-dependencies
```  

This forces Gradle to re-check and download any missing or updated dependencies.

* Check Dependency Tree:

```commandline
./gradlew dependencies
```  

* Debug Specific Dependency Issues:

```commandline
./gradlew dependencyInsight --dependency <dependency-name>
```  