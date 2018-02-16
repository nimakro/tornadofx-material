package eu.nimakro.tornadofx.material.theming.palettes

import eu.nimakro.tornadofx.material.theming.BasePalette.darkPrimaryText
import eu.nimakro.tornadofx.material.theming.BasePalette.lightPrimaryText
import tornadofx.*

object BlueGreyPalette: Palette {
    override val h50    = c("#eceff1")
    override val h100   = c("#cfd8dc")
    override val h200   = c("b0bec5")
    override val h300   = c("90a4ae")
    override val h400   = c("78909c")
    override val h500   = c("607d8b")
    override val h600   = c("546e7a")
    override val h700   = c("455a64")
    override val h800   = c("37474f")
    override val h900   = c("263238")
    override val hA100  = c("cfd8dc")
    override val hA200  = c("b0bec5")
    override val hA400  = c("78909c")
    override val hA700  = c("455a64")

    // Blue-Gray-Contrast
    override val contrast50  = darkPrimaryText
    override val contrast100  = darkPrimaryText
    override val contrast200  = darkPrimaryText
    override val contrast300  = darkPrimaryText
    override val contrast400  = lightPrimaryText
    override val contrast500  = lightPrimaryText
    override val contrast600  = lightPrimaryText
    override val contrast700  = lightPrimaryText
    override val contrast800  = lightPrimaryText
    override val contrast900  = lightPrimaryText
    override val contrastA100  = darkPrimaryText
    override val contrastA200  = darkPrimaryText
    override val contrastA400  = lightPrimaryText
    override val contrastA700  = lightPrimaryText
}