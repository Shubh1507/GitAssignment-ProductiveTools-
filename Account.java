/*Editing done in edit-branch(1)*/ 

import java.util.Scanner;


class Bank {
    
    double ac_no;
    String name;
    int deposit;
    int amt_balance = 0;
    String type_ac;
    int withdraw_amt;
    String draw;
    
    public void saving_ac()
    {
        Scanner s = new Scanner(System.in);

        System.out.println("\nEnter the saving account number: ");
        ac_no=s.nextInt();
        System.out.println("\nEnter the name of customer: ");
        name=s.nextLine();
        System.out.println("\nEnter the deposit amount:");
        deposit=s.nextInt();
        amt_balance += deposit;
        if(amt_balance<=1000)
        {
            System.out.println("\nEnter minimum Rs.1000 /- :");

            
        }else
        {
            System.out.println("\nSaving Account created successfull..!!");

        }

        

    }
    
    public void current_ac()
    {
        Scanner s = new Scanner(System.in);

        System.out.println("\nEnter the current account number: ");
        ac_no=s.nextInt();
        System.out.println("\nEnter the name of customer: ");
        name=s.nextLine();
        System.out.println("\nEnter the deposit amount:");
        deposit=s.nextInt();
        amt_balance += deposit;
        if(amt_balance<=1000)
        {
            System.out.println("\nEnter minimum Rs.1000 /- :");
            System.exit(0);

            
        }else
        {
            System.out.println("\nCurrent Account created successfull..!!");

        }
    
        

    }
    
    
    

}



class customer extends Bank
{
     public void saving_ac()
    {
        Scanner s = new Scanner(System.in);

        type_ac = "Saving";
        System.out.println("\nEnter the saving account number: ");
        ac_no=s.nextInt();
        System.out.println("\nEnter the name of customer: ");
        name=s.next();
        System.out.println("\nEnter the deposit amount:");
        deposit=s.nextInt();
        amt_balance += deposit;
        if(amt_balance<=1000)
        {
            System.out.println("\nEnter minimum Rs.1000 /- :");
            System.exit(0);

            
        }else
        {
            System.out.println("\nSaving Account created successfull..!!");

        }
        

    }
    
    public void display_sa()
    {
        System.out.println("\nCustomer's Account number is: "+ac_no);
        System.out.println("\nCustomer Name: "+name);
        System.out.println("\nAccount type is: "+type_ac);
        System.out.println("\nAmount balance: "+amt_balance);
    }
    
     public void withdraw_sa()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter the amount to withdraw: ");
        withdraw_amt=s.nextInt();
        amt_balance = amt_balance - withdraw_amt;
        
