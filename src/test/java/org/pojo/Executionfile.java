package org.pojo;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
//deserialization means we will use read, for write we will use serialization
public class Executionfile {
	 public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		//FileReader f = new FileReader("C:\\Users\\sreej\\eclipse-workspace\\Classespojo\\src\\test\\resources\\sample.json");
		 File f = new File("C:\\Users\\sreej\\eclipse-workspace\\Classespojo\\src\\test\\resources\\Write.json");
		ObjectMapper q = new ObjectMapper();
//		samplepojo value = q.readValue(f, samplepojo.class);
//		System.out.println(value.getName());
//		System.out.println(value.getJob());
//		System.out.println(value.getSalary());
		Root a = new Root();
		q.writeValue(f, a);
		
	}
	

}
