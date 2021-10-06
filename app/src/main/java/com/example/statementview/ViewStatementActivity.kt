package com.example.statementview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.statementview.databinding.ActivityViewStatementBinding
import com.google.android.material.tabs.TabLayoutMediator

class ViewStatementActivity : AppCompatActivity() {

    lateinit var binding: ActivityViewStatementBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewStatementBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        val pagerAdapter = ViewPagerAdapter(supportFragmentManager, lifecycle)
        binding.viewPager.adapter = pagerAdapter
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = getString(R.string.settlements_fragment)
                }
                1 -> {
                    tab.text = getString(R.string.order_fragment)
                }
            }
        }.attach()
    }
}