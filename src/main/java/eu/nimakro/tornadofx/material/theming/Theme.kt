package eu.nimakro.tornadofx.material.theming

import eu.nimakro.tornadofx.material.theming.palettes.Palette
import eu.nimakro.tornadofx.material.theming.palettes.RedPalette

interface Theme {

    val primary: ThemePalette
    val accent: ThemePalette
    val warn: ThemePalette
    val isDark: Boolean
    //val foreground: Any?
    //val background: Any?
}

fun computePalette(basePalette: Palette, default: Hue = Hue.h500, lighter: Hue = Hue.h100, darker: Hue = Hue.h700): ThemePalette {
   return object : ThemePalette {

       override val palette = basePalette

       override val default = basePalette.selectColor(default)
       override val lighter = basePalette.selectColor(lighter)
       override val darker = basePalette.selectColor(darker)
       override val defaultContrast = basePalette.selectContrastColor(default)
       override val lighterColor = basePalette.selectContrastColor(lighter)
       override val darkerContrast = basePalette.selectContrastColor(darker)
   }
}

// Creates a container object for a light theme to be given to individual component theme mixins.
fun lightTheme(primary: ThemePalette, accent: ThemePalette, warn: ThemePalette = computePalette(RedPalette)): Theme {
    return object: Theme {
        override val primary = primary
        override val accent = accent
        override val warn = warn
        override val isDark = false
        //override val foreground = null
        //override val background = null
    }
}

fun darkTheme(primary: ThemePalette, accent: ThemePalette, warn: ThemePalette = computePalette(RedPalette)): Theme {
    return object: Theme {
        override val primary = primary
        override val accent = accent
        override val warn = warn
        override val isDark = true
        //override val background = w
        //override val foreground = null
    }
}

enum class Hue {
    h100,
    h200,
    h300,
    h400,
    h500,
    h600,
    h700,
    h800,
    h900,
    hA100,
    hA200,
    hA400,
    hA700,
}


