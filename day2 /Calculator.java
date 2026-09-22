import java.util.Scanner ;

public class Calculator {
// we have to make menu driven calculator
// we have to write method inside class

// mrthods for integer // method ham isiliye banate hai resuability se bachne ke liye 

static  int add(int a , int b){
    return a+b;
}

static int sub(int a , int b){
    return a-b;
}
static int mul(int a , int b){
    return a*b;
}
static int div(int a , int b){
    if(b == 0){
        System.out.println("cant devide by zero");
        return 0;
    }
    return a/b;
}

// method for float

static  float add(float a, float b){
    return a+b;
}

static  float sub(float a, float b){
    return a-b;
}
static  float mul(float a, float b){
    return a*b;
}
static float div(float a, float b){
    if(b==0){
    System.out.println("cant devoide by zero" );
    return 0;
}
return (float)a/b;
}

// method  for double 

static double add(double a , double b ){
    return a+b;
}

static double sub(double a, double b){
    return a-b;
}
static  double mul(double a, double b){
    return a*b;
}
static double div(double a, double b){
    if(b==0){
    System.out.println("cant devoide by zero" );
    return 0;
}
return (double)a/b;
}


public static void main(String[] args) {
    // our program will start from here 

Scanner sc = new Scanner(System.in);  // for taking input

int choice ;

do{

    System.out.println("CALCULATOR MENU");
     System.out.println("integer operation");
      System.out.println("1 Addition:");
       System.out.println("2 Substraction");
        System.out.println("3 Multiplication");
         System.out.println("4 Division");

          System.out.println("float operation ");
        System.out.println("5 Addition:");
       System.out.println("6 Substraction");
        System.out.println("7 Multiplication");
         System.out.println("8 Division");

          System.out.println("double operation ");
    System.out.println("9 Addition:");
       System.out.println("10 Substraction");
        System.out.println("11 Multiplication");
         System.out.println("12 Division");


          // 2. accept choice 
         choice = sc.nextInt();
         
         // 3. apply switch case 
         switch(choice){

            case 1: 
            System.out.println("enter any two integer:");
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            System.out.println("Result:" + add(a1,a2));
            break;

            case 2:
            System.out.println("enter two integer:");
            int a3 = sc.nextInt();
            int a4 = sc.nextInt();
            System.out.println("result: " + sub(a3,a4));
            break;

            case 3:
            System.out.println("enter two integer:");
            int a5 = sc.nextInt();
            int a6 = sc.nextInt();
            System.out.println("result: " + mul(a5,a6));
            break;

            case 4:
            System.out.println("enter two integer:");
            int a7 = sc.nextInt();
            int a8 = sc.nextInt();
            System.out.println("result: " + div(a7,a8));
            break;

            case 5:
            System.out.println("enter two float value:");
            float f1 = sc.nextFloat();
            float f2 = sc.nextFloat();
            System.out.println("result: " + add(f1,f2));
            break;

            case 6:
            System.out.println("enter two float value:");
            float f3 = sc.nextFloat();
            float f4 = sc.nextFloat();
            System.out.println("result: " + sub(f3,f4));
            break;

            case 7:
            System.out.println("enter two float value:");
            float f5 = sc.nextFloat();
            float f6 = sc.nextFloat();
            System.out.println("result: " + mul(f5,f6));
            break;


            case 8:
            System.out.println("enter two float value:");
            float f7 = sc.nextFloat();
            float f8 = sc.nextFloat();
            System.out.println("result: " + div(f7,f8));
            break;

            case 9:
            System.out.println("enter two double value:");
            double d1 = sc.nextDouble();
            double d2 = sc.nextDouble();
            System.out.println("result: " + add(d1,d2));
            break;

            case 10:
            System.out.println("enter two double value:");
            double d3 = sc.nextDouble();
            double d4 = sc.nextDouble();
            System.out.println("result: " + sub(d3,d4));
            break;

            case 11:
            System.out.println("enter two double value:");
            double d5 = sc.nextDouble();
            double d6 = sc.nextDouble();
            System.out.println("result: " + mul(d5,d6));
            break;

            case 12:
            System.out.println("enter two double value:");
            double d7 = sc.nextDouble();
            double d8 = sc.nextDouble();
            System.out.println("result: " + div(d7,d8));
            break;

            case 13:
            System.out.println("exit from calculator");
            break;

            default:
            System.out.println("invalid choice:");
         }
} while(choice != 13);  // case 13 tak loop chalega 

sc.close();
}
}
