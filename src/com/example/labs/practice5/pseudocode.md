# Pseudocode for Practice5
**For Account.java**
```
CLASS Account
    PUBLIC accNum
    PRIVATE balance = 0
    PRIVATE name

    CONSTRUCTOR Account(accNum, name, balance)
        this.accNum = accNum
        this.name = name
        this.balance = balance
    END CONSTRUCTOR

    FUNCTION accNumGetter()    
        RETURN accNum
    END FUNCTION

    FUNCTION balGetter()
        RETURN balance
    END FUNCTION

    FUNCTION nameGetter()
        RETURN name
    END FUNCTION

    FUNCTION withdraw(amount)
        IF amount > balance THEN
            DISPLAY "Withdrawal amount exceeded current balance."
        ELSE
            balance = balance - amount
            DISPLAY "Withdrew " + amount + " from " + name + " (" + accNum + ") successfully!"
        END IF
    END FUNCTION

    FUNCTION deposit(amount)
        balance = balance + amount
    END FUNCTION
END CLASS
```

**For BankingSystem.java**
```
FUNCTION findAccount(accounts, accNum)
    FOR EACH acc IN accounts
        IF acc.accNumGetter() = accNum THEN
            RETURN acc
        END IF
    END FOR
    RETURN null
END FUNCTION

CLASS BankingSystem
    accounts = empty list of Account

    DISPLAY "Enter number of customers: "
    INPUT n

    FOR i = 1 TO n
        DISPLAY "Customer " + i
        REPEAT
            DISPLAY "Account number (14 digits): "
            INPUT accNo and remove surrounding spaces
            IF accNo is not exactly 14 digits THEN
                DISPLAY "Invalid! Must be exactly 14 digits."
            END IF
        UNTIL accNo is exactly 14 digits
        DISPLAY "Name: "
        INPUT name
        DISPLAY "Balance: "
        INPUT balance
        ADD NEW Account(accNo, name, balance) TO accounts
    END FOR

    REPEAT
        DISPLAY menu: 1 Deposit, 2 Withdraw, 3 Display all accounts, 0 Exit
        INPUT choice

        IF choice = 1 OR choice = 2 THEN
            DISPLAY "Enter account number: "
            INPUT accNo and remove surrounding spaces
            acc = findAccount(accounts, accNo)
            IF acc = null THEN
                DISPLAY "Account not found."
            ELSE
                DISPLAY "Enter amount: "
                INPUT amount
                IF choice = 1 THEN
                    acc.deposit(amount)
                ELSE
                    acc.withdraw(amount)
                END IF
                DISPLAY "Updated account details:"
                DISPLAY acc.nameGetter(), acc.accNumGetter(), acc.balGetter()
            END IF
        ELSE IF choice = 3 THEN
            FOR EACH acc IN accounts
                DISPLAY acc.nameGetter(), acc.accNumGetter(), acc.balGetter()
            END FOR
        END IF
    UNTIL choice = 0

    DISPLAY "Thank you for using the banking system."
END CLASS
```