package com.example.davide.kotlinsample.fragments
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.davide.kotlinsample.R
import com.example.davide.kotlinsample.UserActivity
import kotlinx.android.synthetic.main.card_login_layout.*
import kotlinx.android.synthetic.main.fragment_login_layout.*


class LoginFragment: Fragment() {
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


    /**
     * init view fragment
     */
    fun onInitView() {
        Log.e(TAG, "init login fragment")
        signupButtonId.setOnClickListener {
            Log.e(TAG, "singupButton")
            Toast.makeText(context, "hey login", Toast.LENGTH_SHORT).show()
        }
        submitButtonId.setOnClickListener {
            Log.e(TAG, "Submit button")
            Toast.makeText(context, "submit", Toast.LENGTH_SHORT).show()
            startActivity(Intent(context, UserActivity::class.java))
        }
    }

}
