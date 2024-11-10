## Maven
Maven is a build automation tool used primarily for Java projects. It is an open-source project that is distributed under the umbrella of the Apache Software Foundation. Maven's primary goal is to provide a standard way to manage the life cycle of a project, from the initial setup to the final deployment.

Maven uses a project object model (POM) to describe the project and its build process. The POM is an XML file that contains information about the project, such as its dependencies, build settings, and plugins. Maven uses this information to compile, test, package, and deploy the project.

Maven also provides a central repository for storing project dependencies, which can be shared among multiple projects. This helps to reduce duplication and ensure consistency across projects.

Maven is widely used in the Java community and is a key tool for building and managing Java projects.

### GAV
- GroupId
- ArtifactId
- Version

GroupId is the organization or group that owns the project. It is typically a reverse domain name, such as com.example.

ArtifactId is the name of the project. It is typically a short, descriptive name that identifies the project.

Version is the version of the project. It is typically a number that indicates the version of the project.

### pom.xml
Is the project object model file that contains information about the project and its build process. For example:
```xml
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.example</groupId>
    <artifactId>my-project</artifactId>
    <version>1.0-SNAPSHOT</version>
</project>
```

#### dependencies
Is a list of dependencies that the project depends on. For example:
```xml
<dependencies>
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.13.2</version>
    </dependency>
    <!-- more dependencies -->
</dependencies>
```

### Effective POM
Is the POM that is used to build the project. It is created by Maven by merging the POMs of all the dependencies and the project itself.

### Maven Archetype
Is a template for a Maven project. It is used to create new Maven projects.
