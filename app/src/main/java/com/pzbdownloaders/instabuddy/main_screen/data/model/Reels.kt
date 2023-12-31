package com.pzbdownloaders.instabuddy.main_screen.data.model

import com.google.gson.annotations.SerializedName

// ILLUSION API

/* 
data class Reels(
    val video_url: String
)
//ILLUSION API
//
*/


data class RootReel(
    val status: String,
    val response: ResponseReel,
)

data class ResponseReel(
    @SerializedName("status_code")
    val statusCode: Long,
    @SerializedName("content_type")
    val contentType: String,
    val body: BodyReel,
)

data class BodyReel(
    val items: List<ItemReel>,
    @SerializedName("num_results")
    val numResults: Long,
    @SerializedName("more_available")
    val moreAvailable: Boolean,
    @SerializedName("auto_load_more_enabled")
    val autoLoadMoreEnabled: Boolean,
    val status: String,
)

data class ItemReel(
    @SerializedName("taken_at")
    val takenAt: Long,
    val pk: String,
    val id: String,
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
    @SerializedName("fb_like_count")
    val fbLikeCount: Long,
    @SerializedName("has_liked")
    val hasLiked: Boolean,
    @SerializedName("has_privately_liked")
    val hasPrivatelyLiked: Boolean,
    @SerializedName("like_count")
    val likeCount: Long,
    @SerializedName("facepile_top_likers")
    val facepileTopLikers: List<Any?>,
    @SerializedName("top_likers")
    val topLikers: List<Any?>,
    @SerializedName("media_type")
    val mediaType: Long,
    val code: String,
    @SerializedName("can_viewer_reshare")
    val canViewerReshare: Boolean,
    val caption: CaptionReel,
    @SerializedName("clips_tab_pinned_user_ids")
    val clipsTabPinnedUserIds: List<Any?>,
    @SerializedName("comment_inform_treatment")
    val commentInformTreatment: CommentInformTreatmentReel,
    @SerializedName("sharing_friction_info")
    val sharingFrictionInfo: SharingFrictionInfoReel,
    @SerializedName("play_count")
    val playCount: Long,
    @SerializedName("fb_play_count")
    val fbPlayCount: Long,
    @SerializedName("media_appreciation_settings")
    val mediaAppreciationSettings: MediaAppreciationSettings,
    @SerializedName("original_media_has_visual_reply_media")
    val originalMediaHasVisualReplyMedia: Boolean,
    @SerializedName("fb_user_tags")
    val fbUserTags: FbUserTagsReel,
    @SerializedName("invited_coauthor_producers")
    val invitedCoauthorProducers: List<Any?>,
    @SerializedName("can_viewer_save")
    val canViewerSave: Boolean,
    @SerializedName("is_in_profile_grid")
    val isInProfileGrid: Boolean,
    @SerializedName("profile_grid_control_enabled")
    val profileGridControlEnabled: Boolean,
    @SerializedName("featured_products")
    val featuredProducts: List<Any?>,
    @SerializedName("is_comments_gif_composer_enabled")
    val isCommentsGifComposerEnabled: Boolean,
    @SerializedName("highlights_info")
    val highlightsInfo: HighlightsInfoReel,
    @SerializedName("media_cropping_info")
    val mediaCroppingInfo: MediaCroppingInfo,
    @SerializedName("product_suggestions")
    val productSuggestions: List<Any?>,
    val user: User2Reel,
    @SerializedName("image_versions2")
    val imageVersions2: ImageVersions2Reel,
    @SerializedName("original_width")
    val originalWidth: Long,
    @SerializedName("original_height")
    val originalHeight: Long,
    @SerializedName("is_artist_pick")
    val isArtistPick: Boolean,
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
    @SerializedName("is_third_party_downloads_eligible")
    val isThirdPartyDownloadsEligible: Boolean,
    @SerializedName("ig_media_sharing_disabled")
    val igMediaSharingDisabled: Boolean,
    @SerializedName("open_carousel_submission_state")
    val openCarouselSubmissionState: String,
    @SerializedName("is_open_to_public_submission")
    val isOpenToPublicSubmission: Boolean,
    @SerializedName("comment_threading_enabled")
    val commentThreadingEnabled: Boolean,
    @SerializedName("max_num_visible_preview_comments")
    val maxNumVisiblePreviewComments: Long,
    @SerializedName("has_more_comments")
    val hasMoreComments: Boolean,
    @SerializedName("preview_comments")
    val previewComments: List<Any?>,
    val comments: List<Any?>,
    @SerializedName("comment_count")
    val commentCount: Long,
    @SerializedName("can_view_more_preview_comments")
    val canViewMorePreviewComments: Boolean,
    @SerializedName("hide_view_all_comment_entrypoint")
    val hideViewAllCommentEntrypoint: Boolean,
    @SerializedName("inline_composer_display_condition")
    val inlineComposerDisplayCondition: String,
    @SerializedName("has_delayed_metadata")
    val hasDelayedMetadata: Boolean,
    @SerializedName("is_auto_created")
    val isAutoCreated: Boolean,
    @SerializedName("is_quiet_post")
    val isQuietPost: Boolean,
    @SerializedName("is_cutout_sticker_allowed")
    val isCutoutStickerAllowed: Boolean,
    @SerializedName("enable_waist")
    val enableWaist: Boolean,
    val owner: OwnerReel,
    @SerializedName("is_dash_eligible")
    val isDashEligible: Long,
    @SerializedName("video_dash_manifest")
    val videoDashManifest: String,
    @SerializedName("video_codec")
    val videoCodec: String,
    @SerializedName("number_of_qualities")
    val numberOfQualities: Long,
    @SerializedName("video_versions")
    val videoVersions: List<VideoVersion>,
    @SerializedName("video_duration")
    val videoDuration: Double,
    @SerializedName("has_audio")
    val hasAudio: Boolean,
    @SerializedName("clips_metadata")
    val clipsMetadata: ClipsMetadata,
)

