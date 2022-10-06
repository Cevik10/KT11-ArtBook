package com.hakancevik.artbookkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.hakancevik.artbookkt.databinding.ActivityArtBinding

class ArtActivity : AppCompatActivity() {

    private lateinit var binding: ActivityArtBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityArtBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)







    }


    fun saveButton(view : View) {


    }

    fun selectImage(view : View) {


    }



}