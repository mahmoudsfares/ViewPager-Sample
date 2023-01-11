package com.example.viewpager_sample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.viewpager_sample.databinding.FragmentEventsBinding
import com.google.android.material.snackbar.Snackbar

class EventsFragment : Fragment() {

    private lateinit var binding: FragmentEventsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentEventsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val snackbar = Snackbar.make(binding.coordinator, "You are about to buy a ticket!", Snackbar.LENGTH_INDEFINITE)
        snackbar.setAction("DISMISS") { snackbar.dismiss() }

        binding.eventsButton.setOnClickListener {
            val ticketsFragment = TicketsFragment()
            ticketsFragment.show(childFragmentManager, "ticketsFragment")
            snackbar.show()
        }
    }

    companion object {
        fun newInstance() = EventsFragment()
    }
}
