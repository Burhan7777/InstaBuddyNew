package com.pzbdownloaders.instabuddy.main_screen.data.model

import com.google.gson.annotations.SerializedName


data class RootSearch(
    val status: String,
    val response: ResponseSearch,
)

data class ResponseSearch(
    @SerializedName("status_code")
    val statusCode: Long,
    @SerializedName("content_type")
    val contentType: String,
    val body: BodySearch,
)

data class BodySearch(
    val users: List<UserSearch>,
    val places: List<Place>,
    val hashtags: List<Hashtag>,
    @SerializedName("has_more")
    val hasMore: Boolean,
    @SerializedName("rank_token")
    val rankToken: String,
    @SerializedName("clear_client_cache")
    val clearClientCache: List<Any?>,
    val status: String,
)

data class UserSearch(
    val position: Long,
    val user: User2Search,
)

data class User2Search(
    @SerializedName("fbid_v2")
    val fbidV2: String,
    val pk: String,
    @SerializedName("pk_id")
    val pkId: String,
    @SerializedName("strong_id__")
    val strongId: String,
    @SerializedName("full_name")
    val fullName: String,
    @SerializedName("is_private")
    val isPrivate: Boolean,
    @SerializedName("third_party_downloads_enabled")
    val thirdPartyDownloadsEnabled: Long,
    @SerializedName("has_anonymous_profile_picture")
    val hasAnonymousProfilePicture: Boolean,
    val username: String,
    @SerializedName("is_verified")
    val isVerified: Boolean,
    @SerializedName("profile_pic_id")
    val profilePicId: String,
    @SerializedName("profile_pic_url")
    val profilePicUrl: String,
    @SerializedName("has_opt_eligible_shop")
    val hasOptEligibleShop: Boolean,
    @SerializedName("account_badges")
    val accountBadges: List<Any?>,
    @SerializedName("friendship_status")
    val friendshipStatus: FriendshipStatusSearch,
    @SerializedName("latest_reel_media")
    val latestReelMedia: Long,
    @SerializedName("is_verified_search_boosted")
    val isVerifiedSearchBoosted: Boolean,
    @SerializedName("should_show_category")
    val shouldShowCategory: Boolean,
    val seen: Long,
    @SerializedName("show_text_post_app_badge")
    val showTextPostAppBadge: Boolean?,
    @SerializedName("show_ig_app_switcher_badge")
    val showIgAppSwitcherBadge: Boolean?,
)

data class FriendshipStatusSearch(
    val following: Boolean,
    @SerializedName("is_private")
    val isPrivate: Boolean,
    @SerializedName("incoming_request")
    val incomingRequest: Boolean,
    @SerializedName("outgoing_request")
    val outgoingRequest: Boolean,
    @SerializedName("is_bestie")
    val isBestie: Boolean,
    @SerializedName("is_restricted")
    val isRestricted: Boolean,
    @SerializedName("is_feed_favorite")
    val isFeedFavorite: Boolean,
)

data class Place(
    val place: Place2,
    val position: Long,
)

data class Place2(
    val location: Location,
    val title: String,
    val subtitle: String,
    @SerializedName("media_bundles")
    val mediaBundles: List<Any?>,
    val slug: String,
)

data class Location(
    val pk: String,
    @SerializedName("short_name")
    val shortName: String,
    @SerializedName("facebook_places_id")
    val facebookPlacesId: String,
    @SerializedName("external_source")
    val externalSource: String,
    val name: String,
    val address: String,
    val city: String,
    @SerializedName("has_viewer_saved")
    val hasViewerSaved: Boolean,
    val lng: Double,
    val lat: Double,
)

data class Hashtag(
    val position: Long,
    val hashtag: Hashtag2,
)

data class Hashtag2(
    val name: String,
    val id: String,
    @SerializedName("media_count")
    val mediaCount: Long,
    @SerializedName("use_default_avatar")
    val useDefaultAvatar: Boolean,
    @SerializedName("search_result_subtitle")
    val searchResultSubtitle: String,
)
