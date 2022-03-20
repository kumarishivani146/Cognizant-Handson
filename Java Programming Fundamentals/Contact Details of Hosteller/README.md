SNMR College of Engineering and Technology wants to create an application to store their students details as well as the details of hostellers.

In case of any changes to be made to the attributes,  admin can update the details like room number and phone number of the hosteler.

Develop a program to implement this scenario.

Create a public class Student with  protected attributes :

int studentId

String name

int departmentId

String gender

String phone

 

Create a public class Hosteller with private attributes

 

String hostelName

int roomNumber

Make this class inherit the Student class, as it holds all the properties of Student. 

Use appropriate public getters and setters for both the classes.

Write a class Main with the main function.

In Main class get the input of the hosteller using the method :

public static Hosteller getHostellerDetails().

Invoke this method from the main method and then modify the room number and phone number, if needed.