package com.example.davide.kotlinsample.builder

import android.animation.Animator
import android.animation.ObjectAnimator
import android.content.Context
import android.view.View
import java.lang.ref.WeakReference

class AnimatorBuilder(context: WeakReference<Context>) {
    var BOTTOM: String = "bottom"
    var SCALE_Y: String = "scaleY"
    var SCALE_X: String = "scaleX"
    var TOP: String = "top"
    private var duration: Long

    init {
        duration = context.get().resources
                .getInteger(android.R.integer.config_mediumAnimTime).toLong()
    }

    /**
     *
     */
    fun resizeBottomAnimator(view: View?, endHeight: Int): Animator {
        val animator: Animator = ObjectAnimator.ofInt(view, BOTTOM, endHeight)
        animator.duration = duration
        return animator
    }

    /**
     *
     */
    fun resizeTopAnimator(view: View?, endHeight: Int): Animator {
        val animator: Animator = ObjectAnimator.ofInt(view, TOP, endHeight)
        animator.duration = duration
        return animator
    }

    /**
     *
     */
    fun scaleYAnimator(view: View?, scaleValue: Float): Animator {
        val animator: Animator = ObjectAnimator.ofFloat(view, SCALE_Y, scaleValue)
        animator.duration = duration
        view?.pivotY = 0f
        return animator
    }

    /**
     *
     */
    fun scaleXAnimator(view: View?, scaleValue: Float): Animator {
        val animator: Animator = ObjectAnimator.ofFloat(view, SCALE_X, scaleValue)
        animator.duration = duration
        view?.pivotY = 0f
        return animator
    }
}