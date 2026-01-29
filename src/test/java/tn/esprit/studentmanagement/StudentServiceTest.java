package tn.esprit.studentmanagement;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import tn.esprit.studentmanagement.services.StudentService;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentServiceTest {

    @Test
    void testWithMockito() {

        StudentService serviceMock = Mockito.mock(StudentService.class);

        Mockito.when(serviceMock.getStudentName()).thenReturn("Dorsaf");

        String result = serviceMock.getStudentName();

        assertEquals("Dorsaf", result);
    }
}