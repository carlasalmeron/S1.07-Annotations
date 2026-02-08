# S1.07 — Annotations

## 🎯 Objectives

This project introduces the use of standard Java annotations such as `@Override` and `@Deprecated`. It focuses on improving code readability and maintainability while practicing inheritance and polymorphism.

The goal is to understand how annotations help manage method behavior, compiler warnings, and code evolution.

## 📌 Level 1

### ✅ Exercise 1 — Override

Create a class hierarchy with:
- Worker
- OnlineWorker
- OnsiteWorker

The base class defines a salary calculation method, which is overridden in the child classes using `@Override`.

Salary rules:
- OnsiteWorker: worked hours × price per hour + static fuel cost
- OnlineWorker: worked hours × price per hour + constant Internet fee
- The main() method demonstrates polymorphism and method overriding.

### ✅ Exercise 2 — Deprecated

Add obsolete methods to the child classes and mark them using the `@Deprecated` annotation.

From an external class, invoke these methods and suppress deprecation warnings using the appropriate annotation.

## 🛠 Technologies

- Java 21+
- IntelliJ IDEA
- Git & GitHub

## 🚀 Installation and Execution

Using an IDE (from source code without building the project):
- Download the repository.
- Open the project with the IDE
- Execute the main

### 📂 Clone Repository

`git clone https://github.com/carlasalmeron/S1.07-Annotations.git`

### 🌍 Best Practices

- Proper use of annotations to improve maintainability
- Clear inheritance structure
- Controlled handling of deprecated code