package com.component;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("component.xml");
       
       Honda honda = (Honda) context.getBean("honda");
       
       System.out.println(honda);
       
       System.out.println(honda.getModels());
       
       context.close();
    }
}


/*
 @Component use the class name as object reference,
 
the class name need to be passed as object reference , and the class should be add with @component

 

 
 
 */
 
