package School;
public class Main {
    public static void main(String[] args) {


        Student[] students10A = {
                new Student("Алиса Петрова", 5),
                new Student("Боб Иванов", 5)
        };

        students10A[0].addMark(new Mark(5, "Математика"));
        students10A[0].addMark(new Mark(4, "Физика"));
        students10A[1].addMark(new Mark(3, "Математика"));
        students10A[1].addMark(new Mark(4, "Физика"));

        SchoolClass class10A = new SchoolClass("10А", students10A);

        System.out.println(class10A);
    }
}