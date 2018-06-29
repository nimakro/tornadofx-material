package eu.nimakro.tornadofx.material.effects

import javafx.scene.Node
import javafx.scene.effect.BlurType
import javafx.scene.effect.DropShadow
import javafx.scene.paint.Color


fun <T: Node> T.elevation(zValue: Int, color: Color = Color.BLACK) {
    if (zValue > 24 || zValue < 1) IllegalArgumentException("zValue muss zwischen 1 und 24 sein!")
    val shadow = when (zValue) {
        0 -> DropShadow(BlurType.GAUSSIAN, Color.rgb(0, 0, 0), 0.0, 0.0, 0.0, 0.0)
        2 -> DropShadow(BlurType.GAUSSIAN, Color.rgb(0, 0, 0, 0.26), 10.0, 0.12, -1.0, 2.0)
        4 -> DropShadow(BlurType.GAUSSIAN, Color.rgb(0, 0, 0, 0.26), 15.0, 0.16, 0.0, 4.0)
        6 -> DropShadow(BlurType.GAUSSIAN, Color.rgb(0, 0, 0, 0.26), 20.0, 0.19, 0.0, 6.0)
        8 -> DropShadow(BlurType.GAUSSIAN, Color.rgb(0, 0, 0, 0.26), 25.0, 0.25, 0.0, 8.0)
        10 -> DropShadow(BlurType.GAUSSIAN, Color.rgb(0, 0, 0, 0.26), 30.0, 0.30, 0.0, 10.0)
        else -> throw IllegalStateException("$zValue not supported")
    }
    this.effect = shadow
}
