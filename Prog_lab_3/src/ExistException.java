public class ExistException extends NullPointerException {
    private String trouble = "не проинициализировано";
    ExistException() {
        trouble = "не проинициализированная сущность";
    }
    ExistException(String s) {
        super(s);
        trouble = s + trouble;
    }
    ExistException(String s, String ss) {
        super(s);
        trouble = s + ss;
    }
    public String getExc() {
        return trouble;
    }
}
