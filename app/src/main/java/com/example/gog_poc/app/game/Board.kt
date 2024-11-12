package com.example.gog_poc.app.game


class Board {

    val maxRow = 8
    val maxCol = 9

    private val board: Array<Array<Piece>> = Array(maxRow) {
        row -> Array(maxCol) {
            col ->
        Piece("---", 0, Position(row, col))
        }
    }

    fun whoIsInPosition(row: Int, col: Int): String {
        return board[row][col].toString()
    }

    //interface for actors
    fun putPiece(rank: String, team: Int, row:Int, col: Int){
        board[row][col] = Piece(rank, team, Position(row, col))
    }

    //lambda function for FP
    val putPiece = { piece: Piece, row:Int, col: Int ->
        board[row][col] = Piece(piece.rank, piece.team, Position(row, col))
        //TODO() put references in player base for easy lookup
    }

    fun initPieces(list: List<Piece>, randIntList: List<Int>, team: Int) {
        placePieces(list, randIntList, this.putPiece, team)
    }

    fun placePieces(list: List<Piece>, randIntList: List<Int>,
                    putPiece: (piece: Piece, row: Int, col: Int) -> Unit,
                    team: Int) {
        when(list) {
            emptyList<Piece>() ->  Unit
            else -> {
                val pos = randIntList[0]
                when(team) {
                    1 -> putPiece(list[0], pos.div(9), pos.mod(9))
                    2 -> putPiece(list[0], pos.div(9)+5, pos.mod(9))
                }
                placePieces(list.drop(1), randIntList.drop(1), putPiece, team)
            }
        }
    }

    //interface for observers
    fun getPiece(row: Int, col: Int): Piece {
        return board[row][col]
    }

    fun getBoard() : String {
        val boardString = StringBuilder()
        for ((row, value) in board.withIndex()) {
            for(elem in value) {
                when {
                    else -> boardString.append(elem.rank + " ")
                }
            }
            boardString.append("\n")
        }
        boardString.append("\n")
        return boardString.toString()
    }

    //general use
    fun printBoard(){
        for ((row, value) in board.withIndex()) {
            for(elem in value) {
                when {
                    else -> print(elem.rank + " ")
                }
            }
            println()
        }
        println()
    }
}
