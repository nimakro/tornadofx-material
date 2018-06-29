package eu.nimakro.tornadofx.material.style

import eu.nimakro.tornadofx.material.Material
import eu.nimakro.tornadofx.material.controls.MaterialButtonSkin
import javafx.scene.effect.BlurType
import javafx.scene.effect.DropShadow
import javafx.scene.paint.Color
import javafx.scene.paint.Paint
import tornadofx.*

class Button: Stylesheet() {

    companion object {

        val rippleFill by cssproperty<Paint>("-mat-ripple-fill")

        // type
        val raised by cssclass()
        val flat by cssclass()

        // color
        val primary by cssclass()
        val accent  by cssclass()
        val warn    by cssclass()


        private val elevation2 = DropShadow(BlurType.GAUSSIAN, Color.rgb(0, 0, 0, 0.26), 10.0, 0.12, -1.0, 2.0)

    }

    init {

        button {
            skin = MaterialButtonSkin::class
            backgroundColor += Material.theme.background
            rippleFill.value = Material.theme.background.withOpacity(0.1)

            and(hover) {
                backgroundColor += c("#303030",0.04)
            }

            and(armed) {
                backgroundColor += if (Material.theme.isDark) c("#CCCCCC", 0.25)
                                   else c("#999999", 0.4)
            }


            prefHeight = 36.0.px
            minWidth = 88.px
            borderRadius += box(2.px)
            padding = box(0.px, 8.px)

        }

        button and raised {
            effect = elevation2
            backgroundColor += Material.theme.background
            textFill = Material.theme.foreground.text
            rippleFill.value = Material.theme.background.withOpacity(0.1)

            and(disabled) {
                backgroundColor += if (Material.theme.isDark) c("#FFFFFF", 0.3)
                else c("#000000", 0.26)
            }
        }

        button and primary {
            textFill = Material.theme.primary.default
            rippleFill.value = Material.theme.primary.default.withOpacity(0.1)

            and(hover) {
                backgroundColor += Material.theme.primary.default.withOpacity(0.12)
            }

            and(raised) {
                effect = elevation2
                backgroundColor += Material.theme.primary.default
                rippleFill.value = Material.theme.primary.default.withOpacity(0.1)
                textFill = Material.theme.foreground.text
            }
        }

        button and accent {
            textFill = Material.theme.accent.default
            rippleFill.value = Material.theme.accent.default.withOpacity(0.1)

            and(hover) {
                backgroundColor += Material.theme.accent.default.withOpacity(0.12)
            }

            and(raised) {
                effect = elevation2
                backgroundColor += Material.theme.accent.default
                rippleFill.value = Color.BLUE
                textFill = Material.theme.foreground.text
            }
        }

        button and warn {
            textFill = Material.theme.warn.default
            rippleFill.value = Material.theme.warn.default.withOpacity(0.1)

            and(hover) {
                backgroundColor += Material.theme.warn.default.withOpacity(0.12)
            }

            and(raised) {
                effect = elevation2
                backgroundColor += Material.theme.warn.default
                rippleFill.value = Material.theme.warn.default.withOpacity(0.1)
                textFill = Material.theme.foreground.text
            }
        }
    }
}

fun Color.withOpacity(opacity: Double) = c(red, green, blue, opacity)

