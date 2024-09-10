package com.kyj.imageapp

import android.content.Intent
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var image1: ImageView? = null
    private var image2: ImageView? = null
    private var image3: ImageView? = null
    private var image4: ImageView? = null
    private var image5: ImageView? = null
    private var image6: ImageView? = null
    private var image7: ImageView? = null
    private var image8: ImageView? = null
    private var image9: ImageView? = null
    private var intent: Intent? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        image1 = findViewById(R.id.image1)
        image2 = findViewById(R.id.image2)
        image3 = findViewById(R.id.image3)
        image4 = findViewById(R.id.image4)
        image5 = findViewById(R.id.image5)
        image6 = findViewById(R.id.image6)
        image7 = findViewById(R.id.image7)
        image8 = findViewById(R.id.image8)
        image9 = findViewById(R.id.image9)


        intent = Intent(this, ImageInsideActivity::class.java)
    }

    override fun onStart() {
        super.onStart()

        image1?.setOnClickListener(null)
    }

    fun onClick(view: View): Unit {
        when(view.id) {
            R.id.image1 -> {
                intent?.putExtra("image1", R.drawable.image1)
                startActivity(intent)
            }

            R.id.image1 -> {
                intent?.putExtra("image1", R.drawable.image1)
                startActivity(intent)
            }

            R.id.image1 -> {
                intent?.putExtra("image1", R.drawable.image1)
                startActivity(intent)
            }

            R.id.image1 -> {
                intent?.putExtra("image1", R.drawable.image1)
                startActivity(intent)
            }

            R.id.image1 -> {
                intent?.putExtra("image1", R.drawable.image1)
                startActivity(intent)
            }

            R.id.image1 -> {
                intent?.putExtra("image1", R.drawable.image1)
                startActivity(intent)
            }

            R.id.image1 -> {
                intent?.putExtra("image1", R.drawable.image1)
                startActivity(intent)
            }

            R.id.image1 -> {
                intent?.putExtra("image1", R.drawable.image1)
                startActivity(intent)
            }

            R.id.image1 -> {
                intent?.putExtra("image1", R.drawable.image1)
                startActivity(intent)
            }

            R.id.image1 -> {
                intent?.putExtra("image1", R.drawable.image1)
                startActivity(intent)
            }
        }
    }

}