trait TurboMode {
  def PollutionAmount( car: Car, distance: Double  ): Double  = {
    if (car.Ecotype == "Electricity" || car.Ecotype == "Eco") return 0;
    else return distance * car.Engine * 0.1;
  }
}
