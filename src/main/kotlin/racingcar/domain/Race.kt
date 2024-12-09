package racingcar.domain

class Race(rawCarNames: String, rawTryCount: String) {
    val carNames = rawCarNames.split(',')
    val tryCount = rawTryCount.toInt()
    private val cars = carNames.map { Car(it) }

    private fun getCarsByMoveCounts(): List<Pair<String, Int>> {
        val moveCounts = mutableListOf<Pair<String, Int>>()
        cars.forEach { car ->
            val moves = car.getMoves(tryCount).count { it == "-" }
            moveCounts.add(Pair(car.carName, moves))
        }
        return moveCounts
    }

    fun carsByMoves(): List<List<String>> {
        return cars.map { car ->
            car.getMoves(tryCount)
        }
    }

    fun getWinners(): List<String> {
        val carsByMoveCounts = getCarsByMoveCounts()
        val carNamesByMoveCounts = carsByMoveCounts
            .filter { carNames ->
                carNames.second == carsByMoveCounts
                    .maxOfOrNull { it.second }
            }
        return carNamesByMoveCounts.map { it.first }
    }
}
