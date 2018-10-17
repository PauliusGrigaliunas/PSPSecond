object Main {
  def main (args: Array[String]): Unit ={
    val AudiA6 = new CarSample("Audi A6", "Diesel", 2.0, 5, 0.2)
    val BMV535 = new CarSample("BMW535", "Diesel", 3.0, 5, 0.3)
    val Tesla = new CarSample("Tesla", "Electricity", 1.0, 2, 0.18)
    val BMX = new BicycleSample("BMX", "ECO", 1, 0.08)


    val rentFirstCar = new RentCarInSimpleModeUntilDay(AudiA6, 10, 5)
    rentFirstCar.MakeADeal

    val rentSecondCar = new RentCarInSimpleModeUnilMonth(BMV535, 8 * 1440, 123)
    rentSecondCar.MakeADeal

    val rentThirdCar = new RentCarInSimpleModeUnilMonth(Tesla, 30 * 1440, 74)
    rentThirdCar.MakeADeal

    val rentFirstBicycle = new RentBicycleUntilDay(BMX, 30)
    rentFirstBicycle.MakeADeal
  }
}
