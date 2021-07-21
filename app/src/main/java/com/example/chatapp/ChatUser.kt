package com.example.chatapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ChatUser (
    var firstName: String,
    var lastName: String
        ) : Parcelable



