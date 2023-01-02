package ru.geekbrains.home_work_7.core;

import ru.geekbrains.home_work_7.UI.UIPresenter;
import ru.geekbrains.home_work_7.core.interfaces.Generation;
import ru.geekbrains.home_work_7.domain.Report;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.Date;
import java.util.Random;

public class ReportGenerator implements Generation, UIPresenter {
    @Override
    public void generateReportTXT(Collection<Report> reports) {
        Date generateDate = new Date();
        String fileName = "ReportTXT" + "_" + generateDate.getTime();
        try (FileWriter fileWriter = new FileWriter(new File("src/main/java/ru/geekbrains/home_work_7/reportsFiles/"+
                fileName +".txt"))){
            for (Report rep: reports
            ) {
                fileWriter.write(rep.toString() + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void generateReportCSV(Collection<Report> reports) {
        //TODO
    }

    @Override
    public void generateReportPDF(Collection<Report> reports) {
        //TODO
    }

    @Override
    public void RecordEditor(Collection<Report> reports) {
        Random random = new Random();
        int recordPrice = random.nextInt(5, 11);
        for (int i = 0; i <= recordPrice ; i++) {
            reports.add(new Report("Product", random.nextInt(1, 101),
                    Math.floor((random.nextDouble(1, 1001))*100)/100));
        }
    }

    @Override
    public void OutputReportToConsole(Collection<Report> reports) {
        for (Report r: reports) {
            System.out.println(r);
        }
    }

    @Override
    public void saveReportToTXT() {

    }

    @Override
    public void saveReportToCSV() {

    }

    @Override
    public void saveReportToPDF() {

    }
}