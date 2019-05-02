package com.luv2code.jackson.json.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Driver {

    public static void main(String[] args){
        try{
            // create object mapper
            ObjectMapper mapper = new ObjectMapper();

            // reac JSON file and map/convert to Java/convert to Java POJO:

            Student theStudent = mapper.readValue(new File("data/sample-full.json"), Student.class);

            // print first name and last name
            System.out.println("First name = " + theStudent.getFirstName());
            System.out.println("Last name = " + theStudent.getLastName());
        }
        catch (Exception exc){
            exc.printStackTrace();

        }
    }
}
