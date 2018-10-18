abstract class RentBicycle (var bicycle: Bicycle,
                            var Time: Double){

  var Vehile: AVehile = bicycle
  def Discount(): Double
  def CountThePrice(): Double
  def AdditionalServices(): Boolean

  def MakeADeal(): Unit = {
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
    + "€")
    System.out.println("AdditionalService - " + AdditionalServices().toString);
  }
}
