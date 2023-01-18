import java.util.Scanner;

public class Student {
    private int studentId;
    private String studentName;

    public void getData(){
        System.out.println("enter student info-");
        Scanner scan = new Scanner(System.in);
        studentName = scan.nextLine();
        studentId = scan.nextInt();
    }
    public void displayData(){
        System.out.println("Name- "+studentName);
        System.out.println("ID- "+studentId);
    }

    public static void main(String args[]){
        Student st[];
        st = new Student[2];
//        st1 = new Student();
//        st2 = new Student();
        for(int i=0;i<2;i++){
            st[i] = new Student();
            st[i].getData();
        }
        for(Student x : st){
            x.displayData();
        }

    }
};
