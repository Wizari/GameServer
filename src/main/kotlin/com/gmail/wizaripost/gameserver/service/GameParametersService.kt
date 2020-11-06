package com.gmail.wizaripost.gameserver.service

import com.gmail.wizaripost.gameserver.entity.GameParameters
import com.gmail.wizaripost.gameserver.entity.Request
import org.springframework.stereotype.Service



@Service
class GameParametersService : IGameParametersService {

    override fun getParams(request: Request): GameParameters {
        println("test getParams")
        return GameParameters("111111getParams_GameParameters")
    }
}
