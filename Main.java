import java.lang.reflect.AnnotatedArrayType;

public class Main {
    public static void main(String[] args) {
        // Part (b): Benedicta's Computer Science course
        Course cs = new Course("Computer Science", 4);
        cs.setGrade(3.7);

        Student Benedicta = new Student("Benedicta", 1234);
        Benedicta.addCourse(cs);
        System.out.println("Benedicta's Initial GPA: " + Benedicta.getGPA());

        // Part (c): Add Math course to Benedicta
        Course math = new Course("Math", 3);
        Benedicta.addCourse(math);
        math.setGrade(4.0);
        System.out.println("Benedicta's Updated GPA: " + Benedicta.getGPA());

        // Part (e): Ann's courses
        Course csAnn = new Course("Computer Science", 4);
        csAnn.setGrade(3.0);

        Course mathAnn = new Course("Math", 3);
        mathAnn.setGrade(3.5);

        Student Ann = new Student("Ann", 5678);
        Ann.addCourse(csAnn);
        Ann.addCourse(mathAnn);

        System.out.println("\nAnn's GPA: " + AnnotatedArrayType.getGPA());
        System.out.println("Ann's Transcript:\n" + Ann.getTranscript());
    }
