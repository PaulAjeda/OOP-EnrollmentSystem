package org.example;

import org.example.model.*;
import org.example.service.*;
import org.example.exception.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EnrollmentSystemTest {

    private IStudentService studentService;
    private ITuitionService tuitionService;
    private IEnrollmentService enrollmentService;
    private IInstructorService instructorService;

    @BeforeEach
    public void setUp() {
        studentService = new StudentServiceImpl();
        tuitionService = new TuitionServiceImpl();
        enrollmentService = new EnrollmentServiceImpl();
        instructorService = new InstructorServiceImpl();
    }

    // 1. TEST: Capacity Validation (Critical Requirement)
    @Test
    public void testEnrollStudent_SectionIsFull_ThrowsException() throws EnrollmentException {
        // Arrange
        Section testSection = new Section(101, "BSIT-1A", 2); 
        Student s1 = new Student(1, "Alice", "IT");
        Student s2 = new Student(2, "Bob", "IT");
        Student s3 = new Student(3, "Charlie", "IT");
        
        enrollmentService.enrollStudentInSection(s1, testSection);
        enrollmentService.enrollStudentInSection(s2, testSection);

        // Act & Assert
        assertThrows(CapacityExceededException.class, () -> {
            enrollmentService.enrollStudentInSection(s3, testSection);
        }, "Should throw CapacityExceededException when section is full");
    }

    // 2. TEST: Tuition Calculation
    @Test
    public void testCalculateFee_CorrectAmount() throws EnrollmentException {
        // Arrange
        int studentID = 1;
        int units = 3;
        double expectedFee = 3 * 500.0; // Rate is 500 per unit

        // Act
        tuitionService.calculateFee(studentID, units);
        double actualBalance = tuitionService.getRemainingBalance(studentID);

        // Assert
        assertEquals(expectedFee, actualBalance, "Tuition calculation should be units * 500");
    }

    // 3. TEST: Duplicate Student ID
    @Test
    public void testAddStudent_DuplicateID_ThrowsException() throws EnrollmentException {
        // Arrange
        Student s1 = new Student(1, "Alice", "IT");
        Student s2 = new Student(1, "Bob", "CS"); // Same ID
        
        studentService.addStudent(s1);

        // Act & Assert
        assertThrows(DuplicateEntryException.class, () -> {
            studentService.addStudent(s2);
        }, "Should throw DuplicateEntryException for duplicate student IDs");
    }

    // 4. TEST: Payment Processing
    @Test
    public void testMakePayment_ReducesBalance() throws EnrollmentException {
        // Arrange
        int studentID = 1;
        tuitionService.calculateFee(studentID, 6); // 3000 total
        double paymentAmount = 1000.0;
        double expectedBalance = 2000.0;

        // Act
        tuitionService.makePayment(studentID, paymentAmount);
        double actualBalance = tuitionService.getRemainingBalance(studentID);

        // Assert
        assertEquals(expectedBalance, actualBalance, "Balance should decrease by the payment amount");
    }

    // 5. TEST: Instructor Assignment
    @Test
    public void testAssignInstructorToSection_UpdatesSection() throws EnrollmentException {
        // Arrange
        Instructor instructor = new Instructor(1, "Dr. Smith", "Java");
        Section section = new Section(101, "BSIT-1A");

        // Act
        instructorService.assignInstructorToSection(instructor, section);

        // Assert
        assertNotNull(section.getAssignedInstructor(), "Section should have an assigned instructor");
        assertEquals("Dr. Smith", section.getAssignedInstructor().getName(), "Instructor name should match");
    }
}
