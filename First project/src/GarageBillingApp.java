import java.util.Scanner;

public class GarageBillingApp {
    public static void main(String[] args) {
        GarageService garageService=new GarageService();
        Scanner sc=new Scanner(System.in);
        
        System.out.println("----------Lalit Car Service Center----------");

        while(true)
        {
          
            System.out.println("1. Add Customer"); 
            System.out.println("2. Display Services");
            System.out.println("3. Exit");
            System.out.println("Enter Your Choice");
            int choice=sc.nextInt();

        switch (choice)
            {
            case 1:
                System.out.println("Enter Customer Name:");
                String name=sc.next();
                System.out.println("Enter Phone Number:");
                String phone=sc.next();
                System.out.println("Enter Car Number:");
                String carNum=sc.next();
                System.out.println("Enter Car Model:");
                String model=sc.next();

                garageService.addCustomer(name,phone,carNum,model);
                break;

            case 2:

                System.out.println("Enter car number:");
                String carNo=sc.next();
                garageService.createInvoice(carNo);
                break;

            case 3:

                System.out.println("Existing.........thank you!");
                sc.close();
                return;

            default:
                System.out.println("Invalid choice. Try again.");
            }
        }
    }
    
}
