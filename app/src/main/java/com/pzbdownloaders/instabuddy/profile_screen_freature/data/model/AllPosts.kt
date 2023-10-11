package com.pzbdownloaders.instabuddy.profile_screen_freature.data.model

import com.google.gson.annotations.SerializedName

data class AllPosts(
    val data: Data,
    val extensions: Extensions,
    val status: String,
    @SerializedName("unrelated_data")
    val unrelatedData: UnrelatedData,
)

data class Data(
    val user: User,
)

data class User(
    @SerializedName("edge_owner_to_timeline_media")
    var edgeOwnerToTimelineMedia: EdgeOwnerToTimelineMedia,
)

data class EdgeOwnerToTimelineMedia(
    val count: Long,
    @SerializedName("page_info")
    val pageInfo: PageInfo,
    val edges: List<Edge>,
)

data class PageInfo(
    @SerializedName("has_next_page")
    val hasNextPage: Boolean,
    @SerializedName("end_cursor")
    val endCursor: String,
)

data class Edge(
    val node: Node,
)

data class Node(
    @SerializedName("__typename")
    val typename: String,
    var id: String,
    @SerializedName("gating_info")
    val gatingInfo: Any?,
    @SerializedName("fact_check_overall_rating")
    val factCheckOverallRating: Any?,
    @SerializedName("fact_check_information")
    val factCheckInformation: Any?,
    @SerializedName("media_overlay_info")
    val mediaOverlayInfo: Any?,
    @SerializedName("sensitivity_friction_info")
    val sensitivityFrictionInfo: Any?,
    @SerializedName("sharing_friction_info")
    val sharingFrictionInfo: SharingFrictionInfo,
    val dimensions: Dimensions,
    @SerializedName("display_url")
    val displayUrl: String,
    @SerializedName("display_resources")
    val displayResources: List<DisplayResource>,
    @SerializedName("is_video")
    val isVideo: Boolean,
    @SerializedName("media_preview")
    val mediaPreview: String?,
    @SerializedName("tracking_token")
    val trackingToken: String,
    @SerializedName("has_upcoming_event")
    val hasUpcomingEvent: Boolean,
    @SerializedName("edge_media_to_tagged_user")
    val edgeMediaToTaggedUser: EdgeMediaToTaggedUser,
    @SerializedName("accessibility_caption")
    val accessibilityCaption: Any?,
    @SerializedName("edge_media_to_caption")
    val edgeMediaToCaption: EdgeMediaToCaption,
    val shortcode: String,
    @SerializedName("edge_media_to_comment")
    val edgeMediaToComment: EdgeMediaToComment,
    @SerializedName("edge_media_to_sponsor_user")
    val edgeMediaToSponsorUser: EdgeMediaToSponsorUser,
    @SerializedName("is_affiliate")
    val isAffiliate: Boolean,
    @SerializedName("is_paid_partnership")
    val isPaidPartnership: Boolean,
    @SerializedName("comments_disabled")
    val commentsDisabled: Boolean,
    @SerializedName("taken_at_timestamp")
    val takenAtTimestamp: Long,
    @SerializedName("edge_media_preview_like")
    val edgeMediaPreviewLike: EdgeMediaPreviewLike,
    val owner: Owner,
    val location: Location?,
    @SerializedName("nft_asset_info")
    val nftAssetInfo: Any?,
    @SerializedName("viewer_has_liked")
    val viewerHasLiked: Boolean,
    @SerializedName("viewer_has_saved")
    val viewerHasSaved: Boolean,
    @SerializedName("viewer_has_saved_to_collection")
    val viewerHasSavedToCollection: Boolean,
    @SerializedName("viewer_in_photo_of_you")
    val viewerInPhotoOfYou: Boolean,
    @SerializedName("viewer_can_reshare")
    val viewerCanReshare: Boolean,
    @SerializedName("thumbnail_src")
    val thumbnailSrc: String,
    @SerializedName("thumbnail_resources")
    val thumbnailResources: List<ThumbnailResource>,
    @SerializedName("coauthor_producers")
    val coauthorProducers: List<CoauthorProducer>,
    @SerializedName("pinned_for_users")
    val pinnedForUsers: List<PinnedForUser>,
    @SerializedName("edge_sidecar_to_children")
    val edgeSidecarToChildren: EdgeSidecarToChildren?,
    @SerializedName("dash_info")
    val dashInfo: DashInfo?,
    @SerializedName("has_audio")
    val hasAudio: Boolean?,
    @SerializedName("video_url")
    val videoUrl: String?,
    @SerializedName("video_view_count")
    val videoViewCount: Long?,
    @SerializedName("product_type")
    val productType: String?,
)

data class SharingFrictionInfo(
    @SerializedName("should_have_sharing_friction")
    val shouldHaveSharingFriction: Boolean,
    @SerializedName("bloks_app_url")
    val bloksAppUrl: Any?,
)

data class Dimensions(
    val height: Long,
    val width: Long,
)

data class DisplayResource(
    val src: String,
    @SerializedName("config_width")
    val configWidth: Long,
    @SerializedName("config_height")
    val configHeight: Long,
)

data class EdgeMediaToTaggedUser(
    val edges: List<Edge2>,
)

