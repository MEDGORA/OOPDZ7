package task;
public class GetYearOfBirth extends Person{

    GetYearOfBirth(String personName, String personSurname, Integer personAge, String personSex) {
        super(personName, personSurname, personAge, personSex);
    }
    
    public void getYearOfBirth() {
        System.out.println("[Год рождения: " + (2023-getAge()) + "]");
    }
}