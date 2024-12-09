package racingcar.domain

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class RaceTest {
    private val race = Race("a,b","7")

    @Test
    fun `carsByMoves`() {
    }

    @Test
    fun `우승자 출력 테스트`() {
        val result = race.getWinners()
        val expected = listOf("a")

        assertEquals(expected,result)
    }
}