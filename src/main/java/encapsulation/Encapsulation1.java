package encapsulation;

public class Encapsulation1 {
    private int ssn = 100003123;
    private String disease = "Cancer";
    private double salary = 200000;

    public int getSsn() {
        return ssn;
    }
    public void setSsn(int ssn) {
        this.ssn = ssn;
    }
    public void setDisease(String disease) {
        this.disease = disease;
    }
    public double getSalary() {
        return salary;
    }
}

