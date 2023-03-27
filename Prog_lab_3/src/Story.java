public class Story {
    public static void main(String[] args) {
        System.out.println();
        Place highway = new Place("шоссе");
        Place forestRoad = new Place("лесная дорога");
        Place unknownPlace = new Place("неизвестно");
        StoryHero scooperfield = new StoryHero("Господин Скуперфильд", unknownPlace);
        StoryHero krabs = new StoryHero("Господин Крабс", highway);
        Bear medv = new Bear("медвежонок");

        scooperfield.toString();
        scooperfield.missBear(medv);
        scooperfield.fidgeting();
        scooperfield.wantsToSee(medv);
        scooperfield.wantsToCuddle(medv);

        System.out.println();

        System.out.println("Между тем");

        System.out.println();

        krabs.turnFrom(highway);
        krabs.driveTo(forestRoad);

        System.out.println();

        Roads road = new Roads();
        Flower cedar = new Flower("кедры", Planets.Moon);
        Flower oak = new Flower("дубы", Planets.Moon);
        Flower chestnut = new Flower("каштаны", Planets.Moon);
        Flower bambooLeaves = new Flower("заросли бамбука", Planets.Moon);
        Decoration decoration = new Decoration();
        decoration.addFlower(road, cedar);
        decoration.addFlower(road, oak);
        decoration.addFlower(road, chestnut);
        decoration.addFlower(road, bambooLeaves);

        if (krabs.investigate()) {
            krabs.drive(forestRoad);
            decoration.showFlowersOnTheRoad(road);
            krabs.nostalgy(Planets.Moon);
        }
        System.out.println();

        Place forest = new Place("лес");
        krabs.choosePlace(forest);
        krabs.driveAway();
        krabs.drive(forest);

        System.out.println();
        System.out.println("Конец истории.");
        System.out.println();
        System.out.println("Содержимое истории:");
        System.out.println("Герои: " + krabs.getName() + ", " + scooperfield.getName());
        System.out.println("Места: " + highway.getPlace() + ", " + forestRoad.getPlace() + ", " + forest.getPlace());
        System.out.println("Цветы: ");
        decoration.getFlowersList(road);
    }
    static private class Flower extends AbstractFlower {
        Flower(String name, Planets p) {
            super(name, p);
        }
    }
}