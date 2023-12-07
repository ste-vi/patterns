package org.stevi.gof.adapter;

public class ReportAdapter {

    private final XmlReporter xmlReporter;

    public ReportAdapter(XmlReporter xmlReporter) {
        this.xmlReporter = xmlReporter;
    }

    public String generateReport() {
        String reportInXml = xmlReporter.generateReport();
        return doAdapterLogic(reportInXml);
    }

    private String doAdapterLogic(String reportInXml) {
        return reportInXml.replace("xml", "json");
    }
}
