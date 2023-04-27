package com.example.recyclarviewapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PostsAdapter(
    private val posts : ArrayList<Post>
) : RecyclerView.Adapter<PostsAdapter.PostViewHolder>() {

    inner class PostViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val txtAccountName: TextView
        val txtPostedOn: TextView
        val imgPost: ImageView
        val btnLike: ImageView
        val txtLikes: TextView
        val txtText: TextView

        init {
            txtAccountName = view.findViewById(R.id.txtAccountName)
            txtPostedOn = view.findViewById(R.id.txtPostedOn)
            imgPost = view.findViewById(R.id.imgPost)
            btnLike = view.findViewById(R.id.imgLike)
            txtLikes = view.findViewById(R.id.txtLikes)
            txtText = view.findViewById(R.id.txtText)

            btnLike.setOnClickListener {

                if (posts[adapterPosition].isMyhHeart == false) {
                    posts[adapterPosition].imgHeart = R.drawable.heart3
                    posts[adapterPosition].isMyhHeart = true
                    posts[adapterPosition].likes += 1
                } else if (posts[adapterPosition].isMyhHeart == true) {
                    posts[adapterPosition].imgHeart = R.drawable.heart4
                    posts[adapterPosition].isMyhHeart = false
                    posts[adapterPosition].likes -= 1

                }
                btnLike.setImageResource(posts[adapterPosition].imgHeart)
                txtLikes.text = "${posts[adapterPosition].likes}"
            }

            imgPost.setOnClickListener {
                var intent = Intent(view.context, PostViewerActivity::class.java)
                intent.putExtra("imgPost", posts[adapterPosition].imageId)

                view.context.startActivity(intent)

            }
        }

    }


    override fun getItemCount() = posts.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        //create view
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.post_views, null)

        return PostViewHolder(view)

    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val post = posts[position]

        holder.txtAccountName.text = post.accountName
        holder.txtPostedOn.text = post.postedOn
        if (post.imageId != null) {
            holder.imgPost.setImageResource(post.imageId!!)
        }
        holder.txtLikes.text = "${post.likes}"
        if (post.text != null) {
            holder.txtText.text = post.text
            holder.txtText.visibility = View.VISIBLE
        } else {
            holder.txtText.visibility = View.GONE
        }
        if (post.imgHeart != null) {
            holder.btnLike.setImageResource(post.imgHeart)
        }

    }
}