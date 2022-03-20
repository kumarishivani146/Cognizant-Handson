public class Student{
    protected int studentId;
    protected String name;
    protected int departmentId;
    protected String gender;
    protected String phone;
    
    public void setStudentId(int id){
        this.studentId=id;
    }
    public void setName(String n){
        this.name=n;
    }
    public void setDepartmentId(int id){
        this.departmentId=id;
    }
    public void setGender(String g){
        this.gender=g;
    }
    public void setPhone(String p){
        this.phone=p;
    }
    public int getStudentId(){
        return this.studentId;
    }
    public String getName(){
        return this.name;
    }
    public int getDepartmentId(){
        return this.departmentId;
    }
    public String getGender(){
        return this.gender;
    }
    public String getPhone(){
        return this.phone;
    }
}