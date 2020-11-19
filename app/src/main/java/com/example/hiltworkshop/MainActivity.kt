package com.example.hiltworkshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Show how to use Hilt in simple way.
        truckDeliverBtn.setOnClickListener {
        }
        // Show how to use Hilt with 3rd party libraries.
        networkRequestBtn.setOnClickListener {
        }
        // Show how to use Hilt with ViewModel.
        viewModelWorkBtn.setOnClickListener {
        }
    }

}