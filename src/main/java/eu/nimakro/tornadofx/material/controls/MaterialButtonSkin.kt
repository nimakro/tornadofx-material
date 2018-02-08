package eu.nimakro.tornadofx.material.controls

import com.sun.javafx.scene.control.skin.ButtonSkin
import javafx.animation.Interpolator
import javafx.beans.property.ObjectProperty
import javafx.beans.property.SimpleObjectProperty
import javafx.scene.Group
import javafx.scene.control.Button
import javafx.scene.layout.StackPane
import javafx.scene.paint.Color
import javafx.scene.paint.Paint
import javafx.scene.shape.Circle
import javafx.util.Duration
import tornadofx.*


const val RIPPLE_MAX_RADIUS = 300.0
const val RIPPLE_FADE_IN_DURATION = 450.0
const val RIPPLE_FADE_OUT_DURATION = 400.0

/**
 * Created by amish on 6/19/17.
 */
class MaterialButtonSkin(button: Button) : ButtonSkin(button) {

    val renderer = RippleRenderer()

    init {
        val container = StackPane(renderer)
        // add listeners to the button and bind properties
        skinnable.setOnMousePressed {  e ->
            renderer.render(e.x, e.y, computeRippleRadius(button.layoutBounds.width, button.layoutBounds.height))
            //println("$e Pressed")
        }
        val clipNode = StackPane()
        clipNode.shape = skinnable.shape
        clipNode.resize(button.width - button.snappedRightInset() - button.snappedLeftInset(),
                button.height - button.snappedBottomInset() - button.snappedTopInset())
        //clipNode.relocate(button.layoutBounds.minX, button.layoutBounds.minY)
        //renderer.clip = clipNode

        // add rippel effect to the container
        //children[0].isMouseTransparent = true
        children.add(0, renderer)
    }

    fun computeRippleRadius(width: Double, height: Double): Double {
        val width2 = width * width
        val height2 = height * height
        return Math.min(Math.sqrt(width2 + height2), RIPPLE_MAX_RADIUS) * 1.1 + 5
    }
}

class RippleRenderer : Group() {

    init {
        // 1. set clip
    }

    fun render(x: Double, y: Double, radius: Double) {
        // create the ripple effect
        val ripple = Ripple(x, y, radius)
        children.add(0, ripple)

        ripple.onFinish { children.remove(ripple) }
    }
}


class Ripple(centerX: Double, centerY: Double, radius: Double) : Circle(centerX, centerY, radius) {

    val rippleInterpolator = Interpolator.SPLINE(0.0825, 0.3025, 0.0875, 0.9975)!! //0.1, 0.54, 0.28, 0.95);

    var finished: (() -> Unit)? = null

    init {
        //Interpolator.SPLINE(0.0, 0.0 , 0.2, 1.0)
        val c = Color(Color.LIGHTBLUE.red, Color.LIGHTBLUE.green, Color.LIGHTBLUE.blue, 0.3)
        stroke = c
        fill = c

        //-- Fade in
        timeline {
            keyframe(Duration.ZERO) {
                keyvalue(scaleXProperty(), 0.0, rippleInterpolator)
                keyvalue(scaleYProperty(), 0.0, rippleInterpolator)
                keyvalue(opacityProperty(), 1.0, rippleInterpolator)
            }
            keyframe(Duration(RIPPLE_FADE_IN_DURATION)){
                keyvalue(scaleXProperty(), 0.9, rippleInterpolator)
                keyvalue(scaleYProperty(), 0.9, rippleInterpolator)
            }
            setOnFinished {
                //-- Fade out
                timeline {
                    keyframe(Duration(RIPPLE_FADE_OUT_DURATION)) {
                        keyvalue(scaleXProperty(), 1.0, rippleInterpolator)
                        keyvalue(scaleYProperty(), 1.0, rippleInterpolator)
                        keyvalue(opacityProperty(), 0.0, rippleInterpolator)
                    }
                    setOnFinished { finished?.invoke() }
                }.play()
            }
        }.play()
    }

    fun onFinish(op: ()-> Unit) { finished = op }
}



enum class ButtonType { RAISED, FLAT }

const val BUTTON_RIPPLER_FILL = "tornadofx.material.button.ripplerFill"

val Button.ripplerFillProperty: ObjectProperty<Paint>
    get()  {
        var v = (this.properties[BUTTON_RIPPLER_FILL] as? ObjectProperty<Paint>)
        if (v == null) {
            v = SimpleObjectProperty<Paint>(this, "ripplerFill")
            this.properties[BUTTON_RIPPLER_FILL] = v
        }
        return v
    }

var Button.ripplerFill: Paint?
    get() = (this.properties[BUTTON_RIPPLER_FILL] as? ObjectProperty<Paint>)?.value
    set(value) {
        val v = (this.properties[BUTTON_RIPPLER_FILL] as? ObjectProperty<Paint>)
        if (v == null) {
            this.properties[BUTTON_RIPPLER_FILL] = SimpleObjectProperty<Paint>(this, "ripplerFill", value)
        } else {
            v.value = value
        }
    }
