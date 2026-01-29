package tn.esprit.studentmanagement;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import tn.esprit.studentmanagement.services.StudentService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)

class StudentServiceTest {

    @Mock
    private StudentService studentServiceMock;

    @InjectMocks
    private StudentService studentService;

    // TEST OK
    @Test
    void testInstanceMock() {

        when(studentServiceMock.getStudentName())
                .thenReturn("Dorsaf");

        String result = studentServiceMock.getStudentName();

        assertEquals("Dorsaf", result);
    }


}