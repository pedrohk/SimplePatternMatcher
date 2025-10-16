object DPK06 {
  val pattern_matcher6: String => String = {
    case "Usa" => "English"
    case "Brazil" => "Portuguese"
    case "Spain" => "Spanish"
    case "Italy" => "Italian"
    case "France" => "French"
    case "Germany" => "German"
    case _ => "Unknown"
  }
}
