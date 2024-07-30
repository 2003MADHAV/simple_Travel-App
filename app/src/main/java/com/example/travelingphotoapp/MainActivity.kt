package com.example.travelingphotoapp

import android.os.Bundle
import android.util.Log
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.travelingphotoapp.ui.theme.TravelingPhotoAppTheme



/*
class MainActivity : ComponentActivity() {
    private var currentImage = 0
    lateinit var image: ImageView

    var places= arrayOf("LotusTemple","IndiaGate","Banaras","Amar Taj","Nature Of Goaa","Taj Mahal","The Ganges River, Varanasi",
        "Cola Beach, Goa","Bada Bagh, Jaisalmer","Tea Plantations","Meenakshi Amman Temple, Madurai","Golden Temple, Amritsar",
        "Red Fort, Delhi","Bhagwan Mahavir Wildlife Sanctuary","Bandra-Worli Sea Link, Mumbai")

 *//*   private val addresses = arrayOf(
        "Lotus Temple, New Delhi, Delhi 110019, India",
        "India Gate, Rajpath, India Gate, New Delhi, Delhi 110001, India",
        "Banaras, Varanasi, Uttar Pradesh 221001, India",
        "Latest House Model, Sector 50, Gurgaon, Haryana 122018, India",
        "Nature Of Goa, Panaji, Goa 403001, India"
    )*//*

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity__main)

        // Initialize the first image
        image = findViewById(R.id.pic1)
        image.alpha = 1f

        val next = findViewById<ImageButton>(R.id.btnNext)
        val prev = findViewById<ImageButton>(R.id.btnPrev)

        val placeName=findViewById<TextView>(R.id.tVName)

        val placeAddress=findViewById<TextView>(R.id.tvFullAddress)

        next.setOnClickListener {
            updateImage(alphaValue = 0f)

            currentImage = (5 + currentImage + 1) % 5
            updateImage(alphaValue = 1f)

            placeName.text=places[currentImage]

           // placeAddress.text=addresses[currentImage]
        }

        prev.setOnClickListener {
            updateImage(alphaValue = 0f)

            currentImage = (5 + currentImage - 1) % 5
            updateImage(alphaValue = 1f)

            placeName.text=places[currentImage]

           // placeAddress.text=addresses[currentImage]
        }
    }

    private fun updateImage(alphaValue: Float) {
        val idImageToShowString = "pic${currentImage + 1}"
        val idImageToShowInt = resources.getIdentifier(idImageToShowString, "id", packageName)
        image = findViewById(idImageToShowInt)
        image?.alpha = (alphaValue ?: run {
            Log.e("MainActivity", "ImageView with ID $idImageToShowInt not found")
        }).toFloat()
    }
}*/


class MainActivity : ComponentActivity() {
    private var currentImage = 0
    lateinit var image: ImageView

    var places = arrayOf(
        "LotusTemple", "IndiaGate", "Banaras", "Amar Taj", "Nature Of Goaa", "Taj Mahal", "The Ganges River, Varanasi",
        "Cola Beach, Goa", "Bada Bagh, Jaisalmer", "Tea Plantations", "Meenakshi Amman Temple, Madurai", "Golden Temple, Amritsar",
        "Red Fort, Delhi", "Bhagwan Mahavir Wildlife Sanctuary", "Bandra-Worli Sea Link, Mumbai"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity__main)

        // Initialize the first image
        image = findViewById(R.id.pic1)
        image.alpha = 1f

        val next = findViewById<ImageButton>(R.id.btnNext)
        val prev = findViewById<ImageButton>(R.id.btnPrev)

        val placeName = findViewById<TextView>(R.id.tVName)
        val placeAddress = findViewById<TextView>(R.id.tvFullAddress)

        next.setOnClickListener {
            updateImage(alphaValue = 0f)

            currentImage = (15 + currentImage + 1) % 15
            updateImage(alphaValue = 1f)

            placeName.text = places[currentImage]
            // placeAddress.text = addresses[currentImage]
        }

        prev.setOnClickListener {
            updateImage(alphaValue = 0f)

            currentImage = (15 + currentImage - 1) % 15
            updateImage(alphaValue = 1f)

            placeName.text = places[currentImage]
            // placeAddress.text = addresses[currentImage]
        }
    }

    private fun updateImage(alphaValue: Float) {
        val idImageToShowString = "pic${currentImage + 1}"
        val idImageToShowInt = resources.getIdentifier(idImageToShowString, "id", packageName)
        val imageView: ImageView? = findViewById(idImageToShowInt)

        if (imageView != null) {
            imageView.alpha = alphaValue
        } else {
            Log.e("MainActivity", "ImageView with ID $idImageToShowInt not found")
        }
    }
}










