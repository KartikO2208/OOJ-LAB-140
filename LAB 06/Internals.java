package CIE;
import java.util.Scanner;

public class Internal extends Student{
    int[]marks=new int[5];
    protected int[]ciemarks=new int[5];
    public void InputCIEMarks(){
        Scanner sc = new Scanner(System.in);
        System.out.println(x:"Enter your CIE marks for 5 subjects");
        for(int i=o;i<5;i++){
            System.out.println("Subject"+(i+1)+":");
            ciemarks[i]=sc.nextInt();
        }
    }
}