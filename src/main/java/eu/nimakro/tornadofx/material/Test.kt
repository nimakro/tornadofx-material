package eu.nimakro.tornadofx.material

import eu.nimakro.tornadofx.material.controls.Type
import eu.nimakro.tornadofx.material.controls.type
import eu.nimakro.tornadofx.material.style.Button
import eu.nimakro.tornadofx.material.style.MaterialStyle
import eu.nimakro.tornadofx.material.theming.Themes
import javafx.application.Application
import javafx.beans.property.SimpleStringProperty
import javafx.geometry.Pos
import javafx.scene.Node
import javafx.scene.layout.Priority
import tornadofx.*

/**
 * Created by amish on 6/19/17.
 */

class Main: App(MainView::class, MaterialStyle::class) {
    override fun onBeforeShow(view: UIComponent) {
        println(Button().render())

    }
}

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

        flatButtons()
        raisedButtons()
    }
}

fun Node.flatButtons() = vbox(10) {

    style {
        padding = box(15.px)
    }

    label("Flat-Buttons") {
        vgrow = Priority.ALWAYS
        alignment = Pos.CENTER
    }
    hbox(15) {
        button("Basic")
        button("Primary") {
            addClass(Button.primary)
            type = Type.FLAT
        }
        button("Accent") {
            addClass(Button.accent)
            type = Type.FLAT
        }
        button("Warn") {
            addClass(Button.warn)
            type = Type.FLAT
        }
        button("Disabled") {
            isDisable = true
        }
    }
}

fun Node.raisedButtons() = vbox(10) {
    style {
        padding = box(15.px)
    }
    label("Raised-Buttons") {
        vgrow = Priority.ALWAYS
        alignment = Pos.CENTER
    }
    hbox(15) {
        button("Basic").addClass(Button.raised)
        button("Primary") {
            addClass(Button.primary)
            addClass(Button.raised)
        }
        button("Accent") {
            addClass(Button.accent)
            addClass(Button.raised)
        }
        button("Warn") {
            addClass(Button.warn)
            addClass(Button.raised)
        }
        button("Disabled") {
            addClass(Button.raised)
            isDisable = true
        }
    }
}

fun main(args: Array<String>) {
    Application.launch(Main::class.java, *args)
}
