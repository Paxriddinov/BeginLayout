package com.example.beginlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.viewpager.widget.ViewPager
import com.example.beginlayout.fragments.Fragment1
import com.example.beginlayout.fragments.Fragment2
import com.example.beginlayout.fragments.Fragment3
import com.example.beginlayout.fragments.adapter.DataAdapter
import com.google.android.material.tabs.TabLayout

class MainActivity2 : AppCompatActivity() {

    lateinit var dataAdapter: DataAdapter
    lateinit var viewPager:ViewPager
    lateinit var tabLayout:TabLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        initView()
    }

    private fun initView() {
        viewPager = findViewById(R.id.viewPager_id)
        tabLayout = findViewById(R.id.tabLayout_id)

        dataAdapter = DataAdapter(supportFragmentManager)
        dataAdapter.addFragment(Fragment1(), "Top News")
        dataAdapter.addFragment(Fragment2(), "Top 2")
        dataAdapter.addFragment(Fragment3(), "Top 3")

        viewPager.adapter = dataAdapter

        tabLayout.setupWithViewPager(viewPager)

    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity2", "onStart: Working")
    }
    override fun onResume() {
        super.onResume()
        Log.d("MainActivity2", "onResume: Working")
    }
    override fun onPause() {
        super.onPause()
        Log.d("MainActivity2", "onPause: Working")
    }
    override fun onStop() {
        super.onStop()
        Log.d("MainActivity2", "onStop: Working")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity2", "onDestroy: Working")
    }

}