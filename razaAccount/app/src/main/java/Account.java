package src.main.java;



/**
 * This file defines the Account class.  It provides the basis for a
 * series of improvements you'll need to make as you progress through
 * the lessons in Module 6.
 */
public
class Account<Number> {

    /**
     * Name of the account holder.
     */
    private String name;
    /**
     * Number of the account.
     */
    private Number number;
    /**
     * Current balance in the account.
     */
    private double balance=0;

    /**
     * for build acct number
     */
     private static int count;
     
     /**
      * Static class constant 
      * defined in the class file
      */
      public static final String
 RTNUMBER = "85493627";
     
    public Account(){
      
    }
     
    /**
     * Constructor initializes the field
     */
     public Account( String newName){
       name = newName;
       number = buildAcctNumber();
       }
  
     public Account( String newName, Double initialBalance){
      this(newName);
      number =buildAcctNumber();
      balance = initialBalance;
      }

    /** this will be used for creating
     *  Account Number 
     */



    private @SuppressWarnings("Unchecked cast")
     Number buildAcctNumber(){
      count = (count+1)%100;
      return (Number) (formatYr() + hash() + count);
    }
    
    
     private String hash ()
     {
         String last2dig;
         String x=Integer.toString(name.hashCode());
         if (x.length()>=2){
            last2dig = x.substring(x.length()-2);
         }
         else {
             last2dig =x;
         }
       return last2dig;
     }
     
     private String formatYr(){
       return String.valueOf(2019).substring(2);
     }
    
    public static
    void tripleIt ( Account<String> x ) {
        x.deposit(x.getBalance()*2);
    }

    public
    String getName () {
        return name;
    }

    public
    void setName ( String name ) {
        this.name=name;
    }

    public @SuppressWarnings("Unchecked cast")
    Number getNumber () {
        return number =(Number) (RTNUMBER + buildAcctNumber());
    }

    public
    Double getBalance () {
        return balance;
    }

    public
    void setBalance ( Double balance ) {
        this.balance=balance;
    }

    public @SuppressWarnings("Unchecked cast") void makeCopyOf(Account<Integer> original){

        this.name = original.name;        //this.setName = original.name;
        this.number =(Number) original.number;    //this.setNumber = original.number;   lecture basis.
        this.deposit(original.getBalance());
    }

    /**
     * Deposit @a amount into the account.
     */
    public
    void deposit ( Double amount ) {
        balance+=amount;
    }

    /**
     * Withdraw @a amount from the account.  Prints "Insufficient
     * Funds" if there's not enough money in the account.
     */
    public
    void withdrawal ( double amount ) {
        if (balance>amount)
            balance-=amount;
        else
            System.out.println("Insufficient Funds");
    }

    /**
     * Display the current @a amount in the account.
     */
    public
    void displayBalance () {
        System.out.println("The balance on account "
                +getNumber()
                +" is "
                +balance);
    }



    @Override
    public
    String toString () {
        return "Account{"+
                "name='"+name+'\''+
                ", number="+getNumber()+
                ", balance="+balance+
                '}';
    }
}
