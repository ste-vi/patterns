package org.stevi.gof.adapter;

public class AdapterExample {

    public static void main(String[] args) {

        XmlReporter xmlReporter = new XmlReporter();
        ReportAdapter reportAdapter = new ReportAdapter(xmlReporter);

        ReportPublisher reportPublisher = new ReportPublisher();
        reportPublisher.publishReport(reportAdapter.generateReport());
    }
}
