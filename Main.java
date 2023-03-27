import java.util.ArrayList;
import java.util.Scanner;


class Inventory {
  
}

class Main {
	public static void main(String[] args) {

   
ArrayList<String> names = new ArrayList<>(); 
    ArrayList<String> SerialNumbers = new ArrayList<>();
    ArrayList<Integer> Prices = new ArrayList<>();




    
    int i = 0;
    while (i == 0) {
    System.out.println("Press 1 to add an item.");
    System.out.println("Press 2 to delete an item.");
    System.out.println("Press 3 to update an item.");
    System.out.println("Press 4 to show all the items.");
    System.out.println("Press 5 to quit the program.");

Scanner options = new Scanner(System.in);
    int list = options.nextInt(); 
    
  Scanner sn = new Scanner(System.in);
   
      
    switch (list) {
      case 1: 
        if (list == 1) {
          System.out.println("Enter the name: ");
            String name = sn.nextLine();
            names.add(name);
          System.out.println("Enter the serial number: ");
            String SerialNumber = sn.nextLine();
            SerialNumbers.add(SerialNumber);
          System.out.println("Enter the value in dollars (whole number): ");
            int price = sn.nextInt(); 
            Prices.add(price);
          break;
        }
          
    case 2:
        System.out.println("Enter the serial number of the item to delete: ");
        String Input = sn.nextLine();
        if (SerialNumbers.remove(Input)) {
          names.remove(0);
          Prices.remove(0);
        break;
          }
          
    case 3:
        System.out.println("Enter the serial number of the item to change: ");
        String change = sn.nextLine();
        if (change.equals(SerialNumbers)) {
        System.out.println("Enter the new name: ");
        String name = sn.nextLine();
        names.add(name); 
        System.out.println("Enter the new value in dollars (whole number): ");
        int price = sn.nextInt();
        Prices.add(price); 
        break;
        }
    
    case 4:
        System.out.println((names) + "," + (SerialNumbers) + "," + (Prices)); 
        break;

      case 5: 
        return; 
      
          
        }
    }
  }
}
	
