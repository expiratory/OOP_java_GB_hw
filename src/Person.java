public class Person {
    public String fullName;
    public String gender;

    public Person(String fullName, String gender) {
        this.fullName = fullName;
        this.gender = gender;
    }

    public Person() {
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return fullName;
    }

    public String petTheCat(Cat cat, Person master) {
        return "Человек " + master + " погладил " + cat.name;
    }

    public String callTheCat(Cat cat, Person master) {
        cat.isCalled = true;
        return "Человек " + master + " позвал котика " + cat.name;
    }
}
