package com.example.composition.domain.entity

data class GameSettings(
    val maxSumResult: Int,
    val minCountRightAnswers: Int,
    val minPercentOfRightAnswers: Int,
    val gameTimeInSeconds: Int
)