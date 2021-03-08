package com.example.viewpager_sample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.viewpager_sample.databinding.FragmentEventsBinding

class EventsFragment : Fragment() {

    lateinit var binding: FragmentEventsBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {

        binding = FragmentEventsBinding.inflate(layoutInflater)
        val view = binding.root

        binding.eventsButton.setOnClickListener {
            val ticketsFragment = TicketsFragment()
            ticketsFragment.show(fragmentManager!!, "ticketsFragment")
        }
        return view
    }

    companion object { fun newInstance() = EventsFragment() }
}
