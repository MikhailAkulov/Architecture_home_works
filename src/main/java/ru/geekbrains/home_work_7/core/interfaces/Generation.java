package ru.geekbrains.home_work_7.core.interfaces;

import ru.geekbrains.home_work_7.domain.Report;

import java.util.Collection;

public interface Generation {
    void generateReportTXT(Collection<Report> reports);

    void generateReportCSV(Collection<Report> reports);

    void generateReportPDF(Collection<Report> reports);
}