package com.dl.refType;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//innerBeans referType

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("refType.xml");
    	Honda h =(Honda)context.getBean("id1");
    	System.out.println(h);
    	context.close();
        
    }
}
