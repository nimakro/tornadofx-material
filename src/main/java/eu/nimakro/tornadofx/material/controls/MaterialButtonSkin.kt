package eu.nimakro.tornadofx.material.controls

import com.sun.javafx.scene.control.skin.ButtonSkin
import eu.nimakro.tornadofx.material.effects.Ripple
import eu.nimakro.tornadofx.material.effects.elevation
import eu.nimakro.tornadofx.material.style.withOpacity
import javafx.beans.property.ObjectProperty
import javafx.beans.property.SimpleObjectProperty
import javafx.css.CssMetaData
import javafx.css.StyleConverter
import javafx.css.Styleable
import javafx.css.StyleableObjectProperty
import javafx.geometry.Bounds
import javafx.scene.Group
import javafx.scene.Node
import javafx.scene.control.Button
import javafx.scene.paint.Color
import javafx.scene.paint.Paint
import javafx.scene.shape.Rectangle


const val RIPPLE_MAX_RADIUS = 300.0

/** See: https://github.com/angular/material2/blob/master/src/lib/core/ripple/ripple.ts */
const val RIPPLE_FADE_IN_DURATION = 450.0
const val RIPPLE_FADE_OUT_DURATION = 400.0

/**
 * Created by amish on 6/19/17.
 */
class MaterialButtonSkin(button: Button) : ButtonSkin(button) {
    private val renderer = RippleRenderer(skinnable)

    companion object {
        val styleables: MutableList<CssMetaData<*, *>> = create()

        private fun create(): MutableList<CssMetaData<out Styleable, *>> {
            val cssMetaData = ButtonSkin.getClassCssMetaData().toMutableList()
            cssMetaData.add(rippleFillCss)
            println("Create-Css-Class")
            return cssMetaData;
        }
    }

    init {
        // add listeners to the button and bind properties
        skinnable.setOnMousePressed {  e ->
            renderer.render(e.x, e.y, button.layoutBounds, skinnable.rippleFill)
        }

        //button.typeProperty.onChange { skinnable.evaluation(it) }

        //skinnable.evaluation(button.type)

        // add ripple effect to the container
        //children[0].isMouseTransparent = true
        children.add(0, renderer)
    }

    override fun getCssMetaData(): MutableList<CssMetaData<out Styleable, *>> {
        return styleables;
    }
}

private fun <T : Node> T.evaluation(type: Type?) = when (type) {
    Type.RAISED -> this.elevation(2)
    else -> this.elevation(0)
}

class RippleRenderer(private val clipNode: Node) : Group() {
    init {
        clip = Rectangle().apply {
            clipNode.layoutBoundsProperty().addListener { _, _, value ->
                width = value.width
                height = value.height
            }
        }
    }

    fun render(x: Double, y: Double, bounds: Bounds, color: Paint?) {
        // create the ripple effect
        val ripple = Ripple(x, y, bounds, color ?: Color.RED.withOpacity(0.3))
        children.add(0, ripple)

        ripple.onFinish { children.remove(ripple) }
    }
}

enum class Type { RAISED, FLAT }

//enum class Type {BASIC, PRIMARY, ACCENT, WARN}

const val BUTTON_TYPE = "tornadofx.material.button.type"
val Button.typeProperty: ObjectProperty<Type>
    get()  {
        var v = (this.properties[BUTTON_TYPE] as? ObjectProperty<Type>)
        if (v == null) {
            v = SimpleObjectProperty<Type>(this, "button-type")
            this.properties[BUTTON_TYPE] = v
        }
        return v
    }

var Button.type: Type
    get() = (this.properties[BUTTON_TYPE] as? ObjectProperty<Type>)?.value ?: Type.FLAT
    set(value) {
        val v = (this.properties[BUTTON_TYPE] as? ObjectProperty<Type>)
        if (v == null) {
            this.properties[BUTTON_TYPE] = SimpleObjectProperty<Type>(this, "button-type", value)
        } else {
            v.value = value
        }
    }

const val BASE_SELECTOR = "tornadofx.material."
inline fun <N: Node, reified T> N.extract(selector: String) = (this.properties[BASE_SELECTOR + selector] as? ObjectProperty<T>)?.value
inline fun <N: Node, reified T> N.extractProperty(selector: String) = (this.properties[BASE_SELECTOR + selector] as? ObjectProperty<T>)

fun <N : Node, T> N.setValue(selector: String, value: T) {
    val v = (this.properties[BASE_SELECTOR + selector] as? ObjectProperty<T>)
    if (v == null) {
        this.properties[BASE_SELECTOR + selector] = SimpleObjectProperty<T>(value)
    } else {
        v.value = value
    }
}




private const val BUTTON_RIPPLE_FILL = "button.ripplerFill"

private val rippleFillCss = object :CssMetaData<Button, Paint>("-mat-ripple-fill", StyleConverter.getPaintConverter()) {

    override fun isSettable(control: Button?): Boolean {
        return control?.rippleFillProperty?.isBound == false
    }

    override fun getStyleableProperty(control: Button): StyleableObjectProperty<Paint> {
        return control.rippleFillProperty as StyleableObjectProperty<Paint>
    }
}

var Button.rippleFill: Paint?
    get() = this.extract<Button, Paint>(BUTTON_RIPPLE_FILL)
    set(value) = this.setValue(BUTTON_RIPPLE_FILL, value)

val Button.rippleFillProperty: ObjectProperty<Paint>
    get() {
        var v = (this.properties[BASE_SELECTOR +  BUTTON_RIPPLE_FILL] as? ObjectProperty<Paint>)
        if (v == null) {
            v = object : StyleableObjectProperty<Paint>(Color.BLACK) {
                override fun getCssMetaData(): CssMetaData<Button, Paint> {
                    return rippleFillCss
                }

                override fun getBean(): Any {
                    return this
                }

                override fun getName(): String {
                    return "rippleFill"
                }
            }
            this.properties[BASE_SELECTOR + BUTTON_RIPPLE_FILL] = v
        }
        return v
    }
