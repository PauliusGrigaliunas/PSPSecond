trait RentCarUntilMonth {
  var Car : Car

  var Time: Double

  var Distance: Double

  def Discount(): Double ={
    {
      if (Car.Ecotype == "Electricity" || Car.Ecotype == "Eco") return CountThePrice() * 0.18
      else return 0
    }
  }

  def CountThePrice() = Car.TimeTarif * Time * 0.02;

  def AdditionalServices() : Boolean =
  {
    if (Car.NumberOfSeats >= 4) return true
    else return false
  }

  def  MakeADeal(): Unit
}
