object DPK01 {
  def pattern_matcher1(country: String): String = country match
    case "Usa" => "English"
    case "Brazil" => "Portuguese"
    case "Spain" => "Spanish"
    case "Italy" => "Italian"
    case "France" => "French"
    case "Germany" => "German"
    case _ => "Unknown"

}
