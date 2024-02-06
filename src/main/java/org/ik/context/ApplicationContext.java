package org.ik.context;

import org.ik.data.Student;
import org.ik.data.Subject;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.EnumMap;
import java.util.Map;

import static org.ik.data.Subject.ENGLISH;
import static org.ik.data.Subject.MATH;
import static org.ik.data.Subject.PHYSICS;

@Configuration
@ComponentScan("org.ik.data")
public class ApplicationContext {
    @Bean
    public Student student1() {
        Map<Subject, Integer> marks = new EnumMap<>(Subject.class);
        marks.put(ENGLISH, 5);
        marks.put(MATH, 3);
        marks.put(PHYSICS, 4);

        return new Student("Dasha", marks);
    }

    @Bean
    public Student student2() {
        Map<Subject, Integer> marks = new EnumMap<>(Subject.class);
        marks.put(ENGLISH, 2);
        marks.put(MATH, 2);
        marks.put(PHYSICS, 2);

        return new Student("Sanya", marks);
    }

    @Bean
    public Student student3() {
        Map<Subject, Integer> marks = new EnumMap<>(Subject.class);
        marks.put(ENGLISH, 2);
        marks.put(MATH, 2);
        marks.put(PHYSICS, 3);

        return new Student("Jil", marks);
    }

    @Bean
    public BeanPostProcessor studentBeanPostProcessor() {
        return new StudentBeanPostProcessor();
    }
}