        if(amt_balance <=1000)
        {
            System.out.println("\nSorry :-( .. You cannot withdraw this amount." );
            amt_balance = amt_balance + withdraw_amt;
        }
        else
        {
        System.out.println("\nCurrent Amount Balance is: "+amt_balance);
        }
        
    }
    
    
    public void deposit_sa()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter the amount to deposit: ");
        deposit = s.nextInt();
        amt_balance = amt_balance + deposit;
        System.out.println("\nCurrent Amount Balance is: "+amt_balance);

        
    }
    
    public void loan_sa()
    {
        Scanner s = new Scanner(System.in);
        double principle , time;
        double rate = 10.25;
        System.out.println("\nEnter the amount for loan: ");
        principle = s.nextDouble();
         System.out.println("\nEnter the time period: ");
         time = s.nextDouble();
        /* Calculate compound interest */
        double CI = principle * 
                    (Math.pow((1 + rate / 100), time)); 
          
        System.out.println("Compound Interest is "+ CI);
    }
    
    public void current_ac()
    {
        Scanner s = new Scanner(System.in);
        
        type_ac = "Current Account";
        System.out.println("\nEnter the current account number: ");
        ac_no=s.nextInt();
        System.out.println("\nEnter the name of customer: ");
        name=s.next();
        System.out.println("\nEnter the deposit amount:");
        deposit=s.nextInt();
        amt_balance += deposit;
        if(amt_balance<=1000)
        {
            System.out.println("\nEnter minimum Rs.1000 /- :");
            System.exit(0);

            
        }else
        {
            System.out.println("\nCurrent Account created successfull..!!");

        }
    
        

    }
    
    public void display_ca()
    {
        System.out.println("\nCustomer's Account number is: "+ac_no);
        System.out.println("\nCustomer Name: "+name);
        System.out.println("\nAccount type is: "+type_ac);
        System.out.println("\nAmount balance: "+amt_balance);
    }
    
    public void withdraw_ca()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter the amount to withdraw: ");
        withdraw_amt=s.nextInt();
        amt_balance = amt_balance - withdraw_amt;
        
        if(amt_balance <=1000)
        {
            System.out.println("\nSorry :-( .. You cannot withdraw this amount." );
            amt_balance = amt_balance + withdraw_amt;
        }
        else
        {
        System.out.println("\nCurrent Amount Balance is: "+amt_balance);
        }
        
    }
    
    
    public void deposit_ca()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter the amount to deposit: ");
        deposit = s.nextInt();
        amt_balance = amt_balance + deposit;
        System.out.println("\nCurrent Amount Balance is: "+amt_balance);

        
    }
    
    public void loan_ca()
    {
        Scanner s = new Scanner(System.in);
        double principle , time;
        double rate = 10.25;
        System.out.println("\nEnter the amount for loan: ");
        principle = s.nextDouble();
         System.out.println("\nEnter the time period: ");
         time = s.nextDouble();
        /* Calculate compound interest */
        double CI = principle * 
                    (Math.pow((1 + rate / 100), time)); 
          
        System.out.println("Compound Interest is "+ CI);
    }
    
  
    
    
    
    
}


public class Account
{
      public static void main(String[] args)
        {
            int draw;
            Scanner s = new Scanner(System.in);
            int type;
            
            System.out.println("\nEnter the type of Account: \n Press - 1 for Saving Account \n Press - 2 for Current Account");
            type = s.nextInt();
            
            if(type == 1)
            {
                customer cust1 = new customer();

                int choice=0;
                

                do
                {
                        System.out.println("\nMENU");
                        System.out.println("\nPRESS - 1. Create Saving Account\nPRESS - 2. Display Account details\nPRESS - 3. Withdraw\nPRESS - 4.Deposit\nPRESS - 5. Loan Option\nPRESS - 6. Exit ");
                        choice = s.nextInt();

                        switch(choice)
                        {
                            case 1: cust1.saving_ac();
                            break;

                            case 2: cust1.display_sa();
                            break;

                            case 3: cust1.withdraw_sa();
                            break;

                            case 4: cust1.deposit_sa();
                            break;

                            case 5: cust1.loan_sa();
                            break;

                            case 6: System.exit(0);

                            default:

                                System.out.println("Wrong choice.");

                                break; 

                            

                        }
                        
                }while(choice!=6);
                System.exit(0);   
            }
            
            else if(type == 2)
            {
                customer cust2 = new customer();

                int choice=0;
                

                do
                {
                        System.out.println("\nMENU");
                        System.out.println("\nPRESS - 1. Create Current Account\n PRESS - 2. Display Account details\n PRESS - 3. Withdraw\n PRESS - 4.Deposit\n PRESS - 5. Exit. ");
                        choice = s.nextInt();

                        switch(choice)
                        {
                            case 1: cust2.current_ac();
                            break;

                            case 2: cust2.display_ca();
                            break;

                            case 3: cust2.withdraw_ca();
                            break;

                            case 4: cust2.deposit_ca();
                            break;

                            case 5: cust2.loan_ca();
                            break;

                            case 6: System.exit(0);
                            break;

                            default:

                                System.out.println("Wrong choice.");

                                break; 

                            

                        }
                        
                }while(choice!=6);
                System.exit(0); 
                


            }
            
            
            
        }
}
