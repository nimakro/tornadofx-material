package eu.nimakro.tornadofx.material.style

import eu.nimakro.tornadofx.material.Material
import eu.nimakro.tornadofx.material.controls.MaterialButtonSkin
import javafx.scene.paint.Color
import javafx.scene.paint.Paint
import tornadofx.*

class Button: Stylesheet() {

    companion object {

        val rippleFill by cssproperty<Paint>()
        val primary by cssclass()
        val accent  by cssclass()
        val warn    by cssclass()
    }

    init {
        button {
            skin = MaterialButtonSkin::class
            backgroundColor += Color.TRANSPARENT
            and(hover) {
                backgroundColor += c("#303030",0.04)
            }
            
            prefHeight = 36.0.px
            minWidth = 88.px
            borderRadius += box(2.px)
            padding = box(0.px, 8.px)

        }

        button and primary {
            textFill = Material.theme.primary.default
            rippleFill.value = Material.theme.primary.default.withOpacity(0.1)

            and(hover) {
                backgroundColor += Material.theme.primary.default.withOpacity(0.12)
            }
        }

        button and accent {
            textFill = Material.theme.accent.default
            and(hover) {
                backgroundColor += Material.theme.accent.default.withOpacity(0.12)
            }
        }

        button and warn {
            textFill = Material.theme.warn.default
            and(hover) {
                backgroundColor += Material.theme.warn.default.withOpacity(0.12)
            }
        }
    }
}

fun Color.withOpacity(opacity: Double) = c(red, green, blue, opacity)

