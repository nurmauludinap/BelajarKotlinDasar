fun main() {

    val nilaiUjian = 80
    val nilaiAbsen = 80
    val nilaiEkstra = 70

    val apakahLulusUjian = nilaiUjian > 75
    val apakahLulusAbsen = nilaiAbsen > 75
    val apakahLulusEkstra = nilaiEkstra > 75

    val apakahLulus = apakahLulusUjian && apakahLulusAbsen && apakahLulusEkstra
//    val apakahLulus = (apakahLulusUjian && apakahLulusAbsen) && apakahLulusEkstra
    //    val apakahLulus = ((apakahLulusUjian && apakahLulusAbsen) && apakahLulusEkstra)
    println(apakahLulus)
}