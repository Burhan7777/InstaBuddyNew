package com.pzbdownloaders.instabuddy.profile_screen_freature.data.model

import com.google.gson.annotations.SerializedName


data class RootAllStories(
    val status: String,
    val response: ResponseStories,
)

data class ResponseStories(
    @SerializedName("status_code")
    val statusCode: Long,
    @SerializedName("content_type")
    val contentType: String,
    val body: BodyStories,
)

data class BodyStories(
    val reels: ReelsStories,
    @SerializedName("reels_media")
    val reelsMedia: List<ReelsMedumStories>,
    val status: String,
)

data class ReelsStories(
    @SerializedName("1587340758")
    val n1587340758: n1587340758,
)

data class n1587340758(
    val id: String,
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
    val user: UserStories,
    val items: List<ItemStories>,
    @SerializedName("is_nux")
    val isNux: Boolean,
    @SerializedName("prefetch_count")
    val prefetchCount: Long,
    @SerializedName("media_count")
    val mediaCount: Long,
    @SerializedName("media_ids")
    val mediaIds: List<String>,
    @SerializedName("is_cacheable")
    val isCacheable: Boolean,
    @SerializedName("disabled_reply_types")
    val disabledReplyTypes: List<String>,
)

data class UserStories(
    val pk: String,
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
    @SerializedName("friendship_status")
    val friendshipStatus: FriendshipStatusStories,
    @SerializedName("interop_messaging_user_fbid")
    val interopMessagingUserFbid: Long,
)

