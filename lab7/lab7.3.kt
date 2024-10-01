import kotlin.random.Random

fun teamPoints(wins: Int, draws: Int): Int {
    val pointsPerWin = 3
    val pointsPerDraw = 1
    val totalPoints = (wins * pointsPerWin) + (draws * pointsPerDraw)
    return totalPoints
}

fun main() {
    val team1Wins = Random.nextInt(0, 5)
    val team1Draws = Random.nextInt(0, 5)
    val team1Losses = Random.nextInt(0, 5)
    println("Побед: $team1Wins\nНичья: $team1Draws\nПроигрышей: $team1Losses\n")
    val team1Points = teamPoints(team1Wins, team1Draws)
    println("Команда набрала $team1Points очков")
}
