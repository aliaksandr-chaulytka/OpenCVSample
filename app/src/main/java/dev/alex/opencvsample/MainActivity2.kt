package dev.alex.opencvsample

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import org.opencv.android.OpenCVLoader

class MainActivity2 : AppCompatActivity() {

    init {
        if (OpenCVLoader.initDebug()) {
            Log.d("AABB", "OpenCv configured successfully")
        } else {
            Log.d("AABB", "OpenCv doesn’t configured successfully")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}