package com.example.viewpager_sample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.viewpager_sample.databinding.FragmentMoviesBinding

class MoviesFragment : Fragment() {

    private lateinit var binding: FragmentMoviesBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {

        binding = FragmentMoviesBinding.inflate(layoutInflater)
        val view = binding.root

        binding.moviesButton.setOnClickListener {
            val ticketsFragment = TicketsFragment()
            ticketsFragment.show(fragmentManager!!, "ticketsFragment")
        }
        return view
    }

    companion object { fun newInstance() = MoviesFragment() }
}