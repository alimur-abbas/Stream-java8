public class Person {
    private Integer age;
    private String Name;

    public Person(Integer age, String name) {
        this.age = age;
        Name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
