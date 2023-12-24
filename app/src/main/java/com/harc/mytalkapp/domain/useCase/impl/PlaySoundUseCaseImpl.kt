package com.harc.mytalkapp.domain.useCase.impl

import android.content.Context
import android.media.MediaPlayer
import com.harc.mytalkapp.domain.useCase.interfaces.PlaySoundUseCase

class PlaySoundUseCaseImpl(
    private val context: Context
) : PlaySoundUseCase {
    private var mediaPlayer: MediaPlayer? = null

    override fun PlaySound(sonidoId: Int, listener: MediaPlayer.OnCompletionListener) {
        // Detener cualquier sonido que se esté reproduciendo
        mediaPlayer?.stop()
        mediaPlayer?.release()

        // Iniciar el nuevo sonido
        mediaPlayer = MediaPlayer.create(context, sonidoId).apply {
            setOnCompletionListener(listener)
            start()
        }
    }

    override fun stopSound() {
        mediaPlayer?.stop()
        mediaPlayer?.release()
        mediaPlayer = null
    }
}
