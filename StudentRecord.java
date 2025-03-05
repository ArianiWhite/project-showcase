import java.util.Scanner;

class StudentRecord {

    // Instance variables
    private final double quiz1;
    private final double quiz2;
    private final double quiz3;
    private final double midterm;
    private final double finalExam;
    private double overallScore;
    private String letterGrade;

    // Constructor
    public StudentRecord(double quiz1, double quiz2, double quiz3, double midterm, double finalExam) {
        this.quiz1 = quiz1;
        this.quiz2 = quiz2;
        this.quiz3 = quiz3;
        this.midterm = midterm;
        this.finalExam = finalExam;
        this.overallScore = 0;
        this.letterGrade = "";
    }

    // Method to calculate the overall numeric grade
    public void calculateOverallScore() {
        // Convert quiz scores to a percentage and calculate weighted scores
        double quizTotal = (quiz1 + quiz2 + quiz3) / 30 * 100; // total out of 30 converted to percentage
        double quizWeight = quizTotal * 0.25; // 25% weight for quizzes
        double midtermWeight = midterm * 0.35; // 35% weight for midterm
        double finalExamWeight = finalExam * 0.40; // 40% weight for final exam

        // Calculate the overall score
        overallScore = quizWeight + midtermWeight + finalExamWeight;
    }

    // Method to determine the final letter grade
    public void calculateLetterGrade() {
        if (overallScore >= 90) {
            letterGrade = "A";
        } else if (overallScore >= 80) {
            letterGrade = "B";
        } else if (overallScore >= 70) {
            letterGrade = "C";
        } else if (overallScore >= 60) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }
    }

    // Override toString method to display student record
    @Override
    public String toString() {
        return "Student record: Quiz 1: " + quiz1 + ", Quiz 2: " + quiz2 + ", Quiz 3: " + quiz3 +
               ", Midterm: " + midterm + ", Final: " + finalExam + ".\n" +
               "Overall numeric grade: " + String.format("%.2f", overallScore) + "\n" +
               "Final letter grade: " + letterGrade;
    }

    // Main method to run the program
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the student's score on the first quiz: ");
            double quiz1 = input.nextDouble();
            
            System.out.print("Enter the student's score on the second quiz: ");
            double quiz2 = input.nextDouble();
            
            System.out.print("Enter the student's score on the third quiz: ");
            double quiz3 = input.nextDouble();
            
            System.out.print("Enter the student's score on the midterm: ");
            double midterm = input.nextDouble();
            
            System.out.print("Enter the student's score on the final: ");
            double finalExam = input.nextDouble();
            
            // Create StudentRecord object
            StudentRecord student = new StudentRecord(quiz1, quiz2, quiz3, midterm, finalExam);
            
            // Calculate scores and letter grade
            student.calculateOverallScore();
            student.calculateLetterGrade();
            
            // Print student record
            System.out.println(student);
        }
    }
}
