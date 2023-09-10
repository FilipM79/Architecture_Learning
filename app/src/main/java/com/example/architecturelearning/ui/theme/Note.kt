package com.example.architecturelearning.ui.theme

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "note_table")
class Note() {

    @PrimaryKey(autoGenerate = true)
    private var id: Int = 0

    private val title: String
        get() {
            return title
        }

    private val description: String
        get() {
            return description
        }

    private val priority: Int
        get() {
            return priority
        }
}