data class CaptionReel(
    val pk: String,
    @SerializedName("user_id")
    val userId: String,
    val user: UserReel,
    val type: Long,
    val text: String,
    @SerializedName("did_report_as_spam")
    val didReportAsSpam: Boolean,
    @SerializedName("created_at")
    val createdAt: Long,
    @SerializedName("created_at_utc")
    val createdAtUtc: Long,
    @SerializedName("content_type")
    val contentType: String,
    val status: String,
    @SerializedName("bit_flags")
    val bitFlags: Long,
    @SerializedName("share_enabled")
    val shareEnabled: Boolean,
    @SerializedName("is_ranked_comment")
    val isRankedComment: Boolean,
    @SerializedName("is_covered")
    val isCovered: Boolean,
    @SerializedName("private_reply_status")
    val privateReplyStatus: Long,
    @SerializedName("media_id")
    val mediaId: String,
)

data class UserReel(
    @SerializedName("fbid_v2")
    val fbidV2: String,
    @SerializedName("feed_post_reshare_disabled")
    val feedPostReshareDisabled: Boolean,
    @SerializedName("full_name")
    val fullName: String,
    val id: String,
    @SerializedName("is_private")
    val isPrivate: Boolean,
    @SerializedName("is_unpublished")
    val isUnpublished: Boolean,
    val pk: String,
    @SerializedName("pk_id")
    val pkId: String,
    @SerializedName("show_account_transparency_details")
    val showAccountTransparencyDetails: Boolean,
    @SerializedName("strong_id__")
    val strongId: String,
    @SerializedName("third_party_downloads_enabled")
    val thirdPartyDownloadsEnabled: Long,
    @SerializedName("account_badges")
    val accountBadges: List<Any?>,
    @SerializedName("fan_club_info")
    val fanClubInfo: FanClubInfoReel,
    @SerializedName("friendship_status")
    val friendshipStatus: FriendshipStatusReel,
    @SerializedName("has_anonymous_profile_picture")
    val hasAnonymousProfilePicture: Boolean,
    @SerializedName("hd_profile_pic_url_info")
    val hdProfilePicUrlInfo: HdProfilePicUrlInfoReel,
    @SerializedName("hd_profile_pic_versions")
    val hdProfilePicVersions: List<HdProfilePicVersionReel>,
    @SerializedName("is_favorite")
    val isFavorite: Boolean,
    @SerializedName("is_verified")
    val isVerified: Boolean,
    @SerializedName("latest_reel_media")
    val latestReelMedia: Long,
    @SerializedName("profile_pic_id")
    val profilePicId: String,
    @SerializedName("profile_pic_url")
    val profilePicUrl: String,
    @SerializedName("transparency_product_enabled")
    val transparencyProductEnabled: Boolean,
    val username: String,
)

