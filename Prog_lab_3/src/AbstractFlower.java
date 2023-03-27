abstract class AbstractFlower {
    private String Type = "цветы";
    Planets FlowersHome;
    AbstractFlower(String name, Planets p) {
        Type = name;
        FlowersHome = p;
    }
    String getType() {
        return Type;
    }
}
