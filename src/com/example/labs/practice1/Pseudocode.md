START 
INPUT N 
CREATE Book arraylist of size N

FOR i = 0 TO N-1 
    INPUT Book ID 
    INPUT Title 
    INPUT Author 
    INPUT Price 
    STORE Book details into ArrayList
END FOR

FOR each Book in ArrayList 
    DISPLAY Book Details (ID, Title, Author, Price)
    ADD Price to Total
END FOR

CALCULATE Average = Total / N
DISPLAY Total Price, Average Price

END