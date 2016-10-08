/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.joda.time.LocalDate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mark
 */
public class StudentTest {
    
    public StudentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    

    /**
     * Test of getAge method, of class Student.
     * @throws java.lang.Exception
     */
    @org.junit.Test
    public void testGetAge() throws Exception
    {
       LocalDate DOB = new LocalDate (1993, 7, 20);
       Student testStudent = new Student("Mark killeen", 23, "12402538","chief",DOB);
       int expResult = 23;
       int result = testStudent.getAge();
       assertEquals(expResult, result);
       
    }

 

 

    /**
     * Test of getUsername method, of class Student.
     */
    @org.junit.Test
    public void testGetUsername() {
       LocalDate DOB = new LocalDate(1995, 8, 24);
       Student testStudent = new Student("Mark killeen", 23, "12402538","chief",DOB);
       String expResult = "mark123";
       String result = testStudent.getUsername();
       assertEquals(expResult, result);
    }
}

    