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

public class Coursename 
{
    
private String name;
public ArrayList<Module> modules;
private LocalDate start_date;
private LocalDate end_date;


public Coursename(String n, ArrayList<Module> modules, LocalDate s_date, LocalDate f_date)
    {
	this.name = n;
	this.modules = modules;
	this.start_date = s_date;
	this.end_date = f_date;
    }
 public void addModule(Module module) {
        this.modules.add(0, module);

        for(Student student: module.getStudents()) {
            student.setCourse(this);
        }
    }


public String getName() {
    return this.name;
    }

public void setName(String name){
    this .name = name;
    }

public ArrayList<Module> getModules() {
    return this.modules;
    }   

public void setModules(ArrayList<Module>  modules){
    this.modules = modules;
    }

public LocalDate getStartDate() {
    return this.start_date;
    }
public LocalDate getEndDate() {
    return this.end_date;
    }

public void setStartDate(LocalDate start_date) {
    this.start_date = start_date;
    }
public void setEndDate(LocalDate end_date) {
    this.end_date = end_date;
   }
}
