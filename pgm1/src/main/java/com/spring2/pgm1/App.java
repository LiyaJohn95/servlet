package com.spring2.pgm1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext context = new ClassPathXmlApplicationContext("bean-confi.xml");
    	 //Address ad = (Address)context.getBean("addr");
    	 Student st = (Student)context.getBean("stud");
    	 st.details();
    	 
    	   
    }
}
