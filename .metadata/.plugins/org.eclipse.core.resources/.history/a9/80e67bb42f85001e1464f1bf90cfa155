package com.withByType;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("withByType.xml");
    	Honda h = (Honda) context.getBean("id1");
    	System.out.println(h);
    	context.close();
    }
}


/*
<bean name="id1" class="com.withoutByType.Honda" p:models-ref="id2"> </bean> without by type
 with by type we remove models-ref and add autiwire= "byType"
 <bean name="id1" class="com.withoutByType.Honda" autowire ="byType"> </bean> without by type

*/