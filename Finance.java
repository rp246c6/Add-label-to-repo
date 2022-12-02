public class Finance
{
  public static void main(String args[])
  {

    int commission = 10;
    System.out.println("Welcome to Finance");
    System.out.println("checking Commission..");
    Finance com = new Finance();
    if(com.checkCommission())
    {
      System.out.println("Eligible for Commission");
    }
    else
    {
      System.out.println("Not Eligible for Commission");
    }

  }
  public Boolean checkCommission(int Commission)
  {
     return Commission > 100 ? true : false;
  }
  
}
