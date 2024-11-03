package Jobsheet5;

class Manager extends Employee {
    public Manager(String name, int id) {
        super(name, id);
    }

    public void manage() {
        System.out.println(name + " is managing the team.");
    }
}

