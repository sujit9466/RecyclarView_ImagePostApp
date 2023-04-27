package com.example.recyclarviewapp

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class PostViewerActivity  : AppCompatActivity() {
    private lateinit var imgPostView :ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.post_viewer_activity)
        initViews()
    }
    private fun initViews(){

        imgPostView=findViewById(R.id.imgPostView)

        val intent =getIntent()
        val imgPost= intent.getIntExtra("imgPost", 0)
        imgPostView.setImageResource(imgPost)

    }
}