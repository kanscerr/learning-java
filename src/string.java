import java.util.*;

public class string {
    public static void main(String args[]){

        //ways of storing a string
//        String nameString = "Khushi";
//        char[] nameArray = { 'K', 'h', 'u', 's', 'h', 'i' };
//        String nameUserInput;
//
        Scanner sc = new Scanner(System.in);
//        nameUserInput = sc.nextLine();
//        System.out.println("name string- " + nameString);
//        System.out.println("name user input- " + nameUserInput);
//        System.out.print("name as array- ");
//        for(int i=0;i< nameArray.length;i++){ //length = x.length()
//            System.out.print(nameArray[i]);
//        }

        //printing string in reverse
        String str = "This is a reversed string";
        String reverseStr = "";
        for(int i=str.length()-1;i>=0;i--){
            reverseStr += str.charAt(i); //charAt method to run loop through a string
        }
        System.out.println(reverseStr);

        //concatenate
        String fname = "Eiliad";
        String lname = "Elordi";
        String formatFullName = String.format(fname+lname); //format string
        String fullName = fname.concat(lname); //concatenation
        System.out.println(fullName);
        System.out.println(formatFullName);

        //string to number
//        String a_string, b_string;
//        System.out.print("enter two numbers as string- ");
//        a_string = sc.nextLine();
//        b_string = sc.nextLine();
//        float af = Float.valueOf(a_string);
//        float bf = Float.valueOf(b_string);
//        int aI = (int) af;
//        int bI = (int) bf;
//        System.out.println("Sum of string-to-float= " + (af+bf));
//        System.out.println("Sum of float-to-integer= "+ (aI+bI));

        //number to string
//        int a_num, b_num;
//        System.out.print("enter two string as number- ");
//        a_num = sc.nextInt();
//        b_num = sc.nextInt();
//        String aS = String.valueOf(a_num); //valueOf method
//        String bS = Integer.toString(b_num); //toString method
//        System.out.println(aS+bS);

        //compute number of digits before and after decimal in double
        double double_num;
        int counterBefore=0, counterAfter=0, i=0;
        System.out.println("enter a double datatype number- ");
        double_num = sc.nextDouble();
        String doubleToString = Double.toString(double_num);
        while(doubleToString.charAt(i) != '.'){
            counterBefore++;
            i++;
        }
        System.out.println("Number of characters before decimal= "+ counterBefore);
        for(i=i+1;i<doubleToString.length();i++){
            counterAfter++;
        }
        System.out.println("Number of characters after decimal= "+ counterAfter);
    }
}
