package com.harc.mytalkapp.presentation.resource

import com.example.mytalkapp.R


data class GameResource(val image: Int, val sound: Int)
object GameResources {
    val resources = listOf(
        GameResource(R.drawable.bobsponjacomiendo, R.raw.quierocomer),
        GameResource(R.drawable.durmiendo, R.raw.quierodormir),
        GameResource(R.drawable.enojado, R.raw.estoyenojada),
        GameResource(R.drawable.estoyfeliz, R.raw.estoyfeliz),
        GameResource(R.drawable.lavarmanitos, R.raw.quierolavarmelasmanos),
        GameResource(R.drawable.quierobailar, R.raw.quierobailar),
        GameResource(R.drawable.quierosalir, R.raw.quierosalir),
        GameResource(R.drawable.quierovertv, R.raw.quierovertv),
        GameResource(R.drawable.tomandoagua, R.raw.quierotomaragua),
        GameResource(R.drawable.tomandorefrezco, R.raw.quierotomarrefrezco),
        // ... más imágenes y sonidos ...
    )
}

