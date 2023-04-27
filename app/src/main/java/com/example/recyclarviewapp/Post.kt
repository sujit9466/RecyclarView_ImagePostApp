package com.example.recyclarviewapp

class Post(
    val id : Int,
    val accountName : String,
    val postedOn : String?,
    val imageId : Int?,
    val text : String?,
    var likes : Int = 0
){

    var isMyhHeart : Boolean= false
    var imgHeart : Int = R.drawable.heart4
}