package com.pzbdownloaders.instabuddy.profile_screen_freature.data.model

import com.google.gson.annotations.SerializedName

data class AllStories(
    val reels: Reels,
    val status: String,
    @SerializedName("unrelated_data")
    val unrelatedData: UnrelatedDataStory,
)

data class Reels(
    @SerializedName("491527077")
    val n491527077: n491527077,
)

data class n491527077(
    val id: Long,
    @SerializedName("strong_id__")
    val strongId: String,
    @SerializedName("latest_reel_media")
    val latestReelMedia: Long,
    @SerializedName("expiring_at")
    val expiringAt: Long,
    val seen: Long,
    @SerializedName("can_reply")
    val canReply: Boolean,
    @SerializedName("can_gif_quick_reply")
    val canGifQuickReply: Boolean,
    @SerializedName("can_reshare")
    val canReshare: Boolean,
    @SerializedName("can_react_with_avatar")
    val canReactWithAvatar: Boolean,
    @SerializedName("reel_type")
    val reelType: String,
    @SerializedName("ad_expiry_timestamp_in_millis")
    val adExpiryTimestampInMillis: Any?,
    @SerializedName("is_cta_sticker_available")
    val isCtaStickerAvailable: Any?,
    @SerializedName("app_sticker_info")
    val appStickerInfo: Any?,
    @SerializedName("should_treat_link_sticker_as_cta")
    val shouldTreatLinkStickerAsCta: Any?,
    val user: UserStory,
    val items: List<ItemStory>,
    @SerializedName("prefetch_count")
    val prefetchCount: Long,
    @SerializedName("media_count")
    val mediaCount: Long,
    @SerializedName("media_ids")
    val mediaIds: List<Long>,
    @SerializedName("is_cacheable")
    val isCacheable: Boolean,
    @SerializedName("disabled_reply_types")
    val disabledReplyTypes: List<String>,
)

data class UserStory(
    val pk: Long,
    @SerializedName("pk_id")
    val pkId: String,
    @SerializedName("full_name")
    val fullName: String,
    @SerializedName("is_private")
    val isPrivate: Boolean,
    @SerializedName("strong_id__")
    val strongId: String,
    val username: String,
    @SerializedName("interop_messaging_user_fbid")
    val interopMessagingUserFbid: Long,
    @SerializedName("is_verified")
    val isVerified: Boolean,
    @SerializedName("friendship_status")
    val friendshipStatus: FriendshipStatusStory,
    @SerializedName("profile_pic_id")
    val profilePicId: String,
    @SerializedName("profile_pic_url")
    val profilePicUrl: String,
)

