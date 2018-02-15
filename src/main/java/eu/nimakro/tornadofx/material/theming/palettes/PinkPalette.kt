package eu.nimakro.tornadofx.material.theming.palettes

import eu.nimakro.tornadofx.material.theming.BasePalette.Companion.darkPrimaryText
import eu.nimakro.tornadofx.material.theming.BasePalette.Companion.lightPrimaryText
import javafx.scene.paint.Color
import tornadofx.*

object PinkPalette: Palette {
    override val h50   : Color = c("#fce4ec")
    override val h100  : Color = c("#f8bbd0")
    override val h200  : Color = c("#f48fb1")
    override val h300  : Color = c("#f06292")
    override val h400  : Color = c("#ec407a")
    override val h500  : Color = c("#e91e63")
    override val h600  : Color = c("#d81b60")
    override val h700  : Color = c("#c2185b")
    override val h800  : Color = c("#ad1457")
    override val h900  : Color = c("#880e4f")
    override val hA100 : Color = c("#ff80ab")
    override val hA200 : Color = c("#ff4081")
    override val hA400 : Color = c("#f50057")
    override val hA700 : Color = c("#c51162")

    //-- -contrast
    override val contrast50   : Color = darkPrimaryText
    override val contrast100  : Color = darkPrimaryText
    override val contrast200  : Color = darkPrimaryText
    override val contrast300  : Color = darkPrimaryText
    override val contrast400  : Color = darkPrimaryText
    override val contrast500  : Color = lightPrimaryText
    override val contrast600  : Color = lightPrimaryText
    override val contrast700  : Color = lightPrimaryText
    override val contrast800  : Color = lightPrimaryText
    override val contrast900  : Color = lightPrimaryText
    override val contrastA100 : Color = darkPrimaryText
    override val contrastA200 : Color = lightPrimaryText
    override val contrastA400 : Color = lightPrimaryText
    override val contrastA700 : Color = lightPrimaryText
}