data class Edge2(
    val node: Node2,
)

data class Node2(
    val user: User2,
    val x: Double,
    val y: Double,
)

data class User2(
    @SerializedName("full_name")
    val fullName: String,
    @SerializedName("followed_by_viewer")
    val followedByViewer: Boolean,
    val id: String,
    @SerializedName("is_verified")
    val isVerified: Boolean,
    @SerializedName("profile_pic_url")
    val profilePicUrl: String,
    val username: String,
)

data class EdgeMediaToCaption(
    val edges: List<Edge3>,
)

data class Edge3(
    val node: Node3,
)

data class Node3(
    val text: String,
)

data class EdgeMediaToComment(
    val count: Long,
    @SerializedName("page_info")
    val pageInfo: PageInfo2,
)

data class PageInfo2(
    @SerializedName("has_next_page")
    val hasNextPage: Boolean,
    @SerializedName("end_cursor")
    val endCursor: String,
)

data class EdgeMediaToSponsorUser(
    val edges: List<Edge4>,
)

data class Edge4(
    val node: Node4,
)

data class Node4(
    val sponsor: Sponsor,
)

data class Sponsor(
    val id: String,
    val username: String,
)

data class EdgeMediaPreviewLike(
    val count: Long,
    val edges: List<Any?>,
)

data class Owner(
    val id: String,
    val username: String,
)

data class Location(
    val id: String,
    @SerializedName("has_public_page")
    val hasPublicPage: Boolean,
    val name: String,
    val slug: String,
)

data class ThumbnailResource(
    val src: String,
    @SerializedName("config_width")
    val configWidth: Long,
    @SerializedName("config_height")
    val configHeight: Long,
)

data class CoauthorProducer(
    val id: String,
    @SerializedName("is_verified")
    val isVerified: Boolean,
    @SerializedName("profile_pic_url")
    val profilePicUrl: String,
    val username: String,
)

data class PinnedForUser(
    val id: String,
    @SerializedName("is_verified")
    val isVerified: Boolean,
    @SerializedName("profile_pic_url")
    val profilePicUrl: String,
    val username: String,
)

data class EdgeSidecarToChildren(
    val edges: List<Edge5>,
)

data class Edge5(
    val node: Node5,
)

data class Node5(
    @SerializedName("__typename")
    val typename: String,
    val id: String,
    @SerializedName("gating_info")
    val gatingInfo: Any?,
    @SerializedName("fact_check_overall_rating")
    val factCheckOverallRating: Any?,
    @SerializedName("fact_check_information")
    val factCheckInformation: Any?,
    @SerializedName("media_overlay_info")
    val mediaOverlayInfo: Any?,
    @SerializedName("sensitivity_friction_info")
    val sensitivityFrictionInfo: Any?,
    @SerializedName("sharing_friction_info")
    val sharingFrictionInfo: SharingFrictionInfo2,
    val dimensions: Dimensions2,
    @SerializedName("display_url")
    val displayUrl: String,
    @SerializedName("display_resources")
    val displayResources: List<DisplayResource2>,
    @SerializedName("is_video")
    val isVideo: Boolean,
    @SerializedName("media_preview")
    val mediaPreview: String?,
    @SerializedName("tracking_token")
    val trackingToken: String,
    @SerializedName("has_upcoming_event")
    val hasUpcomingEvent: Boolean,
    @SerializedName("edge_media_to_tagged_user")
    val edgeMediaToTaggedUser: EdgeMediaToTaggedUser2,
    @SerializedName("accessibility_caption")
    val accessibilityCaption: Any?,
    @SerializedName("video_url")
    val videoUrl: String?
)

data class SharingFrictionInfo2(
    @SerializedName("should_have_sharing_friction")
    val shouldHaveSharingFriction: Boolean,
    @SerializedName("bloks_app_url")
    val bloksAppUrl: Any?,
)

data class Dimensions2(
    val height: Long,
    val width: Long,
)

data class DisplayResource2(
    val src: String,
    @SerializedName("config_width")
    val configWidth: Long,
    @SerializedName("config_height")
    val configHeight: Long,
)

data class EdgeMediaToTaggedUser2(
    val edges: List<Edge6>,
)

data class Edge6(
    val node: Node6,
)

data class Node6(
    val user: User3,
    val x: Double,
    val y: Double,
)

data class User3(
    @SerializedName("full_name")
    val fullName: String,
    @SerializedName("followed_by_viewer")
    val followedByViewer: Boolean,
    val id: String,
    @SerializedName("is_verified")
    val isVerified: Boolean,
    @SerializedName("profile_pic_url")
    val profilePicUrl: String,
    val username: String,
)

data class DashInfo(
    @SerializedName("is_dash_eligible")
    val isDashEligible: Boolean,
    @SerializedName("video_dash_manifest")
    val videoDashManifest: String,
    @SerializedName("number_of_qualities")
    val numberOfQualities: Long,
)

data class Extensions(
    @SerializedName("is_final")
    val isFinal: Boolean,
)

data class UnrelatedData(
    val retry: Long,
    @SerializedName("id_acc")
    val idAcc: String,
    @SerializedName("proxy_info")
    val proxyInfo: String,
    @SerializedName("time_gen")
    val timeGen: Double,
)
