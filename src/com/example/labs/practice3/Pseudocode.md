START
INPUT N
CREATE Employee array of size N

FOR i = 0 TO N-1
    INPUT ID
    INPUT Name
    INPUT Basic Salary

    HRA = Basic Salary * 0.20
    TCA = Basic Salary * 0.10
    Gross Salary = Basic Salary + HRA + TCA

    STORE employee details
END FOR

FOR i = 0 TO N-1
    DISPLAY ID, Name, Basic Salary
    DISPLAY HRA, TCA, Gross Salary
END FOR

END
