package eu.nimakro.tornadofx.material

import eu.nimakro.tornadofx.material.controls.Type
import eu.nimakro.tornadofx.material.controls.type
import eu.nimakro.tornadofx.material.style.Button
import eu.nimakro.tornadofx.material.style.MaterialStyle
import eu.nimakro.tornadofx.material.theming.Themes
import javafx.application.Application
import javafx.beans.property.SimpleStringProperty
import javafx.geometry.Pos
import javafx.scene.layout.Priority
import tornadofx.*

/**
 * Created by amish on 6/19/17.
 */

class Main: App(MainView::class, MaterialStyle::class)

class MainView: View("Test") {
    private val purpleGreen = "Purple-Green"
    private val deepPurpleAmber = "Deep-Purple-Amber"
    private val pinkBlueGrey = "Pink-Blue-Grey"

    private val selected = SimpleStringProperty()

    init {
        selected.onChange {
            when(it) {
                purpleGreen -> Material.theme = Themes.purpleGreen
                deepPurpleAmber -> Material.theme = Themes.deepPurpleAmber
                pinkBlueGrey -> Material.theme = Themes.pinkBlueGrey
            }
        }
    }

    override val root = vbox(10) {
        label("Change-Theme")
        combobox(selected, listOf(purpleGreen, deepPurpleAmber, pinkBlueGrey))

        label("Flat-Buttons") {
            vgrow = Priority.ALWAYS
            alignment = Pos.CENTER
        }
        hbox(4) {
            button("Basic")
            button("Primary") {
                addClass(Button.primary)
                type = Type.PRIMARY
            }
            button("Accent") {
                addClass(Button.accent)
                type = Type.ACCENT
            }
            button("Warn") {
                addClass(Button.warn)
                type = Type.WARN
            }
            button("Disabled") {
                isDisable = true
            }
        }
    }
}

fun main(args: Array<String>) {
    Application.launch(Main::class.java, *args)
}
