package eu.nimakro.tornadofx.material.style

import eu.nimakro.tornadofx.material.Material
import javafx.scene.paint.Color
import tornadofx.*

/**
 * Created by amish on 6/19/17.
 */
class MaterialStyle: Stylesheet() {
    companion object {
        val testBackground by cssproperty<Color>("-fx-background")
    }

    init {
        importStylesheet(Button::class)

        root {
            testBackground.value = Material.theme.background;
        }


    }
}

