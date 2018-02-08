package eu.nimakro.tornadofx.material

import eu.nimakro.tornadofx.material.style.MaterialStyle
import javafx.application.Application
import tornadofx.*

/**
 * Created by amish on 6/19/17.
 */

class Main: App(MainView::class, MaterialStyle::class)


class MainView: View("Test") {
    override val root = vbox {
        button("TEST")
    }
}

fun main(args: Array<String>) {
    Application.launch(Main::class.java, *args)
}
