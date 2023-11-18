package com.one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("objRef.xml");
       Brand b= (Brand) context.getBean("id1");
       System.out.println(b); //brand class values we get
       context.close();
    }
}
