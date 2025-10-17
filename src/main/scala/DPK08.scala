object DPK08 {
  enum Country(val lang: String):
    case Usa extends Country("English")
    case Brazil extends Country("Portuguese")
    case Spain extends Country("Spanish")
    case Italy extends Country("Italian")
    case France extends Country("French")
    case Germany extends Country("German")

  def pattern_matcher8(country: String): String =
    try Country.valueOf(country).lang
    catch case _: Exception => "Unknown"
}