data class FriendshipStatusStories(
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

data class ItemStories(
    @SerializedName("taken_at")
    val takenAt: Long,
    val pk: String,
    val id: String,
    @SerializedName("caption_position")
    val captionPosition: Double,
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
    @SerializedName("mezql_token")
    val mezqlToken: String,
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
    val commentInformTreatment: CommentInformTreatmentStories,
    @SerializedName("sharing_friction_info")
    val sharingFrictionInfo: SharingFrictionInfoStories,
    @SerializedName("has_translation")
    val hasTranslation: Boolean,
    @SerializedName("original_media_has_visual_reply_media")
    val originalMediaHasVisualReplyMedia: Boolean,
    @SerializedName("fb_user_tags")
    val fbUserTags: FbUserTagsStories,
    @SerializedName("invited_coauthor_producers")
    val invitedCoauthorProducers: List<Any?>,
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
    val imageVersions2: ImageVersions2Stories,
    @SerializedName("original_width")
    val originalWidth: Long,
    @SerializedName("original_height")
    val originalHeight: Long,
    @SerializedName("enable_media_notes_production")
    val enableMediaNotesProduction: Boolean,
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
    val crosspost: List<String>,
    @SerializedName("open_carousel_submission_state")
    val openCarouselSubmissionState: String,
    @SerializedName("is_open_to_public_submission")
    val isOpenToPublicSubmission: Boolean,
    @SerializedName("has_delayed_metadata")
    val hasDelayedMetadata: Boolean,
    @SerializedName("is_auto_created")
    val isAutoCreated: Boolean,
    @SerializedName("is_cutout_sticker_allowed")
    val isCutoutStickerAllowed: Boolean,
    val owner: OwnerStories,
    @SerializedName("is_dash_eligible")
    val isDashEligible: Long,
    @SerializedName("video_dash_manifest")
    val videoDashManifest: String,
    @SerializedName("video_codec")
    val videoCodec: String,
    @SerializedName("number_of_qualities")
    val numberOfQualities: Long,
    @SerializedName("video_versions")
    val videoVersions: List<VideoVersionStories>,
    @SerializedName("video_duration")
    val videoDuration: Double,
    @SerializedName("has_audio")
    val hasAudio: Boolean,
    val user: User2Stories,
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
    @SerializedName("should_render_soundwave")
    val shouldRenderSoundwave: Boolean,
    @SerializedName("created_from_add_yours_browsing")
    val createdFromAddYoursBrowsing: Boolean,
    @SerializedName("story_reaction_stickers")
    val storyReactionStickers: List<StoryReactionStickerStories>?,
    @SerializedName("story_music_stickers")
    val storyMusicStickers: List<StoryMusicStickerStories>,
    @SerializedName("has_liked")
    val hasLiked: Boolean,
    @SerializedName("supports_reel_reactions")
    val supportsReelReactions: Boolean,
    @SerializedName("can_send_custom_emojis")
    val canSendCustomEmojis: Boolean,
    @SerializedName("show_one_tap_fb_share_tooltip")
    val showOneTapFbShareTooltip: Boolean,
    @SerializedName("imported_taken_at")
    val importedTakenAt: Long?,
    @SerializedName("story_link_stickers")
    val storyLinkStickers: List<StoryLinkStickerStories>?,
    @SerializedName("story_bloks_tappables")
    val storyBloksTappables: List<StoryBloksTappableStories>?,
    @SerializedName("story_bloks_stickers")
    val storyBloksStickers: List<StoryBloksStickerStories>?,
    val location: LocationStories?,
    val lng: Double?,
    val lat: Double?,
    @SerializedName("story_locations")
    val storyLocations: List<StoryLocationStories>?,
)

data class CommentInformTreatmentStories(
    @SerializedName("should_have_inform_treatment")
    val shouldHaveInformTreatment: Boolean,
    val text: String,
    val url: Any?,
    @SerializedName("action_type")
    val actionType: Any?,
)

data class SharingFrictionInfoStories(
    @SerializedName("should_have_sharing_friction")
    val shouldHaveSharingFriction: Boolean,
    @SerializedName("bloks_app_url")
    val bloksAppUrl: Any?,
    @SerializedName("sharing_friction_payload")
    val sharingFrictionPayload: Any?,
)

data class FbUserTagsStories(
    @SerializedName("in")
    val in_field: List<Any?>,
)

data class ImageVersions2Stories(
    val candidates: List<CandidateStories>,
)

data class CandidateStories(
    val width: Long,
    val height: Long,
    val url: String,
)

data class OwnerStories(
    val pk: String,
    @SerializedName("is_private")
    val isPrivate: Boolean,
)

data class VideoVersionStories(
    val type: Long,
    val width: Long,
    val height: Long,
    val url: String,
    val id: String,
)

data class User2Stories(
    val pk: String,
    @SerializedName("is_private")
    val isPrivate: Boolean,
)

data class StoryReactionStickerStories(
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
    val startTimeMs: Double,
    @SerializedName("end_time_ms")
    val endTimeMs: Double,
    @SerializedName("reaction_sticker")
    val reactionSticker: ReactionStickerStories,
)

data class ReactionStickerStories(
    val emoji: String,
    @SerializedName("viewer_has_reacted")
    val viewerHasReacted: Boolean,
)

data class StoryMusicStickerStories(
    val x: Double,
    val y: Double,
    val z: Long,
    val width: Double,
    val height: Double,
    val rotation: Double,
    val attribution: String,
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
    val startTimeMs: Double,
    @SerializedName("end_time_ms")
    val endTimeMs: Double,
    @SerializedName("music_asset_info")
    val musicAssetInfo: MusicAssetInfoStories,
)

data class MusicAssetInfoStories(
    @SerializedName("audio_asset_id")
    val audioAssetId: String,
    @SerializedName("audio_cluster_id")
    val audioClusterId: String,
    val id: String,
    val title: String,
    @SerializedName("sanitized_title")
    val sanitizedTitle: Any?,
    val subtitle: String,
    @SerializedName("display_artist")
    val displayArtist: String,
    @SerializedName("artist_id")
    val artistId: Any?,
    @SerializedName("is_explicit")
    val isExplicit: Boolean,
    @SerializedName("cover_artwork_uri")
    val coverArtworkUri: String,
    @SerializedName("cover_artwork_thumbnail_uri")
    val coverArtworkThumbnailUri: String,
    @SerializedName("progressive_download_url")
    val progressiveDownloadUrl: String,
    @SerializedName("reactive_audio_download_url")
    val reactiveAudioDownloadUrl: Any?,
    @SerializedName("fast_start_progressive_download_url")
    val fastStartProgressiveDownloadUrl: String,
    @SerializedName("web_30s_preview_download_url")
    val web30sPreviewDownloadUrl: Any?,
    @SerializedName("highlight_start_times_in_ms")
    val highlightStartTimesInMs: List<Long>,
    @SerializedName("dash_manifest")
    val dashManifest: Any?,
    @SerializedName("has_lyrics")
    val hasLyrics: Boolean,
    @SerializedName("duration_in_ms")
    val durationInMs: Long,
    @SerializedName("dark_message")
    val darkMessage: Any?,
    @SerializedName("allows_saving")
    val allowsSaving: Boolean,
    @SerializedName("ig_username")
    val igUsername: String,
    @SerializedName("is_eligible_for_audio_effects")
    val isEligibleForAudioEffects: Any?,
    @SerializedName("ig_artist")
    val igArtist: IgArtistStories,
    @SerializedName("placeholder_profile_pic_url")
    val placeholderProfilePicUrl: String,
    @SerializedName("should_mute_audio")
    val shouldMuteAudio: Boolean,
    @SerializedName("should_mute_audio_reason")
    val shouldMuteAudioReason: String,
    @SerializedName("should_mute_audio_reason_type")
    val shouldMuteAudioReasonType: Any?,
    @SerializedName("overlap_duration_in_ms")
    val overlapDurationInMs: Long,
    @SerializedName("audio_asset_start_time_in_ms")
    val audioAssetStartTimeInMs: Long,
    @SerializedName("is_bookmarked")
    val isBookmarked: Boolean,
    @SerializedName("allow_media_creation_with_music")
    val allowMediaCreationWithMusic: Boolean,
    @SerializedName("is_trending_in_clips")
    val isTrendingInClips: Boolean,
    @SerializedName("trend_rank")
    val trendRank: Any?,
    @SerializedName("formatted_clips_media_count")
    val formattedClipsMediaCount: Any?,
    @SerializedName("display_labels")
    val displayLabels: Any?,
    @SerializedName("should_allow_music_editing")
    val shouldAllowMusicEditing: Boolean,
    @SerializedName("audio_filter_infos")
    val audioFilterInfos: List<Any?>,
    @SerializedName("derived_content_id")
    val derivedContentId: Any?,
    @SerializedName("audio_muting_info")
    val audioMutingInfo: AudioMutingInfoStories,
    @SerializedName("contains_lyrics")
    val containsLyrics: Any?,
)

data class IgArtistStories(
    val pk: String,
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

data class AudioMutingInfoStories(
    @SerializedName("mute_audio")
    val muteAudio: Boolean,
    @SerializedName("mute_reason_str")
    val muteReasonStr: String,
    @SerializedName("allow_audio_editing")
    val allowAudioEditing: Boolean,
    @SerializedName("show_muted_audio_toast")
    val showMutedAudioToast: Boolean,
)

data class StoryLinkStickerStories(
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
    val startTimeMs: Double,
    @SerializedName("end_time_ms")
    val endTimeMs: Double,
    @SerializedName("story_link")
    val storyLink: StoryLinkStories,
)

data class StoryLinkStories(
    @SerializedName("link_type")
    val linkType: String,
    val url: String,
    @SerializedName("link_title")
    val linkTitle: String,
    @SerializedName("display_url")
    val displayUrl: String,
)

data class StoryBloksTappableStories(
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
    val startTimeMs: Double,
    @SerializedName("end_time_ms")
    val endTimeMs: Double,
    @SerializedName("bloks_tappable_sticker")
    val bloksTappableSticker: BloksTappableStickerStories,
)

data class BloksTappableStickerStories(
    val id: String,
    @SerializedName("bloks_app")
    val bloksApp: String,
    @SerializedName("should_preload")
    val shouldPreload: Boolean,
    @SerializedName("bloks_parameters")
    val bloksParameters: BloksParametersStories,
    @SerializedName("nux_tooltip_text")
    val nuxTooltipText: String,
    @SerializedName("show_tooltip_count")
    val showTooltipCount: Long,
    @SerializedName("action_tooltip_text")
    val actionTooltipText: Any?,
    @SerializedName("accessibility_hint")
    val accessibilityHint: Any?,
)

data class BloksParametersStories(
    @SerializedName("logging_surface")
    val loggingSurface: String,
    @SerializedName("logging_mechanism")
    val loggingMechanism: String,
)

data class StoryBloksStickerStories(
    @SerializedName("bloks_sticker")
    val bloksSticker: BloksStickerStories,
    val x: Double,
    val y: Double,
    val z: Long,
    val width: Double,
    val height: Double,
    val rotation: Double,
)

data class BloksStickerStories(
    val id: String,
    @SerializedName("app_id")
    val appId: String,
    @SerializedName("sticker_data")
    val stickerData: StickerDataStories,
    @SerializedName("bloks_sticker_type")
    val bloksStickerType: String,
)

data class StickerDataStories(
    @SerializedName("ig_mention")
    val igMention: IgMentionStories,
)

data class IgMentionStories(
    @SerializedName("account_id")
    val accountId: String,
    val username: String,
    @SerializedName("full_name")
    val fullName: String,
    @SerializedName("profile_pic_url")
    val profilePicUrl: String,
)

data class LocationStories(
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
    @SerializedName("is_eligible_for_guides")
    val isEligibleForGuides: Boolean,
)

data class StoryLocationStories(
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
    val startTimeMs: Double,
    @SerializedName("end_time_ms")
    val endTimeMs: Double,
    val location: Location2Stories,
)

data class Location2Stories(
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

data class ReelsMedumStories(
    val id: String,
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
    val user: User3Stories,
    val items: List<Item2Stories>,
    @SerializedName("is_nux")
    val isNux: Boolean,
    @SerializedName("prefetch_count")
    val prefetchCount: Long,
    @SerializedName("media_count")
    val mediaCount: Long,
    @SerializedName("media_ids")
    val mediaIds: List<String>,
    @SerializedName("is_cacheable")
    val isCacheable: Boolean,
    @SerializedName("disabled_reply_types")
    val disabledReplyTypes: List<String>,
)

data class User3Stories(
    val pk: String,
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
    @SerializedName("friendship_status")
    val friendshipStatus: FriendshipStatus2Stories,
    @SerializedName("interop_messaging_user_fbid")
    val interopMessagingUserFbid: Long,
)

data class FriendshipStatus2Stories(
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

data class Item2Stories(
    @SerializedName("taken_at")
    val takenAt: Long,
    val pk: String,
    val id: String,
    @SerializedName("caption_position")
    val captionPosition: Double,
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
    @SerializedName("mezql_token")
    val mezqlToken: String,
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
    val commentInformTreatment: CommentInformTreatment2Stories,
    @SerializedName("sharing_friction_info")
    val sharingFrictionInfo: SharingFrictionInfo2Storie,
    @SerializedName("has_translation")
    val hasTranslation: Boolean,
    @SerializedName("original_media_has_visual_reply_media")
    val originalMediaHasVisualReplyMedia: Boolean,
    @SerializedName("fb_user_tags")
    val fbUserTags: FbUserTags2Stories,
    @SerializedName("invited_coauthor_producers")
    val invitedCoauthorProducers: List<Any?>,
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
    val imageVersions2: ImageVersions22Stories,
    @SerializedName("original_width")
    val originalWidth: Long,
    @SerializedName("original_height")
    val originalHeight: Long,
    @SerializedName("enable_media_notes_production")
    val enableMediaNotesProduction: Boolean,
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
    val crosspost: List<String>,
    @SerializedName("open_carousel_submission_state")
    val openCarouselSubmissionState: String,
    @SerializedName("is_open_to_public_submission")
    val isOpenToPublicSubmission: Boolean,
    @SerializedName("has_delayed_metadata")
    val hasDelayedMetadata: Boolean,
    @SerializedName("is_auto_created")
    val isAutoCreated: Boolean,
    @SerializedName("is_cutout_sticker_allowed")
    val isCutoutStickerAllowed: Boolean,
    val owner: Owner2Stories,
    @SerializedName("is_dash_eligible")
    val isDashEligible: Long,
    @SerializedName("video_dash_manifest")
    val videoDashManifest: String,
    @SerializedName("video_codec")
    val videoCodec: String,
    @SerializedName("number_of_qualities")
    val numberOfQualities: Long,
    @SerializedName("video_versions")
    val videoVersions: List<VideoVersion2Stories>,
    @SerializedName("video_duration")
    val videoDuration: Double,
    @SerializedName("has_audio")
    val hasAudio: Boolean,
    val user: User4Stories,
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
    @SerializedName("should_render_soundwave")
    val shouldRenderSoundwave: Boolean,
    @SerializedName("created_from_add_yours_browsing")
    val createdFromAddYoursBrowsing: Boolean,
    @SerializedName("story_reaction_stickers")
    val storyReactionStickers: List<StoryReactionSticker2Stories>?,
    @SerializedName("story_music_stickers")
    val storyMusicStickers: List<StoryMusicSticker2Stories>,
    @SerializedName("has_liked")
    val hasLiked: Boolean,
    @SerializedName("supports_reel_reactions")
    val supportsReelReactions: Boolean,
    @SerializedName("can_send_custom_emojis")
    val canSendCustomEmojis: Boolean,
    @SerializedName("show_one_tap_fb_share_tooltip")
    val showOneTapFbShareTooltip: Boolean,
    @SerializedName("imported_taken_at")
    val importedTakenAt: Long?,
    @SerializedName("story_link_stickers")
    val storyLinkStickers: List<StoryLinkSticker2Stories>?,
    @SerializedName("story_bloks_tappables")
    val storyBloksTappables: List<StoryBloksTappable2Stories>?,
    @SerializedName("story_bloks_stickers")
    val storyBloksStickers: List<StoryBloksSticker2Stories>?,
    val location: Location3Stories?,
    val lng: Double?,
    val lat: Double?,
    @SerializedName("story_locations")
    val storyLocations: List<StoryLocation2Stories>?,
)

data class CommentInformTreatment2Stories(
    @SerializedName("should_have_inform_treatment")
    val shouldHaveInformTreatment: Boolean,
    val text: String,
    val url: Any?,
    @SerializedName("action_type")
    val actionType: Any?,
)

data class SharingFrictionInfo2Storie(
    @SerializedName("should_have_sharing_friction")
    val shouldHaveSharingFriction: Boolean,
    @SerializedName("bloks_app_url")
    val bloksAppUrl: Any?,
    @SerializedName("sharing_friction_payload")
    val sharingFrictionPayload: Any?,
)

data class FbUserTags2Stories(
    @SerializedName("in")
    val in_field: List<Any?>,
)

data class ImageVersions22Stories(
    val candidates: List<Candidate2Stories>,
)

data class Candidate2Stories(
    val width: Long,
    val height: Long,
    val url: String,
)

data class Owner2Stories(
    val pk: String,
    @SerializedName("is_private")
    val isPrivate: Boolean,
)

data class VideoVersion2Stories(
    val type: Long,
    val width: Long,
    val height: Long,
    val url: String,
    val id: String,
)

data class User4Stories(
    val pk: String,
    @SerializedName("is_private")
    val isPrivate: Boolean,
)

data class StoryReactionSticker2Stories(
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
    val startTimeMs: Double,
    @SerializedName("end_time_ms")
    val endTimeMs: Double,
    @SerializedName("reaction_sticker")
    val reactionSticker: ReactionSticker2Stories,
)

data class ReactionSticker2Stories(
    val emoji: String,
    @SerializedName("viewer_has_reacted")
    val viewerHasReacted: Boolean,
)

data class StoryMusicSticker2Stories(
    val x: Double,
    val y: Double,
    val z: Long,
    val width: Double,
    val height: Double,
    val rotation: Double,
    val attribution: String,
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
    val startTimeMs: Double,
    @SerializedName("end_time_ms")
    val endTimeMs: Double,
    @SerializedName("music_asset_info")
    val musicAssetInfo: MusicAssetInfo2Stories,
)

data class MusicAssetInfo2Stories(
    @SerializedName("audio_asset_id")
    val audioAssetId: String,
    @SerializedName("audio_cluster_id")
    val audioClusterId: String,
    val id: String,
    val title: String,
    @SerializedName("sanitized_title")
    val sanitizedTitle: Any?,
    val subtitle: String,
    @SerializedName("display_artist")
    val displayArtist: String,
    @SerializedName("artist_id")
    val artistId: Any?,
    @SerializedName("is_explicit")
    val isExplicit: Boolean,
    @SerializedName("cover_artwork_uri")
    val coverArtworkUri: String,
    @SerializedName("cover_artwork_thumbnail_uri")
    val coverArtworkThumbnailUri: String,
    @SerializedName("progressive_download_url")
    val progressiveDownloadUrl: String,
    @SerializedName("reactive_audio_download_url")
    val reactiveAudioDownloadUrl: Any?,
    @SerializedName("fast_start_progressive_download_url")
    val fastStartProgressiveDownloadUrl: String,
    @SerializedName("web_30s_preview_download_url")
    val web30sPreviewDownloadUrl: Any?,
    @SerializedName("highlight_start_times_in_ms")
    val highlightStartTimesInMs: List<Long>,
    @SerializedName("dash_manifest")
    val dashManifest: Any?,
    @SerializedName("has_lyrics")
    val hasLyrics: Boolean,
    @SerializedName("duration_in_ms")
    val durationInMs: Long,
    @SerializedName("dark_message")
    val darkMessage: Any?,
    @SerializedName("allows_saving")
    val allowsSaving: Boolean,
    @SerializedName("ig_username")
    val igUsername: String,
    @SerializedName("is_eligible_for_audio_effects")
    val isEligibleForAudioEffects: Any?,
    @SerializedName("ig_artist")
    val igArtist: IgArtist2Stories,
    @SerializedName("placeholder_profile_pic_url")
    val placeholderProfilePicUrl: String,
    @SerializedName("should_mute_audio")
    val shouldMuteAudio: Boolean,
    @SerializedName("should_mute_audio_reason")
    val shouldMuteAudioReason: String,
    @SerializedName("should_mute_audio_reason_type")
    val shouldMuteAudioReasonType: Any?,
    @SerializedName("overlap_duration_in_ms")
    val overlapDurationInMs: Long,
    @SerializedName("audio_asset_start_time_in_ms")
    val audioAssetStartTimeInMs: Long,
    @SerializedName("is_bookmarked")
    val isBookmarked: Boolean,
    @SerializedName("allow_media_creation_with_music")
    val allowMediaCreationWithMusic: Boolean,
    @SerializedName("is_trending_in_clips")
    val isTrendingInClips: Boolean,
    @SerializedName("trend_rank")
    val trendRank: Any?,
    @SerializedName("formatted_clips_media_count")
    val formattedClipsMediaCount: Any?,
    @SerializedName("display_labels")
    val displayLabels: Any?,
    @SerializedName("should_allow_music_editing")
    val shouldAllowMusicEditing: Boolean,
    @SerializedName("audio_filter_infos")
    val audioFilterInfos: List<Any?>,
    @SerializedName("derived_content_id")
    val derivedContentId: Any?,
    @SerializedName("audio_muting_info")
    val audioMutingInfo: AudioMutingInfo2Stories,
    @SerializedName("contains_lyrics")
    val containsLyrics: Any?,
)

data class IgArtist2Stories(
    val pk: String,
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

data class AudioMutingInfo2Stories(
    @SerializedName("mute_audio")
    val muteAudio: Boolean,
    @SerializedName("mute_reason_str")
    val muteReasonStr: String,
    @SerializedName("allow_audio_editing")
    val allowAudioEditing: Boolean,
    @SerializedName("show_muted_audio_toast")
    val showMutedAudioToast: Boolean,
)

data class StoryLinkSticker2Stories(
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
    val startTimeMs: Double,
    @SerializedName("end_time_ms")
    val endTimeMs: Double,
    @SerializedName("story_link")
    val storyLink: StoryLink2Stories,
)

data class StoryLink2Stories(
    @SerializedName("link_type")
    val linkType: String,
    val url: String,
    @SerializedName("link_title")
    val linkTitle: String,
    @SerializedName("display_url")
    val displayUrl: String,
)

data class StoryBloksTappable2Stories(
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
    val startTimeMs: Double,
    @SerializedName("end_time_ms")
    val endTimeMs: Double,
    @SerializedName("bloks_tappable_sticker")
    val bloksTappableSticker: BloksTappableSticker2Stories,
)

data class BloksTappableSticker2Stories(
    val id: String,
    @SerializedName("bloks_app")
    val bloksApp: String,
    @SerializedName("should_preload")
    val shouldPreload: Boolean,
    @SerializedName("bloks_parameters")
    val bloksParameters: BloksParameters2Stories,
    @SerializedName("nux_tooltip_text")
    val nuxTooltipText: String,
    @SerializedName("show_tooltip_count")
    val showTooltipCount: Long,
    @SerializedName("action_tooltip_text")
    val actionTooltipText: Any?,
    @SerializedName("accessibility_hint")
    val accessibilityHint: Any?,
)

data class BloksParameters2Stories(
    @SerializedName("logging_surface")
    val loggingSurface: String,
    @SerializedName("logging_mechanism")
    val loggingMechanism: String,
)

data class StoryBloksSticker2Stories(
    @SerializedName("bloks_sticker")
    val bloksSticker: BloksSticker2Stories,
    val x: Double,
    val y: Double,
    val z: Long,
    val width: Double,
    val height: Double,
    val rotation: Double,
)

data class BloksSticker2Stories(
    val id: String,
    @SerializedName("app_id")
    val appId: String,
    @SerializedName("sticker_data")
    val stickerData: StickerData2Stories,
    @SerializedName("bloks_sticker_type")
    val bloksStickerType: String,
)

data class StickerData2Stories(
    @SerializedName("ig_mention")
    val igMention: IgMention2Stories,
)

data class IgMention2Stories(
    @SerializedName("account_id")
    val accountId: String,
    val username: String,
    @SerializedName("full_name")
    val fullName: String,
    @SerializedName("profile_pic_url")
    val profilePicUrl: String,
)

data class Location3Stories(
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
    @SerializedName("is_eligible_for_guides")
    val isEligibleForGuides: Boolean,
)

data class StoryLocation2Stories(
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
    val startTimeMs: Double,
    @SerializedName("end_time_ms")
    val endTimeMs: Double,
    val location: Location4Stories,
)

data class Location4Stories(
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
