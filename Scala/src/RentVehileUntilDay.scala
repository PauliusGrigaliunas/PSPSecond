trait RentVehileUntilDay {

  var Vehile : AVehile

  var Time: Double


   def Discount(): Double ={
    {
      if (Vehile.Ecotype == "Electricity" || Vehile.Ecotype == "Eco") return CountThePrice() * 0.1
      else return 0
    }
  }

  def CountThePrice() = Vehile.TimeTarif * Time;

  def AdditionalServices() : Boolean =
  {
    return false
  }

}
