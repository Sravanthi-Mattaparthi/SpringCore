package com.three;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//setter injection pname space
//we use value along with name in same property tag

public class App 
{
    public static void main( String[] args )
    {
       
    	ClassPathXmlApplicationContext context	= new ClassPathXmlApplicationContext("spring.xml"); 
    	Honda h = (Honda) context.getBean("id1",Honda.class);
    	System.out.println("Vehicle name: " +h.getVname());
    	System.out.println("Vehicle no: " +h.getVno());
    	context.close();
    }
}


//keypoint :

/* While using pschema , add the xml pname space definition in bean tag remove , property tag inside the bean
 while using value as element and value as attribute use the property tag inside the bean tag */