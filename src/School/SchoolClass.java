package School;

public class SchoolClass {
    private String name;
    private Student[] students;
    private int size;


    public SchoolClass(String name, Student[] students) {
        this.name = name;
        this.students = students;
        this.size = 0;

        for (Student student : students) {
            if (student != null) {
                size++;
            } else {
                break;
            }
        }
    }

    public String getName() {
        return name;
    }

    public int studentsCount() {
        return size;
    }

    public Student getStudent(int index) {
        if (index < 0 || index >= size) return null;
        return students[index];
    }

    public Student findByName(String fullName) {
        for (int i = 0; i < size; i++) {
            if (students[i].getFullName().equals(fullName)) {
                return students[i];
            }
        }
        return null;
    }

    public double average() {
        if (size == 0) return 0.0;
        double sum = 0.0;
        for (int i = 0; i < size; i++) {
            sum += students[i].average();
        }
        return sum / size;
    }

    public Student bestStudent() {
        if (size == 0) return null;
        Student best = students[0];
        for (int i = 1; i < size; i++) {
            if (students[i].average() > best.average()) {
                best = students[i];
            }
        }
        return best;
    }

    @Override
    public String toString() {
        return "Класс " + name + " (" + size + " учеников, ср. балл: " + String.format("%.2f", average()) + ")";
    }
}

