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

public class Module
{
    private final String mod_name;
    private final String mod_id;
    private final ArrayList<Student> students;

    public Module(String module, String id)
    {
      this.mod_name = module;
      this.mod_id = id;
      this.students = new ArrayList<>();

    }

    public String getName() {
      return this.mod_name;
    }

    public String getId() {
      return this.mod_id;
    }

    public ArrayList<Student> getStudents() {
      return this.students;
    }

    public void addStudents(ArrayList<Student> students) {
      this.students.addAll(students);
     }
}