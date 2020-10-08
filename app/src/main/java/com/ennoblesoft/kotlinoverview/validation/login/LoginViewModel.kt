package com.ennoblesoft.kotlinoverview.validation.login

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel @ViewModelInject constructor() : ViewModel() {
    var email: MutableLiveData<String> = MutableLiveData()
}