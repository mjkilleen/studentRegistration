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
		private final LocalDate DOB;
		private Coursename course;
		private ArrayList<Module> modules = new ArrayList<Module>();
		
		public Student (String n, int a, String id, String user, LocalDate day)
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
	
		
		
		public LocalDate getDOB(){
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
                
                public void addStudentocourse (Coursename course){
			 this.course = course;
                }
                public ArrayList<Module> getModules() {
                 return modules;
                }
                
                public void setModules(ArrayList<Module> modules) {
                   this.modules = modules;
                  
                 }
                public void addModule(Module module) {
                   this.modules.add(0, module);
                 }
                
		public  Coursename getCourse() {
			return this.course;
                }
                public void setCourse(Coursename course) {
                this.course = course;
    }
		}
               
                
                

