# Psuedocode for Practice4
- **For Student.java:**
```
CLASS Student
    PRIVATE name, ID
    PRIVATE scores[5]
    PRIVATE sum = 0.0f, average = 0.0f

    CONSTRUCTOR Student (name, ID, scores[])
        this.name = name
        this.ID = ID
        this.scores = scores
    END CONSTRUCTOR

    FUNCTION nameGetter()
        return this.name
    END FUNCTION

    FUNCTION IDGetter()
        return this.ID
    END FUNCTION

    FUNCTION scoresGetter(index)
        return this.scores[index]
    END FUNCTION

    FUNCTION sumGetter()
        return this.sum
    END FUNCTION

    FUNCTION averageGetter()
        return this.average
    END FUNCTION

    FUNCTION calcSumAndAverage()
        FOR every i in this.scores
            this.sum += i
        END FOR
        this.average = this.sum/5.0f
    END FUNCTION

    FUNCTION gradeDetermine()
        IF this.average >= 90.0f
            return 'A'
        ELSE IF this.average >= 75.0f
            return 'B'
        ELSE IF this.average >= 50.0f
            return 'C'
        ELSE
            return 'F'
        END IF
    END FUNCTION

END CLASS
```
- **For StudentGrades.java:**
```
CLASS StudentGrades
    subject = ["Mathematics", "Physics", "Chemistry", "Biology", "English"]
    students = empty list of Student

    DISPLAY "Enter the amount of students: "
    INPUT numberOfStudents

    FOR i = 0 TO numberOfStudents - 1
        DISPLAY separator line
        DISPLAY "Enter name: "
        INPUT name
        DISPLAY "Enter ID: "
        INPUT ID
        scores[5]

        FOR j = 0 TO 4
            DISPLAY "Enter your score for " + subject[j]
            INPUT scores[j]
        END FOR

        ADD student = NEW Student(name, ID, scores)
        student.calcSumAndAverage()
    END FOR

    DISPLAY "Evaluating results..."
    DISPLAY "Printing..."

    FOR i = 0 TO numberOfStudents - 1
        student = students[i]
        DISPLAY student.nameGetter() and student.IDGetter()
        FOR j = 0 TO 4
            DISPLAY subject[j] and student.scoresGetter(j)
        END FOR
        DISPLAY "Total Marks: " + student.sumGetter()
        DISPLAY "Average: " + student.averageGetter()
        DISPLAY "Your letter grade: " + student.gradeDetermine()
    END FOR

END CLASS
```