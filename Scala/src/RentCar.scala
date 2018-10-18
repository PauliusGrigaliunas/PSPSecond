abstract class RentCar (var car: Car,
                        var Time: Double,
                        var Distance: Double) {

  var Vehile: AVehile = car
  def CountThePrice() : Double
  def Discount(): Double
  def AdditionalServices() : Boolean
  def PollutionAmount(car: Car, Distance: Double ) : Double

  def MakeADeal() = {

    System.out.println();
    System.out.println("Name - " + car.Name);
    System.out.println("Price - " +
      BigDecimal(CountThePrice()).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
      + "€");
    System.out.println("Discount - " +
      BigDecimal(Discount()).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
      + "€");
    System.out.println("Real price - " +
      BigDecimal(CountThePrice()- Discount()).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
      + "€");
    System.out.println("AdditionalService - " + AdditionalServices().toString);
    System.out.println("Pollution amount - " + PollutionAmount( car, Distance ).toString);
  }

}
