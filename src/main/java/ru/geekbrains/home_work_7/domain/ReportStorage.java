package ru.geekbrains.home_work_7.domain;

import ru.geekbrains.home_work_7.core.interfaces.ReportStoring;

import java.util.ArrayList;
import java.util.Collection;

public class ReportStorage implements ReportStoring {
    private Collection<Report> reportCollection = new ArrayList<>();


    @Override
    public void addReport(Report report) {
        reportCollection.add(report);
    }

    @Override
    public void removeReport(Report report) {
        reportCollection.remove(report);
    }

    public Collection<Report> getReportCollection() {
        return reportCollection;
    }
}