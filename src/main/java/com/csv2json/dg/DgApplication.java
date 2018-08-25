package com.csv2json.dg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DgApplication {



	public static void main(String[] args) {

        System.out.println("Reading data from CSV: ");
        ReadCsv readCsv = new ReadCsv();
        readCsv.readCsv();

        System.out.println("Reading data from csv and converting it to java object:");
        ReadCsv csvToJavaObject = new ReadCsv();
        csvToJavaObject.readCsv();
//        SpringApplication.run(DgApplication.class, args);
	}
}
