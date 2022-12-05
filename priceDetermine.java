/*Demand : 5 person wants to buy 200 shares
 *Supply : 5 person wants to sell 20 shares
*/
class priceDetermine {
    public static void main(String args[])
    {
          int demand = 1000;
          int supply = 100;
          Boolean demand_flag = false;
          priceDetermine price = new priceDetermine();
          demand_flag = price.checkDemand(demand,supply);
          if(demand_flag)
          System.out.println("Demand is: "+demand+ " greater than supply: "+supply+ " price will increase" );
          else
          System.out.println("Demand is: "+demand+ " less than supply: "+supply+ " price will decrease");

    }

         public Boolean checkDemand(int demand,int supply)
         {
            return demand>supply?true:false;
         }
}