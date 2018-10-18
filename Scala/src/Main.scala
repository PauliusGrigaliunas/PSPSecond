object Main {
  def main (args: Array[String]): Unit ={
    val AudiA6 = new Car("Audi A6", "Diesel", 2.0, 5, 0.2)
    val BMV535 = new Car("BMW535", "Diesel", 3.0, 5, 0.3)
    val Tesla = new Car("Tesla", "Electricity", 1.0, 2, 0.18)
    val BMX = new Bicycle("BMX", "Eco", 1, 0.17)


    val rentFirstCar = new RentCarInSimpleModeUntilDay(AudiA6, 10, 5)
    rentFirstCar.MakeADeal

    val rentSecondCar = new RentCarInSimpleModeUnilMonth(BMV535, 8 * 14, 123)
    rentSecondCar.MakeADeal

    val rentThirdCar = new RentCarInSimpleModeUnilMonth(Tesla, 30 * 14, 74)
    rentThirdCar.MakeADeal

    val rentFirstBicycle = new RentBicycleUntilDay(BMX, 60)
    rentFirstBicycle.MakeADeal
  }
}
