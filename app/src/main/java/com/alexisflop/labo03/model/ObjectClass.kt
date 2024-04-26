package com.alexisflop.labo03.model

data class ObjectClass(
    private var name: String,
    private var creation: String
) {

    fun getName(): String {
        return name
    }

    fun getCreation(): String {
        return creation
    }

    fun setName(_name: String) {
        name = _name
    }

    fun setCreation(_creation: String) {
        creation = _creation
    }
}