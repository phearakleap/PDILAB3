CLASS Temperature
    DECLARE celsius, fahrenheit AS REAL
    METHOD setTemperature(c)
        celsius = c
    END METHOD
    METHOD convert()
        fahrenheit = (celsius * 9 / 5) + 32
    END METHOD
    METHOD display()
        OUTPUT "Celsius: ", celsius
        OUTPUT "Fahrenheit: ", fahrenheit
    END METHOD
END CLASS
MAIN
    DECLARE N, i AS INTEGER
    DECLARE c AS REAL

    OUTPUT "Enter the number of cities: "
    INPUT N

    FOR i = 1 TO N
        CREATE OBJECT temp OF Temperature
        OUTPUT "Enter Celsius temperature for city ", i
        INPUT c
        CALL temp.setTemperature(c)
        CALL temp.convert()
        OUTPUT "City ", i
        CALL temp.display()
    END FOR
END MAIN