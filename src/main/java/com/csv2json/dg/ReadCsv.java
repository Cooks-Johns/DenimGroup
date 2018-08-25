package com.csv2json.dg;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCsv {

    public void readCsv() {
        String csvFileToRead = "csv/SampleCsv.csv";
        BufferedReader reading = null;
        String line = "";
        String splitBy = ",";
        List<CsvData> csvList = new ArrayList<CsvData>();

        try {
            reading = new BufferedReader(new FileReader(csvFileToRead));
            while ((line = reading.readLine()) != null) {


                // splits on the comma
                String[] csv = line.split(splitBy);

                // this is where the car values are stored
                CsvData csvObject = new CsvData();
                csvObject.setTeamName(csv[0]);
                csvObject.setAppId(csv[1]);
                csvObject.setAppName(csv[2]);
                csvObject.setVulnerabilityId(csv[3]);
                csvObject.setVulnerabilityReference(csv[4]);

                System.out.println("DgCsvData [ Team Name= " + csv[0]
                        + ",app Unique ID= " + csv[1]
                        + "  Application Name= " + csv[2]
                        + " ,Vulnerability ID= " + csv[3]
                        + " ,Vulnerability Name= " + csv[4]
                        + " ,Vulnerability Reference= " + csv[5]
                        + " ,Severity= " + csv[6]
                        + " ,Status= " + csv[7]
                        + " ,Open Date= " + csv[8]
                        + " ,Scanner= " + csv[9]
                        + " ,CWE ID= " + csv[10]
                        + " ,CWE Name= " + csv[11]
                        + " ,OWASP Top 10= " + csv[12]
                        + " , Path= " + csv[13]
                        + " ,Parameter= " + csv[14]
                        + " ,Payload= " + csv[15]
                        + " ,Attack Surface Path= " + csv[16]
                        + " ,Attack String= " + csv[17]
                        + " ,Attack Request= " + csv[18]
                        + " ,Attack Response= " + csv[19]
                        + " ,Scanner Details= " + csv[20]
                        + " ,Scanner Recommendation= " + csv[21]
                        + " ,Remediation Target Date= " + csv[22]
                        + " ,Application Tags= " + csv[23]
                        + " ,Vulnerability Tags=" + csv[24]
                );
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(reading != null) {
                try {
                    reading.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("This program has finished reading your CSV file.");
    }

    public static void main(String[] args) {
        System.out.println();
    }

}
