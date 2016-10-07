/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mark
 */


import java.util.ArrayList;
import org.joda.time.*;

public class Student 
   {
	 
		
		public String name;
		public final int age;
		private final String idnum;
		private final String username;
		private final DateTime DOB;
		private Coursename course;
		
		
		public Student (String n, int a, String id, String user, DateTime day)
		{ 	this.name = n;
			this.age = a;
			this.idnum = id;
			this.username = user;
			this.DOB = day;
		
		}

		
	
		public String getName(){
			return this.name; 
		}
		
		public int getAge(){
			return this.age; 
			}
                public String getIDnum(){
			return this.idnum;
		}
	
		
		
		public DateTime getDOB(){
			return DOB;
		}
		public String getUsername(){
		return name + age;
}
		public String getStudent(){
			return this.name + this.DOB + this.idnum;
		}
		
		public void addStudent (Coursename course){
			 this.course = course;
		}
                
                public void addStudenttocourse (Coursename course){
			 this.course = course;
                }
                
		public  Coursename getCourse() {
			return this.course;
		}
               
                
                
                
                
	    public ArrayList<Module> getModules(ArrayList<Module> modules) {
	        ArrayList<Module> studentsModules = new ArrayList<>();
	        for (int i=0; i< modules.size(); i++) {
	                Module module = modules.get(i);

	            if (module.getStudents().contains(this)) {
	                studentsModules.add(module);
	            }
	        }
	        return studentsModules;
            }
}

  
