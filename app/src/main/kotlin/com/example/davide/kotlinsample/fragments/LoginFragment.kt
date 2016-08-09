package com.example.davide.kotlinsample.fragments
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.davide.kotlinsample.R

class LoginFragment: Fragment() {
    private val TAG: String = "LoginFragment"
//    private var mainView: View? = null
    private var signupButton: View? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super<Fragment>.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val mainView: View? = inflater?.inflate(R.layout.fragment_login_layout, container, false)
        onBindViewManual(mainView)
        return mainView
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super<Fragment>.onViewCreated(view, savedInstanceState)
        onInitView()
    }

    /**
     *
     */
    private fun onBindViewManual(mainView: View?) {
        signupButton = mainView?.findViewById(R.id.signupButtonId)
    }

    /**
     * init view fragment
     */
    fun onInitView() {
        Log.e(TAG, "init login fragment")
        signupButton?.setOnClickListener {
            Log.e(TAG, "Hey click")
            Toast.makeText(context, "hey login", Toast.LENGTH_SHORT).show()
        }
    }

}
