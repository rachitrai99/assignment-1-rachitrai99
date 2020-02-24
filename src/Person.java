import java.util.ArrayList;

public class Person {
    String FirstName;
    String LastName;
    private ArrayList<Long> a;
    private String email;
    Person(String FirstName,String LastName,ArrayList<Long> a,String email){
        this.a=a;
        this.FirstName=FirstName;
        this.LastName=LastName;
        this.email=email;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getA() {
        String b="";
        int c=0;
        for (int i = 0; i <a.size()-1 ; i++) {
            b=b+a.get(i)+",";}
        return  b+a.get(a.size()-1);
    }

    public String getEmail() {
        return email;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setA(ArrayList<Long> a) {
        this.a = a;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
