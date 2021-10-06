package com.example.statementview

import android.transition.AutoTransition
import android.transition.TransitionManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.statementview.databinding.LayoutSettlementsItemBinding


class StatementAdapter(var dataList: ArrayList<StatementModel>) :
    RecyclerView.Adapter<StatementAdapter.StatementViewHolder>() {
    class StatementViewHolder(var binding: LayoutSettlementsItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(model: StatementModel) {
            binding.labelStatementBank.text = model.bank
            binding.labelStatementDate.text = model.date
            binding.labelStatementNumber.text = model.id
            binding.labelStatementprice.text = model.price
            binding.labelStatusValue.text = model.status

            if (model.status == "Processing") {
                binding.card.setCardBackgroundColor(
                    ContextCompat.getColor(
                        binding.card.context,
                        R.color.light_yello
                    )
                )

                binding.labelStatusRetry.visibility = View.GONE
                binding.labelStatusValue.setTextColor(
                    ContextCompat.getColor(
                        binding.card.context,
                        R.color.grey

                    )
                )
            } else {
                binding.card.setCardBackgroundColor(
                    ContextCompat.getColor(
                        binding.card.context,
                        R.color.light_pink

                    )
                )
                binding.labelStatusRetry.visibility = View.VISIBLE
                binding.labelStatusValue.setTextColor(
                    ContextCompat.getColor(
                        binding.card.context,
                        R.color.red

                    )
                )
            }

            binding.card.setOnClickListener {
                if (binding.clParent.visibility == View.VISIBLE) {
                    TransitionManager.beginDelayedTransition(
                        binding.card,
                        AutoTransition()
                    )
                    binding.clParent.visibility = View.GONE
                    binding.group.visibility = View.VISIBLE
                } else {

                    TransitionManager.beginDelayedTransition(
                        binding.card,
                        AutoTransition()
                    )

                    binding.clParent.visibility = View.VISIBLE
                    binding.group.visibility = View.GONE
                }
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StatementViewHolder {
        return StatementViewHolder(
            LayoutSettlementsItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: StatementViewHolder, position: Int) {
        val model = dataList[position]
        (holder as StatementViewHolder).bind(model)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }
}