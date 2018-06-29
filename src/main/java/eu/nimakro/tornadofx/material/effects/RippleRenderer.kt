package eu.nimakro.tornadofx.material.effects

import javafx.animation.Interpolator
import javafx.animation.Timeline
import javafx.beans.property.DoubleProperty
import javafx.geometry.Bounds
import javafx.scene.paint.Paint
import javafx.scene.shape.Circle
import javafx.util.Duration
import tornadofx.*

/** See: https://github.com/angular/material2/blob/master/src/lib/core/ripple/ripple.ts */
const val RIPPLE_FADE_IN_DURATION = 450.0
const val RIPPLE_FADE_OUT_DURATION = 400.0

class Ripple(x: Double, y: Double, bounds: Bounds, color: Paint, centered: Boolean = false): Circle(x, y, computeRippleRadius(x, y, bounds, centered)) {

    private var op: () -> Unit = { }

    init {
        stroke = color
        fill = color

        fadeIn(scaleXProperty(), scaleYProperty(), opacityProperty()).setOnFinished {
            fadeOut(scaleXProperty(), scaleYProperty(), opacityProperty())
        }
    }

    companion object {

        private fun computeRippleRadius(x: Double, y: Double, bounds: Bounds, centered: Boolean = false): Double {
            return if (centered) {
                val xCenter = bounds.minX + (bounds.width / 2)
                val yCenter = bounds.minY + (bounds.height / 2)
                distanceToFurthestCorner(xCenter, yCenter, bounds)
            } else {
                distanceToFurthestCorner(x, y, bounds)
            }

        }

        private fun distanceToFurthestCorner(x: Double, y: Double, rect: Bounds): Double {
            val distX = Math.max(Math.abs(x - rect.minX), Math.abs(x - rect.maxX))
            val distY = Math.max(Math.abs(y - rect.minY), Math.abs(y - rect.maxY))
            return Math.sqrt(distX * distX + distY * distY)
        }

        private fun fadeIn(scaleXProperty: DoubleProperty, scaleYProperty: DoubleProperty, opacityProperty: DoubleProperty): Timeline {
            val interpolator = Interpolator.SPLINE(0.0, 0.0, 0.2, 1.0)!!
            //-- Fade in
            return timeline() {
                keyframe(Duration.ZERO) {
                    keyvalue(scaleXProperty, 0.0, interpolator)
                    keyvalue(scaleYProperty, 0.0, interpolator)
                    keyvalue(opacityProperty, 1.0, interpolator)
                }
                keyframe(Duration(RIPPLE_FADE_IN_DURATION)) {
                    keyvalue(scaleXProperty, 0.9, interpolator)
                    keyvalue(scaleYProperty, 0.9, interpolator)
                }
            }
        }

    }

    fun onFinish(op: ()-> Unit) { this.op = op }

    private fun fadeOut(scaleXProperty: DoubleProperty, scaleYProperty: DoubleProperty, opacityProperty: DoubleProperty): Timeline {
        val interpolator = Interpolator.SPLINE(0.0, 0.0, 0.2, 1.0)!!
        //-- Fade out
        return timeline() {
            keyframe(Duration(RIPPLE_FADE_OUT_DURATION)) {
                keyvalue(scaleXProperty, 1.0, interpolator)
                keyvalue(scaleYProperty, 1.0, interpolator)
                keyvalue(opacityProperty, 0.0, interpolator)
            }
            setOnFinished { op() }
        }
    }
}



