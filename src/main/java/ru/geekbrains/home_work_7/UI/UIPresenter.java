package ru.geekbrains.home_work_7.UI;

import ru.geekbrains.home_work_7.domain.Report;

import java.util.Collection;

public interface UIPresenter {
    void RecordEditor(Collection<Report> reports);
    void OutputReportToConsole(Collection<Report> reports);
    void saveReportToTXT();
    void saveReportToCSV();
    void saveReportToPDF();
}