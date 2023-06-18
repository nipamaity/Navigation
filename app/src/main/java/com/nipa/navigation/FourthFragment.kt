package com.nipa.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.nipa.navigation.databinding.FragmentFourthBinding
import com.nipa.navigation.databinding.FragmentSecondBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FourthFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FourthFragment : Fragment() {
    private lateinit var binding: FragmentFourthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFourthBinding.inflate(inflater, container, false)
        binding.button.setOnClickListener { View->gotoNext() }

        // Inflate the layout for this fragment
        return binding.root
    }
    fun gotoNext(){
        findNavController().navigate(R.id.action_fourthFragment_to_secondFragment3)

    }

}