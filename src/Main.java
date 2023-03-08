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

        Wardrobe w = new Wardrobe();
        System.out.println(w.open(ivan));
        System.out.println(w.close(ivan));

        Cat cat1 = new Cat("pushok", 5);
        System.out.println(ivan.petTheCat(cat1, ivan));
        System.out.println(ivan.callTheCat(cat1, ivan));
        System.out.println(cat1.sayMeow(cat1, ivan));
    }

}
