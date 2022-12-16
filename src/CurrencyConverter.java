import java. util.Scanner;
    public class CurrencyConverter {

        public static void main(String[] args) {
            System.out.println("1 USD");
            System.out.println("2 CAD");
            System.out.println("3 MXN");

            // take input
            Scanner sc = new Scanner(System.in);
            System. out.println("Choose the currency");
            int choice = sc.nextInt();

            System.out.println("Enter the amount");
            double amount = sc.nextDouble();
            
            // convert the amount
            switch (choice) {
                case 1:
                    USD_to_other(amount);
                    break;
                case 2:
                    CAD_to_other(amount);
                    break;
                case 3:
                    MXN_to_other(amount);
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        }

        public static void USD_to_other(double amt) {
            System.out.println("1 USD = " + 1.37 + " Canadian Dollar");
            System.out.println();

            System.out.println(amt+" USD = " + (amt*1.373) + " Canadian Dollar");
            System.out.println();

            System.out.println("1 USD = " + 19.78 + " Mexican Peso");
            System.out.println();
            System.out.println(amt+" USD = " + (amt*19.78) + " Mexican Peso");
            System.out.println();

        }


        public static void CAD_to_other(double amt) {
            System.out.println("1 Canadian Dollar = " + 0.73 + " US Dollar");
            System.out.println();
            System.out.println(amt+" Canadian Dollar = " + (amt*0.73) + " US Dollar");
            System.out.println();

            System.out.println("1 Canadian Dollar= " + 14.44 + " Mexican Peso");
            System.out.println();

            System.out.println(amt+" Canadian Dollar = " + (amt*14.44) + " Mexican Peso");
        }



        public static void MXN_to_other(double amt){
            System.out.println("1 Mexican Peso = " + 0.051 + " US Dollar");
            System.out.println();
            System.out.println(amt+" Mexican Peso = " + (amt*0.051) + " US Dollar");
            System.out.println();

            System.out.println("1 Mexican Peso = " + 0.069 + " Canadian Dollar");
            System.out.println();

            System.out.println(amt+" Mexican Peso = " + (amt*0.069) + " Canadian Dollar");
        }
    }