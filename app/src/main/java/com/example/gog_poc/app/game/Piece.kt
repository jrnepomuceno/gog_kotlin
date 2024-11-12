package com.example.gog_poc.app.game

import android.annotation.SuppressLint

class Piece(val rank: String, val team: Int, val position: Position) {

    @SuppressLint("DefaultLocale")
    override fun toString(): String {
        return String.format("%s %d @ %s", rank, team, position)
    }
}