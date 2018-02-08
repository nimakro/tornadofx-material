package eu.nimakro.tornadofx.material.style

import eu.nimakro.tornadofx.material.controls.ButtonType
import eu.nimakro.tornadofx.material.controls.MaterialButtonSkin
import eu.nimakro.tornadofx.material.theming.Palette
import javafx.scene.paint.Paint
import tornadofx.*

/**
 * Created by amish on 6/19/17.
 */
class MaterialStyle: Stylesheet() {

    companion object {
        val type by cssproperty<ButtonType>()
        val rippleFill by cssproperty<Paint>()
    }

    init {
        button {
            // Dense
            backgroundColor += Palette.blue600
            textFill = Palette.blueContrast600
            backgroundRadius += box(3.px) //2dp
            // margin 8dp
            padding = box(0.7.em, 0.57.em) // left/right 8dp
            fontSize = 13.pt // 13.pt Roboto medium
            prefWidth = 200.px
            //prefHeight = 32.dp

            skin = MaterialButtonSkin::class
            type.value = ButtonType.RAISED
            rippleFill.value = c("#536dfe")
        }
    }
}

