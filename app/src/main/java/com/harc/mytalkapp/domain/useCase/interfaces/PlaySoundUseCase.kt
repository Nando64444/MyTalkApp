package com.harc.mytalkapp.domain.useCase.interfaces

import android.media.MediaPlayer


interface PlaySoundUseCase {
    fun PlaySound(sonidoId: Int, listener: MediaPlayer.OnCompletionListener)
    fun stopSound()
}
