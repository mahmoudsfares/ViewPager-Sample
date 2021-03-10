package com.example.viewpager_sample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.example.viewpager_sample.databinding.FragmentTicketsBinding

// TODO: just replace DialogFragment() with BottomSheetDialogFragment() if you want to use BottomModalSheet instead
// BottomModalSheet -> fragment is pulled from the bottom of the screen and dims the background
// DialogFragment -> fragment appears in the middle of the predecessor and dims the background
class TicketsFragment : DialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return FragmentTicketsBinding.inflate(layoutInflater).root
    }
}