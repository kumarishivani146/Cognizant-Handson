import java.util.*;
public class PhoneBook{
    private List<Contact> phoneBook = new ArrayList<Contact>();
    public void setPhoneBook(List<Contact> c){
        phoneBook=c;
    }
    public List<Contact> getPhoneBook(){
        return phoneBook;
    }
    public void addContact(Contact contactObj) {
        phoneBook.add(contactObj);
    }
    public List<Contact> viewAllContacts(){
        return phoneBook;
    }
    public boolean removeContact(long phoneNumber){
        for(int i=0;i<phoneBook.size();i++){
            if(phoneBook.get(i).getPhoneNumber()==phoneNumber)
            {
                phoneBook.remove(phoneBook.get(i));
                return true;
            }
        }
        return false;
    }
    public Contact viewContactGivenPhone(long phoneNumber){
        Contact c=new Contact("","",0,"");
        for(int i=0;i<phoneBook.size();i++){
            if(phoneBook.get(i).getPhoneNumber()==phoneNumber)
            {
                c=phoneBook.get(i);
                return c;
            }
        }
        return c;
    }
}