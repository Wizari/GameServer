package com.gmail.wizaripost.gameserver.service

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.gmail.wizaripost.gameserver.entity.GameParameters
import com.gmail.wizaripost.gameserver.entity.Request
import org.springframework.stereotype.Service

@Service
class GameParametersService : IGameParametersService {


    override fun getParams(stringRequest: String): GameParameters {
        println("test getParams")
        val request : Request = parsingJsonStringIntoJsonNode(stringRequest)
        println(request.a)
        println(request.b)
        println(request.ls)
//        val gameParameters: GameParameters = GameParameters("getParams123123")
        return GameParameters("getParams123123")
    }

    fun parsingJsonStringIntoJsonNode(string: String) : Request {
        val mapper = ObjectMapper()
        val jsonObj: JsonNode  = mapper.readTree(string);
        return mapper.treeToValue(jsonObj, Request::class.java)
    }
}


//override fun getParams(request: Request?): GameParameters {
//    println(request?.a)
//    println(request?.b)
//    println(request?.ls)
//    return GameParameters("getParams123123")
//}
