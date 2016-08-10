package com.example.davide.kotlinsample.fragments
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.davide.kotlinsample.R
import kotlinx.android.synthetic.main.activity_user.*

class UserFragment : Fragment() {
    private val TAG: String = "UserFragment"

    override fun onCreate(savedInstanceState: Bundle?) {
        super<Fragment>.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_user, container, false)
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
//        https//6bfed912ac7945c7ae2189b73586d201@punkapi.com/api/v1/beers

//        signupButton?.setOnClickListener {
//            Log.e(TAG, "Hey click")
//            Toast.makeText(context, "hey login", Toast.LENGTH_SHORT).show()
//        }
    }

}
