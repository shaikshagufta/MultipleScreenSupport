package com.example.multiplescreensupportdemo

interface MyCommunicator { // Meant for inter-fragment communication

    fun displayDetails(title: String, description: String)
}