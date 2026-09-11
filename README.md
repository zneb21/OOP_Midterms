# OOP Midterms Project

This repository contains our **Object Oriented Programming (OOP) midterm group project** for **BSCS 2A**. It is a collection of Java console-programming exercises focused on loops, conditional statements, arithmetic, validation, and step-by-step calculations.

## Group Members

- Zneb Delariman
- Nico Campania
- French Mar Ballescas

## Course Information

- **Subject:** Object Oriented Programming (OOP)
- **Section:** BSCS 2A
- **Project:** Midterm Group Project

## Java Setup

Follow these steps before running the programs:

1. Install a **JDK (Java Development Kit)**, not only a Java Runtime Environment. The JDK includes both `java` and `javac`.
2. Install Microsoft’s **Extension Pack for Java** in VS Code.
3. Add the JDK location to your environment variables:
   - Set `JAVA_HOME` to the JDK folder, such as `C:\Program Files\Java\jdk-26`.
   - Add the JDK `bin` folder to `Path`, such as `C:\Program Files\Java\jdk-26\bin`.
   - Do not include `\bin` in the `JAVA_HOME` value.
4. Restart VS Code after changing environment variables.
5. Open this repository folder in VS Code and verify the installation in the integrated terminal:

```bash
java -version
javac -version
```

Both commands should display the installed JDK version. The `.env.example` file contains the expected local Java variables; copy it to `.env` and update the paths if needed. The `.env` file is for local reference only and is ignored by Git.

## Included Exercises

### Project 3 — Number Classification Laboratory

`Project3_NumberClassificationLab.java` is intended to examine every number in a user-defined range and identify:

- Prime numbers
- Perfect numbers
- Armstrong numbers
- Palindrome numbers

The program should print the numbers as they are found and display totals for each classification. The exercise emphasizes nested loops, modulo, division, counters, accumulators, and conditional statements.

### Project 10 — Loan Payment Simulation

`Project10_LoanPaymentSimulation.java` is intended to simulate a loan month by month. It accepts the loan amount, annual interest rate, and monthly payment, then calculates the monthly interest, payment, and remaining balance until the loan is paid.

The program should also produce a loan summary containing the original loan, total interest, total amount paid, and number of payments. It must detect when the monthly payment is not enough to reduce the balance, preventing an infinite loop.

### Project 11 — Compound Investment Simulator

`Project11_CompoundInvestmentSim.java` is intended to simulate an investment account one month at a time. It accepts an initial investment, annual interest rate, monthly contribution, and number of years.

The final summary should show the initial investment, total contributions, interest earned, and final balance. The calculation is performed for every period rather than calculating only the final amount.

### Project 16 — Electricity Bill Calculator with Tiered Rates

`Project16_ElectricityBillCalc.java` is intended to calculate electricity bills for multiple customers using tiered rates based on kilowatt-hour consumption. It should display each customer’s consumption and bill, followed by a summary containing:

- Number of customers
- Total consumption
- Total revenue
- Highest bill
- Lowest bill
- Average bill

### Number Analysis

`NumberAnalysis.java` is intended to provide a more comprehensive version of number classification. For each number in a user-defined range, it can classify prime, composite, even, odd, palindrome, Armstrong, perfect, abundant, and deficient numbers, then report totals and notable values such as the largest prime, perfect number, and Armstrong number.

## Restrictions and Approach

The exercises are designed around fundamental programming constructs. The intended solutions use variables, arithmetic, `if` statements, `switch`, `for` loops, `while` loops, `do-while` loops, nested loops, and methods where appropriate.

The assignment specifications prohibit arrays, `ArrayList`, collections, recursion, classes/OOP features beyond what has been taught, sorting methods, and advanced libraries. Values should therefore be processed and summarized as they are read or discovered.

## Current Repository Status

The repository contains starter implementations for the five exercises. Each Java file currently has a `main` method, and the exercise logic can be developed in the corresponding file while keeping the required input, processing, validation, and summary-output behavior described above.

## Running the Programs

After installing a JDK and opening this folder in VS Code, compile and run a program from the repository directory:

```bash
javac Project3_NumberClassificationLab.java
java Project3_NumberClassificationLab
```

Replace the filename and class name with the exercise you want to run. The filename and public class name must match exactly. The other programs can be run in the same way:

```bash
javac Project10_LoanPaymentSimulation.java && java Project10_LoanPaymentSimulation
javac Project11_CompoundInvestmentSim.java && java Project11_CompoundInvestmentSim
javac Project16_ElectricityBillCalc.java && java Project16_ElectricityBillCalc
javac NumberAnalysis.java && java NumberAnalysis
```

In VS Code, the Java extension’s **Run** button above the `main` method can also compile and run the selected program. If using Code Runner, make sure its Java executor can find `javac`.

## Build Outputs

Compiled Java `.class` files are also ignored through `.gitignore`. Only the `.java` source files and project documentation should be committed. If compiled files already appear in Git, remove them from tracking with `git rm --cached *.class` before committing; this does not delete the local source files.

## Academic Purpose

This project applies basic programming and problem-solving techniques to practical simulations and number-analysis tasks. It demonstrates how loops, conditions, arithmetic, validation, counters, and accumulators can be combined to process user input and generate meaningful summaries.
