# CODSOFT_JAVA-DEVELOPMENT_TASK-2

Detailed Explanation of Each Step:

Welcome Message: Displays a welcome message at the start to introduce the program to the user.

Predefined Subjects: The subjects are predefined in the subjects array. This array contains the names of the subjects for which the marks will be entered.

Initialize Marks and Grades Arrays and Total Marks:

The marks array is initialized to store the marks for each subject.

The grades array is initialized to store the grades for each subject.

The totalMarks variable is initialized to sum the marks.

Input Marks and Calculate Grades for Each Subject:

The program loops through each subject in the subjects array.

The getMarksForSubject method is called to input and validate marks for each subject.

The calculateGrade method is called to determine the grade based on the marks obtained.

The entered marks are added to the totalMarks.

Calculate Average Percentage:

The calculateAveragePercentage method computes the average percentage by dividing the totalMarks by the number of subjects.

Overall Grade Calculation:

The calculateGrade method is called again to assign an overall grade based on the average percentage.

Display Results:

The displayResults method prints the marks and grades obtained in each subject, the total marks, the average percentage (formatted to two decimal places), and the overall grade.

Close Scanner: The scanner.close() method is called to close the scanner object and release the associated resources.

This program ensures a structured and user-friendly approach to inputting marks, calculating results, and displaying the output, including individual subject grades and the overall grade.
