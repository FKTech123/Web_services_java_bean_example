# Apache Ant Tutorial Repository

Welcome to the Apache Ant Tutorial Repository! This repository is set up as a template to help you learn and practice Apache Ant, a powerful Java-based build tool. When you open this repository in Codespaces, you will find it empty except for this README.md file. Follow the instructions below to set up a basic project, create necessary files and folders, and familiarize yourself with the basics of Apache Ant.

## Getting Started

1. **Creating Directories**:
   - Create a directory named `src` for your Java source files.
   - Create a directory named `bin` for the compiled class files.

2. **Creating a Java Class**:
   - Inside the `src` directory, create a file named `HelloWorld.java`.
   - Add the following Java code to `HelloWorld.java`:
     ```java
     public class HelloWorld {
         public static void main(String[] args) {
             System.out.println("Hello, World!");
         }
     }
     ```

3. **Creating the Build File**:
   - In the root of the repository, create a file named `build.xml`.
   - Add the following XML code to `build.xml`:
     ```xml
     <project name="MyProject" default="compile">
         <target name="compile">
             <javac srcdir="src" destdir="bin"/>
         </target>
     </project>
     ```

## Building and Running Your Project

1. **Building Your Project**:
   - In the integrated terminal, navigate to the root of the repository.
   - Run the command `ant` to compile your `HelloWorld.java` file. The compiled `HelloWorld.class` file will be placed in the `bin` directory.

2. **Running Your Java Class**:
   - In the integrated terminal, navigate to the `bin` directory.
   - Run the command `java HelloWorld` to execute your program. You should see "Hello, World!" printed to the console.

## Additional Resources

- For a more detailed walkthrough on Apache Ant, check out this [Apache Ant Tutorial for Beginners](https://examples.javacodegeeks.com/apache-ant-tutorial-beginners/).
- For a step-by-step guide provided by the official Apache Ant website, visit [Hello World with Apache Ant](https://ant.apache.org/manual/tutorial-HelloWorldWithAnt.html).

Happy Coding!
