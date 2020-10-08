package com.ennoblesoft.kotlinoverview.validation.login

import android.os.Bundle
import android.util.Patterns
import android.view.View
import android.widget.Toast
import androidx.fragment.app.viewModels
import com.ennoblesoft.kotlinoverview.R
import com.ennoblesoft.kotlinoverview.base.ui.BaseFragment
import com.ennoblesoft.kotlinoverview.databinding.FragmentLoginBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginFragment : BaseFragment<FragmentLoginBinding>() {

    override fun getLayoutId(): Int = R.layout.fragment_login

    private val viewModel: LoginViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (binding as FragmentLoginBinding).viewModel = viewModel
        subscribeToObservers(binding as FragmentLoginBinding)
        buttonClickEvents(binding as FragmentLoginBinding)
    }

    private fun subscribeToObservers(binding: FragmentLoginBinding) {
        viewModel.email.observe(viewLifecycleOwner, {
            if (!it.isNullOrEmpty()) {
                if (Patterns.EMAIL_ADDRESS.matcher(it).matches()) {
                    binding.apply {
                        tlPhone.error = null
                        btnLogin.isEnabled = true
                    }
                } else {
                    binding.apply {
                        tlPhone.error = "Invalid email"
                        btnLogin.isEnabled = false
                    }
                }
            }
        })
    }

    private fun buttonClickEvents(binding: FragmentLoginBinding) {
        binding.btnLogin.setOnClickListener {
            Toast.makeText(requireContext(), "Login Clicked", Toast.LENGTH_SHORT).show()
        }
    }
}