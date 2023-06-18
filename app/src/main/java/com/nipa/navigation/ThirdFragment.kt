package com.nipa.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.nipa.navigation.databinding.FragmentSecondBinding
import com.nipa.navigation.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {
    private lateinit var binding: FragmentThirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThirdBinding.inflate(inflater, container, false)
        binding.button.setOnClickListener { View->gotoNext() }

        // Inflate the layout for this fragment
        return binding.root
    }
    fun gotoNext(){
        findNavController().navigate(R.id.action_thirdFragment_to_firstFragment2)

    }

}