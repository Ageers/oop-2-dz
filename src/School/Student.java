package School;

public class Student {

    private String fullName;
    private Mark[] marks;
    private int size;
    private int marksCapasity;


    public Student(String fullName, int marksCapasity) {
        this.fullName = fullName;
        this.marks = new Mark[marksCapasity];
        this.size = 0;
    }

    public String getFullName() {

        return fullName;
    }

    public int marksCount(){

        return size;
    }

    public boolean isMarkFull(boolean markFull){
        if (marks.length == size){
            return true;
        }
        return false;
    }

    public boolean isMarksFull() {
        return size >= marks.length;
    }

    public boolean addMark(Mark mark) {
        if (mark == null) return false;
        if (isMarksFull()) return false;
        marks[size++] = mark;
        return true;
    }

    public double average() {
        if (size == 0) return 0.0;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += marks[i].getValue();
        }
        return (double) sum / size;
    }

    @Override
    public String toString() {
        return fullName + " (ср. балл: " + String.format("%.2f", average()) + ")";
    }

}
