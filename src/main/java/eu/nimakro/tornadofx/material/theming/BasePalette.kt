package eu.nimakro.tornadofx.material.theming

import javafx.scene.paint.Color
import tornadofx.*

/**
 * The color pallet's are from the Material Design spec.
 * See https://www.google.com/design/spec/style/color.html
 */
class BasePalette {

    companion object {
        private fun c(color: Color, opacity: Double): Color = Color(color.red, color.green, color.blue, opacity)

        val black             = Color.BLACK
        val darkPrimaryText   = c(black, 0.87)
        val darkSecondaryText = c(black, 0.54)
        val darkDisabledText  = c(black, 0.38)
        val darkDividers      = c(black, 0.12)
        val darkFocused       = c(black, 0.12)

        val white              = Color.WHITE
        val lightPrimaryText   = white
        val lightSecondaryText = c(white, 0.7)
        val lightDisabledText  = c(white, 0.5)
        val lightDividers      = c(white, 0.12)
        val lightFocused       = c(white, 0.12)




        //-- Indigo
        val indigo50   = c("e8eaf6")
        val indigo100  = c("c5cae9")
        val indigo200  = c("9fa8da")
        val indigo300  = c("7986cb")
        val indigo400  = c("5c6bc0")
        val indigo500  = c("3f51b5")
        val indigo600  = c("3949ab")
        val indigo700  = c("303f9f")
        val indigo800  = c("283593")
        val indigo900  = c("1a237e")
        val indigoA100 = c("8c9eff")
        val indigoA200 = c("536dfe")
        val indigoA400 = c("3d5afe")
        val indigoA700 = c("304ffe")

        // Indigo-Contrast
        val indigoContrast50   = darkPrimaryText
        val indigoContrast100  = darkPrimaryText
        val indigoContrast200  = darkPrimaryText
        val indigoContrast300  = lightPrimaryText
        val indigoContrast400  = lightPrimaryText
        val indigoContrast500  = lightPrimaryText
        val indigoContrast600  = lightPrimaryText
        val indigoContrast700  = lightPrimaryText
        val indigoContrast800  = lightPrimaryText
        val indigoContrast900  = lightPrimaryText
        val indigoContrastA100 = darkPrimaryText
        val indigoContrastA200 = lightPrimaryText
        val indigoContrastA400 = lightPrimaryText
        val indigoContrastA700 = lightPrimaryText

        //-- Blue
        val blue50   = c("e3f2fd")
        val blue100  = c("bbdefb")
        val blue200  = c("90caf9")
        val blue300  = c("64b5f6")
        val blue400  = c("42a5f5")
        val blue500  = c("2196f3")
        val blue600  = c("1e88e5")
        val blue700  = c("1976d2")
        val blue800  = c("1565c0")
        val blue900  = c("0d47a1")
        val blueA100 = c("82b1ff")
        val blueA200 = c("448aff")
        val blueA400 = c("2979ff")
        val blueA700 = c("2962ff")

        //-- val Blue-Contrast
        val blueContrast50   = darkPrimaryText
        val blueContrast100  = darkPrimaryText
        val blueContrast200  = darkPrimaryText
        val blueContrast300  = darkPrimaryText
        val blueContrast400  = darkPrimaryText
        val blueContrast500  = lightPrimaryText
        val blueContrast600  = lightPrimaryText
        val blueContrast700  = lightPrimaryText
        val blueContrast800  = lightPrimaryText
        val blueContrast900  = lightPrimaryText
        val blueContrastA100 = darkPrimaryText
        val blueContrastA200 = lightPrimaryText
        val blueContrastA400 = lightPrimaryText
        val blueContrastA700 = lightPrimaryText

        //-- Light-Blue
        val lightBlue50   = c("e1f5fe")
        val lightBlue100  = c("b3e5fc")
        val lightBlue200  = c("81d4fa")
        val lightBlue300  = c("4fc3f7")
        val lightBlue400  = c("29b6f6")
        val lightBlue500  = c("03a9f4")
        val lightBlue600  = c("039be5")
        val lightBlue700  = c("0288d1")
        val lightBlue800  = c("0277bd")
        val lightBlue900  = c("01579b")
        val lightBlueA100 = c("80d8ff")
        val lightBlueA200 = c("40c4ff")
        val lightBlueA400 = c("00b0ff")
        val lightBlueA700 = c("0091ea")

        //-- Light-Blue-Contrast
        val lightBlueContrast50   = darkPrimaryText
        val lightBlueContrast100  = darkPrimaryText
        val lightBlueContrast200  = darkPrimaryText
        val lightBlueContrast300  = darkPrimaryText
        val lightBlueContrast400  = darkPrimaryText
        val lightBlueContrast500  = lightPrimaryText
        val lightBlueContrast600  = lightPrimaryText
        val lightBlueContrast700  = lightPrimaryText
        val lightBlueContrast800  = lightPrimaryText
        val lightBlueContrast900  = lightPrimaryText
        val lightBlueContrastA100 = darkPrimaryText
        val lightBlueContrastA200 = darkPrimaryText
        val lightBlueContrastA400 = darkPrimaryText
        val lightBlueContrastA700 = lightPrimaryText

        //-- Cyan
        val cyan50  = c("e0f7fa")
        val cyan100  = c("b2ebf2")
        val cyan200  = c("80deea")
        val cyan300  = c("4dd0e1")
        val cyan400  = c("26c6da")
        val cyan500  = c("00bcd4")
        val cyan600  = c("00acc1")
        val cyan700  = c("0097a7")
        val cyan800  = c("00838f")
        val cyan900  = c("006064")
        val cyanA100  = c("84ffff")
        val cyanA200  = c("18ffff")
        val cyanA400  = c("00e5ff")
        val cyanA700  = c("00b8d4")

        //-- Cyan-Contrast
        val cyanContrast50   = darkPrimaryText
        val cyanContrast100  = darkPrimaryText
        val cyanContrast200  = darkPrimaryText
        val cyanContrast300  = darkPrimaryText
        val cyanContrast400  = darkPrimaryText
        val cyanContrast500  = lightPrimaryText
        val cyanContrast600  = lightPrimaryText
        val cyanContrast700  = lightPrimaryText
        val cyanContrast800  = lightPrimaryText
        val cyanContrast900  = lightPrimaryText
        val cyanContrastA100 = darkPrimaryText
        val cyanContrastA200 = darkPrimaryText
        val cyanContrastA400 = darkPrimaryText
        val cyanContrastA700 = darkPrimaryText

        //-- Teal
        val teal50  = c("e0f2f1")
        val teal100  = c("b2dfdb")
        val teal200  = c("80cbc4")
        val teal300  = c("4db6ac")
        val teal400  = c("26a69a")
        val teal500  = c("009688")
        val teal600  = c("00897b")
        val teal700  = c("00796b")
        val teal800  = c("00695c")
        val teal900  = c("004d40")
        val tealA100  = c("a7ffeb")
        val tealA200  = c("64ffda")
        val tealA400  = c("1de9b6")
        val tealA700  = c("00bfa5")

        //-- Teal-Contrast
        val tealContrast50  = darkPrimaryText
        val tealContrast100  = darkPrimaryText
        val tealContrast200  = darkPrimaryText
        val tealContrast300  = darkPrimaryText
        val tealContrast400  = darkPrimaryText
        val tealContrast500  = lightPrimaryText
        val tealContrast600  = lightPrimaryText
        val tealContrast700  = lightPrimaryText
        val tealContrast800  = lightPrimaryText
        val tealContrast900  = lightPrimaryText
        val tealContrastA100  = darkPrimaryText
        val tealContrastA200  = darkPrimaryText
        val tealContrastA400  = darkPrimaryText
        val tealContrastA700  = darkPrimaryText


        //-- Light-Green
        val lightGreen50   = c("f1f8e9")
        val lightGreen100  = c("dcedc8")
        val lightGreen200  = c("c5e1a5")
        val lightGreen300  = c("aed581")
        val lightGreen400  = c("9ccc65")
        val lightGreen500  = c("8bc34a")
        val lightGreen600  = c("7cb342")
        val lightGreen700  = c("689f38")
        val lightGreen800  = c("558b2f")
        val lightGreen900  = c("33691e")
        val lightGreenA100 = c("ccff90")
        val lightGreenA200 = c("b2ff59")
        val lightGreenA400 = c("76ff03")
        val lightGreenA700 = c("64dd17")

        //-- Light-Green-Contrast
        val lightGreenContrast50   = darkPrimaryText
        val lightGreenContrast100  = darkPrimaryText
        val lightGreenContrast200  = darkPrimaryText
        val lightGreenContrast300  = darkPrimaryText
        val lightGreenContrast400  = darkPrimaryText
        val lightGreenContrast500  = darkPrimaryText
        val lightGreenContrast600  = darkPrimaryText
        val lightGreenContrast700  = lightPrimaryText
        val lightGreenContrast800  = lightPrimaryText
        val lightGreenContrast900  = lightPrimaryText
        val lightGreenContrastA100 = darkPrimaryText
        val lightGreenContrastA200 = darkPrimaryText
        val lightGreenContrastA400 = darkPrimaryText
        val lightGreenContrastA700 = darkPrimaryText

        //-- Lime
        val lime50   = c("f9fbe7")
        val lime100  = c("f0f4c3")
        val lime200  = c("e6ee9c")
        val lime300  = c("dce775")
        val lime400  = c("d4e157")
        val lime500  = c("cddc39")
        val lime600  = c("c0ca33")
        val lime700  = c("afb42b")
        val lime800  = c("9e9d24")
        val lime900  = c("827717")
        val limeA100 = c("f4ff81")
        val limeA200 = c("eeff41")
        val limeA400 = c("c6ff00")
        val limeA700 = c("aeea00")

        // Lime-Contrast
        val limeContrast50   = darkPrimaryText
        val limeContrast100  = darkPrimaryText
        val limeContrast200  = darkPrimaryText
        val limeContrast300  = darkPrimaryText
        val limeContrast400  = darkPrimaryText
        val limeContrast500  = darkPrimaryText
        val limeContrast600  = darkPrimaryText
        val limeContrast700  = darkPrimaryText
        val limeContrast800  = darkPrimaryText
        val limeContrast900  = lightPrimaryText
        val limeContrastA100 = darkPrimaryText
        val limeContrastA200 = darkPrimaryText
        val limeContrastA400 = darkPrimaryText
        val limeContrastA700 = darkPrimaryText

        //-- Yellow
        val yellow50   = c("fffde7")
        val yellow100  = c("fff9c4")
        val yellow200  = c("fff59d")
        val yellow300  = c("fff176")
        val yellow400  = c("ffee58")
        val yellow500  = c("ffeb3b")
        val yellow600  = c("fdd835")
        val yellow700  = c("fbc02d")
        val yellow800  = c("f9a825")
        val yellow900  = c("f57f17")
        val yellowA100 = c("ffff8d")
        val yellowA200 = c("ffff00")
        val yellowA400 = c("ffea00")
        val yellowA700 = c("ffd600")

        //-- Yellow-Contrast
        val yellowContrast50   = darkPrimaryText
        val yellowContrast100  = darkPrimaryText
        val yellowContrast200  = darkPrimaryText
        val yellowContrast300  = darkPrimaryText
        val yellowContrast400  = darkPrimaryText
        val yellowContrast500  = darkPrimaryText
        val yellowContrast600  = darkPrimaryText
        val yellowContrast700  = darkPrimaryText
        val yellowContrast800  = darkPrimaryText
        val yellowContrast900  = darkPrimaryText
        val yellowContrastA100 = darkPrimaryText
        val yellowContrastA200 = darkPrimaryText
        val yellowContrastA400 = darkPrimaryText
        val yellowContrastA700 = darkPrimaryText


        //-- Orange
        val orange50    = c("fff3e0")
        val orange100   = c("ffe0b2")
        val orange200   = c("ffcc80")
        val orange300   = c("ffb74d")
        val orange400   = c("ffa726")
        val orange500   = c("ff9800")
        val orange600   = c("fb8c00")
        val orange700   = c("f57c00")
        val orange800   = c("ef6c00")
        val orange900   = c("e65100")
        val orangeA100  = c("ffd180")
        val orangeA200  = c("ffab40")
        val orangeA400  = c("ff9100")
        val orangeA700  = c("ff6d00")

        //-- Orange-Contrast
        val orangeContrast50   = darkPrimaryText
        val orangeContrast100  = darkPrimaryText
        val orangeContrast200  = darkPrimaryText
        val orangeContrast300  = darkPrimaryText
        val orangeContrast400  = darkPrimaryText
        val orangeContrast500  = darkPrimaryText
        val orangeContrast600  = darkPrimaryText
        val orangeContrast700  = darkPrimaryText
        val orangeContrast800  = lightPrimaryText
        val orangeContrast900  = lightPrimaryText
        val orangeContrastA100 = darkPrimaryText
        val orangeContrastA200 = darkPrimaryText
        val orangeContrastA400 = darkPrimaryText
        val orangeContrastA700 = black

        // Deep-Orange
        val deepOrange50    = c("fbe9e7")
        val deepOrange100   = c("ffccbc")
        val deepOrange200   = c("ffab91")
        val deepOrange300   = c("ff8a65")
        val deepOrange400   = c("ff7043")
        val deepOrange500   = c("ff5722")
        val deepOrange600   = c("f4511e")
        val deepOrange700   = c("e64a19")
        val deepOrange800   = c("d84315")
        val deepOrange900   = c("bf360c")
        val deepOrangeA100  = c("ff9e80")
        val deepOrangeA200  = c("ff6e40")
        val deepOrangeA400  = c("ff3d00")
        val deepOrangeA700  = c("dd2c00")

        // Deep-Orange-Contrast
        val deepOrangeContrast50   = darkPrimaryText
        val deepOrangeContrast100   = darkPrimaryText
        val deepOrangeContrast200   = darkPrimaryText
        val deepOrangeContrast300   = darkPrimaryText
        val deepOrangeContrast400   = darkPrimaryText
        val deepOrangeContrast500   = lightPrimaryText
        val deepOrangeContrast600   = lightPrimaryText
        val deepOrangeContrast700   = lightPrimaryText
        val deepOrangeContrast800   = lightPrimaryText
        val deepOrangeContrast900   = lightPrimaryText
        val deepOrangeContrastA100  = darkPrimaryText
        val deepOrangeContrastA200  = darkPrimaryText
        val deepOrangeContrastA400  = lightPrimaryText
        val deepOrangeContrastA700  = lightPrimaryText

        //Brown
        val brown50    = c("efebe9")
        val brown100   = c("d7ccc8")
        val brown200   = c("bcaaa4")
        val brown300   = c("a1887f")
        val brown400   = c("8d6e63")
        val brown500   = c("795548")
        val brown600   = c("6d4c41")
        val brown700   = c("5d4037")
        val brown800   = c("4e342e")
        val brown900   = c("3e2723")
        val brownA100  = c("d7ccc8")
        val brownA200  = c("bcaaa4")
        val brownA400  = c("8d6e63")
        val brownA700  = c("5d4037")

        // Brown-Contrast
        val brownContrast50  = darkPrimaryText
        val brownContrast100  = darkPrimaryText
        val brownContrast200  = darkPrimaryText
        val brownContrast300  = lightPrimaryText
        val brownContrast400  = lightPrimaryText
        val brownContrast500  = lightPrimaryText
        val brownContrast600  = lightPrimaryText
        val brownContrast700  = lightPrimaryText
        val brownContrast800  = lightPrimaryText
        val brownContrast900  = lightPrimaryText
        val brownContrastA100  = darkPrimaryText
        val brownContrastA200  = darkPrimaryText
        val brownContrastA400  = lightPrimaryText
        val brownContrastA700  = lightPrimaryText

        //Grey
        val gray50    = c("fafafa")
        val grey100   = c("f5f5f5")
        val gray200   = c("eeeeee")
        val gray300   = c("e0e0e0")
        val gray400   = c("bdbdbd")
        val gray500   = c("9e9e9e")
        val gray600   = c("757575")
        val gray700   = c("616161")
        val gray800   = c("424242")
        val gray900   = c("212121")
        val grayA100  = c("ffffff")
        val grayA200  = c("eeeeee")
        val grayA400  = c("bdbdbd")
        val grayA700  = c("616161")

        //-- Grey-Contrast
        val greyContrast50    = darkPrimaryText
        val greyContrast100   = darkPrimaryText
        val greyContrast200   = darkPrimaryText
        val greyContrast300   = darkPrimaryText
        val greyContrast400   = darkPrimaryText
        val greyContrast500   = darkPrimaryText
        val greyContrast600   = lightPrimaryText
        val greyContrast700   = lightPrimaryText
        val greyContrast800   = lightPrimaryText
        val greyContrast900   = lightPrimaryText
        val greyContrastA100  = darkPrimaryText
        val greyContrastA200  = darkPrimaryText
        val greyContrastA400  = darkPrimaryText
        val greyContrastA700  = lightPrimaryText

    }
}
