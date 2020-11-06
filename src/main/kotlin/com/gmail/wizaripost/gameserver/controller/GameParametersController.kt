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
    val service: IGameParametersService = GameParametersService()


//    @RequestMapping(method = [RequestMethod.GET], produces = [MediaType.TEXT_PLAIN_VALUE])
//@RequestMapping(method = [RequestMethod.GET], consumes= ["text/plain"])
    @RequestMapping(method = [RequestMethod.GET])
//    fun getParams(@RequestBody request: Request): GameParameters {
    fun getParams(@RequestBody request: String): GameParameters {
        return service.getParams(request)
}


    @GetMapping("/greeting")
//    fun getParams(@RequestBody request: Request): GameParameters {
    fun getParams1(): GameParameters {
        println("getParams(controller")
        return GameParameters("getParams1")
    }
}
