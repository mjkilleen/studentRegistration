/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import io.github.markkilleen.studentRegistration;
import java.util.ArrayList;
import org.joda.time.LocalDate;
import static org.junit.Assert.*;
import java.lang.Exception;
import static org.hamcrest.CoreMatchers.*;
/**
 *
 * @author Mark
 */
public class StudentTest {
    
    public StudentTest() {
    }
    
  
    public static void setUpClass() {
    }
    
   
    public static void tearDownClass() {
    }

    

    /**
     * Test of getAge method, of class Student.
     */
    @Test
    public void testGetAge() throws Exception {
        LocalDate DOB = new LocalDate(1993,07,20);
        Student testStudent = new Student("Mark Killeen", 23,"12402538", "Mark Killeen23", DOB);
        int expResult = 23;
        int result = testStudent.getAge();
        assertEquals(expResult, result);
    }

   

    /**
     * Test of getUsername method, of class Student.
     */
    @Test
    public void GetUsername() throws Exception {
      
        LocalDate DOB = new LocalDate(1993,7,20);
        Student testStudent = new Student("Mark Killeen", 23,"12402538", "Mark Killeen23", DOB);
        String expResult = "23";
        String result = testStudent.getUsername();
        
        assertEquals(expResult, result);
        
    }
}