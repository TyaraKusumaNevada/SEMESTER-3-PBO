package Jobsheet5;

class Employee {
    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void work() {
        System.out.println(name + " is working.");
    }
}
