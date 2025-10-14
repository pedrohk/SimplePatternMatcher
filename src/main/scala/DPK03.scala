object DPK03 {
  def pattern_matcher3(country: String): String =
    (country, 1) match
      case ("Usa", _) => "English"
      case ("Brazil", _) => "Portuguese"
      case ("Spain", _) => "Spanish"
      case ("Italy", _) => "Italian"
      case ("France", _) => "French"
      case ("Germany", _) => "German"
      case _ => "Unknown"

}
