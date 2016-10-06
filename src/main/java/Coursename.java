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

public class Coursename {
private String name;
public ArrayList<Module> mod;
private DateTime start_date;
private DateTime end_date;


public Coursename(String n, ArrayList<Module> mod, DateTime s_date, DateTime f_date)
{
	this.name = n;
	this.mod = mod;
	this.start_date = s_date;
	this.end_date = f_date;
}



public String getName() {
    return this.name;
}

public void setName(String name){
    this .name = name;
}

public ArrayList<Module> getModules() {
    return this.mod;
}

public void setModules(ArrayList<Module>  modules){
    this.mod = modules;
}

public DateTime getStartDate() {
    return this.start_date;
}
public DateTime getEndDate() {
    return this.end_date;
}

public void setStartDate(DateTime start_date) {
    this.start_date = start_date;
}
public void setEndDate(DateTime end_date) {
    this.end_date = end_date;
}
}
