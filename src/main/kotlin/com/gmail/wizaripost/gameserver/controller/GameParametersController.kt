package com.gmail.wizaripost.gameserver.controller

import com.gmail.wizaripost.gameserver.entity.GameParameters
import com.gmail.wizaripost.gameserver.entity.Request
import com.gmail.wizaripost.gameserver.service.GameParametersService
import com.gmail.wizaripost.gameserver.service.IGameParametersService
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("api/employees")
class GameParametersController {
    //    private val service: GameParametersService = new GameParametersService
    val service: IGameParametersService = GameParametersService()

//, produces = [MediaType.TEXT_PLAIN_VALUE]
//    value = ["/{id}"],
//    , method = [RequestMethod.GET]
    //    produces = [MediaType.APPLICATION_JSON_VALUE] produces = [MediaType.TEXT_HTML_VALUE]


    @RequestMapping(method = [RequestMethod.GET], produces = [MediaType.TEXT_PLAIN_VALUE])
    fun getParams(@RequestBody request: Request): GameParameters {
        println("getParams(controller")
        return this.service.getParams(request)
    }

//    //    @GetMapping
//    @GetMapping("/greeting")
//    fun getParams(@RequestBody request: Request): GameParameters {
//        println("getParams(controller")
//        return this.service.getParams(request)
//    }
}
