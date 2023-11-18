package com.fieldLevel;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//Autowire at fieldlevel

public class App 
{
    public static void main( String[] args )
    {
       
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("autoWiredFieldLevel.xml");
    	
    	Honda h = (Honda)context.getBean("id1");
    	System.out.println(h);
    	context.close();
    }
}
