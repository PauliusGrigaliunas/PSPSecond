class RentBicycleUntilMonth (
                              override var bicycle: Bicycle,
                              override var Time: Double)
  extends RentBicycle {

  override def AdditionalServices() : Boolean = {
    if(bicycle.NumberOfSeats >= 4)  return true
    else return false
  }
  override def CountThePrice =  Time * bicycle.TimeTarif * 0.02

  override def Discount= CountThePrice() * 0.18

  override def MakeADeal() = {

    System.out.println();
    System.out.println("Name - " + bicycle.Name);
    System.out.println("Price - " +
      BigDecimal(CountThePrice()).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
      + "€");
    System.out.println("Discount - " +
      BigDecimal(Discount()).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
      + "€");
    System.out.println("Real price - " +
      BigDecimal(CountThePrice()- Discount()).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
      + "€");
   }
}


