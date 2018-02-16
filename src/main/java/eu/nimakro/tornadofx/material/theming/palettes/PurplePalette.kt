package eu.nimakro.tornadofx.material.theming.palettes

import eu.nimakro.tornadofx.material.theming.BasePalette.darkPrimaryText
import eu.nimakro.tornadofx.material.theming.BasePalette.lightPrimaryText
import tornadofx.*

object PurplePalette: Palette {

    override val h50   = c("#f3e5f5")
    override val h100  = c("#e1bee7")
    override val h200  = c("#ce93d8")
    override val h300  = c("#ba68c8")
    override val h400  = c("#ab47bc")
    override val h500  = c("#9c27b0")
    override val h600  = c("#8e24aa")
    override val h700  = c("#7b1fa2")
    override val h800  = c("#6a1b9a")
    override val h900  = c("#4a148c")
    override val hA100 = c("#ea80fc")
    override val hA200 = c("#e040fb")
    override val hA400 = c("#d500f9")
    override val hA700 = c("#aa00ff")

    //-- Purple-Contrast
    override val contrast50   = darkPrimaryText
    override val contrast100  = darkPrimaryText
    override val contrast200  = darkPrimaryText
    override val contrast300  = lightPrimaryText
    override val contrast400  = lightPrimaryText
    override val contrast500  = lightPrimaryText
    override val contrast600  = lightPrimaryText
    override val contrast700  = lightPrimaryText
    override val contrast800  = lightPrimaryText
    override val contrast900  = lightPrimaryText
    override val contrastA100 = darkPrimaryText
    override val contrastA200 = lightPrimaryText
    override val contrastA400 = lightPrimaryText
    override val contrastA700 = lightPrimaryText
}