public class Finance
{
  public static void main(String args[])
  {
    int commission = 10;
    System.out.println("Welcome to Finance");
    System.out.println("checking commission..");
    Finance com = new Finance();
    if(com.checkCommission(commission))
    {
      System.out.println("Eligible for commission");
    }
    else
    {
      System.out.println("Not Eligible for commission");
    }

  }
  public Boolean checkCommission(int commission)
  {
    return commission>100?true:false;
  }
}
