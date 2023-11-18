package com.withByName;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("withByName.xml");
    	Honda h = (Honda) context.getBean("id1");
    	System.out.println(h);
    	context.close();
    }
}

/*
//byName
	<bean name="id1" class="com.withByName.Honda" autowire="byName"></bean>
	
	<bean name="models" class="com.withByName.Models" p:models="Honda-XUV" p:type="Automatic">
	
	
	In byName the bean name and property name should be same, if we use byName then mention the name on the next bean name="models"

//byType
 
 	<bean name="id1" class="com.withByType.Honda" autowire="byType"></bean>
	
	<bean name="id2" class="com.withByType.Models" p:models="Honda-city" p:type="Manual">


*/