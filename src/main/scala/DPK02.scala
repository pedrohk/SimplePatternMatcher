object DPK02 {
  def pattern_matcher2(country: String): String =
    if country == "Usa" then "English"
    else if country == "Brazil" then "Portuguese"
    else if country == "Spain" then "Spanish"
    else if country == "Italy" then "Italian"
    else if country == "France" then "French"
    else if country == "Germany" then "German"
    else "Unknown"

}
