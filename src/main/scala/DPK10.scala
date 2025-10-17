object DPK10 {
  sealed trait CountryLang10

  case object Usa extends CountryLang10

  case object Brazil extends CountryLang10

  case object Spain extends CountryLang10

  case object Italy extends CountryLang10

  case object France extends CountryLang10

  case object Germany extends CountryLang10

  def pattern_matcher10(country: String): String =
    val countryObj = country match
      case "Usa" => Some(Usa)
      case "Brazil" => Some(Brazil)
      case "Spain" => Some(Spain)
      case "Italy" => Some(Italy)
      case "France" => Some(France)
      case "Germany" => Some(Germany)
      case _ => None

    countryObj match
      case Some(Usa) => "English"
      case Some(Brazil) => "Portuguese"
      case Some(Spain) => "Spanish"
      case Some(Italy) => "Italian"
      case Some(France) => "French"
      case Some(Germany) => "German"
      case _ => "Unknown"
}
