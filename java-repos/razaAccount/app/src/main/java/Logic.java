package src.main.java;

/**
 * This is where the logic of this App is centralized.
 *
 * <p>The assignments are designed this way to simplify your early Android interactions. Designing
 * the assignments this way allows you to first learn key 'Java' features without having to
 * beforehand learn the complexities of Android.
 */
public class Logic extends Account<Number> {

  /** This is the method that will ultimately get called */
  public static void main(String[] args) {
    Account<String> acct1=new Account<>();
    Account<Integer> acct2=new Account<>();
    /*
     creating array of objects and filling with values
    */
    Account[] customer=new Account[]{
            new Account<>("Rose Dior") , new Account<>("Lucy Lastic") , new Account<>("Viola Fuss" , 182.90)
    };
    for ( Account account : customer) {
      System.out.println(account.toString());
    }

    Account<String> acctX = new Account<>("Bob", 27.50);
    // mOut.println(acctX.toString()); # uncomm. for print acctx.
    tripleIt(acctX);
    acctX.displayBalance();

    // makes copy of existing object

    // Account acctY = new Account(mOut); initialize a new object.
    acctX.makeCopyOf(acct2); // i am using existing one.
    acct2.setName("Raza Haider");
    System.out.println("acct2=" + acct2.toString());


    /*acct1.name = "Bill";
            acct1.number = 738924;
            acct1.balance = 231.48;

            acct2.name = "Sue";
            acct2.number = 894730;
            acct2.balance =3000;
            Above code is working before the fields are private
    */
    acct1.setName("Rick Rudd");

    acct1.setBalance(150.2);
    System.out.println(acct1.getName());

    // mOut.println("Account number:- "+acct1.getNumber());
    System.out.println(
        acct1.getNumber()); // added println method to outputInterface to print integer
    // and also in MAinActivity

    System.out.println(acct1.getBalance()); // also displayBalance() works like this.

    // int value = acct1.getNumber();
    // *mOut.println(value);
    System.out.println("before");
    acct1.setBalance((double) 15); // overrides the previous setBalance
    acct1.displayBalance();
    acct1.deposit(18.91);
    System.out.println("After");
    System.out.println("Deposit is ");
    acct1.displayBalance();

    // acct1.deposit(89.00);
    // acct1.displayBalance();

    /* acct2.displayBalance();
            acct2.withdrawal(300);
            acct2.displayBalance();
    */
    // USing our own constructor
    Account<String> acctA = new Account<>("Sue Vlaki");
    Account<String> acctB = new Account<>("Joseph schmoe", 187.13);

    System.out.println(acct1.toString());
    System.out.println(acctB.toString());

    acctA.displayBalance();
    acctB.displayBalance();
    acctB.withdrawal(100);
    acctB.displayBalance();

    System.out.println("RTNUMBER = " + Account.RTNUMBER);
  }
}
