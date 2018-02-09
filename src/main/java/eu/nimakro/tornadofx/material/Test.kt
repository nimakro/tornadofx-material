package eu.nimakro.tornadofx.material

import eu.nimakro.tornadofx.material.style.MaterialStyle
import javafx.application.Application
import javafx.stage.Screen
import tornadofx.*

/**
 * Created by amish on 6/19/17.
 */

class Main: App(MainView::class, MaterialStyle::class)

class MainView: View("Test") {
    override val root = vbox {
        paddingAll = 32
        spacing = 16.0
        button("Cancel")
        button("Confirm")
    }
}

fun main(args: Array<String>) {
    Application.launch(Main::class.java, *args)
}
