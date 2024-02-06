package org.ik.data;

import java.util.Map;

import javax.annotation.PostConstruct;

public class Student {
    private String name;
    private Map<Subject, Integer> marks;
    private Boolean isEnrolled = false;

    public Student(String name, Map<Subject, Integer> marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Subject, Integer> getMarks() {
        return marks;
    }

    public void setMarks(Map<Subject, Integer> marks) {
        this.marks = marks;
    }

    public Boolean getEnrolled() {
        return isEnrolled;
    }

    public void setEnrolled(Boolean enrolled) {
        isEnrolled = enrolled;
    }

    public double calculateAverageMark() {
        return marks.values()
                .stream()
                .mapToInt(Number::intValue)
                .average()
                .orElse(0.0);
    }

    @PostConstruct
    public void init() {
        if (calculateAverageMark() >= 3.0) {
            isEnrolled = true;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                ", isEnrolled=" + isEnrolled +
                '}';
    }
}
