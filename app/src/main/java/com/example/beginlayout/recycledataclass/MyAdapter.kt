package com.example.beginlayout.recycledataclass

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.beginlayout.R
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter(private val profileList:ArrayList<Profile>):
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.listitem, parent, false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return profileList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = profileList[position]
        holder.imageProfile.setImageResource(currentItem.imageProfile)
        holder.nameProfile.text = currentItem.nameP
    }

    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val imageProfile:ShapeableImageView = itemView.findViewById(R.id.image_id)
        val nameProfile:TextView = itemView.findViewById(R.id.text_id)

    }
}