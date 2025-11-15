package School;

public class School {
    private SchoolClass[] classes;

    public School(SchoolClass[] classes) {
        this.classes = classes;
    }

    public SchoolClass getClass(int index) {
        if (index < 0 || index >= classes.length) return null;
        return classes[index];
    }

    public SchoolClass findByName(String name) {
        for (SchoolClass schoolClass : classes) {
            if (schoolClass.getName().equals(name)) {
                return schoolClass;
            }
        }
        return null;
    }

    public double average() {
        if (classes.length == 0) return 0.0;
        double sum = 0.0;
        for (SchoolClass schoolClass : classes) {
            sum += schoolClass.average();
        }
        return sum / classes.length;
    }

    public Student bestStudent() {
        Student best = null;
        for (SchoolClass schoolClass : classes) {
            Student candidate = schoolClass.bestStudent();
            if (candidate != null) {
                if (best == null || candidate.average() > best.average()) {
                    best = candidate;
                }
            }
        }
        return best;
    }

    @Override
    public String toString() {
        return "Школа (" + classes.length + " классов, ср. балл: " + String.format("%.2f", average()) + ")";
    }
}
