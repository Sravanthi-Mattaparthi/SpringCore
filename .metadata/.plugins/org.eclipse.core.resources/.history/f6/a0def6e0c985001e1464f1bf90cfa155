package com.qualifier;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("qualifier.xml");
       
       Honda h = (Honda) context.getBean("id1");
       
       System.out.println(h);
       
       System.out.println(h.getModels());
       
       context.close();
    }
}

/*

Qualifier requires bean name , that has the properties in it

here in class models the values are there , it is created as bean with id2 , so this id2 has to be passed in the qualifier. 




*/