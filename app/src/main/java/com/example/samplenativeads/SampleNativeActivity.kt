package com.example.samplenativeads

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.samplenativeads.databinding.ActivitySampleNativeBinding

class SampleNativeActivity : AppCompatActivity() {

    companion object {
        const val ID_ADS_NATIVE_NORMAL = "ca-app-pub-3940256099942544/2247696110"
        const val ID_ADS_NATIVE_HIGH_PRIORITY = "ca-app-pub-3940256099942544/1044960115"
    }

    private lateinit var binding: ActivitySampleNativeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySampleNativeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


    }
}