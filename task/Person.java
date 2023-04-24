package task;
import java.util.Objects;

public class Person implements iPerson, iYearOfBirth {

    private String name;
    private String surname;
    private Integer age;
    private String sex;
    Person(String personName, String personSurname, Integer personAge, String personSex){
        this.name = personName;
        this.surname = personSurname;
        this.age = personAge;
        this.sex = personSex;
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public String getSurname(){
        return this.surname;
    }

    @Override
    public Integer getAge(){
        return this.age;
    }

    @Override
    public String getSex(){
        return this.sex;
    }

    @Override
    public String toString(){
        return "[Имя: " + name + ", Фамилия: " + surname + ", Возраст:" + age + ", Пол: " + sex + "]";
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, surname, age, sex);
    }

    @Override
    public void getFullName() {
        GetFullName getFullName = new GetFullName(name, surname, age, sex);
        getFullName.GetFullName();
    }

    @Override
    public void getYearOfBirth() {
        GetYearOfBirth getYearOfBirth = new GetYearOfBirth(name, surname, age, sex);
        getYearOfBirth.getYearOfBirth();
    }
}
