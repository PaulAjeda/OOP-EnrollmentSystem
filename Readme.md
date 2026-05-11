# Enrollment Management System
**Author:** Paul Geneo Ajeda

---

##  Project Overview
The Enrollment Management System is a Java project that uses Object-Oriented Programming (OOP) principles to manage manages students, courses, sections, and tuition payments using a structured and organized design with interfaces and service classes. It applies proper validation, basic business rules, and GitHub version control to simulate a real-world enrollment system.

---

## 1. Data Encapsulation
The system ensures data integrity by utilizing private attributes and public getters and setters to control all state modifications.

![Encapsulation Screenshot](src/main/resources/Images/Ajeda_Screenshot%202026-02-07%20110509.png)

---

## 2. Service Layer Architecture
Business logic is separated into a dedicated service layer to decouple operational actions from data entities.

---

## 3. Inheritance
A hierarchical relationship is established where Student and Instructor classes inherit shared attributes from a base Person class.

**Base Class (Person):**
![img_1.png](img_1.png)

**Subclasses:**
![img_2.png](img_2.png) ![img_3.png](img_3.png)

---

## 4. Abstraction
The Person class is defined as an abstract template to enforce consistent polymorphic behavior across all specialized subclasses.

![img_5.png](img_5.png) ![img_4.png](img_4.png)
![img_8.png](img_8.png) ![img_7.png](img_7.png) ![img_9.png](img_9.png)

---

## 5. Interface-
All business operations are defined through Java Interfaces to create a modular, contract-based architecture.

![img_10.png](img_10.png)
![img_11.png](img_11.png) ![img_12.png](img_12.png)
![img_13.png](img_13.png) ![img_14.png](img_14.png)
![img_15.png](img_15.png) ![img_16.png](img_16.png)

---

## 6. Extended Entities
The system includes specialized modules for Section, Department, and Tuition management to simulate a comprehensive university structure.

### [1] Section Management
![img_17.png](img_17.png) ![img_18.png](img_18.png) ![img_19.png](img_19.png)

### [2] Department Management
![img_20.png](img_20.png) ![img_21.png](img_21.png) ![img_22.png](img_22.png)

### [3] Tuition Fee Management
![img_23.png](img_23.png) ![img_24.png](img_24.png)

---

## 7. Phase 1: Architectural Shift
The codebase was refactored to strictly separate data models from service implementations using formal interface contracts.

![img_25.png](img_25.png) ![img_26.png](img_26.png) ![img_27.png](img_27.png)
![img_28.png](img_28.png) ![img_29.png](img_29.png) ![img_30.png](img_30.png)

---

## 8. Phase 2: Minimum Coding Requirements including Advance Input Validation
The system supports institutional hierarchy traversal and enforces strict section capacity limits through custom exception handling.

![img_31.png](img_31.png) ![img_32.png](img_32.png) ![img_33.png](img_33.png)
![img_34.png](img_34.png) ![img_35.png](img_35.png) ![img_36.png](img_36.png) ![img_37.png](img_37.png)

---

## 9. Phase 4: Unit Testing (JUnit 5)
Automated unit tests were implemented to verify the accuracy of tuition calculations and the integrity of capacity validation logic.

![img_39.png](img_39.png)

---
