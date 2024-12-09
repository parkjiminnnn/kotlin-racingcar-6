package racingcar.domain

import racingcar.utils.GenerateRandomNumber.randomNumber

class Car(val carName: String) {
    private fun isMove(randomNumber: Int): Boolean {
        return randomNumber >= 4
    }

    private fun move(randomNumber: Int): String {
        if (isMove(randomNumber)) return "-"
        return ""
    }

    fun getMoves(tryCount: Int): List<String> {
        return List(tryCount) { move(randomNumber()) }
    }
}