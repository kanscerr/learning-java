import java.util.*;
public class stringBuffer {
    public StringBuffer fname, lname;

    public void getName(){
        fname = new StringBuffer("Khushi");
        lname = new StringBuffer("Singh");
    }
    public void getFullName(){
        fname.append(" "+lname);
        System.out.println(fname);
    }
    public void deleteLastName(){
        fname.delete(fname.length()-lname.length(), fname.length()+1);
        System.out.println(fname);
    }
    public void insertLastName(){
        fname.insert(fname.length(), lname);
        System.out.println(fname);
    }

    public void reverseName(){
        fname.reverse();
        System.out.println(fname);
    }
    public static void main(String[] args){
        stringBuffer sb = new stringBuffer();
        sb.getName();
        sb.getFullName();
        sb.deleteLastName();
        sb.insertLastName();
        sb.reverseName();
    }
}


