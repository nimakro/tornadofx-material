package eu.nimakro.tornadofx.material.theming.palettes

import eu.nimakro.tornadofx.material.theming.BasePalette.darkPrimaryText
import eu.nimakro.tornadofx.material.theming.BasePalette.lightPrimaryText
import tornadofx.*

object GreenPalette: Palette {
    override val h50   = c("e8f5e9")
    override val h100  = c("c8e6c9")
    override val h200  = c("a5d6a7")
    override val h300  = c("81c784")
    override val h400  = c("66bb6a")
    override val h500  = c("4caf50")
    override val h600  = c("43a047")
    override val h700  = c("388e3c")
    override val h800  = c("2e7d32")
    override val h900  = c("1b5e20")
    override val hA100 = c("b9f6ca")
    override val hA200 = c("69f0ae")
    override val hA400 = c("00e676")
    override val hA700 = c("00c853")

    //-- Green-Contrast
    override val contrast50   = darkPrimaryText
    override val contrast100  = darkPrimaryText
    override val contrast200  = darkPrimaryText
    override val contrast300  = darkPrimaryText
    override val contrast400  = darkPrimaryText
    override val contrast500  = darkPrimaryText
    override val contrast600  = lightPrimaryText
    override val contrast700  = lightPrimaryText
    override val contrast800  = lightPrimaryText
    override val contrast900  = lightPrimaryText
    override val contrastA100 = darkPrimaryText
    override val contrastA200 = darkPrimaryText
    override val contrastA400 = darkPrimaryText
    override val contrastA700 = darkPrimaryText
}