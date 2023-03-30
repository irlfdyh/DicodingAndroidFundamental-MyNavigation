package com.dicoding.fundamental.navigation

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dicoding.fundamental.navigation.databinding.FragmentDetailCategoryBinding

class DetailCategoryFragment : Fragment() {

    private var _binding: FragmentDetailCategoryBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailCategoryBinding.inflate(inflater, container, false)
        return binding.root
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val dataName = arguments?.getString(CategoryFragment.EXTRA_NAME)
        val dataDescription = arguments?.getLong(CategoryFragment.EXTRA_STOCK)

        binding.tvCategoryName.text = dataName
        binding.tvCategoryDescription.text = "Stock : $dataDescription"
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}