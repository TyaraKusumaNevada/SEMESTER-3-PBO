package Jobsheet5;

class intern extends Employee {
    public intern(String name, int id) {
        super(name, id);
    }

    public void learn() {
        System.out.println(name + " is learning from the team.");
    }
}
