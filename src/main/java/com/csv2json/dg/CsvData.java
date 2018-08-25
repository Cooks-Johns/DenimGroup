package com.csv2json.dg;

public class CsvData {

    private String teamName;
    private int appId;
    private String appName;
    private int vulnerabilityId;
    private String vulnerabilityReference;
    private String severity;
    private boolean status;
    private int openDate;
    private String scanner;
    private int cweId;
    private String cweName;
    private String owaspTopTen;
    private String path;
    private String parameter;
    private String payload;
    private String attackSurfacePath;
    private String attackString;
    private String attackRequest;
    private String attackResponse;
    private String scannerDetails;
    private String scannerRecommendation;
    private String remediationTargetDate;
    private String vulnerabilityTags;


    public CsvData(String teamName,
                   int appId,
                   String appName,
                   int vulnerabilityId,
                   String vulnerabilityReference,
                   String severity,
                   boolean status,
                   int openDate,
                   String scanner,
                   int cweId,
                   String cweName,
                   String owaspTopTen,
                   String path,
                   String parameter,
                   String payload,
                   String attackSurfacePath,
                   String attackString,
                   String attackRequest,
                   String attackResponse,
                   String scannerDetails,
                   String scannerRecommendation,
                   String remediationTargetDate,
                   String vulnerabilityTags) {
        this.teamName = teamName;
        this.appId = appId;
        this.appName = appName;
        this.vulnerabilityId = vulnerabilityId;
        this.vulnerabilityTags = vulnerabilityTags;
        this.vulnerabilityReference = vulnerabilityReference;
        this.severity = severity;
        this.status = status;
        this.openDate = openDate;
        this.scanner = scanner;
        this.cweId = cweId;
        this.cweName = cweName;
        this.owaspTopTen = owaspTopTen;
        this.path = path;
        this.parameter = parameter;
        this.payload = payload;
        this.attackSurfacePath = attackSurfacePath;
        this.attackString = attackString;
        this.attackRequest = attackRequest;
        this.attackResponse = attackResponse;
        this.scannerDetails = scannerDetails;
        this.scannerRecommendation = scannerRecommendation;
        this.remediationTargetDate = remediationTargetDate;
    }


    public String getOwaspTopTen() {
        return owaspTopTen;
    }

    public void setOwaspTopTen(String owaspTopTen) {
        this.owaspTopTen = owaspTopTen;
    }

    public String getCweName() {
        return cweName;
    }

    public void setCweName(String cweName) {
        this.cweName = cweName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getAppId() {
        return appId;
    }

    public void setAppId(int appId) {
        this.appId = appId;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public int getVulnerabilityId() {
        return vulnerabilityId;
    }

    public void setVulnerabilityId(int vulnerabilityId) {
        this.vulnerabilityId = vulnerabilityId;
    }

    public String getVulnerabilityReference() {
        return vulnerabilityReference;
    }

    public void setVulnerabilityReference(String vulnerabilityReference) {
        this.vulnerabilityReference = vulnerabilityReference;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getOpenDate() {
        return openDate;
    }

    public void setOpenDate(int openDate) {
        this.openDate = openDate;
    }

    public String getScanner() {
        return scanner;
    }

    public void setScanner(String scanner) {
        this.scanner = scanner;
    }

    public int getCweId() {
        return cweId;
    }

    public void setCweId(int cweId) {
        this.cweId = cweId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public String getAttackSurfacePath() {
        return attackSurfacePath;
    }

    public void setAttackSurfacePath(String attackSurfacePath) {
        this.attackSurfacePath = attackSurfacePath;
    }

    public String getAttackString() {
        return attackString;
    }

    public void setAttackString(String attackString) {
        this.attackString = attackString;
    }

    public String getAttackRequest() {
        return attackRequest;
    }

    public void setAttackRequest(String attackRequest) {
        this.attackRequest = attackRequest;
    }

    public String getAttackResponse() {
        return attackResponse;
    }

    public void setAttackResponse(String attackResponse) {
        this.attackResponse = attackResponse;
    }

    public String getScannerDetails() {
        return scannerDetails;
    }

    public void setScannerDetails(String scannerDetails) {
        this.scannerDetails = scannerDetails;
    }

    public String getScannerRecommendation() {
        return scannerRecommendation;
    }

    public void setScannerRecommendation(String scannerRecommendation) {
        this.scannerRecommendation = scannerRecommendation;
    }

    public String getRemediationTargetDate() {
        return remediationTargetDate;
    }

    public void setRemediationTargetDate(String remediationTargetDate) {
        this.remediationTargetDate = remediationTargetDate;
    }

    public String getVulnerabilityTags() {
        return vulnerabilityTags;
    }

    public void setVulnerabilityTags(String vulnerabilityTags) {
        this.vulnerabilityTags = vulnerabilityTags;
    }
}
