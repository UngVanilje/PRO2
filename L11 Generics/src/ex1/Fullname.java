package ex1;

public class Fullname implements Comparable<Fullname>{
    private String firstName;
    private String lastName;

    public Fullname(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Fullname: " + firstName + " " + lastName;
    }

    @Override
    public int compareTo(Fullname n) {
        if(this.firstName.compareTo(n.firstName) != 0){
            return this.firstName.compareTo(n.firstName);
        } else {
            return this.lastName.compareTo(n.lastName);
        }
    }
}
