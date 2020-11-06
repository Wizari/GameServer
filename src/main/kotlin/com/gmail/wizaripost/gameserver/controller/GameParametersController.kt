package com.gmail.wizaripost.gameserver.controller

import com.gmail.wizaripost.gameserver.entity.GameParameters
import com.gmail.wizaripost.gameserver.entity.Request
import com.gmail.wizaripost.gameserver.service.GameParametersService
import com.gmail.wizaripost.gameserver.service.IGameParametersService
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/GetInitialParametersJson.aspx")
class GameParametersController {
    val service: IGameParametersService = GameParametersService()

//    @RequestMapping(method = [RequestMethod.GET], produces = [MediaType.TEXT_PLAIN_VALUE])
//      @RequestMapping(method = [RequestMethod.GET], consumes= ["text/plain"])
//    fun getParams(@RequestBody request: Request): GameParameters {

    @RequestMapping(method = [RequestMethod.GET])
    fun getParams(@RequestBody request: String): GameParameters {
        return service.getParams(request)
    }

//    @RequestMapping(method = [RequestMethod.GET])
//    fun getParams(@RequestBody request: Request?): GameParameters {
//        println(request)
//        return GameParameters("Hello")
//    }

}
