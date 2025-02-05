<div style="text-align:center">
    <img src="https://projects.eclipse.org/sites/default/files/Logo_Temurin_2021_08_17_JRR_RGB-V1A_0.png" />
</div>

<div style="text-align:center">
    <img src="https://junit.org/junit5/assets/img/junit5-logo.png" width="150" />
</div>

# primeNumbers Library

A simple Java library that works with prime numbers. It contains three static methods:
1. ```java
   boolean isPrime(int n)
   ```
2. ```java
   int nextPrime(int n)
   ```
3. ```java
    int[] primesInRange(int start, int end)
    ```

## Description

The code in this library started life out as a component of the [PrimeNumbers-cli](https://github.com/jacques-navarro/primeNumbers-cli) app which I made in order to practice implementing JUnit 5 tests.

It then became one of the main parts in a Spring Boot MVC application called [primeNumbers-springmvc](https://github.com/jacques-navarro/prime-numbers-mvc). Instead of copying and pasting the code inside the PrimeNumbers class, I thought it would be a good opportunity to learn how to package a Java application with Maven so it could be reused across multiple projects.

I used what I learned during that process to create a blog post about installing a JAR file to the local Maven repository which can be read here at [jarFile passing(arguments)](https://www.passingarguments.dev/posts/java-jar-file/).

## Getting Started

### Dependencies

This library has no dependencies but the JAR file was compiled with Eclipse Temurin 17.0.8+7.

### Installing

The project can be distributed via the JAR file (primeNumbers-0.3.0.jar) which is located in the project's base directory.

It can also be installed to the Maven local repository. Simply, clone the library and then run the Maven install command. Here are the required steps:

```
git clone git@github.com:jacques-navarro/primeNumbers.git
```

cd into the project directory.

```
cd primeNumberApp
```

Then run the install command to save it to the local Maven repository.

```
mvn install
```

## Github Actions

The project has includes a Github Actions workflow which runs all unit tests before commits are added
to Github.

## Author

[@bunnythief@hachyderm.io](https://hachyderm.io/@bunnythief)

## License

This project is licensed under the MIT License - see the LICENSE.md file for details.