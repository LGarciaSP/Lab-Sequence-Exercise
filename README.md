# Lab-Sequence-Exercise

This is a Spring Boot project that calculates the labseq sequence and provides a REST API to access the labseq values.

## Introduction

The "Springboot Lab Exercise" is a Spring Boot application that calculates the labseq sequence. The labseq sequence is defined as follows:

- n = 0 => l(0) = 0
- n = 1 => l(1) = 1
- n = 2 => l(2) = 0
- n = 3 => l(3) = 1
- n > 3 => l(n) = l(n-4) + l(n-3)

The application provides a REST API to calculate and retrieve labseq values for a given non-negative integer `n`.

## Features

- Calculate the labseq value for a non-negative integer `n`.
- REST API to access labseq values.
- Caching for improved performance.

## Getting Started

1. Before running the project, make sure you have the following installed:
    - Java Development Kit (JDK)
    - Apache Maven
    - A Java Integrated Development Environment (IDE)

2. Clone the repository to your local machine
3. Open the project in your Java IDE.
4. Build the project using Maven.
5. Run the SpringbootLabExerciseApplication class to start the Spring Boot application.

## Usage

To calculate the lab sequence ("labseq") value for a non-negative integer n, you can make a GET request to the API endpoint. Go to <baseurl>/labseq/{n} and switch "n" with the intended number for the sequence.

## Documentation

The project includes Java documentation for classes and methods. You can generate documentation using Javadoc.
