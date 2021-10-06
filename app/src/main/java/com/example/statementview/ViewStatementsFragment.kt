package com.example.statementview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.statementview.databinding.FragmentViewStatementsBinding


class ViewStatementsFragment : Fragment() {

    lateinit var binding: FragmentViewStatementsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentViewStatementsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var dataList = prepareData()

        var dataAdapter = StatementAdapter(dataList)
        binding.recyclerview.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = StatementAdapter(dataList)
        }
    }


}