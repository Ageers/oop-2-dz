package School;

import java.util.Arrays;

public class Student {

    private String fullName;
    private Mark[] marks;
    private int size;
    private int marksCapasity;


    public Student(String fullName, int marksCapasity) {
        this.fullName = fullName;
        this.marksCapasity = marksCapasity;
    }

    public String getFullName() {
        return fullName;
    }

    public int marksCount(){
        return marks.length;
    }

    public boolean isMarkFull(boolean markFull){
        if (marks.length == size){
            return true;
        }
        return false;
    }

    /**
     * Не понятно как перезаписать массив объектов оценки в double;
     *
     *
     */


    public double average(Mark[] marks){
        for (int i = 0; i < this.marks.length; i++){
            System.out.println(marks[i]);
        }
        return 0.0 ;
        }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", marks=" + Arrays.toString(marks) +
                ", size=" + size +
                ", marksCapasity=" + marksCapasity +
                '}';
    }

}
