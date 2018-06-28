package com.kpn.nl.assignment.person;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/**
 * The Class PersonApp.
 */
@SpringBootApplication
@ComponentScan({"com.kpn.nl.assignment.controller", "com.kpn.nl.assignment.service"})
public class PersonApp 
{
    
    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main( String[] args )
    {
        SpringApplication.run(PersonApp.class, args);
    }
}
