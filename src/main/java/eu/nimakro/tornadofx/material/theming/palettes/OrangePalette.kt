package eu.nimakro.tornadofx.material.theming.palettes

import eu.nimakro.tornadofx.material.theming.BasePalette.black
import eu.nimakro.tornadofx.material.theming.BasePalette.darkPrimaryText
import eu.nimakro.tornadofx.material.theming.BasePalette.lightPrimaryText
import tornadofx.*

object OrangePalette: Palette {

    override val h50    = c("fff3e0")
    override val h100   = c("ffe0b2")
    override val h200   = c("ffcc80")
    override val h300   = c("ffb74d")
    override val h400   = c("ffa726")
    override val h500   = c("ff9800")
    override val h600   = c("fb8c00")
    override val h700   = c("f57c00")
    override val h800   = c("ef6c00")
    override val h900   = c("e65100")
    override val hA100  = c("ffd180")
    override val hA200  = c("ffab40")
    override val hA400  = c("ff9100")
    override val hA700  = c("ff6d00")

    override val contrast50   = darkPrimaryText
    override val contrast100  = darkPrimaryText
    override val contrast200  = darkPrimaryText
    override val contrast300  = darkPrimaryText
    override val contrast400  = darkPrimaryText
    override val contrast500  = darkPrimaryText
    override val contrast600  = darkPrimaryText
    override val contrast700  = darkPrimaryText
    override val contrast800  = lightPrimaryText
    override val contrast900  = lightPrimaryText
    override val contrastA100 = darkPrimaryText
    override val contrastA200 = darkPrimaryText
    override val contrastA400 = darkPrimaryText
    override val contrastA700 = black
}