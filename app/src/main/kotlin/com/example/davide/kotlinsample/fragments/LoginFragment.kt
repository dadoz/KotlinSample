package com.example.davide.kotlinsample.fragments
import android.animation.Animator
import android.animation.AnimatorSet
import android.animation.ValueAnimator
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.CardView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.ViewGroup
import android.view.animation.Animation
import android.widget.RelativeLayout
import android.widget.Toast
import com.example.davide.kotlinsample.R
import com.example.davide.kotlinsample.UserActivity
import com.example.davide.kotlinsample.builder.AnimatorBuilder
import kotlinx.android.synthetic.main.card_login_layout.*
import kotlinx.android.synthetic.main.fragment_login_layout.*
import java.lang.ref.WeakReference


class LoginFragment: Fragment(), Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {
    private val TAG: String = "LoginFragment"


    override fun onCreate(savedInstanceState: Bundle?) {
        super<Fragment>.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val mainView: View? = inflater?.inflate(R.layout.fragment_login_layout, container, false)
        return mainView
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super<Fragment>.onViewCreated(view, savedInstanceState)
        onInitView()
    }

    override fun onAnimationStart(p0: Animator?) {
    }

    override fun onAnimationRepeat(p0: Animator?) {
    }

    override fun onAnimationEnd(p0: Animator?) {
        Log.e("TAG", "finished animation")
        cardLoginCardviewLayoutId.invalidate()
    }

    override fun onAnimationCancel(p0: Animator?) {
    }

    /**
     * init view fragment
     */
    fun onInitView() {
        Log.e(TAG, "init login fragment")
        initCardLogin()

        signupButtonId.setOnClickListener {
            Log.e(TAG, "singupButton")
            Toast.makeText(context, "hey login", Toast.LENGTH_SHORT).show()
            signupButtonId.visibility = GONE
            animateView()
        }

        submitButtonId.setOnClickListener {
            Log.e(TAG, "Submit button")
            Toast.makeText(context, "submit", Toast.LENGTH_SHORT).show()
            startActivity(Intent(context, UserActivity::class.java))
        }
    }

    /**
     *
     */
    private fun animateView() {
        val valueAnimator = AnimatorBuilder(WeakReference(context)).scaleAnimator(1f)
        valueAnimator.addUpdateListener(this)
        valueAnimator.start()
    }

    /**
     *
     */
    private fun initCardLogin() {
        setViewLayoutParams(cardLoginCardviewLayoutId, 1, 1)
    }

    /**
     *
     */
    private fun setViewLayoutParams(view: View, height: Int, width: Int) {
        view.layoutParams.height = height
        view.layoutParams.width = width
    }

    override fun onAnimationUpdate(valueAnimator: ValueAnimator?) {
        var width: Int = 1000
        var height: Int= 1100
        cardLoginCardviewLayoutId.layoutParams.height = (valueAnimator?.animatedValue as Float).times(height).toInt()
        cardLoginCardviewLayoutId.layoutParams.width = (valueAnimator?.animatedValue as Float).times(width).toInt()
        cardLoginCardviewLayoutId.requestLayout()
        cardLoginContentLayoutId.requestLayout()

    }
//    override fun onAnimationUpdate(valueAnimator: ValueAnimator?) {
//        val max: Int = 10
//        var oldAnimVal: Float = valueAnimator?.animatedValue as Float
//        val deltaAnimVal = oldAnimVal - cardLoginCardviewLayoutId.layoutParams.height
//        Log.e(TAG, "updateListener - ${valueAnimator?.animatedValue}")
//        for (i in 1..max) {
//            Log.e(TAG, "updateListener - ${valueAnimator?.animatedValue}")
//            Log.e(TAG, "**** - ${oldAnimVal.plus(deltaAnimVal.div(max).times(i))}")
//            cardLoginCardviewLayoutId.layoutParams.height = oldAnimVal.toInt()//oldAnimVal.plus(deltaAnimVal.div(max).times(i))
//            cardLoginCardviewLayoutId.layoutParams.width = oldAnimVal.toInt()//oldAnimVal.plus(deltaAnimVal.div(max).times(i))
//            cardLoginCardviewLayoutId.requestLayout()
//            cardLoginContentLayoutId.requestLayout()
//        }
//    }

}





