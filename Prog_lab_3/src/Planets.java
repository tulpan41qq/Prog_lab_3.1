enum Planets {
    Earth("Земля"),
    Moon("Луна");
    private final String Type;
    Planets(String t) {
        Type = t;
    }

    @Override
    public String toString() {
        return Type;
    }
}
