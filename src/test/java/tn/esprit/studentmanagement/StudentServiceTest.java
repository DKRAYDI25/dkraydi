package tn.esprit.studentmanagement;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import tn.esprit.studentmanagement.services.StudentService;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentServiceTest {

    @Test
    void testGetStudentName() {

        // Mock du service
        StudentService serviceMock = Mockito.mock(StudentService.class);

        // Comportement simulé
        Mockito.when(serviceMock.getStudentName()).thenReturn("Dorsaf");

        // Appel
        String result = serviceMock.getStudentName();

        // Vérification
        assertEquals("Dorsaf", result);
    }


    @Test
    void testMethodIsCalled() {

        // Mock du service
        StudentService serviceMock = Mockito.mock(StudentService.class);

        // Appel de la méthode
        serviceMock.getStudentNamee();

        // Vérifier que la méthode a bien été appelée une fois
        Mockito.verify(serviceMock, Mockito.times(1)).getStudentNamee();
    }


}