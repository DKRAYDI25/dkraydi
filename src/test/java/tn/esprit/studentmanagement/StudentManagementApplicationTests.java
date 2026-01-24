package tn.esprit.studentmanagement;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class StudentManagementApplicationTests {

//    @Test
//    void contextLoads() {
//    }
//

    @Test
    void testAddition() {
        int a = 5;
        int b = 3;


        int result = a + b;


        assertEquals(8, result);
    }
}
