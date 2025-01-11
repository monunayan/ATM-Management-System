import java.util.*;
class Main {
    public static void main(String[] args) {
Scanner pin =new Scanner(System.in);
System.out.println ("Welcome to ATM");
System.out.print("Enter PIN :");
int Mypin = pin.nextInt();
int balance=10000000;
int deposit=0;
int withdrawl=0;
if(Mypin ==2727){
    while(true){
    System.out.println("********Select any option*********");
    System.out.println("* Check Your Balance press --> 1"); 
    System.out.println("* Deposit Money press --> 2");
    System.out.println("* Withdrawl Money press--> 3");
    System.out.println("* Exit press--> 4");
    System.out.println("**********Press Valid Option***********");
  int opt=pin.nextInt();
  if(opt==1){
      System.out.println("Balance remaining is ;" +balance);
  }
  else if (opt==2){
      System.out.println("Enter Amount:" );
      int dop=pin.nextInt();
      balance+=dop;
      System.out.println("Balance is " + balance);
  }
  else if (opt==3){
      System.out.println("Enter Withdrawl Amount");
      int wit=pin.nextInt();
      if(wit<=balance){
      balance-=wit;
      System.out.println("Amount Withdrawl Successfully");
      System.out.println( "your current Amount is :" +balance); 
      }else{
          System.out.println("Insufficient balance.");
      }
  }
  else if (opt==4){
      System.out.println("Thank you for using the ATM");
      break;
  }
  else if (opt>=5){
      System.out.println("YOU ARE CHOOSE THE WRONG OPTION");
      System.out.println("PLEASE TRY AGAIN ");
      System.out.println("THANK YOU");
  }
    }
}
    else{
    System.out.println("Incorrect PIN");
    System.out.println("PLEASE TRY AGAIN ");
      System.out.println("THANKYOU");
}
System.out.println(" ");
    }
}

