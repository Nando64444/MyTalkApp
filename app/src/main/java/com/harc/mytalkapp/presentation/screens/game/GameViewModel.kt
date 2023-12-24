package com.harc.mytalkapp.presentation.screens.game

import android.content.Context
import android.media.MediaPlayer
import android.widget.Toast
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.harc.mytalkapp.domain.useCase.interfaces.PlaySoundUseCase
import com.harc.mytalkapp.presentation.resource.GameResources
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

@HiltViewModel
class GameViewModel @Inject constructor(
    private val playSoundUseCase: PlaySoundUseCase,
    @ApplicationContext val context: Context
) : ViewModel() {

    // Estado que indica si hay un sonido en reproducción
    private val _isSoundPlaying = mutableStateOf(false)
    val isSoundPlaying: MutableState<Boolean> get() = _isSoundPlaying

    private val onCompletionListener = MediaPlayer.OnCompletionListener {
        // Método llamado cuando la reproducción del sonido ha terminado
        onSoundStopped()
    }

    fun playSound(sonidoId: Int) {
        // Detener cualquier sonido que se esté reproduciendo
        if (_isSoundPlaying.value) {
            playSoundUseCase.stopSound()
        }

        // Encontrar el índice del recurso en la lista de recursos
        val resourceIndex = GameResources.resources.indexOfFirst { it.sound == sonidoId }

        // Verificar si el índice es válido antes de reproducir el sonido
        if (resourceIndex != -1) {
            // Iniciar el nuevo sonido
            playSoundUseCase.PlaySound(GameResources.resources[resourceIndex].sound, onCompletionListener)

            // Actualizar el estado después de iniciar el sonido
            _isSoundPlaying.value = true
        } else {
            // Manejar el caso en el que no se encuentra el sonido correspondiente al sonidoId
            // Puedes mostrar un mensaje de error o realizar alguna otra acción según tus necesidades
            Toast.makeText(context, "Error desconocido", Toast.LENGTH_SHORT).show()
        }
    }

    // Método para actualizar el estado cuando el sonido ha terminado
    private fun onSoundStopped() {
        _isSoundPlaying.value = false
    }
}
