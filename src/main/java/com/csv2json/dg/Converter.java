package com.csv2json.dg;


import com.fasterxml.jackson.databind.ObjectMapper;

public class Converter {

    public static void main(String[] args) {


        ObjectMapper mapper = new ObjectMapper();

        CsvPojo csvPojo = csvObject();

    }



    private static CsvPojo csvObject(){

        CsvPojo csvObject = new CsvPojo();

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

        return csvObject;

    }
}
