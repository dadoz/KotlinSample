package com.example.davide.kotlinsample.views

import android.content.Context
import android.graphics.Canvas
import android.support.v7.widget.CardView
import android.util.AttributeSet
import android.util.Log

class ScalingCardView: CardView {
    private val TAG: String = "ScaledCardView"

    constructor(ctx: Context) : super(ctx)
    constructor(ctx: Context, attrs: AttributeSet) : super(ctx, attrs)
    constructor(ctx: Context, attrs: AttributeSet, defStyleAttr: Int) : super(ctx, attrs, defStyleAttr)

    override fun onLayout(z: Boolean, a: Int, b: Int, c: Int, d: Int) {
        super.onLayout(z, a, b, c, d)
//        Log.e(TAG, "onLayout")
    }

    override fun onSizeChanged(a: Int, b: Int, c: Int, d: Int) {
        super.onSizeChanged(a, b, c, d)
//        Log.e(TAG, "onSizeChanged $a - $b - $c - $d")
    }

    override public fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int ) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
//        Log.i(TAG, "onMeasure $widthMeasureSpec - $heightMeasureSpec")
    }

    override public fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
//        Log.e(TAG, "draw")
    }
}

