package com.example.gog_poc.app.game

import android.annotation.SuppressLint

class Position(val row: Int, val col: Int) {
    @SuppressLint("DefaultLocale")
    override fun toString(): String{
        return String.format("(%d, %d)", row, col)
    }
}