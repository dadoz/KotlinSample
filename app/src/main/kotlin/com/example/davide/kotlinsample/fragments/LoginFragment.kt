package com.example.davide.kotlinsample.fragments
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.davide.kotlinsample.R

class LoginFragment: Fragment() {
    private val TAG: String = "LoginFragment"

    override fun onCreate(savedInstanceState: Bundle?) {
        super<Fragment>.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.login_layout_fragment, container, false)
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
//        ViewClass(context, null).signupButton.setOnClickListener {
//            Toast.makeText(context, "hey login", Toast.LENGTH_SHORT).show()
//        }
    }

}
