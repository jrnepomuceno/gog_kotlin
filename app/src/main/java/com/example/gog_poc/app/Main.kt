package com.example.gog_poc.app

import com.example.gog_poc.app.game.Game

object Main {

    @JvmStatic
    fun main(args: Array<String>){
        println("Welcome to Game of Generals!");

        val game = Game()

        game.main()
    }
}
