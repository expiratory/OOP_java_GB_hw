public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Ирина", "female");
        Person vasya = new Person("Вася", "male");
        Person masha = new Person("Маша", "female");
        Person jane = new Person("Женя", "female");
        Person ivan = new Person("Ваня", "male");
        GeoTree gt = new GeoTree();
        gt.append(irina, vasya);
        gt.append(irina, masha);
        gt.append(vasya, jane);
        gt.append(vasya, ivan);
        gt.appendBrotherOrSister(vasya, masha);
        gt.appendBrotherOrSister(jane, ivan);

        System.out.println(new Reserch(gt).spend(irina,
                Relationship.parent));
        System.out.println(new Reserch(gt).spend(vasya,
                Relationship.brother));
    }

}
