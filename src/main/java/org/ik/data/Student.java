package org.ik.data;

import java.util.Map;
import java.util.stream.IntStream;

public class Student {
    private String name;
    private Map<String, Integer> marks;
    private Boolean isEnrolled = false;

    public Student(String name, Map<String, Integer> marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Integer> getMarks() {
        return marks;
    }

    public void setMarks(Map<String, Integer> marks) {
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                ", isEnrolled=" + isEnrolled +
                '}';
    }
}
