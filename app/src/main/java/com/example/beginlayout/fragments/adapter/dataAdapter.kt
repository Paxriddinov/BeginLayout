@file:Suppress("DEPRECATION")

package com.example.beginlayout.fragments.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class DataAdapter(fm:FragmentManager):FragmentStatePagerAdapter(fm){
    private val fragmentList = ArrayList<Fragment>()
    private var dataList = ArrayList<String>()



    fun addFragment(fragment: Fragment, data: String){
        fragmentList.add(fragment)
        dataList.add(data)
    }
    override fun getCount(): Int {
        return fragmentList.size
    }

    override fun getItem(position: Int): Fragment {
        return fragmentList[position]
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return dataList[position]
    }

}