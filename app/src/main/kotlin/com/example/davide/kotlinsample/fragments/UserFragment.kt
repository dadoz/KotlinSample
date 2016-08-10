package com.example.davide.kotlinsample.fragments
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.davide.kotlinsample.R
import com.example.davide.kotlinsample.adapter.BeerRecyclerAdapter
import com.example.davide.kotlinsample.models.Beer
import com.google.gson.Gson
import com.google.gson.JsonArray
import com.google.gson.reflect.TypeToken
import kotlinx.android.synthetic.main.activity_user.*
import kotlinx.android.synthetic.main.fragment_user.*
import java.io.FileDescriptor
import java.util.*

class UserFragment : Fragment() {

    private val TAG: String = "UserFragment"
    private var beerList: MutableList<Beer>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super<Fragment>.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_user, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super<Fragment>.onViewCreated(view, savedInstanceState)
        parseDataFromAssets()
        onInitView()
    }

    private fun parseDataFromAssets() {
        beerList = Gson().fromJson<MutableList<Beer>>(activity.assets.open("data.json").reader(),
                object : TypeToken<MutableList<Beer>>() {}.type)
    }

    /**
     * init view fragment
     */
    fun onInitView() {
        Log.e(TAG, "init login fragment")
        initRecyclerView()
    }

    /**
     *
     */
    private fun initRecyclerView() {
        userBeerRecyclerId.layoutManager = LinearLayoutManager(context)
        userBeerRecyclerId.adapter = BeerRecyclerAdapter(beerList) {
            Toast.makeText(context, "hey this is awesome", Toast.LENGTH_SHORT).show()
        }
    }

}
