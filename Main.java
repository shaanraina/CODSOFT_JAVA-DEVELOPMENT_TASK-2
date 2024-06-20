import java.util.Scanner;

class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Predefined subjects
        String[] subjects = {"Math", "Science", "English", "History", "Physical Education"};
        int numberOfSubjects = subjects.length;

        // Initialize arrays to store marks and grades, and calculate total marks
        int[] marks = new int[numberOfSubjects];
        String[] grades = new String[numberOfSubjects];
        int totalMarks = 0;

        // Welcome message
        System.out.println("Welcome to the Student Grade Calculator!");

        // Input marks for each subject
        for (int i = 0; i < numberOfSubjects; i++) {
            marks[i] = getMarksForSubject(scanner, subjects[i]);
            grades[i] = calculateGrade(marks[i]);
            totalMarks += marks[i];
        }

        // Calculate average percentage
        double averagePercentage = calculateAveragePercentage(totalMarks, numberOfSubjects);

        // Determine overall grade based on average percentage
        String overallGrade = calculateGrade((int) averagePercentage);

        // Display results
        displayResults(subjects, marks, grades, totalMarks, averagePercentage, overallGrade);

        // Close scanner
        scanner.close();
    }

    // Method to input marks for each subject with validation
    private static int getMarksForSubject(Scanner scanner, String subject) {
        int marks = 0;
        boolean validInput = false;
        while (!validInput) {
            System.out.print("Enter marks obtained in " + subject + " (out of 100): ");
            if (scanner.hasNextInt()) {
                marks = scanner.nextInt();
                if (marks >= 0 && marks <= 100) {
                    validInput = true;
                } else {
                    System.out.println("Please enter marks within the range of 0 to 100.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Clear invalid input
            }
        }
        return marks;
    }

    // Method to calculate the average percentage
    private static double calculateAveragePercentage(int totalMarks, int numberOfSubjects) {
        return (double) totalMarks / numberOfSubjects;
    }

    // Method to determine the grade based on marks
    private static String calculateGrade(int marks) {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    // Method to display the results
    private static void displayResults(String[] subjects, int[] marks, String[] grades, int totalMarks, double averagePercentage, String overallGrade) {
        System.out.println("\nResults:");
        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i] + ": " + marks[i] + " marks, Grade: " + grades[i]);
        }
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Overall Grade: " + overallGrade);
    }
}