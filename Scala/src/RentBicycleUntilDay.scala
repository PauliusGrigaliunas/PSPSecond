class RentBicycleUntilDay (
                            override var bicycle: Bicycle,
                            override var Time: Double)
  extends RentBicycle{


  override def AdditionalServices = false

  override def CountThePrice = bicycle.TimeTarif * Time * 0.1

  override def Discount = CountThePrice() * 0.1

  override def MakeADeal(): Unit = {

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
