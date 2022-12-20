import java.util.HashMap;
import java.util.Map;

public class Person {

    private static final Map<Integer, Division> hashMapDivision = new HashMap<>();
    private Integer id;
    private String name;
    private String gender;
    private String birtDate;
    private Division division;
    private Integer salary;

    public Person(String [] listPerson) {
        this.id = Integer.parseInt(listPerson[0]);
        this.name = listPerson[1];
        this.gender = listPerson[2];
        this.birtDate = listPerson[3];
        if (!hashMapDivision.containsKey(listPerson[4].hashCode())) {
            hashMapDivision.put(listPerson[4].hashCode(), new Division(listPerson[4]));
        }
        this.division = hashMapDivision.get(listPerson[4].hashCode());
        this.salary = Integer.parseInt(listPerson[5]);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirtDate() {
        return birtDate;
    }

    public void setBirtDate(String birtDate) {
        this.birtDate = birtDate;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person(" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birtDate='" + birtDate + '\'' +
                "', d_id=" + division.getId() +" Division=" + '\'' + division.getName() +
                ", salary=" + salary +
                ')' + '\n';
    }
}