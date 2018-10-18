trait RentVehileUntilMonth {
  var Vehile : AVehile

  var Time: Double


  def Discount(): Double ={
    {
      if (Vehile.Ecotype == "Electricity" || Vehile.Ecotype == "Eco") return CountThePrice() * 0.18
      else return 0
    }
  }

  def CountThePrice() = Vehile.TimeTarif * Time * 0.02;

  def AdditionalServices() : Boolean =
  {
    if (Vehile.NumberOfSeats >= 4) return true
    else return false
  }

}
