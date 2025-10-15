object DPK04 {
  case class CountryLang(country: String, lang: String)

  val countries4 = List(
    CountryLang("Usa", "English"),
    CountryLang("Brazil", "Portuguese"),
    CountryLang("Spain", "Spanish"),
    CountryLang("Italy", "Italian"),
    CountryLang("France", "French"),
    CountryLang("Germany", "German")
  )

  def pattern_matcher4(country: String): String =
    countries4.find(_.country == country).map(_.lang).getOrElse("Unknown")
}
