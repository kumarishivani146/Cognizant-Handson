public class Student{
    private int studentId;
    private String studentName, studentAddress, collegeName;
    
    public Student(int id, String sname, String saddress){
        this.studentId=id;
        this.studentName=sname;
        this.studentAddress=saddress;
        this.collegeName="NIT";
    }
    public Student(int id, String sname, String saddress, String cname){
        this.studentId=id;
        this.studentName=sname;
        this.studentAddress=saddress;
        this.collegeName=cname;
    }
    public String getStudentName(){
        return this.studentName;
    }
    public int getStudentId(){
        return this.studentId;
    }
    public String getStudentAddress(){
        return this.studentAddress;
    }
    public String getCollegeName(){
        return this.collegeName;
    }

}