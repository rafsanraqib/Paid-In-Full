# Paid-In-Full
Java program that reads credit card statement and calculates remaining balance of the user

CreditCard.java
This class uses the Java file library to read from a CSV file. The CSV file contains credit card statement of an user. The data structure used
in this problem is an ArrayList that stores string arrays. If the statement shows credit that means the credit amount is added to the balance,
if debit then the ammount if substracted. This is done using conditional statements. 

Tester.java
This class handles all the tests. To initiate the text, first the user has to create an example CSV file and add the path of the file to the 
path variable in line 13 of the class file CreditCard.java. Then an instance of the CreditCard.java object has to be created and then the method 
updateBalance() has to be called. 

Example text in the CSV file 
Sep02,CREDIT,CostCo,342.23
Sep09,CREDIT,ATT,93.42
Sep10,CREDIT,Applebees,56.20
Sep11,CREDIT,AppleStore,995.95
Sep12,DEBIT,ACHPayment,500
Sep19,CREDIT,Speedway,35.09
Sep20,CREDIT,McDonalds,12.55
Sep21,DEBIT,ACHPayment,600
Sep26,DEBIT,ACHPayment,250
Sep30,FEE,MasterCard,2.50

