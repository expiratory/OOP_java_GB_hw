public class Cat extends Animal{

    public boolean isCalled = false;
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Котик " + name + ", с возрастом " + age + " лет";
    }

    public String sayMeow(Cat cat, Person person) {
        if (cat.isCalled == true) {
            return "Котик " + cat.name + " говорит мяу и идет к хозяину " + person;
        }
        else {
            return "Этого котика никто не звал :(";
        }
    }

}
