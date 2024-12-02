import SEE.Externals;
import java.util.Scanner;





public class main{
   public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         System.out.println("x:Enter the number of students:");
         int n=sc.nextInt();
         Externals[]student = new Externals[n];
         for(int i=0;i<n;i++){
            System.out.println("\n Enter the details of student here:"+(i+1)+":");
            student[i]= new Externals();
            student[i].InputStudent();
            student[i].InputCIEMarks();
            student[i].InputSEEMarks();
            student[i].Calculatefinalmarks();
         }

         System.out.println("\n Finalmarks of student:");
         for(int i=0;i<5;i++){
            System.out.println("\nStudent"+(i+1)+":");
            student[i].Displayfinalmarks();
            
        }
        sc.close();
         }
 

}