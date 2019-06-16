package io.kweb.client

data class Server2ClientMessage(
        val yourId: String,
        val debugToken: String?,
        val instructions: List<Instruction>? = null
) {


    data class Instruction(val id : String, val jsFunction: String?, val callbackId : Int?, val arguments: List<Any?>)
}