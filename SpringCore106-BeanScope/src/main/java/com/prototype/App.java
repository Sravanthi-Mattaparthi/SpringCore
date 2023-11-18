package com.prototype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("prototype.xml");
       Honda h1 = (Honda)context.getBean("id1");
       System.out.println(h1);
       System.out.println(h1.hashCode());
       
       Honda h2 = (Honda)context.getBean("id1");
       System.out.println(h2);
       System.out.println(h2.hashCode());
       
       context.close();
    }
}


//Same instances
/*

Honda [vno=1998, vname=Honda-Fortune]
1620948027
Honda [vno=1998, vname=Honda-Fortune]
1442191055


hash code sends the object reference

*/