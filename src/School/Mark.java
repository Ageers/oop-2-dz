package School;

public class Mark {

    private int value;
    private String subject;

    public Mark(int value, String subject) {
        if (value < 2 || value > 5){
            throw new IllegalArgumentException("please input objective value >= 2 or <= 5");
        }

        this.value = value;
        this.subject = subject;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Mark{" +
                "value=" + value +
                ", subject='" + subject + '\'' +
                '}';
    }
}
