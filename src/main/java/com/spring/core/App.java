package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	ApplicationContext context =  new ClassPathXmlApplicationContext("com/spring/core/config.xml");
    	Employee e = (Employee) context.getBean("emp");
    	Employee e1 = (Employee) context.getBean("emp1");
    	Employee e2 = (Employee) context.getBean("emp2");
    	System.out.println(e);
    	System.out.println(e1);
    	System.out.println(e2);
    }
}
