package ru.geekbrains.home_work_7.core.interfaces;

import ru.geekbrains.home_work_7.domain.Report;

public interface ReportStoring {

    void addReport(Report report);
    void removeReport(Report report);

}