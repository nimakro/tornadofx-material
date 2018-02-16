package eu.nimakro.tornadofx.material

import eu.nimakro.tornadofx.material.style.Button
import eu.nimakro.tornadofx.material.theming.Theme
import eu.nimakro.tornadofx.material.theming.Themes
import tornadofx.*

object Material {

    var theme: Theme = Themes.deepPurpleAmber
        set(value) {
            field = value
            FX.primaryStage.scene.reloadStylesheets()
        }
}