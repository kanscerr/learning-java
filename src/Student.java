import java.util.Scanner;

public class Student {
    private int studentId;
    private String studentName;

    public Student(){
        System.out.println("initializing non-parameterized constructor");
    }

    public Student(int i, String n){
        System.out.println("initializing parameterized constructor");
        studentId = i;
        studentName = n;
    }
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
        Student st1, st2;
        st1 = new Student(2428, "Khushi");
        st2 = new Student();
//        st1 = new Student();
//        st2 = new Student();
//        st = new Student[2];
//        for(int i=0;i<2;i++){
//            st[i] = new Student();
//            st[i].getData();
//        }
//        for(Student x : st){
//            x.displayData();
//        }

        st1.displayData();
        st2.getData();
        st2.displayData();

    }
};
