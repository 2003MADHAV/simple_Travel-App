package com.example.travelingphotoapp

import android.os.Bundle
import android.util.Log
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity


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
    private lateinit var image: ImageView

    private val places = arrayOf(
        "Lotus Temple", "India Gate", "Banaras", "Amar Taj", "Nature of Goa", "Taj Mahal", "The Ganges River, Varanasi",
        "Cola Beach, Goa", "Bada Bagh, Jaisalmer", "Tea Plantations", "Meenakshi Amman Temple, Madurai", "Golden Temple, Amritsar",
        "Red Fort, Delhi", "Bhagwan Mahavir Wildlife Sanctuary", "Bandra-Worli Sea Link, Mumbai"
    )

    private val addresses = arrayOf(
        "Address for Lotus Temple", "Address for India Gate", "Address for Banaras", "Address for Amar Taj", "Address for Nature of Goa",
        "Address for Taj Mahal", "Address for The Ganges River, Varanasi", "Address for Cola Beach, Goa", "Address for Bada Bagh, Jaisalmer",
        "Address for Tea Plantations", "Address for Meenakshi Amman Temple, Madurai", "Address for Golden Temple, Amritsar",
        "Address for Red Fort, Delhi", "Address for Bhagwan Mahavir Wildlife Sanctuary", "Address for Bandra-Worli Sea Link, Mumbai"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Ensure this matches the layout file name

        // Initialize the first image
        image = findViewById(R.id.pic1)
        image.alpha = 1f

        val next = findViewById<ImageButton>(R.id.btnNext)
        val prev = findViewById<ImageButton>(R.id.btnPrev)

        val placeName = findViewById<TextView>(R.id.tVName)
        val placeAddress = findViewById<TextView>(R.id.tvFullAddress)

        next.setOnClickListener {
            updateImage(alphaValue = 0f)

            currentImage = (currentImage + 1) % places.size
            updateImage(alphaValue = 1f)

            placeName.text = places[currentImage]
            placeAddress.text = addresses[currentImage]
        }

        prev.setOnClickListener {
            updateImage(alphaValue = 0f)

            currentImage = (currentImage - 1 + places.size) % places.size
            updateImage(alphaValue = 1f)

            placeName.text = places[currentImage]
            placeAddress.text = addresses[currentImage]
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






