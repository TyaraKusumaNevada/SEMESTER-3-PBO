package Jobsheet3;

public class EncapTest {
    public static void main(String[] args) {
        EncapDemo encap = new EncapDemo();
        encap.setName("James");
        encap.setAge(35); // Akan diubah jadi 30
        System.out.println("Name : " + encap.getName());
        System.out.println("Age  : " + encap.getAge());

        encap.setAge(17); // Akan diubah jadi 18
        System.out.println("Name : " + encap.getName());
        System.out.println("Age  : " + encap.getAge());
    }
}

