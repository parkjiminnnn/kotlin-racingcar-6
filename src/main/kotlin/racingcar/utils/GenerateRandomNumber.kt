package racingcar.utils

import camp.nextstep.edu.missionutils.Randoms

object GenerateRandomNumber {
    fun randomNumber() = Randoms.pickNumberInRange(0, 9)
}