data class FanClubInfoReel(
    @SerializedName("fan_club_id")
    val fanClubId: Any?,
    @SerializedName("fan_club_name")
    val fanClubName: Any?,
    @SerializedName("is_fan_club_referral_eligible")
    val isFanClubReferralEligible: Any?,
    @SerializedName("fan_consideration_page_revamp_eligiblity")
    val fanConsiderationPageRevampEligiblity: Any?,
    @SerializedName("is_fan_club_gifting_eligible")
    val isFanClubGiftingEligible: Any?,
    @SerializedName("subscriber_count")
    val subscriberCount: Any?,
    @SerializedName("connected_member_count")
    val connectedMemberCount: Any?,
    @SerializedName("autosave_to_exclusive_highlight")
    val autosaveToExclusiveHighlight: Any?,
    @SerializedName("has_enough_subscribers_for_ssc")
    val hasEnoughSubscribersForSsc: Any?,
)

data class FriendshipStatusReel(
    val following: Boolean,
    @SerializedName("is_bestie")
    val isBestie: Boolean,
    @SerializedName("is_restricted")
    val isRestricted: Boolean,
    @SerializedName("is_feed_favorite")
    val isFeedFavorite: Boolean,
)

data class HdProfilePicUrlInfoReel(
    val url: String,
    val width: Long,
    val height: Long,
)

data class HdProfilePicVersionReel(
    val width: Long,
    val height: Long,
    val url: String,
)

data class CommentInformTreatmentReel(
    @SerializedName("should_have_inform_treatment")
    val shouldHaveInformTreatment: Boolean,
    val text: String,
    val url: Any?,
    @SerializedName("action_type")
    val actionType: Any?,
)

data class SharingFrictionInfoReel(
    @SerializedName("should_have_sharing_friction")
    val shouldHaveSharingFriction: Boolean,
    @SerializedName("bloks_app_url")
    val bloksAppUrl: Any?,
    @SerializedName("sharing_friction_payload")
    val sharingFrictionPayload: Any?,
)

data class MediaAppreciationSettings(
    @SerializedName("media_gifting_state")
    val mediaGiftingState: String,
    @SerializedName("gift_count_visibility")
    val giftCountVisibility: String,
)

data class FbUserTagsReel(
    @SerializedName("in")
    val in_field: List<Any?>,
)

data class HighlightsInfoReel(
    @SerializedName("added_to")
    val addedTo: List<Any?>,
)

data class MediaCroppingInfo(
    @SerializedName("square_crop")
    val squareCrop: SquareCrop,
)

data class SquareCrop(
    @SerializedName("crop_left")
    val cropLeft: Double,
    @SerializedName("crop_right")
    val cropRight: Double,
    @SerializedName("crop_top")
    val cropTop: Double,
    @SerializedName("crop_bottom")
    val cropBottom: Double,
)

