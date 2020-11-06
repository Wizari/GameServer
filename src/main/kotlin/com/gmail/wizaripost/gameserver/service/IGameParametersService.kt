package com.gmail.wizaripost.gameserver.service

import com.gmail.wizaripost.gameserver.entity.GameParameters
import com.gmail.wizaripost.gameserver.entity.Request

interface IGameParametersService {
    fun getParams(request: Request): GameParameters
}
