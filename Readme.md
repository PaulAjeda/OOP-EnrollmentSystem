# Ajeda_00P_EnrollmentSystem

---
**Author**: Paul Geneo Ajeda


**1. Encapsulation**

Image:

![Ajeda_Screenshot 2026-02-07 110509.png](src/main/resources/Images/Ajeda_Screenshot%202026-02-07%20110509.png)

**2. Service Layer**

**3. Inheritance**

Person:
![img_1.png](img_1.png)

Instructor:
![img_2.png](img_2.png)

Student:
![img_3.png](img_3.png)

**4. Abstraction**

Main:

![img_5.png](img_5.png)

![img_4.png](img_4.png)

Person:

![img_8.png](img_8.png)


Student: 

![img_7.png](img_7.png)

Instructor:

![img_9.png](img_9.png)

**5. Interface**

Campus Registrar:

![img_10.png](img_10.png)

Student:

![img_11.png](img_11.png)
![img_12.png](img_12.png)

Course: 

![img_13.png](img_13.png)
![img_14.png](img_14.png)

Instructor:

![img_15.png](img_15.png)
![img_16.png](img_16.png)


**6. Added Entities**

**[1] Section**

Section

![img_17.png](img_17.png)

SectionRegistration

![img_18.png](img_18.png)

SectionRegistrationImpl

![img_19.png](img_19.png)

**[2] Department**

Department

![img_20.png](img_20.png)

DepartmentRegistration

![img_21.png](img_21.png)

DepartmentRegistrationImpl

![img_22.png](img_22.png)

**[3] TuitionFeePayment**

TuitionPayment

![img_23.png](img_23.png)

TuitionFeePayment

![img_24.png](img_24.png)

TuitionFeePaymentImpl

**7. Phase 1: The Architectural Shift**

NewEntity-Enrollment

---Interfaces Contracts---

IStudentService:

![img_25.png](img_25.png)

IInstructorService:

![img_26.png](img_26.png)

ICourseService: 

![img_27.png](img_27.png)

ITuitionService

![img_28.png](img_28.png)

IEnrollmentService:

![img_29.png](img_29.png)

NewEntity-Enrollment Added

![img_30.png](img_30.png)

**Phase 2: Minimum Coding Requirements**

Institutional Hierarchy Viewing

![img_31.png](img_31.png)

Critical Validation

![img_32.png](img_32.png)
![img_33.png](img_33.png)
![img_34.png](img_34.png)
![img_35.png](img_35.png)
![img_36.png](img_36.png)
![img_37.png](img_37.png)

**Phase 4: Bonus Automated Testing**

The system includes **JUnit 5 Unit Tests** to prove business logic works correctly:
- Capacity limit validation (Throws Exception if full).
- Accurate tuition calculation (Units * 500).
- Duplicate Student ID prevention.
- Payment balance tracking.
- Instructor-to-section assignment.

![img_38.png](img_38.png)

