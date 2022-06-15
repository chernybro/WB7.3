package com.chernybro.wb53.data.remote.search

import com.chernybro.wb53.presentation.data.Cat
import com.chernybro.wb53.utils.Resource

interface SearchService {

    suspend fun getCat(): Resource<Cat>
}