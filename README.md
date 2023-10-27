# Java Bean Persistence Example

This repository contains a simple example of Java Bean persistence using serialization. It includes two Java classes, `PersonBean` and `TestPersonBean`, and an Apache Ant build script to compile the code and bundle it into an executable jar file.

## Classes

- `PersonBean`: A simple Java Bean class representing a person with first and last name properties.
- `TestPersonBean`: A menu-driven program that allows you to interact with a `PersonBean` object, save its state to a file, and load its state from a file.

## Setup

This repository is configured to work with GitHub Codespaces, which has `ant` pre-installed. When you open this repository in a Codespace, you'll have everything you need to compile, run, and test the code.

## Instructions

1. Open this repository in a Codespace.
2. In the terminal, navigate to the repository root directory.
3. Run the following command to compile the code and create an executable jar file:

    ```bash
    ant
    ```

4. Run the following command to execute the jar file and interact with the menu-driven program:

    ```bash
    java -jar dist/PersonApp.jar
    ```

5. Follow the on-screen menu to set the first name and last name properties of the `PersonBean` object, display the name, save the object to a file, and load the object from a file.

## Exploring the Code

- The `PersonBean` class is defined in `src/PersonBean.java`.
- The `TestPersonBean` class is defined in `src/TestPersonBean.java`.
- The Ant build script is defined in `build.xml`.

Feel free to explore the code, run the program, and experiment with saving and loading `PersonBean` objects to understand Java Bean persistence using serialization.

Enjoy coding!
