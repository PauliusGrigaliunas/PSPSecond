trait RentCarUntilDay {
  var Car : Car

  var Time: Double

  var Distance: Double

   def Discount(): Double ={
    {
      if (Car.Ecotype == "Electricity" || Car.Ecotype == "Eco") return CountThePrice() * 0.1
      else return 0
    }
  }

  def CountThePrice() = Car.TimeTarif * Time;

  def AdditionalServices() : Boolean =
  {
    return false
  }

  def  MakeADeal(): Unit

}
