package com.example.trackrun.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.example.trackrun.repositories.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class StatisticsViewModel @Inject constructor(
    val mainRepository: MainRepository
): ViewModel() {

}