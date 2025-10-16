object DPK07 {
  val countries7 = List(
    ("Usa", "English"),
    ("Brazil", "Portuguese"),
    ("Spain", "Spanish"),
    ("Italy", "Italian"),
    ("France", "French"),
    ("Germany", "German")
  )

  def pattern_matcher7(country: String): String =
    def loop(lst: List[(String, String)]): String = lst match
      case Nil => "Unknown"
      case (c, l) :: tail => if c == country then l else loop(tail)

    loop(countries7)
}
