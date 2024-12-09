package racingcar.utils

object ErrorHandler {
    fun handleCarNameLength(rawCarNames: String) {
        val carNames = rawCarNames.split(',')
        carNames.forEach { carName ->
            if (carName.length > 5) throw IllegalArgumentException()
        }
    }
}