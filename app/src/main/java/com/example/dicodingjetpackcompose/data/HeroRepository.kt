package com.example.dicodingjetpackcompose.data

import com.example.dicodingjetpackcompose.model.Hero
import com.example.dicodingjetpackcompose.model.HeroesData

class HeroRepository {
    fun getHeroes(): List<Hero> {
        return HeroesData.heroes
    }

    fun searchHeroes(query: String): List<Hero>{
        return HeroesData.heroes.filter {
            it.name.contains(query, ignoreCase = true)
        }
    }

}