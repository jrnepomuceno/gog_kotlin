package com.example.gog_poc.app.game

import com.example.gog_poc.app.actor.Player

class Game {

    val ranks: Array<String> = kotlin.arrayOf(
        "5*G", "4*G", "3*G", "2*G", "1*G", "COL", "LTC", "MAJ", "CPT", "1LT", "2LT", "SGT",
        "SP1", "SP2", "PV1", "PV2", "PV3", "PV4", "PV5", "PV6", "FLG"
    )

    val pOnePieces: List<Piece> = ranks.map { r -> Piece(r, 1, Position(0,0))}
    val pTwoPieces: List<Piece> = ranks.map { r -> Piece(r, 2, Position(0,0))}

    fun main(){
        //initialize board
        val board = Board()
        board.printBoard()

        //initialize players and team
        val player1 = Player(1)
        val player2 = Player(2)

        //commence drafting
        //all-in for now, Player custom draft TODO()
        board.initPieces(pOnePieces, (0..26).shuffled(), 1)
        board.initPieces(pTwoPieces, (0..26).shuffled(), 2)

        println("Board is SET!")
        board.printBoard()
    }

    fun movePiece(from: Position, to: Position): Boolean {
        TODO()
        //get piece, store in var
        //if valid, return true
        //if invalid, return false
        //call arbiter
    }

    fun locatePieceForTeam(rank: String, team: String): Position{
        TODO()
    }
}