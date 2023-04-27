package com.example.recyclarviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerPosts : RecyclerView
    private val post = ArrayList<Post>();
    private lateinit var postsAdapter : PostsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initData()
        initData()
        initData()

        initViews()
    }

    private fun initViews() {
        recyclerPosts = findViewById(R.id.recyclerPost)
        recyclerPosts.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false
        )

        postsAdapter = PostsAdapter(post)
        recyclerPosts.adapter = postsAdapter
    }


    private fun initData(){
        post.add(
            Post(1, "@DipakAnap", "12-04-2023", R.drawable.image1, "Are you looking to build Career in IT ?\n" + "Join BitCode! We are the Best IT Training Company in Pune.", 10123)
        )
        post.add(
            Post(1, "@parag12", "12-04-2023", R.drawable.image2, null)
        )
        post.add(
            Post(1, "@kalu", "12-04-2023", R.drawable.image3, "Android the most popular operating system", 20234)
        )
        post.add(
            Post(1, "@sujit99", "12-04-2023", R.drawable.image4, "Are you looking to build Career in IT ?\n" + "Join BitCode! We are the Best IT Training Company in Pune.", 10123)
        )
        post.add(
            Post(1, "@dipakAnap", "12-04-2023", R.drawable.image1, "Are you looking to build Career in IT ?\n" + "Join BitCode! We are the Best IT Training Company in Pune.", 10243)
        )
        post.add(
            Post(1, "@parag12", "12-04-2023", R.drawable.image1, "Are you looking to build Career in IT ?\n" + "Join BitCode! We are the Best IT Training Company in Pune.", 10234)
        )
        post.add(
            Post(1, "@kalu", "12-04-2023", R.drawable.image2, null)
        )
        post.add(
            Post(1, "@Sujit99", "12-04-2023", R.drawable.image3, "Android the most popular operating system", 203245)
        )
        post.add(
            Post(1, "@DipakAnap", "12-04-2023", R.drawable.image4, "Are you looking to build Career in IT ?\n" + "Join BitCode! We are the Best IT Training Company in Pune.", 10)
        )
        post.add(
            Post(1, "@parag12", "12-04-2023", R.drawable.image1, "Are you looking to build Career in IT ?\n" + "Join BitCode! We are the Best IT Training Company in Pune.", 10)
        )
        post.add(
            Post(1, "@kalu", "12-04-2023", R.drawable.image1, "Are you looking to build Career in IT ?\n" + "Join BitCode! We are the Best IT Training Company in Pune.", 10)
        )
        post.add(
            Post(1, "@Sujit99", "12-04-2023", R.drawable.image2, null)
        )
        post.add(
            Post(1, "@dipakApnap", "12-04-2023", R.drawable.image3, "Android the most popular operating system", 20)
        )
        post.add(
            Post(1, "@parag12", "12-04-2023", R.drawable.image4, "Are you looking to build Career in IT ?\n" + "Join BitCode! We are the Best IT Training Company in Pune.", 10)
        )
        post.add(
            Post(1, "kalu ", "12-04-2023", R.drawable.image1, "Are you looking to build Career in IT ?\n" + "Join BitCode! We are the Best IT Training Company in Pune.", 10)
        )


    }















}