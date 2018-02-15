package eu.nimakro.tornadofx.material.theming

import eu.nimakro.tornadofx.material.theming.palettes.Palette
import javafx.scene.paint.Color

interface ThemePalette {

    val palette: Palette

    val default: Color
    val lighter: Color
    val darker: Color

    val defaultContrast: Color
    val lighterColor: Color
    val darkerContrast: Color

}