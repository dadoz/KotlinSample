package com.example.davide.kotlinsample.fragments
import android.animation.Animator
import android.animation.AnimatorSet
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.CardView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
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


class LoginFragment: Fragment(), Animator.AnimatorListener {
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
        val animatorSet: AnimatorSet = AnimatorSet()
        val animatorY: Animator = AnimatorBuilder(WeakReference(context)).scaleYAnimator(cardLoginLayoutId, 28f)
        val animatorX: Animator = AnimatorBuilder(WeakReference(context)).scaleXAnimator(cardLoginLayoutId, 36f)
        animatorSet.playTogether(animatorX, animatorY)
        animatorSet.start()
    }

    /**
     *
     */
    private fun initCardLogin() {
        setViewLayoutParams(cardLoginLayoutId, 20, 20)
        cardLoginCardviewLayoutId.addOnLayoutChangeListener { view, left, top, right, bottom, oldLeft, oldTop, oldRight, oldBottom ->
            Log.e(TAG, "resizing$left - $top - $right - $bottom - $oldLeft - $oldTop - $oldRight - $oldBottom")
        }
    }

    /**
     *
     */
    private fun setViewLayoutParams(view: View, height: Int, width: Int) {
        view.layoutParams.height = height
        view.layoutParams.width = width
    }

}





