package com.zay.music.module.mainmodule.my

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.zay.music.R

class MyFragment :Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view: View? = null
        try {
            view = inflater.inflate(
                R.layout.myfragment_layout,
                container, false)
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return view
    }

}