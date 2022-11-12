package com.example.fragmentpractice.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(com.example.fragmentpractice.R.layout.fragment_first,container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


        changeTextBtn.setOnClickListener {

//           임시로 -> 텍스트뷰 문구를 "안녕하세요"로 변경
            contentTxt.text = "안녕하세요"
        }
    }

}