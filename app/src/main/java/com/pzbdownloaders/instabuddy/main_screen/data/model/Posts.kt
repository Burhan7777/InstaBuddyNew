package com.pzbdownloaders.instabuddy.main_screen.data.model

data class Posts(
    val display_resources: List<DisplayResource>
)

data class DisplayResource(
    val src: String,
    val config_width: String,
    val config_height: String
)