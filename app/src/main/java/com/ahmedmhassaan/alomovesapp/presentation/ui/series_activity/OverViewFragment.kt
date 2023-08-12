package com.ahmedmhassaan.alomovesapp.presentation.ui.series_activity

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.ahmedmhassaan.alomovesapp.R
import com.ahmedmhassaan.alomovesapp.databinding.FragmentOverviewBinding

class OverViewFragment : Fragment(R.layout.fragment_overview) {

    private lateinit var binding: FragmentOverviewBinding
    private val serieseViewModel: SerieseViewModel by lazy {
        ViewModelProvider(this)[SerieseViewModel::class.java]
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentOverviewBinding.inflate(layoutInflater)

        serieseViewModel.fetchSeriese()
        observeViewModel()

    }

    private fun observeViewModel() {
        serieseViewModel.apply {

            series.observe(viewLifecycleOwner) {
                binding.sereis = it
            }

            error.observe(viewLifecycleOwner) {

                // show error here with error message  it
            }

            progress.observe(viewLifecycleOwner) {
//                handle progress using it object
            }
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        binding.unbind()
    }
}