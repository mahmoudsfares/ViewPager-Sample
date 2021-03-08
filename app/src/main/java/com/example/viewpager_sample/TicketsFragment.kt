package com.example.viewpager_sample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewpager_sample.databinding.FragmentTicketsBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class TicketsFragment: BottomSheetDialogFragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return FragmentTicketsBinding.inflate(layoutInflater).root
    }
}