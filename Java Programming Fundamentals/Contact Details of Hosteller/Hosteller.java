public class Hosteller extends Student{
    private String hostelName;
    private int roomNumber;
    
    public void setHostelName(String h){
        this.hostelName=h;
    }
    public void setRoomNumber(int r){
        this.roomNumber=r;
    }
    public String getHostelName(){
        return this.hostelName;
    }
    public int getRoomNumber(){
        return this.roomNumber;
    }
}