package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment

class ThirdFragment : Fragment() {
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<View>(R.id.button_second_back).setOnClickListener {
            NavHostFragment.findNavController(this@ThirdFragment)
                    .navigate(R.id.action_thirdFragment_to_FirstFragment)
        }
        val mainActivity = activity as MainActivity?
        mainActivity!!.findViewById<View>(R.id.fab2).setOnClickListener {
            NavHostFragment.findNavController(this@ThirdFragment)
                    .navigate(R.id.action_thirdFragment_to_FirstFragment)
        }
    }
}