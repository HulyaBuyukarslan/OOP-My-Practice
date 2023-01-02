package encapsulation;

public class Encapsulation2 {

    private int ssn = 1234;
    private String disease = "Headahce";
    private double salary = 100000;


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

