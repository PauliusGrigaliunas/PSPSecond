class RentCarInSimpleModeUntilDay( car: Car, Time: Double, Distance: Double)
  extends RentCar(car: Car, Time: Double, Distance: Double) with RentVehileUntilDay  with SimpleMode {
}
