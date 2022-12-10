package ru.geekbrains.home_work_2;

/**
 * TODO: �������� ������
 * 1. ���������� ����� generateEmploeyee(), ������� ���������� ������������� ����.
 * 2***. ����� generateEmploeyee() ������ ���� ��� ������� ����������, ��� ����������,
 * ��� � ������ ������������ �������������.
 */

import java.util.Random;

public class Homework{

    static Employee generateEmployee(){

        String[] names = new String[] { "��������", "����", "����", "������", "������", "�������", "����", "���������", "�����", "������" };
        String[] surnames = new String[] { "���������", "�����", "��������", "������", "�����", "�������", "�������", "��������", "������", "�������" };
        Integer[] workerSalary = new Integer[] { 35000, 40000, 45000, 50000, 55000, 60000, 65000, 70000, 75000, 80000 };
        Integer[] freelancerSalary = new Integer[] { 350, 400, 450, 500, 550, 600, 650, 700, 750, 800 };
        Random random = new Random();
        int nameIndex = random.nextInt(names.length);
        int surnameIndex = random.nextInt(surnames.length);
        int workerSalaryIndex = random.nextInt(workerSalary.length);
        int freelancerSalaryIndex = random.nextInt(freelancerSalary.length);

        EmployeeType employeeType = EmployeeType.randomEmployeeType();
        return switch (employeeType) {
            case WORKER -> new Worker(names[nameIndex], surnames[surnameIndex], workerSalary[workerSalaryIndex]);
            case FREELANCER -> new Freelancer(names[nameIndex], surnames[surnameIndex], freelancerSalary[freelancerSalaryIndex]);
        };
    }

    public static void main(String[] args) {

//        Worker worker1 = new Worker("��������", "��������", 70000);
//        System.out.println(worker1);

        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++){
            employees[i] = generateEmployee();
        }

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

/**
 * �������� (������� �����)
 */
abstract class Employee {

    protected String name;
    protected String surname;
    /**
     * ������ ���������� �����
     */
    protected double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    /**
     * ������ �������������� ���������� �����
     * @return
     */
    public abstract double calculateSalary();
}

class Freelancer extends Employee{

    public Freelancer(String name, String surname, double salary) {
        super(name, surname, salary);
    }

    @Override
    public double calculateSalary() {
        return 15 * 6 * salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; ���������; �������������� ���������� �����: %.2f (���.); ��������� ������: %.2f (���.)",
                surname, name, calculateSalary(), salary);
    }
}

class Worker extends Employee{

    public Worker(String name, String surname, double salary) {
        super(name, surname, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; �������; �������������� ���������� ����� (������������� �������� ������): %.2f (���.)",
                surname, name, salary);
    }
}

enum EmployeeType {
    FREELANCER,
    WORKER;

    static final Random r = new Random();
    static EmployeeType randomEmployeeType() {
        EmployeeType[] employees = values();
        return employees[r.nextInt(employees.length)];
    }
}