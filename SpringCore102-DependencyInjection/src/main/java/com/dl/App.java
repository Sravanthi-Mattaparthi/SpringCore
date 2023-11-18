package com.dl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
       
       Brand b1 = (Brand)context.getBean("id1",Brand.class);
       System.out.println(b1.Honda());
       
       
       Brand b2 = (Brand) context.getBean("id2",Brand.class); 
       System.out.println(b2.Honda());
       
       context.close();
    }
}
