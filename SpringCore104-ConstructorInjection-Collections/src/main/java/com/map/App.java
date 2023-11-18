package com.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("map.xml");
    	Honda h = context.getBean("id1",Honda.class);
    	System.out.println(h);
    	context.close();
    }
}
