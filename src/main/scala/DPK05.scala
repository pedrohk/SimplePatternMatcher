object DPK05 {
  val countries5 = Array(
    ("Usa", "English"),
    ("Brazil", "Portuguese"),
    ("Spain", "Spanish"),
    ("Italy", "Italian"),
    ("France", "French"),
    ("Germany", "German")
  )

  def pattern_matcher5(country: String): String =
    for (c, l) <- countries5 do
      if c == country then return l
    "Unknown"
}
