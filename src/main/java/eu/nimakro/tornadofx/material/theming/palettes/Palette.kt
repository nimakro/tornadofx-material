package eu.nimakro.tornadofx.material.theming.palettes

import eu.nimakro.tornadofx.material.theming.Hue
import javafx.scene.paint.Color

interface Palette {

    val h50: Color
    val h100: Color
    val h200: Color
    val h300: Color
    val h400: Color
    val h500: Color
    val h600: Color
    val h700: Color
    val h800: Color
    val h900: Color
    val hA100: Color
    val hA200: Color
    val hA400: Color
    val hA700: Color

    val contrast50: Color
    val contrast100: Color
    val contrast200: Color
    val contrast300: Color
    val contrast400: Color
    val contrast500: Color
    val contrast600: Color
    val contrast700: Color
    val contrast800: Color
    val contrast900: Color
    val contrastA100: Color
    val contrastA200: Color
    val contrastA400: Color
    val contrastA700: Color

    fun selectColor(hue: Hue) = when(hue) {
        Hue.h100 -> h100
        Hue.h200 -> h200
        Hue.h300 -> h300
        Hue.h400 -> h400
        Hue.h500 -> h500
        Hue.h600 -> h600
        Hue.h700 -> h700
        Hue.h800 -> h800
        Hue.h900 -> h900
        Hue.hA100 -> hA100
        Hue.hA200 -> hA200
        Hue.hA400 -> hA400
        Hue.hA700 -> hA700
    }

    fun selectContrastColor(hue: Hue) = when(hue) {
        Hue.h100 -> contrast100
        Hue.h200 -> contrast200
        Hue.h300 -> contrast300
        Hue.h400 -> contrast400
        Hue.h500 -> contrast500
        Hue.h600 -> contrast600
        Hue.h700 -> contrast700
        Hue.h800 -> contrast800
        Hue.h900 -> contrast900
        Hue.hA100 -> contrastA100
        Hue.hA200 -> contrastA200
        Hue.hA400 -> contrast400
        Hue.hA700 -> contrastA700
    }
}

