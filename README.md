# Student Result Calculator

A simple **Java-based Student Result Calculator** that takes a student's name and marks of five subjects, calculates the total marks and percentage, and displays the student's performance and pass/fail result.

## Features

* Enter student name
* Enter marks for 5 subjects
* Calculate total marks
* Calculate percentage
* Check pass/fail status
* Display performance
* If any subject has marks below 40, the student is marked **Fail** and performance is shown as **Very Bad**

## Performance Criteria

| Percentage           | Performance     |
| -------------------- | --------------- |
| 90% and above        | Outstanding     |
| 80% - 89%            | Excellent       |
| 70% - 79%            | Very Good       |
| 60% - 69%            | Good            |
| 50% - 59%            | Not Bad         |
| Below 50%            | Average         |
| Any subject below 40 | Very Bad / Fail |

## How It Works

1. Enter the student's name.
2. Enter marks for five subjects.
3. The program calculates the total marks.
4. The percentage is calculated.
5. The program checks whether every subject has at least 40 marks.
6. If any subject is below 40, the result is **Fail**.
7. If all subjects are 40 or above, performance is calculated according to the percentage.
8. The final result is displayed.

## Example Output

```text
Enter Student Name
Shubham

Enter First Subject Marks
85
Enter Second Subject Marks
78
Enter Third Subject Marks
90
Enter Fourth Subject Marks
82
Enter Fifth Subject Marks
75

----- STUDENT DETAILS -----
Student Name: Shubham
Total Marks: 410.0/500
Percentage: 82.0%
Performance: Excellent
Result: Pass
```

## Technologies Used

* Java
* Scanner
* Conditional Statements
* Variables
* Arithmetic Operators
* Logical Operators

## How to Run

### 1. Save the file

Save the Java code as:

```text
StudentResult.java
```

### 2. Compile the program

```bash
javac StudentResult.java
```

### 3. Run the program

```bash
java StudentResult
```

## Author

**Shubham Kumar Jha**

## Project Type

Beginner Java Project
