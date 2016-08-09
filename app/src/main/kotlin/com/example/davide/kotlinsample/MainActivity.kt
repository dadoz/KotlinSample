package com.example.davide.kotlinsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.davide.kotlinsample.fragments.LoginFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    /**
     * init view
     */
    private fun initView() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainerId, LoginFragment())
            .commit()
    }
}
