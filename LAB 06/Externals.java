package SEE;
import java.util.Scanner;
import CIE.Internal;
public class External extends Internal{
    int[] marks=new int[5];
    int[] finalmarks = new int[5];


public void InputSEEMarks(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the SEE marks:");
    for(int i=0;i<5;i++){
        System.out.println("Subjects"+(i+1)+":")
        marks[i]=sc.nextInt();
    }
    }

    public void Calculatefinalmarks(){
        for(int i=0;i<5;i++){
            finalmarks[i]=this.marks[i]/2+super.marks[i];
        }
    }

    public void Displayfinalmarks(){
        DisplayStudent();
        System.out.println(x:"The final marks for 5 subjects");
        for(int i=0;i<5;i++){
            System.out.print("Subjects"+(i+1)+":"+finalmarks[i]);
        }

    }
    
}