data class User2Reel(
    @SerializedName("fbid_v2")
    val fbidV2: String,
    @SerializedName("feed_post_reshare_disabled")
    val feedPostReshareDisabled: Boolean,
    @SerializedName("full_name")
    val fullName: String,
    val id: String,
    @SerializedName("is_private")
    val isPrivate: Boolean,
    @SerializedName("is_unpublished")
    val isUnpublished: Boolean,
    val pk: String,
    @SerializedName("pk_id")
    val pkId: String,
    @SerializedName("show_account_transparency_details")
    val showAccountTransparencyDetails: Boolean,
    @SerializedName("strong_id__")
    val strongId: String,
    @SerializedName("third_party_downloads_enabled")
    val thirdPartyDownloadsEnabled: Long,
    @SerializedName("account_badges")
    val accountBadges: List<Any?>,
    @SerializedName("fan_club_info")
    val fanClubInfo: FanClubInfo2Reel,
    @SerializedName("friendship_status")
    val friendshipStatus: FriendshipStatus2Reel,
    @SerializedName("has_anonymous_profile_picture")
    val hasAnonymousProfilePicture: Boolean,
    @SerializedName("hd_profile_pic_url_info")
    val hdProfilePicUrlInfo: HdProfilePicUrlInfo2Reel,
    @SerializedName("hd_profile_pic_versions")
    val hdProfilePicVersions: List<HdProfilePicVersion2Reel>,
    @SerializedName("is_favorite")
    val isFavorite: Boolean,
    @SerializedName("is_verified")
    val isVerified: Boolean,
    @SerializedName("latest_reel_media")
    val latestReelMedia: Long,
    @SerializedName("profile_pic_id")
    val profilePicId: String,
    @SerializedName("profile_pic_url")
    val profilePicUrl: String,
    @SerializedName("transparency_product_enabled")
    val transparencyProductEnabled: Boolean,
    val username: String,
)

data class FanClubInfo2Reel(
    @SerializedName("fan_club_id")
    val fanClubId: Any?,
    @SerializedName("fan_club_name")
    val fanClubName: Any?,
    @SerializedName("is_fan_club_referral_eligible")
    val isFanClubReferralEligible: Any?,
    @SerializedName("fan_consideration_page_revamp_eligiblity")
    val fanConsiderationPageRevampEligiblity: Any?,
    @SerializedName("is_fan_club_gifting_eligible")
    val isFanClubGiftingEligible: Any?,
    @SerializedName("subscriber_count")
    val subscriberCount: Any?,
    @SerializedName("connected_member_count")
    val connectedMemberCount: Any?,
    @SerializedName("autosave_to_exclusive_highlight")
    val autosaveToExclusiveHighlight: Any?,
    @SerializedName("has_enough_subscribers_for_ssc")
    val hasEnoughSubscribersForSsc: Any?,
)

data class FriendshipStatus2Reel(
    val following: Boolean,
    @SerializedName("is_bestie")
    val isBestie: Boolean,
    @SerializedName("is_restricted")
    val isRestricted: Boolean,
    @SerializedName("is_feed_favorite")
    val isFeedFavorite: Boolean,
)

data class HdProfilePicUrlInfo2Reel(
    val url: String,
    val width: Long,
    val height: Long,
)

data class HdProfilePicVersion2Reel(
    val width: Long,
    val height: Long,
    val url: String,
)

data class ImageVersions2Reel(
    val candidates: List<CandidateReel>,
    @SerializedName("additional_candidates")
    val additionalCandidates: AdditionalCandidates,
    @SerializedName("smart_thumbnail_enabled")
    val smartThumbnailEnabled: Boolean,
    @SerializedName("scrubber_spritesheet_info_candidates")
    val scrubberSpritesheetInfoCandidates: ScrubberSpritesheetInfoCandidates,
)

data class CandidateReel(
    val width: Long,
    val height: Long,
    val url: String,
)

data class AdditionalCandidates(
    @SerializedName("igtv_first_frame")
    val igtvFirstFrame: IgtvFirstFrame,
    @SerializedName("first_frame")
    val firstFrame: FirstFrame,
    @SerializedName("smart_frame")
    val smartFrame: Any?,
)

data class IgtvFirstFrame(
    val width: Long,
    val height: Long,
    val url: String,
)

data class FirstFrame(
    val width: Long,
    val height: Long,
    val url: String,
)

data class ScrubberSpritesheetInfoCandidates(
    val default: Default,
)

data class Default(
    @SerializedName("video_length")
    val videoLength: Double,
    @SerializedName("thumbnail_width")
    val thumbnailWidth: Long,
    @SerializedName("thumbnail_height")
    val thumbnailHeight: Long,
    @SerializedName("thumbnail_duration")
    val thumbnailDuration: Double,
    @SerializedName("sprite_urls")
    val spriteUrls: List<String>,
    @SerializedName("thumbnails_per_row")
    val thumbnailsPerRow: Long,
    @SerializedName("total_thumbnail_num_per_sprite")
    val totalThumbnailNumPerSprite: Long,
    @SerializedName("max_thumbnails_per_sprite")
    val maxThumbnailsPerSprite: Long,
    @SerializedName("sprite_width")
    val spriteWidth: Long,
    @SerializedName("sprite_height")
    val spriteHeight: Long,
    @SerializedName("rendered_width")
    val renderedWidth: Long,
    @SerializedName("file_size_kb")
    val fileSizeKb: Long,
)

