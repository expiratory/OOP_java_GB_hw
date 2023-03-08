public class Wardrobe {

    public boolean isOpened = false;

    public Wardrobe() {
    }

    public String open(Person p) {
        if (isOpened == false) {
            this.isOpened = true;
            return "Человек " + p + " открыл шкаф";
        }
        else return "Шкаф уже открыт";
    }

    public String close(Person p) {
        if (isOpened == true) {
            this.isOpened = false;
            return "Человек " + p + " закрыл шкаф";
        }
        else return "Шкаф уже закрыт";
    }
}
