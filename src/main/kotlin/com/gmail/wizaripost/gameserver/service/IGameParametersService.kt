package com.gmail.wizaripost.gameserver.service

import com.fasterxml.jackson.databind.JsonNode
import com.gmail.wizaripost.gameserver.entity.GameParameters
import com.gmail.wizaripost.gameserver.entity.Request

interface IGameParametersService {

    fun getParams(stringRequest: String): GameParameters

}
