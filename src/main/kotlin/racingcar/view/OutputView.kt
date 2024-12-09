package racingcar.view

class OutputView {

    fun printResult(tryCount: Int, carNames: List<String>, moveCounts: List<List<String>>) {
        println("실행 결과")
        for (i in 0 until tryCount) {
            printCars(carNames, moveCounts, i)
            println()
        }
    }

    private fun printCars(carNames: List<String>, moveCounts: List<List<String>>, i: Int) {
        for (j in carNames.indices) {
            println("${carNames[j]} : ${moveCounts[j].take(i + 1).joinToString("")}")
        }
    }

    fun printWinners(winners: List<String>) {
        println("최종 우승자 : ${winners.joinToString()}")
    }
}