data class OwnerReel(
    @SerializedName("fbid_v2")
    val fbidV2: String,
    @SerializedName("feed_post_reshare_disabled")
    val feedPostReshareDisabled: Boolean,
    @SerializedName("full_name")
    val fullName: String,
    val id: String,
    @SerializedName("is_private")
    val isPrivate: Boolean,
    @SerializedName("is_unpublished")
    val isUnpublished: Boolean,
    val pk: String,
    @SerializedName("pk_id")
    val pkId: String,
    @SerializedName("show_account_transparency_details")
    val showAccountTransparencyDetails: Boolean,
    @SerializedName("strong_id__")
    val strongId: String,
    @SerializedName("third_party_downloads_enabled")
    val thirdPartyDownloadsEnabled: Long,
    @SerializedName("account_badges")
    val accountBadges: List<Any?>,
    @SerializedName("fan_club_info")
    val fanClubInfo: FanClubInfo3Reel,
    @SerializedName("friendship_status")
    val friendshipStatus: FriendshipStatus3Reel,
    @SerializedName("has_anonymous_profile_picture")
    val hasAnonymousProfilePicture: Boolean,
    @SerializedName("hd_profile_pic_url_info")
    val hdProfilePicUrlInfo: HdProfilePicUrlInfo3Reel,
    @SerializedName("hd_profile_pic_versions")
    val hdProfilePicVersions: List<HdProfilePicVersion3Reel>,
    @SerializedName("is_favorite")
    val isFavorite: Boolean,
    @SerializedName("is_verified")
    val isVerified: Boolean,
    @SerializedName("latest_reel_media")
    val latestReelMedia: Long,
    @SerializedName("profile_pic_id")
    val profilePicId: String,
    @SerializedName("profile_pic_url")
    val profilePicUrl: String,
    @SerializedName("transparency_product_enabled")
    val transparencyProductEnabled: Boolean,
    val username: String,
)

data class FanClubInfo3Reel(
    @SerializedName("fan_club_id")
    val fanClubId: Any?,
    @SerializedName("fan_club_name")
    val fanClubName: Any?,
    @SerializedName("is_fan_club_referral_eligible")
    val isFanClubReferralEligible: Any?,
    @SerializedName("fan_consideration_page_revamp_eligiblity")
    val fanConsiderationPageRevampEligiblity: Any?,
    @SerializedName("is_fan_club_gifting_eligible")
    val isFanClubGiftingEligible: Any?,
    @SerializedName("subscriber_count")
    val subscriberCount: Any?,
    @SerializedName("connected_member_count")
    val connectedMemberCount: Any?,
    @SerializedName("autosave_to_exclusive_highlight")
    val autosaveToExclusiveHighlight: Any?,
    @SerializedName("has_enough_subscribers_for_ssc")
    val hasEnoughSubscribersForSsc: Any?,
)

data class FriendshipStatus3Reel(
    val following: Boolean,
    @SerializedName("is_bestie")
    val isBestie: Boolean,
    @SerializedName("is_restricted")
    val isRestricted: Boolean,
    @SerializedName("is_feed_favorite")
    val isFeedFavorite: Boolean,
)

data class HdProfilePicUrlInfo3Reel(
    val url: String,
    val width: Long,
    val height: Long,
)

data class HdProfilePicVersion3Reel(
    val width: Long,
    val height: Long,
    val url: String,
)

data class VideoVersion(
    val type: Long,
    val width: Long,
    val height: Long,
    val url: String,
    val id: String,
)

