package CIE;
import.java.util.Scanner;

public class student{
    String USN;
    String Name;
    int Sem;
    



    public void InputStudent{
        Scanner sc=new Scanner(System.in);
        System.out.println(x:"Enter your usn:");
        USN=sc.nextLine();
        System.out.println(x:"Enter your name");
        Name=sc.nextLine();
        System.out.println(x:"Enter your Sem");
        Sem=sc.nextLine();
}



public void DisplayStudent(){
    System.out.println("Name:"+Name);
    System.out.println("USN:"+USN);
    System.out.println("Sem:"+Sem);

}
}


