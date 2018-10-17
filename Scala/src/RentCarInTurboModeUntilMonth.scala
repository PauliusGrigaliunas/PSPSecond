class RentCarInTurboModeUntilMonth(
                                    override var Car: Car,
                                    override var Time: Double,
                                    override var Distance: Double)

  extends RentCar  with SimpleMode {

  override def Discount(): Double ={
    {
      if (Car.Ecotype == "Electricity" || Car.Ecotype == "Eco") return CountThePrice() * 0.1
      else return 0
    }
  }

  override def CountThePrice() = Car.TimeTarif * Time;

  override def AdditionalServices() : Boolean =
  {
    return false
  }

  override def PollutionAmount( car: Car, distance: Double ): Double =         {
    if (Car.Ecotype == "Electricity" || Car.Ecotype == "Eco") return 0;
    else return distance * car.Engine * 0.1;
  }
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