data class ClipsMetadata(
    @SerializedName("music_info")
    val musicInfo: Any?,
    @SerializedName("original_sound_info")
    val originalSoundInfo: OriginalSoundInfo,
    @SerializedName("audio_type")
    val audioType: String,
    @SerializedName("music_canonical_id")
    val musicCanonicalId: String,
    @SerializedName("featured_label")
    val featuredLabel: Any?,
    @SerializedName("mashup_info")
    val mashupInfo: MashupInfo,
    @SerializedName("reusable_text_info")
    val reusableTextInfo: Any?,
    @SerializedName("reusable_text_attribute_string")
    val reusableTextAttributeString: Any?,
    @SerializedName("nux_info")
    val nuxInfo: Any?,
    @SerializedName("viewer_interaction_settings")
    val viewerInteractionSettings: Any?,
    @SerializedName("branded_content_tag_info")
    val brandedContentTagInfo: BrandedContentTagInfo,
    @SerializedName("shopping_info")
    val shoppingInfo: Any?,
    @SerializedName("additional_audio_info")
    val additionalAudioInfo: AdditionalAudioInfo,
    @SerializedName("is_shared_to_fb")
    val isSharedToFb: Boolean,
    @SerializedName("breaking_content_info")
    val breakingContentInfo: Any?,
    @SerializedName("challenge_info")
    val challengeInfo: Any?,
    @SerializedName("reels_on_the_rise_info")
    val reelsOnTheRiseInfo: Any?,
    @SerializedName("breaking_creator_info")
    val breakingCreatorInfo: Any?,
    @SerializedName("asset_recommendation_info")
    val assetRecommendationInfo: Any?,
    @SerializedName("contextual_highlight_info")
    val contextualHighlightInfo: Any?,
    @SerializedName("clips_creation_entry_point")
    val clipsCreationEntryPoint: String,
    @SerializedName("audio_ranking_info")
    val audioRankingInfo: AudioRankingInfo,
    @SerializedName("template_info")
    val templateInfo: Any?,
    @SerializedName("is_fan_club_promo_video")
    val isFanClubPromoVideo: Boolean,
    @SerializedName("disable_use_in_clips_client_cache")
    val disableUseInClipsClientCache: Boolean,
    @SerializedName("content_appreciation_info")
    val contentAppreciationInfo: ContentAppreciationInfo,
    @SerializedName("achievements_info")
    val achievementsInfo: AchievementsInfo,
    @SerializedName("show_achievements")
    val showAchievements: Boolean,
    @SerializedName("show_tips")
    val showTips: Any?,
    @SerializedName("merchandising_pill_info")
    val merchandisingPillInfo: Any?,
    @SerializedName("is_public_chat_welcome_video")
    val isPublicChatWelcomeVideo: Boolean,
    @SerializedName("professional_clips_upsell_type")
    val professionalClipsUpsellType: Long,
    @SerializedName("external_media_info")
    val externalMediaInfo: Any?,
    @SerializedName("cutout_sticker_info")
    val cutoutStickerInfo: Any?,
)

data class OriginalSoundInfo(
    @SerializedName("audio_asset_id")
    val audioAssetId: String,
    @SerializedName("music_canonical_id")
    val musicCanonicalId: Any?,
    @SerializedName("progressive_download_url")
    val progressiveDownloadUrl: String,
    @SerializedName("duration_in_ms")
    val durationInMs: Long,
    @SerializedName("dash_manifest")
    val dashManifest: String,
    @SerializedName("ig_artist")
    val igArtist: IgArtist,
    @SerializedName("should_mute_audio")
    val shouldMuteAudio: Boolean,
    @SerializedName("hide_remixing")
    val hideRemixing: Boolean,
    @SerializedName("original_media_id")
    val originalMediaId: String,
    @SerializedName("time_created")
    val timeCreated: Long,
    @SerializedName("original_audio_title")
    val originalAudioTitle: String,
    @SerializedName("consumption_info")
    val consumptionInfo: ConsumptionInfo,
    @SerializedName("can_remix_be_shared_to_fb")
    val canRemixBeSharedToFb: Boolean,
    @SerializedName("can_remix_be_shared_to_fb_expansion")
    val canRemixBeSharedToFbExpansion: Boolean,
    @SerializedName("formatted_clips_media_count")
    val formattedClipsMediaCount: Any?,
    @SerializedName("allow_creator_to_rename")
    val allowCreatorToRename: Boolean,
    @SerializedName("audio_parts")
    val audioParts: List<Any?>,
    @SerializedName("is_explicit")
    val isExplicit: Boolean,
    @SerializedName("original_audio_subtype")
    val originalAudioSubtype: String,
    @SerializedName("is_audio_automatically_attributed")
    val isAudioAutomaticallyAttributed: Boolean,
    @SerializedName("is_reuse_disabled")
    val isReuseDisabled: Boolean,
    @SerializedName("is_xpost_from_fb")
    val isXpostFromFb: Boolean,
    @SerializedName("xpost_fb_creator_info")
    val xpostFbCreatorInfo: Any?,
    @SerializedName("is_original_audio_download_eligible")
    val isOriginalAudioDownloadEligible: Boolean,
    @SerializedName("trend_rank")
    val trendRank: Any?,
    @SerializedName("audio_filter_infos")
    val audioFilterInfos: List<Any?>,
    @SerializedName("oa_owner_is_music_artist")
    val oaOwnerIsMusicArtist: Boolean,
    @SerializedName("is_eligible_for_audio_effects")
    val isEligibleForAudioEffects: Boolean,
)

