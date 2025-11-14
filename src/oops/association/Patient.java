package oops.association;
public class Patient {
    String name;
    int age;
    String doa;
    String disease;
    Information info;
    Payment pay;

    public Patient(String name, int age, String doa, String disease, Information info,
                   Payment pay) {
        this.name = name;
        this.age = age;
        this.doa = doa;
        this.disease = disease;
        this.info = info;
        this.pay = pay;
    }
    void patientDetails(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Date Of Arrival: " + this.doa);
        System.out.println("Disease: " + this.disease);
        System.out.println("Block No: " + this.info.blockNo);
        System.out.println("Floor No: " + this.info.floorNo);
        System.out.println("Room No: " + this.info.roomNo);
        System.out.println("Bed No: " + this.info.bedNo);
        System.out.println("Admission Fees: " + this.pay.admFees);
        System.out.println("Registration Fees: " + this.pay.regFees);
        System.out.println("Balance Amount: " + this.pay.balAmt);
    }

    public static void main(String[] args) {
        Information info = new Information('A', 3, 301, 2);
        Payment pay = new Payment(30000, 20000, 10000);
        Patient p1 = new Patient("XYZ", 21, "13 Nov", "Dengue",
                info, pay);
        p1.patientDetails();
    }
}
