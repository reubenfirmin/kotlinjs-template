package org.example.pages.home.card3

class HitTheClub(
    private val kickDrum: KickDrum,
    private val hiHat: HiHat,
    private val tb303: TB303
) {
    private val bassline = listOf(
        45, 45, 45, 45, 45, 45, 50, 45
    )

    fun grid(beatCount: Int, time: Double) {
        when (beatCount % 16) {
            0 -> {
                kickDrum.play(time)

            }
            2 -> {
                hiHat.play(time)
                tb303.play(time, bassline[0], 3)
            }
            4 -> {
                kickDrum.play(time)
                tb303.play(time, bassline[1], 3)
            }
            6 -> {
                hiHat.play(time)
                tb303.play(time, bassline[2], 3)
            }
            8 -> {
                kickDrum.play(time)
            }
            10 -> {
                hiHat.play(time)
                tb303.play(time, bassline[4], 3)
            }
            12 -> {
                kickDrum.play(time)
            }
            14 -> {
                hiHat.play(time)
                tb303.play(time, bassline[6], 3)
            }
        }

        // Add occasional accent notes for variation
        if (beatCount % 32 == 30) {
            tb303.play(time, bassline[beatCount % 8] + 12, 3)  // Accent note one octave higher
        }
    }
}