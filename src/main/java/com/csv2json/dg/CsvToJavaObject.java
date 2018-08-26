package com.csv2json.dg;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvToJavaObject {


    public void convertCsvToJava() {
        String csvFileToRead = "csvFiles/csvToRead.csv";
        BufferedReader br = null;
        String line = "";
        String splitBy = ",";
        List<csv> csvList = new ArrayList<csv>();

        try {

            br = new BufferedReader(new FileReader(csvFileToRead));
            while ((line = br.readLine()) != null) {

                // split on comma(',')
                String[] csv = line.split(splitBy);

                // create car object to store values
                CsvPojo csvObject = new CsvPojo();

                // add values from csv to car object
                csvObject.setTeamName(csv[0]);
                csvObject.setAppId(csv[1]);
                csvObject.setAppName(csv[2]);
                csvObject.setVulnerabilityId(csv[3]);
                csvObject.setVulnerabilityReference(csv[4]);
                csvObject.setSeverity(csv[5]);
                csvObject.setStatus(csv[6]);
                csvObject.setOpenDate(csv[7]);
                csvObject.setScanner(csv[8]);
                csvObject.setCweId(csv[9]);
                csvObject.setOwaspTopTen(csv[10]);
                csvObject.setPath(csv[11]);
                csvObject.setParameter(csv[12]);
                csvObject.setPayload(csv[13]);
                csvObject.setAttackSurfacePath(csv[14]);
                csvObject.setAttackString(csv[15]);
                csvObject.setAttackRequest(csv[16]);
                csvObject.setAttackResponse(csv[17]);
                csvObject.setScannerDetails(csv[18]);
                csvObject.setScannerRecommendation(csv[19]);
                csvObject.setRemediationTargetDate(csv[20]);
                csvObject.setApplicationTags(csv[21]);
                csvObject.setVulnerabilityTags(csv[22]);

                // adding car objects to a list
                csvList.add(csvObject);

            }
            // print values stored in carList
            printCsvList(csvList);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void printCarList(List<cars> carListToPrint) {
        for (int i = 0; i < carListToPrint.size(); i++) {
            System.out.println("CARS [year= " + carListToPrint.get(i).getYear()
                    + " , make=" + carListToPrint.get(i).getMake()
                    + " , model=" + carListToPrint.get(i).getModel()
                    + " , description="
                    + carListToPrint.get(i).getDescription() + " , price="
                    + carListToPrint.get(i).getPrice() + "]");
        }
    }
}

</cars></cars></cars>
        }