data class FriendshipStatusStory(
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

data class ItemStory(
    @SerializedName("taken_at")
    val takenAt: Long,
    val pk: Long,
    val id: String,
    @SerializedName("caption_position")
    val captionPosition: Long,
    @SerializedName("is_reel_media")
    val isReelMedia: Boolean,
    @SerializedName("is_terminal_video_segment")
    val isTerminalVideoSegment: Boolean,
    @SerializedName("device_timestamp")
    val deviceTimestamp: Long,
    @SerializedName("client_cache_key")
    val clientCacheKey: String,
    @SerializedName("filter_type")
    val filterType: Long,
    @SerializedName("caption_is_edited")
    val captionIsEdited: Boolean,
    @SerializedName("like_and_view_counts_disabled")
    val likeAndViewCountsDisabled: Boolean,
    @SerializedName("strong_id__")
    val strongId: String,
    @SerializedName("is_reshare_of_text_post_app_media_in_ig")
    val isReshareOfTextPostAppMediaInIg: Boolean,
    @SerializedName("is_post_live_clips_media")
    val isPostLiveClipsMedia: Boolean,
    @SerializedName("imported_taken_at")
    val importedTakenAt: Long?,
    @SerializedName("deleted_reason")
    val deletedReason: Long,
    @SerializedName("integrity_review_decision")
    val integrityReviewDecision: String,
    @SerializedName("has_shared_to_fb")
    val hasSharedToFb: Long,
    @SerializedName("expiring_at")
    val expiringAt: Long,
    @SerializedName("is_unified_video")
    val isUnifiedVideo: Boolean,
    @SerializedName("should_request_ads")
    val shouldRequestAds: Boolean,
    @SerializedName("is_visual_reply_commenter_notice_enabled")
    val isVisualReplyCommenterNoticeEnabled: Boolean,
    @SerializedName("commerciality_status")
    val commercialityStatus: String,
    @SerializedName("explore_hide_comments")
    val exploreHideComments: Boolean,
    @SerializedName("shop_routing_user_id")
    val shopRoutingUserId: Any?,
    @SerializedName("can_see_insights_as_brand")
    val canSeeInsightsAsBrand: Boolean,
    @SerializedName("is_organic_product_tagging_eligible")
    val isOrganicProductTaggingEligible: Boolean,
    val likers: List<Any?>,
    @SerializedName("media_type")
    val mediaType: Long,
    val code: String,
    val caption: Any?,
    @SerializedName("clips_tab_pinned_user_ids")
    val clipsTabPinnedUserIds: List<Any?>,
    @SerializedName("comment_inform_treatment")
    val commentInformTreatment: CommentInformTreatmentStory,
    @SerializedName("fundraiser_tag")
    val fundraiserTag: FundraiserTagStory,
    @SerializedName("sharing_friction_info")
    val sharingFrictionInfo: SharingFrictionInfoStory,
    @SerializedName("has_translation")
    val hasTranslation: Boolean,
    @SerializedName("original_media_has_visual_reply_media")
    val originalMediaHasVisualReplyMedia: Boolean,
    @SerializedName("can_viewer_save")
    val canViewerSave: Boolean,
    @SerializedName("is_in_profile_grid")
    val isInProfileGrid: Boolean,
    @SerializedName("profile_grid_control_enabled")
    val profileGridControlEnabled: Boolean,
    @SerializedName("is_comments_gif_composer_enabled")
    val isCommentsGifComposerEnabled: Boolean,
    @SerializedName("product_suggestions")
    val productSuggestions: List<Any?>,
    @SerializedName("image_versions2")
    val imageVersions2: ImageVersions2Story,
    @SerializedName("original_width")
    val originalWidth: Long,
    @SerializedName("original_height")
    val originalHeight: Long,
    @SerializedName("product_type")
    val productType: String,
    @SerializedName("is_paid_partnership")
    val isPaidPartnership: Boolean,
    @SerializedName("music_metadata")
    val musicMetadata: Any?,
    @SerializedName("organic_tracking_token")
    val organicTrackingToken: String,
    @SerializedName("ig_media_sharing_disabled")
    val igMediaSharingDisabled: Boolean,
    val crosspost: List<String>?,
    @SerializedName("is_open_to_public_submission")
    val isOpenToPublicSubmission: Boolean,
    @SerializedName("has_delayed_metadata")
    val hasDelayedMetadata: Boolean,
    @SerializedName("is_auto_created")
    val isAutoCreated: Boolean,
    @SerializedName("is_cutout_sticker_allowed")
    val isCutoutStickerAllowed: Boolean,
    val user: User2Story,
    @SerializedName("can_reshare")
    val canReshare: Boolean,
    @SerializedName("can_reply")
    val canReply: Boolean,
    @SerializedName("can_send_prompt")
    val canSendPrompt: Boolean,
    @SerializedName("is_first_take")
    val isFirstTake: Boolean,
    @SerializedName("is_rollcall_v2")
    val isRollcallV2: Boolean,
    @SerializedName("is_superlative")
    val isSuperlative: Boolean,
    @SerializedName("is_fb_post_from_fb_story")
    val isFbPostFromFbStory: Boolean,
    @SerializedName("can_play_spotify_audio")
    val canPlaySpotifyAudio: Boolean,
    @SerializedName("archive_story_deletion_ts")
    val archiveStoryDeletionTs: Long,
    @SerializedName("created_from_add_yours_browsing")
    val createdFromAddYoursBrowsing: Boolean,
    @SerializedName("reel_mentions")
    val reelMentions: List<ReelMention>?,
    @SerializedName("has_liked")
    val hasLiked: Boolean,
    @SerializedName("supports_reel_reactions")
    val supportsReelReactions: Boolean,
    @SerializedName("can_send_custom_emojis")
    val canSendCustomEmojis: Boolean,
    @SerializedName("show_one_tap_fb_share_tooltip")
    val showOneTapFbShareTooltip: Boolean,
    @SerializedName("story_link_stickers")
    val storyLinkStickers: List<StoryLinkSticker>?,
    val location: LocationStory?,
    val lng: Double?,
    val lat: Double?,
    @SerializedName("is_dash_eligible")
    val isDashEligible: Long?,
    @SerializedName("video_dash_manifest")
    val videoDashManifest: String?,
    @SerializedName("video_codec")
    val videoCodec: String?,
    @SerializedName("number_of_qualities")
    val numberOfQualities: Long?,
    @SerializedName("video_versions")
    val videoVersions: List<VideoVersionStory>?,
    @SerializedName("has_audio")
    val hasAudio: Boolean?,
    @SerializedName("video_duration")
    val videoDuration: Double?,
    @SerializedName("story_locations")
    val storyLocations: List<StoryLocation>?,
    @SerializedName("attribution_content_url")
    val attributionContentUrl: String?,
    @SerializedName("story_feed_media")
    val storyFeedMedia: List<StoryFeedMedum>?,
    @SerializedName("segmented_video_group_id")
    val segmentedVideoGroupId: String?,
    @SerializedName("reshared_story_media_author")
    val resharedStoryMediaAuthor: ResharedStoryMediaAuthor?,
)

data class CommentInformTreatmentStory(
    @SerializedName("should_have_inform_treatment")
    val shouldHaveInformTreatment: Boolean,
    val text: String,
    val url: Any?,
    @SerializedName("action_type")
    val actionType: Any?,
)

data class FundraiserTagStory(
    @SerializedName("has_standalone_fundraiser")
    val hasStandaloneFundraiser: Boolean,
)

data class SharingFrictionInfoStory(
    @SerializedName("should_have_sharing_friction")
    val shouldHaveSharingFriction: Boolean,
    @SerializedName("bloks_app_url")
    val bloksAppUrl: Any?,
    @SerializedName("sharing_friction_payload")
    val sharingFrictionPayload: Any?,
)

data class ImageVersions2Story(
    val candidates: List<CandidateStory>,
)

data class CandidateStory(
    val width: Long,
    val height: Long,
    val url: String,
    @SerializedName("scans_profile")
    val scansProfile: String,
    @SerializedName("estimated_scans_sizes")
    val estimatedScansSizes: List<Long>?,
)

data class User2Story(
    val pk: Long,
    @SerializedName("is_private")
    val isPrivate: Boolean,
)

data class ReelMention(
    val x: Double,
    val y: Double,
    val z: Long,
    val width: Double,
    val height: Double,
    val rotation: Long,
    @SerializedName("is_pinned")
    val isPinned: Long,
    @SerializedName("is_hidden")
    val isHidden: Long,
    @SerializedName("display_type")
    val displayType: String,
    @SerializedName("is_sticker")
    val isSticker: Long,
    @SerializedName("is_fb_sticker")
    val isFbSticker: Long,
    @SerializedName("start_time_ms")
    val startTimeMs: Long,
    @SerializedName("end_time_ms")
    val endTimeMs: Long,
    val user: User3Story,
)

data class User3Story(
    val pk: Long,
    @SerializedName("pk_id")
    val pkId: String,
    @SerializedName("full_name")
    val fullName: String,
    @SerializedName("is_private")
    val isPrivate: Boolean,
    @SerializedName("strong_id__")
    val strongId: String,
    val username: String,
    @SerializedName("is_verified")
    val isVerified: Boolean,
    @SerializedName("profile_pic_id")
    val profilePicId: String,
    @SerializedName("profile_pic_url")
    val profilePicUrl: String,
)

data class StoryLinkSticker(
    val x: Double,
    val y: Double,
    val z: Long,
    val width: Double,
    val height: Double,
    val rotation: Double,
    @SerializedName("is_pinned")
    val isPinned: Long,
    @SerializedName("is_hidden")
    val isHidden: Long,
    @SerializedName("is_sticker")
    val isSticker: Long,
    @SerializedName("is_fb_sticker")
    val isFbSticker: Long,
    @SerializedName("start_time_ms")
    val startTimeMs: Long,
    @SerializedName("end_time_ms")
    val endTimeMs: Long,
    @SerializedName("story_link")
    val storyLink: StoryLink,
)

data class StoryLink(
    @SerializedName("link_type")
    val linkType: String,
    val url: String,
    @SerializedName("link_title")
    val linkTitle: String,
    @SerializedName("display_url")
    val displayUrl: String,
)

data class LocationStory(
    val pk: Long,
    @SerializedName("short_name")
    val shortName: String,
    @SerializedName("facebook_places_id")
    val facebookPlacesId: Long,
    @SerializedName("external_source")
    val externalSource: String,
    val name: String,
    val address: String,
    val city: String,
    @SerializedName("has_viewer_saved")
    val hasViewerSaved: Boolean,
    val lng: Double,
    val lat: Double,
    @SerializedName("is_eligible_for_guides")
    val isEligibleForGuides: Boolean,
)

data class VideoVersionStory(
    val type: Long,
    val width: Long,
    val height: Long,
    val url: String,
    val id: String,
)

data class StoryLocation(
    val x: Double,
    val y: Double,
    val z: Long,
    val width: Double,
    val height: Double,
    val rotation: Long,
    @SerializedName("is_pinned")
    val isPinned: Long,
    @SerializedName("is_hidden")
    val isHidden: Long,
    @SerializedName("is_sticker")
    val isSticker: Long,
    @SerializedName("is_fb_sticker")
    val isFbSticker: Long,
    @SerializedName("start_time_ms")
    val startTimeMs: Long,
    @SerializedName("end_time_ms")
    val endTimeMs: Long,
    val location: Location2,
)

data class Location2(
    val pk: Long,
    @SerializedName("short_name")
    val shortName: String,
    @SerializedName("facebook_places_id")
    val facebookPlacesId: Long,
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

data class StoryFeedMedum(
    val x: Double,
    val y: Double,
    val z: Long,
    val width: Double,
    val height: Double,
    val rotation: Long,
    @SerializedName("is_pinned")
    val isPinned: Long,
    @SerializedName("is_hidden")
    val isHidden: Long,
    @SerializedName("is_sticker")
    val isSticker: Long,
    @SerializedName("is_fb_sticker")
    val isFbSticker: Long,
    @SerializedName("start_time_ms")
    val startTimeMs: Long,
    @SerializedName("end_time_ms")
    val endTimeMs: Long,
    @SerializedName("media_id")
    val mediaId: String,
    @SerializedName("product_type")
    val productType: String,
    @SerializedName("media_code")
    val mediaCode: String,
    @SerializedName("media_compound_str")
    val mediaCompoundStr: String,
    @SerializedName("clips_creation_entry_point")
    val clipsCreationEntryPoint: String?,
)

data class ResharedStoryMediaAuthor(
    val pk: Long,
    @SerializedName("pk_id")
    val pkId: String,
    @SerializedName("full_name")
    val fullName: String,
    @SerializedName("is_private")
    val isPrivate: Boolean,
    @SerializedName("strong_id__")
    val strongId: String,
    val username: String,
    @SerializedName("is_verified")
    val isVerified: Boolean,
    @SerializedName("profile_pic_id")
    val profilePicId: String,
    @SerializedName("profile_pic_url")
    val profilePicUrl: String,
)

data class UnrelatedDataStory(
    val retry: Long,
    @SerializedName("id_acc")
    val idAcc: String,
    @SerializedName("proxy_info")
    val proxyInfo: String,
    @SerializedName("time_gen")
    val timeGen: Double,
)

