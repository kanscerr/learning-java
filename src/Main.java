class Main{
    public static void main(String args[]){
        //print statement
        System.out.print("hello world!");//does not go to next line
        System.out.println("hello world!");//go to next line

        //take input in variable
        //1. hardcoded-
        Integer num=2;
        Character letter = 'k'; //character in single quotes
        String name = "john";//string in double quotes
        System.out.println(num);
        System.out.println(letter);
        System.out.println(name);

        //type casting
        int i = 5;
        //1. implicit (widening) if any value is not getting lost. eg- int to double
        double d = i;
        System.out.println(d);
        //2. explicit (narrowing) if value is getting lost. eg- double to int
        int ii = (int) d;
        System.out.println(ii);

        //conditions
        //1. if else
        System.out.println("if else-");
        if(i>5){
            System.out.println("greater");
        }
        else if(i==5){
            System.out.println("equal");
        }
        else{
            System.out.println("smaller");
        }

        //2 switch statement
        System.out.println("switch statement-");
        int ch = 3;
        switch(ch){
            case 1:
                System.out.println('1');
                break;
            case 2:
                System.out.println('2');
                break;
            case 3:
                System.out.println('3');
                break;
            default:
                System.out.println("default");
        }

        //iteration
        //1. for loop
        int a = 0;
        System.out.println("for loop-");
        for(a=0;a<5;a++){
            System.out.print(a + " ");
        }
        System.out.println();

        //2. while loop
        System.out.println("while loop-");
        while(a>0){
            System.out.print(--a + " ");
        }
        System.out.println();

        //3. do while
        System.out.println("do while loop-");
        do {
            System.out.print(a++ + " ");
        }while(a<5);
        System.out.println();

        //4. for-each loop
        System.out.println("for each loop-");
        int sum = 0;
        int arr[] = {1, 2, 3, 4, 5};
        for(int x : arr){
            sum+= x;
        }
        System.out.println("sum = " + sum);
    }


}