package com.dl.setterInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//innerBeans setterInjection

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("innerSetter.xml");
    	Honda h =(Honda)context.getBean("id1");
    	System.out.println(h);
    	context.close();
        
    }
}
