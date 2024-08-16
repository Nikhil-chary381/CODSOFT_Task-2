import java.util.Scanner;
public class TASK_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t<--STUDENT GRADE CALCULATOR-->");
        System.out.println();
        System.out.print("\tEnter number of subjects:");
        int sub=sc.nextInt();
        int[] marks=new int[sub];
        System.out.print("\tEnter the marks obtained in "+sub+" subjects: ");
        for(int i=0;i<sub;i++) {
            marks[i]=sc.nextInt();
        }
        sc.close();
        int total_marks=0;
        for(int i=0;i<sub;i++) {
            total_marks+=marks[i];
        }
        float result_percentage=(((float)total_marks/((float)sub*100))*100);
        System.out.println();
        System.out.println("\tTotal marks obtained: "+total_marks);
        System.out.println();
        System.out.println("\tResult in percentage: "+result_percentage+"%");
        System.out.println();
        if(result_percentage>90){
            System.out.println("\tGrade: O");
        }
        else if(result_percentage>80){
            System.out.println("\tGrade: A+");
        }
        else if(result_percentage>70){
            System.out.println("\tGrade: A");
        }
        else if(result_percentage>60){
            System.out.println("\tGrade: B+");
        }
        else if(result_percentage>50){
            System.out.println("\tGrade: B");
        }
        else if(result_percentage>40){
            System.out.println("\tGrade: C+");
        }
        else if(result_percentage>30){
            System.out.println("\tGrade: C");
        }
        else{
            System.out.println("\tFAILED !");
        }
        System.out.println();


    }
}
