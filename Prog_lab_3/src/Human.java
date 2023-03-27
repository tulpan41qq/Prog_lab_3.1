import javax.lang.model.element.Name;

class Human implements InterfaceHuman, InterfaceStFunct {
    private String Name;
    AbstractPlace place;

    Human(String n, AbstractPlace p) {
        Name = n;
        place = p;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + Name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        boolean comp = obj.hashCode() == this.hashCode() ? true : false;
        return comp;
    }

    @Override
    public String toString() {
        try {
            if (place == null) throw new ExistException();
        } catch (ExistException e) {
            e.printStackTrace();
            place = new Place("неизвестно");
        } finally {
            return Name + "находится на месте: " + place.getPlace();
        }
    }

    void nostalgy(Planets p) {
        if (p == Planets.Moon)
            System.out.println("\nЭх, цветы на Земле мне нравятся больше - сказал " + Name);
    }

    boolean investigate() {
        if (place.getPlace() == "лесная дорога") {
            System.out.println("Тут так темно и красиво - сказал " + Name);
            return true;
        } else {
            System.out.println("Обычная дорога - сказал " + Name);
            return false;
        }
    }

    public void drive(AbstractPlace h) {
        place = h;
        System.out.println(Name + " поехал по: " + place.getPlace());
    }

    public void turnFrom(AbstractPlace h) {
        place = h;
        System.out.println(Name + " свернул с: " + place.getPlace());
    }

    public String getName() {
        return Name;
    }

    private AbstractBear medvezhonok;

    public void missBear(AbstractBear b) {
        medvezhonok = b;
        System.out.println(Name + " скучает по: " + medvezhonok.getType());
        System.out.println("Скучаю по своему медвежонку - сказал " + Name);
    }

    void fidgeting() {
        System.out.println(Name + " ёрзает от нетерпения");
    }

    void choosePlace(AbstractPlace p) {
        place = p;
        System.out.println(Name + " выбрал место: " + place.getPlace());
    }

    void driveAway() {
        System.out.println(Name + " повернул руль");
    }

    void wantsToSee(AbstractBear b) {
        medvezhonok = b;
        System.out.println(Name + " хочет увидеть: " + medvezhonok.getType());
    }

    void wantsToCuddle(AbstractBear b) {
        medvezhonok = b;
        System.out.println(Name + " хочет приласкать: " + medvezhonok.getType());
    }

    public void driveTo(AbstractPlace h) {
        place = h;
        System.out.println(Name + " поехал в сторону: " + place.getPlace());
    }
}

