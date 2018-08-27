package com.csv2json.dg;


import au.com.bytecode.opencsv.bean.CsvToBean;
import au.com.bytecode.opencsv.bean.HeaderColumnNameMappingStrategy;
import com.fasterxml.jackson.databind.ObjectMapper;
import csv.CSV;

import java.io.*;

import java.util.List;


public class CsvMover {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        if (args.length > 1) {
            String pathToCsvFile = args[0];
            String javaBeanClassName = "edu.apollogrp.csvtojson.bean." + args[1];
            final File file = new File(pathToCsvFile);
            if (!file.exists()) {
                System.out.println("The file you specified does not exist. path=" + pathToCsvFile);
            }
            Class<?> type = null;
            try {
                type = Class.forName(javaBeanClassName);
            } catch (ClassNotFoundException e) {
                System.out.println("The java bean you specified does not exist. className=" + javaBeanClassName);
            }

            HeaderColumnNameMappingStrategy strat = new HeaderColumnNameMappingStrategy();
            strat.setType(type);

            CsvToBean csv = new CsvToBean();
            List list = csv.parse(strat, new InputStreamReader(new FileInputStream(file)));
            System.out.println(new ObjectMapper().writeValueAsString(list));
        } else {
            System.out.println("Please specify the path to the csv file.");
        }
    }


}
