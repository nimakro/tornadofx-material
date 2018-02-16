package eu.nimakro.tornadofx.material.theming

import eu.nimakro.tornadofx.material.theming.palettes.*

object Themes {
    private val primaryPurpleGreen = computePalette(PurplePalette, Hue.h700, Hue.h500, Hue.h800)
    private val accentPurpleGreen = computePalette(GreenPalette, Hue.hA200, Hue.hA100, Hue.hA400)

    val purpleGreen: Theme = darkTheme(primaryPurpleGreen, accentPurpleGreen)

    private val primaryDeepPurpleAmber = computePalette(DeepPurplePalette)
    private val accentDeepPurpleAmber = computePalette(AmberPalette, Hue.hA200, Hue.hA100, Hue.hA400)
    val deepPurpleAmber: Theme = lightTheme(primaryDeepPurpleAmber, accentDeepPurpleAmber)


    private val primaryPinkBlueGrey = computePalette(PinkPalette, Hue.h700, Hue.h500, Hue.h900)
    private val accentPinkBlueGrey = computePalette(BlueGreyPalette, Hue.hA200, Hue.hA100, Hue.hA400)
    val pinkBlueGrey: Theme = darkTheme(primaryPinkBlueGrey, accentPinkBlueGrey)
}
