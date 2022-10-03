package com.example.activitynavigation.ui.secondActivity

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.activitynavigation.R
import com.example.activitynavigation.databinding.GoBackFragmentBinding

class GoBackFragment : Fragment() {
    private var _binding: GoBackFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = GoBackFragmentBinding.inflate(inflater, container, false)

        binding.goBackMainButton.setOnClickListener {
            findNavController().navigate(R.id.action_go_back_to_mainActivity)
        }

        return binding.root
    }
}