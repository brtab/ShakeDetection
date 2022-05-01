package com.example.shakedetection

import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.squareup.seismic.ShakeDetector

class MainActivity : AppCompatActivity(), ShakeDetector.Listener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sm = getSystemService(SENSOR_SERVICE) as SensorManager
        val sd = ShakeDetector(this)
        sd.start(sm)


    }

    override fun hearShake() {
        Toast.makeText(this, "Shake detected", Toast.LENGTH_SHORT).show()
    }
}