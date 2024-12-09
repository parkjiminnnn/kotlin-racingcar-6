package racingcar.controller

import racingcar.domain.Race
import racingcar.utils.ErrorHandler.handleCarNameLength
import racingcar.view.InputView
import racingcar.view.OutputView

class RaceController {
    private val inputView = InputView()
    private val outputView = OutputView()
    fun run() {
        val rawCarNames = inputView.inputCarNamesMessage()
        handleCarNameLength(rawCarNames)
        val rawTryCount = inputView.inputCountMessage()

        val race = Race(rawCarNames, rawTryCount)

        outputView.printResult(race.tryCount, race.carNames, race.carsByMoves())
        outputView.printWinners(race.getWinners())
    }
}
