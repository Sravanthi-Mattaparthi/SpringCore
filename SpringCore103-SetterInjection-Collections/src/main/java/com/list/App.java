package com.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("list.xml");
    	Honda h = context.getBean("id1",Honda.class);
    	System.out.println("The series name is:" +h.getSname());
    	System.out.println("Models available in this series are:" +h.getModels());
    }
}
