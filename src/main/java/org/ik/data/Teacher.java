package org.ik.data;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("teacher")
public class Teacher {
   private String name;
   private List<Student> students;

   public Teacher(@Value("Vitalik") String name, List<Student> students) {
      this.name = name;
      this.students = students;
   }

   public List<Student> getStudents() {
      return students;
   }

   public void setStudents(List<Student> students) {
      this.students = students;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   @Override
   public String toString() {
      return "Teacher{" +
              "name='" + name + '\'' +
              ", students=" + students +
              '}';
   }
}
