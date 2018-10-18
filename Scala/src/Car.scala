class Car(override var Name: String,
          override var Ecotype: String,
          var Engine: Double,
          override var NumberOfSeats: Int,
          override var TimeTarif: Double )
  extends AVehile {
}
