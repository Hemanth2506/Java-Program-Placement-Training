class Friend{
    String name;
    long phoneNo;
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Phone Number: "+phoneNo);
    }
}
public class Main{
    public static void main(String[] args){
        Friend f=new Friend();
        f.name="Naveen";
        f.phoneNo=9876543210L;
        f.display();
    }
}