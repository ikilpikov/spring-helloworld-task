package org.ik.context;

import org.ik.data.Student;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class StudentBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Student) {
            Student student = (Student) bean;

            if (student.getName().equals("Jil") && student.calculateAverageMark() < 3) {
                student.getMarks()
                        .entrySet()
                        .stream()
                        .filter(x -> x.getValue() < 3)
                        .forEach(x -> student.getMarks().put(x.getKey(), 5));
            }
        }

        return bean;
    }
}
