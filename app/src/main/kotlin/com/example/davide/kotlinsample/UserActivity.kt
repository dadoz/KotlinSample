package com.example.davide.kotlinsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.davide.kotlinsample.fragments.LoginFragment
import com.example.davide.kotlinsample.fragments.UserFragment
import kotlinx.android.synthetic.main.activity_user.*

class UserActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)
        onIntiActionbar()
        initView()
    }

    /**
     *
     */
    private fun onIntiActionbar() {
        toolbarId.title = "User"
        setSupportActionBar(toolbarId)
    }

    /**
     * init view
     */
    private fun initView() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainerId, UserFragment())
            .commit()
    }
}
