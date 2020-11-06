package com.gmail.wizaripost.gameserver.entity

import javax.persistence.Entity


@Entity
class Request(
        var a: String? = null,
        var b: Long? = null,
        var ls: Long? = null
        ) {
}
