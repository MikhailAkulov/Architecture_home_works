package ru.geekbrains.home_work_7;

import ru.geekbrains.home_work_7.core.ReportGenerator;
import ru.geekbrains.home_work_7.domain.ReportStorage;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        ReportStorage reportStorage = new ReportStorage();
        ReportGenerator reportGenerator = new ReportGenerator();

        System.out.println("Welcome to report generator");
        Scanner sc = new Scanner(System.in);
        boolean mark = true;
        while (mark){
            System.out.println("Select a menu item:");
            System.out.println("1 - Generate report");
            System.out.println("2 - Show report in console");
            System.out.println("3 - Save report in txt file");
            System.out.println("4 - Exit");
            System.out.print("Enter the required item: ");
            if(sc.hasNextInt()){
                int userInput = sc.nextInt();
                sc.nextLine();
                try {
                    switch (userInput){
                        case 1:
                            reportGenerator.RecordEditor(reportStorage.getReportCollection());
                            System.out.println("Report was generated");
                            break;
                        case 2:
                            reportGenerator.OutputReportToConsole(reportStorage.getReportCollection());
                            break;
                        case 3:
                            reportGenerator.generateReportTXT(reportStorage.getReportCollection());
                            System.out.println("Report file was created");
                            break;
                        case 4:
                            System.out.println("Shutting down report generator");
                            mark = false;
                            break;
                        default:
                            System.out.println("Input error! Enter correct menu item: ");
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
            }else {
                System.out.println("Enter correct menu item: ");
                sc.nextLine();
            }
        }
    }
}