data class IgArtist(
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

data class ConsumptionInfo(
    @SerializedName("is_bookmarked")
    val isBookmarked: Boolean,
    @SerializedName("should_mute_audio_reason")
    val shouldMuteAudioReason: String,
    @SerializedName("is_trending_in_clips")
    val isTrendingInClips: Boolean,
    @SerializedName("should_mute_audio_reason_type")
    val shouldMuteAudioReasonType: Any?,
    @SerializedName("display_media_id")
    val displayMediaId: Any?,
)

data class MashupInfo(
    @SerializedName("mashups_allowed")
    val mashupsAllowed: Boolean,
    @SerializedName("can_toggle_mashups_allowed")
    val canToggleMashupsAllowed: Boolean,
    @SerializedName("has_been_mashed_up")
    val hasBeenMashedUp: Boolean,
    @SerializedName("is_light_weight_check")
    val isLightWeightCheck: Boolean,
    @SerializedName("formatted_mashups_count")
    val formattedMashupsCount: Any?,
    @SerializedName("original_media")
    val originalMedia: Any?,
    @SerializedName("privacy_filtered_mashups_media_count")
    val privacyFilteredMashupsMediaCount: Any?,
    @SerializedName("non_privacy_filtered_mashups_media_count")
    val nonPrivacyFilteredMashupsMediaCount: Long,
    @SerializedName("mashup_type")
    val mashupType: Any?,
    @SerializedName("is_creator_requesting_mashup")
    val isCreatorRequestingMashup: Boolean,
    @SerializedName("has_nonmimicable_additional_audio")
    val hasNonmimicableAdditionalAudio: Boolean,
    @SerializedName("is_pivot_page_available")
    val isPivotPageAvailable: Boolean,
)

data class BrandedContentTagInfo(
    @SerializedName("can_add_tag")
    val canAddTag: Boolean,
)

data class AdditionalAudioInfo(
    @SerializedName("additional_audio_username")
    val additionalAudioUsername: Any?,
    @SerializedName("audio_reattribution_info")
    val audioReattributionInfo: AudioReattributionInfo,
)

data class AudioReattributionInfo(
    @SerializedName("should_allow_restore")
    val shouldAllowRestore: Boolean,
)

data class AudioRankingInfo(
    @SerializedName("best_audio_cluster_id")
    val bestAudioClusterId: String,
)

data class ContentAppreciationInfo(
    val enabled: Boolean,
    @SerializedName("entry_point_container")
    val entryPointContainer: EntryPointContainer,
)

data class EntryPointContainer(
    val pill: Pill,
    val comment: CommentReel,
    val overflow: Any?,
    val ufi: Any?,
)

data class Pill(
    @SerializedName("action_type")
    val actionType: String,
    val priority: Long,
)

data class CommentReel(
    @SerializedName("action_type")
    val actionType: String,
)

data class AchievementsInfo(
    @SerializedName("show_achievements")
    val showAchievements: Boolean,
    @SerializedName("num_earned_achievements")
    val numEarnedAchievements: Any?,
)
