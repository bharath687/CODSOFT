import java.util.*;

class grade {
    public String Grade(int avgp){
        switch (avgp / 10){
            case 10:
                return "A+";
            case 9:
                return "A";
            case 8:
                return "B+";
            case 7:
                return "B";
            case 6:
                return "C";
            case 5:
                return "D";
            default:
                return "F";
        }
    }
}
public class studentGradeCalculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        grade g = new grade();
        //Taking the inputs of number of subjects
        System.out.println("Enter number of subjects:");
        int tsubj = scan.nextInt();
        int tmarks = 0;
        //Taking and Adding all the marks
        for (int i=0;i<tsubj;i++){
            System.out.println("Enter marks obtained (out of 100) in subject" +(i+1));
            int marks =scan.nextInt();
            tmarks += marks;
        }
        //Calculate the avg
        int avgp = tmarks / tsubj;
        //Calculate the Grade
        String Grade;
        Grade = g.Grade(avgp);

        //Display the data
        System.out.println("Total marks obtained:"+tmarks);
        System.out.println("Percentage obtained:"+avgp+"%");
        System.out.println("Grade obtained:"+Grade);

    }
}