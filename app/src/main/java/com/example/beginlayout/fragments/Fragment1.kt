package com.example.beginlayout.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.beginlayout.R
import com.example.beginlayout.recycledataclass.MyAdapter
import com.example.beginlayout.recycledataclass.Profile

class Fragment1 : Fragment() {

    private lateinit var adapter: MyAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var profileArrayList:ArrayList<Profile>

    lateinit var imageId:Array<Int>
    lateinit var textId:Array<String>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_1, container, false)
    }
    override fun onViewCreated(view:View, savedInstanceState:Bundle?){
        super.onViewCreated(view, savedInstanceState)
        initView()
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.recycle_view_id)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = MyAdapter(profileArrayList)
        recyclerView.adapter = adapter

    }


    private fun initView() {
        profileArrayList = arrayListOf<Profile>()
        imageId = arrayOf(
            R.drawable.luffy,
            R.drawable.luffy,
            R.drawable.luffy,
            R.drawable.luffy,
            R.drawable.luffy,
            R.drawable.luffy,
            R.drawable.luffy
        )

        textId = arrayOf(
            "Paxritdinov Ulug'bek",
            "Paxritdinov Ulug'bek",
            "Paxritdinov Ulug'bek",
            "Paxritdinov Ulug'bek",
            "Paxritdinov Ulug'bek",
            "Paxritdinov Ulug'bek",
            "Paxritdinov Ulug'bek",
        )

        for (i in imageId.indices){
            val profile = Profile(imageId[1], textId[1])
            profileArrayList.add(profile)
        }
    }


}