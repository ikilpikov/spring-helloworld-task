package org.ik;

import org.ik.context.ApplicationContext;
import org.ik.data.Teacher;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
       //createTeacherXml();
        createTeacherJava();
    }

    public static void createTeacherXml() {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("Context.xml");

        Teacher teacher = context.getBean("teacher", Teacher.class);
        System.out.println(teacher);
    }

    public static void createTeacherJava() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ApplicationContext.class);

        Teacher teacher = context.getBean("teacher", Teacher.class);
        System.out.println(teacher);
    }
}
