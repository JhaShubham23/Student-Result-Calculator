# Student Marks Calculator
The Student Marks Calculator is a simple Java program that takes a student's name and marks in five subjects as input. It calculates the total marks, percentage, performance, and final result (Pass or Fail).

## Features

* Takes the student's name as input.
* Accepts marks for five subjects.
* Calculates total marks out of 500.
* Calculates the overall percentage.
* Displays performance based on percentage.
* Shows the final Pass or Fail result.

## Technologies Used

* Java
* Scanner Class
* Conditional Statements (`if-else if-else`)

## How to Run the Project

1. Install Java JDK on your computer.

2. Save the code in a file named `StudentResult.java`.

3. Open the terminal in the folder where the file is saved.

4. Compile the program:

   ```bash
   javac StudentMarks.java
   ```

5. Run the program:

   ```bash
   java StudentMarks
   ```

## Performance Criteria

| Percentage   | Performance |
| ------------ | ----------- |
| Above 90%    | Outstanding |
| Above 80%    | Excellent   |
| Above 70%    | Very Good   |
| Above 60%    | Good        |
| Above 50%    | Not Bad     |
| Above 40%    | Bad         |
| 40% or below | Fail        |

**Note:** In the current code, the result is Pass only when the overall percentage is above 40%. Individual subject marks are not checked separately.

## Sample Output

```text
Enter Student Name
Rahul
Enter First Subject Marks
85
Enter Second Subject Marks
90
Enter Third Subject Marks
80
Enter Fourth Subject Marks
75
Enter Fifth Subject Marks
90

-----STUDENT DETAILS-----
Student Name:Rahul
Total marks:420.0/500
Percentage:84.0%
Performance: Excellent
Result: Pass
```

## Learning Objectives

* Understanding Java variables and data types.
* Taking user input using the Scanner class.
* Performing arithmetic calculations.
* Using conditional statements.
* Displaying formatted student results.

## Author

#### SHUBHAM KUMAR JHA

This project is created for educational and learning purposes.
