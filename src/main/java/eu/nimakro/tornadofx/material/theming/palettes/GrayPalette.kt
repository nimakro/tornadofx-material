package eu.nimakro.tornadofx.material.theming.palettes

import eu.nimakro.tornadofx.material.theming.BasePalette.darkPrimaryText
import eu.nimakro.tornadofx.material.theming.BasePalette.lightPrimaryText
import tornadofx.*

object GrayPalette : Palette {

    override val h50    = c("fafafa")
    override val h100   = c("f5f5f5")
    override val h200   = c("eeeeee")
    override val h300   = c("e0e0e0")
    override val h400   = c("bdbdbd")
    override val h500   = c("9e9e9e")
    override val h600   = c("757575")
    override val h700   = c("616161")
    override val h800   = c("424242")
    override val h900   = c("212121")
    override val hA100  = c("ffffff")
    override val hA200  = c("eeeeee")
    override val hA400  = c("bdbdbd")
    override val hA700  = c("616161")

    override val contrast50    = darkPrimaryText
    override val contrast100   = darkPrimaryText
    override val contrast200   = darkPrimaryText
    override val contrast300   = darkPrimaryText
    override val contrast400   = darkPrimaryText
    override val contrast500   = darkPrimaryText
    override val contrast600   = lightPrimaryText
    override val contrast700   = lightPrimaryText
    override val contrast800   = lightPrimaryText
    override val contrast900   = lightPrimaryText
    override val contrastA100  = darkPrimaryText
    override val contrastA200  = darkPrimaryText
    override val contrastA400  = darkPrimaryText
    override val contrastA700  = lightPrimaryText
}