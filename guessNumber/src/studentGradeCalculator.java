import java.util.*;
class studentGradeCalculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //Taking the inputs of number of subjects
        System.out.println("Enter number of subjects:");
        int subj = scan.nextInt();
        int tmarks = 0;
        //Taking and Adding all the marks
        for (int i=0;i<subj;i++){
            System.out.println("Enter marks obtained (out of 100) in subject" +(i+1));
            int marks =scan.nextInt();
            tmarks += marks;
        }

    }
}