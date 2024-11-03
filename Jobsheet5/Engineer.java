package Jobsheet5;

class Engineer extends Employee {
    public Engineer(String name, int id) {
        super(name, id);
    }

    public void design() {
        System.out.println(name + " is designing a new project.");
    }
    
}
