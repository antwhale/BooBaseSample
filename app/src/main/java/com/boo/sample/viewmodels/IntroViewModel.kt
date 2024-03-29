package com.boo.sample.viewmodels

import android.app.Application
import com.boo.sample.base.BaseViewModel
import com.boo.sample.repository.preference.PreferenceRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class IntroViewModel @Inject constructor(
    application: Application,
    val preferenceRepository: PreferenceRepository
) : BaseViewModel(application){

}