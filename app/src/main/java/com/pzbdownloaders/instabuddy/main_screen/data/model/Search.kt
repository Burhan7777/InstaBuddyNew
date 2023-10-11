package com.pzbdownloaders.instabuddy.main_screen.data.model


data class Search(
    val users: List<Users>
)

data class Users(
    val position: Int,
    val user: User
)

data class User(
    /*val has_anonymous_profile_picture: Boolean,
    val fbid_v2: Long,
    val pk: String,
    val pk_id: String,*/
    val username: String,
    val full_name: String,
    val is_private: Boolean,
    val is_verified: Boolean,
    val profile_pic_id: String,
    val profile_pic_url: String,
/*    val has_opt_eligible_shop: Boolean,
    val account_badges: List<String>,
    val birthday_today_visibility_for_viewer: String,
    val third_party_downloads_enabled: Int,
    val latest_reel_media: Int,
    val should_show_category: Boolean*/
)
