package eu.nimakro.tornadofx.material.theming

import javafx.scene.paint.Color
import tornadofx.*

/**
 * The color pallet's are from the Material Design spec.
 * See https://www.google.com/design/spec/style/color.html
 */
object BasePalette {

    val black = Color.BLACK
    val darkPrimaryText = c(black, 0.87)
    val darkSecondaryText = c(black, 0.54)
    val darkDisabledText = c(black, 0.38)
    val darkDividers = c(black, 0.12)
    val darkFocused = c(black, 0.12)

    val white = Color.WHITE
    val lightPrimaryText = white
    val lightSecondaryText = c(white, 0.7)
    val lightDisabledText = c(white, 0.5)
    val lightDividers = c(white, 0.12)
    val lightFocused = c(white, 0.12)

    private fun c(color: Color, opacity: Double): Color = Color(color.red, color.green, color.blue, opacity)

}
