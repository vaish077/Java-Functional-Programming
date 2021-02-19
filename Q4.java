interface functionalinterface{
    Employee gets(String name,int age, String city);
}

class Employee{
    private String name;
    private int age;
    private String city;

    Employee(String name,int age,String city){
        this.name=name;
        this.age=age;
        this.city=city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
        public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}


public class Q4 {
    public static void main(String...args){
        functionalinterface fi=Employee::new;
        Employee e1=fi.gets("Vaishali",22,"Faridabad");
        Employee e2=fi.gets("Tejas",23,"Alwar");
        System.out.println(e1);
        System.out.println(e2);
    }
}