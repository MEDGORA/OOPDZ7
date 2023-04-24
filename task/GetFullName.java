package task;

public class GetFullName extends Person {

    GetFullName(String personName, String personSurname, Integer personAge, String personSex) {
        super(personName, personSurname, personAge, personSex);
    }

    public void GetFullName() {
        System.out.println("[Имя: " + getName() + ", Фамилия: " + getSurname() + "]");
    }
}

