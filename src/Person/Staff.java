package Person;

public class Staff extends Person {
    private  String school;
    private double pay;

    public Staff(String firstName, String lastName, String address, String school, double pay) {
        super(firstName, lastName, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff{Person | " +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", school='" + school + '\'' +
                ", pay=" + pay +
                '}';
    }
}
