import java.util.Scanner;

public class foodBill {


    
public static void main(String[] args) {
    
Scanner sc= new Scanner (System.in);

int choice;
int totalBill = 0;    // bill ka total count karne ke liye , starting me 0 rakhe hai kyuki use abhi tak kuch v khariada nahi hai

do{

 System.out.println("===== FOOD MENU =====");
System.out.println("1. Dosa    - Rs. 50");
System.out.println("2. Samosa  - Rs. 20");
System.out.println("3. Idli    - Rs. 30");
System.out.println("4. Vada    - Rs. 25");
System.out.println("5. Poha    - Rs. 40");
System.out.println("6. Upma    - Rs. 40");
System.out.println("7. Tea     - Rs. 15");
System.out.println("8. Coffee  - Rs. 25");
System.out.println("9. Juice   - Rs. 45");
System.out.println("10. Generate Bill");

System.out.println();
System.out.println("enter your choice");
// take choice 
choice = sc.nextInt();

//  agar exit choice hai to bill print karo
if(choice == 10){
    System.out.println("=== final biil ===");
    System.out.println("total ammount:" + totalBill);
    System.out.println("thank you for visit");
    break;
}

// take  qunatity

System.out.println("enter quantity:");
int qty = sc.nextInt();


// apply switch case 
switch (choice) {
    case 1:
     totalBill += 50*qty;
       System.out.println("Dosa * " + qty +" "+ "added.Subtotal: Rs." + totalBill);
        break;
         case 2:
         totalBill += 20*qty;
       System.out.println("Samosa * " + qty +" "+ "added.Subtotal: Rs." + totalBill);
        break;
         case 3:
         totalBill += 30 * qty;
      System.out.println("Idli * " + qty +" "+ "added.Subtotal: Rs." + totalBill);
        break;
         case 4:
           totalBill += 25 * qty;
      System.out.println("vada * " + qty +" "+ "added.Subtotal: Rs." + totalBill);
        break;
         case 5:
           totalBill += 40 * qty;
       System.out.println("poha * " + qty +" "+ "added.Subtotal: Rs." + totalBill);
        break;
         case 6:
           totalBill += 35 * qty;
       System.out.println("upma * " + qty +" "+ "added.Subtotal: Rs." + totalBill);
        break;
         case 7:
           totalBill += 15 * qty;
        System.out.println("tea * " + qty +" "+ "added.Subtotal: Rs." + totalBill);
        break;
         case 8:
           totalBill += 25 * qty;
       System.out.println("cofee * " + qty +" "+ "added.Subtotal: Rs." + totalBill);
        break;
         case 9:
           totalBill += 45 * qty;
     System.out.println("juice * " + qty +" "+ "added.Subtotal: Rs." + totalBill);
        break;
    //      case 10:
    //    System.out.println("Dosa * " + qty + "added.Subtotal: Rs." + totalBill);
       // break;
        
    default:
     System.out.println("Invalid item! Try again.");
        break;
}

}while (choice != 10);

 sc.close();
}

}
