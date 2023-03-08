public class Animal {
    public String name;
    public int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Животное " + name + ", с возрастом " + age + " лет";
    }
}
