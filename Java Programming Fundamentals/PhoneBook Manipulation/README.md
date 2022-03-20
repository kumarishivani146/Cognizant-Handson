irone mobile services needs to store their customer details in the company portal. The details are customer's first and last name, phone number, and email address. Help the company develop an application to maintain the details of their customer systematically. 

You are provided with a class Contact with the following attributes as private.

String firstName

String lastName

long  phoneNumber

String emailId

A 4 argument constructor and appropriate setters and getters to store and retrieve the details are also provided.

Create a class PhoneBook with a private attribute

List<Contact> phoneBook = new ArrayList<Contact>();

Write the getters and setters.

Write the following methods in the PhoneBook class.

public void addContact(Contact contactObj) – This method should add the contact object to the phoneBook list.

public List<Contact> viewAllContacts() – This method should return the list of all contacts available.

public Contact viewContactGivenPhone(long phoneNumber) -  This method should return the contact details which has the phoneNumber given as parameter.

public boolean removeContact(long phoneNumber) -  This method should remove the contact details which has the phoneNumber given as parameter.  If removed return true.  Else if the phone number is not available return false.

Write a class Main with the main method.  Create the menu as shown in the Sample Input and Output and invoke the corresponding methods as per the choice provided.

