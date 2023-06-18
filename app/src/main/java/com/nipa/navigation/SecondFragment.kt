package com.nipa.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.nipa.navigation.databinding.FragmentFirstBinding
import com.nipa.navigation.databinding.FragmentSecondBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SecondFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        binding.button.setOnClickListener { View->gotoNext() }
        binding.buttonFourth.setOnClickListener { View->gotoFourth() }
        // Inflate the layout for this fragment
        return binding.root
    }
    fun gotoNext(){
        findNavController().navigate(R.id.action_secondFragment_to_thirdFragment)

    }
    fun gotoFourth(){
        findNavController().navigate(R.id.action_secondFragment_to_fourthFragment2)
    }

}