# HLTest

# Instruction to clone 
From Eclipse go to File - Import - Import Wizard - Git - Project From Git - Next - Clone URI
or you can download as zip and do File - open project from file system.

Once project is loaded into ecplise , right click on Project - Maven - Update Project...

Check if any errors are there if not we are good to go, if any errors please do project - clean and try again.





# Tool Stack in the Framework
|  |                                                                            |         |
|-----------------------------|----------------------------------------------------------------------------|---------|
| Framework/Library           | Usage Description                                                          | Version |
| Selenium WebDriver          | Java API which controls Web browser and emulate user interactions          | 3.14.0  |
| WebDriver Manager           | helps to download binaries/executables in an automated way                 | 3.6.0   |
| TestNG Framework            | It provides features for organizing and running tests in a flexible manner | 6.14.3  |
| Maven                       | Dependencies and Build Management                                          | 4.0.0   |

# Directory and Packages Hierarchy

| Directory/File        | Description                                                                                                              |
|-----------------------|--------------------------------------------------------------------------------------------------------------------------|
| src/test/java/pages   | Java package that holds page objects and page methods                                                                    |
| src/test/java/tests   | Java package that holds Java class files grouped under functionality, which has TestNG test methods annotated with @Test |
| TestNG.xml            | TestNG suite file that controls the execution flow                                                                       |
| pom.xml               | Maven POM file that maintains the dependencies and helps in build process                                                |
| emailable-report.html | HTML report that has details on recent automated test execution                                                          |
