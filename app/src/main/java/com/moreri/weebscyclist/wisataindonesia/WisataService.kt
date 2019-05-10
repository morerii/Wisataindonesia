package com.moreri.weebscyclist.wisataindonesia

import android.telecom.Call
import retrofit2.http.GET

interface WisataService {


    @GET("?action/findAll")
    fun requestAmbil():retrofit2.Call<ResponseServer>

}