package com.example.statementview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.statementview.databinding.FragmentOrderwiseBinding


class OrderwiseFragment : Fragment() {
    lateinit var binding: FragmentOrderwiseBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOrderwiseBinding.inflate(inflater, container, false)
        return binding.root
    }


}