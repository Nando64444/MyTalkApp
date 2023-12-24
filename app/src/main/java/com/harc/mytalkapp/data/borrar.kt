package com.harc.mytalkapp.data

import android.content.Context
import android.media.MediaPlayer
import com.example.mytalkapp.R

class Borrar(private val context: Context) {

    private val mediaPlayer: MediaPlayer = MediaPlayer.create(context, R.raw.quieroagua)

    fun reproducir() {
        mediaPlayer.start()
    }
}
