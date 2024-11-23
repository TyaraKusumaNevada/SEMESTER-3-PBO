package Jobsheet12Praktikum;

public class Tester1 {
    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        InternshipEmployee iEmp = new InternshipEmployee("Sunarto", 5);
        ElectricityBill eBill = new ElectricityBill(5, "R-1"); // Kategori diperbaiki ke "R-1"

        Employee e;
        Payable p;

        e = pEmp;
        System.out.println(e.getEmployeeInfo());

        e = iEmp;
        System.out.println(e.getEmployeeInfo());

        p = pEmp;
        System.out.println("Payment Amount: " + p.getPaymentAmount());

        p = eBill;
        System.out.println("Electricity Bill Info:");
        System.out.println(((ElectricityBill) p).getBillInfo());
    }
}

