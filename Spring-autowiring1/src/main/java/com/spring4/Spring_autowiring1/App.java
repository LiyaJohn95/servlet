package com.spring4.Spring_autowiring1;

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
       ApplicationContext context = new ClassPathXmlApplicationContext("autowiring.xml");
       Student st = (Student)context.getBean("stud");
  	 st.details();
    }
}
