class RentCarInSimpleModeUntilDay(
                                   override var Car: Car,
                                   override var Time: Double,
                                   override var Distance: Double)

  extends RentCarUntilDay  with SimpleMode {



  override def MakeADeal() = {

    System.out.println();
    System.out.println("Name - " + Car.Name);
    System.out.println("Price - " +
      BigDecimal(CountThePrice()).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
      + "€");
    System.out.println("Discount - " +
      BigDecimal(Discount()).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
      + "€");
    System.out.println("Real price - " +
      BigDecimal(CountThePrice()- Discount()).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
      + "€");
    System.out.println("AdditionalService - " + PollutionAmount( Car, Distance ).toString);
  }
}
