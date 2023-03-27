class Decoration implements InterfaceStFunct {
    private Planets planet;
    void addFlower(InterfaceRoad r, AbstractFlower f) {
        planet = f.FlowersHome;
        r.add(f);
    }
    void showFlowersOnTheRoad(InterfaceRoad r) {
        System.out.println("По обеим сторонам возвышались растения с планеты " + planet.toString() + ": ");
        System.out.println(r.toString());
    }
    void getFlowersList(InterfaceRoad r) {
        System.out.println(r.toString());
    }
}
