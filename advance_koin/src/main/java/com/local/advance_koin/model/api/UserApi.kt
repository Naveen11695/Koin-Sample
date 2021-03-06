package com.local.advance_koin.model.api

import kotlinx.coroutines.Deferred
import com.local.advance_koin.model.entity.GithubUser
import retrofit2.http.GET

interface UserApi {

    @GET("users")
    fun getAllAsync(): Deferred<List<GithubUser>>
}