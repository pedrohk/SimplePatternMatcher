object DPK09 {
  val pattern_matcher9: PartialFunction[String, String] = {
    case "Usa" => "English"
    case "Brazil" => "Portuguese"
    case "Spain" => "Spanish"
    case "Italy" => "Italian"
    case "France" => "French"
    case "Germany" => "German"
  }

  def getLanguage9(country: String): String =
    if pattern_matcher9.isDefinedAt(country) then pattern_matcher9(country)
    else "Unknown"
}
