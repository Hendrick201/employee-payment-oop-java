# Employee Payment System - Java OOP 💼💰

![Java](https://img.shields.io/badge/Java-11%2B-blue?logo=java)
![OOP](https://img.shields.io/badge/OOP-Inheritance%2FPolymorphism-success)
![License](https://img.shields.io/badge/License-MIT-green)

A payment calculation system for regular and outsourced employees, demonstrating Object-Oriented Programming concepts in Java.

## 📌 Overview

The system allows:

* Registration of employees (regular and outsourced)
* Automatic payment calculation
* Method overriding for specialized calculations
* Listing of payments

## 🚀 Features

✔️ Registration of regular and outsourced employees
✔️ Polymorphic payment calculation
✔️ Different calculation for outsourced employees (+10% additional fee)
✔️ Formatted payment listing

## 🛠️ Technologies Used

* **Java 11+**
* **OOP Concepts**:

  * Inheritance (`OutsourcedEmployee extends Employee`)
  * Polymorphism (`@Override` in the `payment()` method)
  * Encapsulation (private attributes with getters/setters)
* **Input/Output** using `Scanner` and `Locale`

## 🗂️ Project Structure

```bash
src/
├── entities/
│   ├── Employee.java            # Base employee class
│   └── OutsourcedEmployee.java  # Outsourced employee class
└── Program.java                 # Main class
```

# 📥 Cloning and Running the Project

## 🔧 Prerequisites

```bash
- Java JDK 11+ installed
- Git (optional for cloning)
- Terminal/CMD access
```

## 🚀 Step-by-Step Instructions

1️⃣ CLONE THE REPOSITORY

```bash
git clone https://github.com/Hendrick201/employee-payment-oop-java.git
cd employee-payment-oop-java
```

2️⃣ VERIFY THE STRUCTURE

```bash
Make sure these files exist:
src/
├── entities/
│   ├── Employee.java
│   └── OutsourcedEmployee.java
└── Program.java
```

3️⃣ COMPILE THE PROJECT

```bash
# Compile all files
javac src/entities/*.java src/Program.java -d out/
```

🧪 MANUAL TESTS

**TEST 1 - REGULAR EMPLOYEE**

```
Input:
Name: João
Hours: 40
Hourly Rate: 50
Outsourced? n
```

Expected Output:
João - $2000.00

**TEST 2 - OUTSOURCED EMPLOYEE**

```
Input:
Name: Maria
Hours: 40
Hourly Rate: 50
Outsourced? y
Additional: 100
```

Expected Output:
Maria - $2110.00
