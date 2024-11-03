package Jobsheet5;

public class MainHierarchical {
    public static void main(String[] args) {
        Manager manager = new Manager("Aliya", 100);
        manager.work();   // Dari class Employee
        manager.manage(); // Dari class Manager

        Engineer engineer = new Engineer("John", 200);
        engineer.work();   // Dari class Employee
        engineer.design(); // Dari class Engineer

        intern intern = new intern("Coco", 300);
        intern.work();   // Dari class Employee
        intern.learn();  // Dari class Intern
    }
}


