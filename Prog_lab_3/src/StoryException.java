class StoryException extends Exception {
    private String exc;
    StoryException(String s) {
        super(s);
        exc = s;
    }
    public String getExc() {
        return exc;
    }
}
