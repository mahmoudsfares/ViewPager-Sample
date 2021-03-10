package com.example.viewpager_sample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.viewpager_sample.databinding.FragmentMoviesBinding
import com.sergivonavi.materialbanner.Banner

class MoviesFragment : Fragment(){

    private lateinit var binding: FragmentMoviesBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {

        binding = FragmentMoviesBinding.inflate(layoutInflater)
        val view = binding.root

        val banner = Banner.Builder(requireActivity()).setParent(binding.root)
            .setIcon(R.drawable.ic_launcher_foreground)
            .setMessage("You are about to buy a ticket!")
            .setLeftButton("Dismiss") { it.dismiss() }

        binding.moviesButton.setOnClickListener {
            val ticketsFragment = TicketsFragment()
            ticketsFragment.show(fragmentManager!!, "ticketsFragment")
            banner.show()
        }

        return view
    }

    companion object { fun newInstance() = MoviesFragment() }
}