package com.syntax.hemmerich.bottomnav.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.syntax.hemmerich.bottomnav.R
import com.syntax.hemmerich.bottomnav.databinding.FragmentChatBinding
import com.syntax.hemmerich.bottomnav.databinding.FragmentHomeBinding


class chatFragment : Fragment() {
    private lateinit var binding: FragmentChatBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentChatBinding.inflate(layoutInflater)
        return binding.root
    }

}