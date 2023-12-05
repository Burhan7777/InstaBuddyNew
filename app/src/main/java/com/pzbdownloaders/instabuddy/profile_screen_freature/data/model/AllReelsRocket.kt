package com.pzbdownloaders.instabuddy.profile_screen_freature.data.model

import com.google.gson.annotations.SerializedName
import com.pzbdownloaders.instabuddy.main_screen.data.model.BodyReel


data class RootAllReels(
    val status: String,
    val response: ResponseReel,
)

data class ResponseReel(
    @SerializedName("status_code")
    val statusCode: Long,
    @SerializedName("content_type")
    val contentType: String,
    val body: BodyAllReel,
)

data class BodyAllReel(
    val items: List<ItemAllReel>,
    @SerializedName("paging_info")
    val pagingInfo: PagingInfoAllReels,
    val status: String,
)

data class ItemAllReel(
    val media: MediaAllReels,
)

data class MediaAllReels(
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
    @SerializedName("view_state_item_type")
    val viewStateItemType: Long,
    @SerializedName("logging_info_token")
    val loggingInfoToken: String,
    @SerializedName("clips_delivery_parameters")
    val clipsDeliveryParameters: Map<String, Any>,
    @SerializedName("mezql_token")
    val mezqlToken: String,
    val usertags: UsertagsAllReels?,
    @SerializedName("photo_of_you")
    val photoOfYou: Boolean?,
    @SerializedName("shop_routing_user_id")
    val shopRoutingUserId: Any?,
    @SerializedName("can_see_insights_as_brand")
    val canSeeInsightsAsBrand: Boolean,
    @SerializedName("is_organic_product_tagging_eligible")
    val isOrganicProductTaggingEligible: Boolean,
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
    @SerializedName("video_subtitles_confidence")
    val videoSubtitlesConfidence: Double?,
    @SerializedName("media_type")
    val mediaType: Long,
    val code: String,
    @SerializedName("can_viewer_reshare")
    val canViewerReshare: Boolean,
    val caption: CaptionAllReels,
    @SerializedName("clips_tab_pinned_user_ids")
    val clipsTabPinnedUserIds: List<Any?>,
    @SerializedName("comment_inform_treatment")
    val commentInformTreatment: CommentInformTreatmentAllReels,
    @SerializedName("sharing_friction_info")
    val sharingFrictionInfo: SharingFrictionInfoAllReels,
    @SerializedName("play_count")
    val playCount: Long,
    @SerializedName("media_appreciation_settings")
    val mediaAppreciationSettings: MediaAppreciationSettingsAllReels,
    @SerializedName("original_media_has_visual_reply_media")
    val originalMediaHasVisualReplyMedia: Boolean,
    @SerializedName("fb_user_tags")
    val fbUserTags: FbUserTagsAllReels,
    @SerializedName("coauthor_producers")
    val coauthorProducers: List<CoauthorProducerAllReels>?,
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
    val highlightsInfo: HighlightsInfoAllReels,
    @SerializedName("media_cropping_info")
    val mediaCroppingInfo: MediaCroppingInfoAllReels,
    @SerializedName("product_suggestions")
    val productSuggestions: List<Any?>,
    val user: User3AllReels,
    @SerializedName("image_versions2")
    val imageVersions2: ImageVersions2AllReels,
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
    @SerializedName("social_context")
    val socialContext: List<Any?>,
    @SerializedName("organic_tracking_token")
    val organicTrackingToken: String,
    @SerializedName("is_third_party_downloads_eligible")
    val isThirdPartyDownloadsEligible: Boolean,
    @SerializedName("commerce_integrity_review_decision")
    val commerceIntegrityReviewDecision: String,
    @SerializedName("ig_media_sharing_disabled")
    val igMediaSharingDisabled: Boolean,
    @SerializedName("open_carousel_submission_state")
    val openCarouselSubmissionState: String,
    @SerializedName("is_open_to_public_submission")
    val isOpenToPublicSubmission: Boolean,
    @SerializedName("comment_likes_enabled")
    val commentLikesEnabled: Boolean?,
    @SerializedName("comment_threading_enabled")
    val commentThreadingEnabled: Boolean,
    @SerializedName("max_num_visible_preview_comments")
    val maxNumVisiblePreviewComments: Long,
    @SerializedName("has_more_comments")
    val hasMoreComments: Boolean,
    @SerializedName("next_max_id")
    val nextMaxId: String?,
    @SerializedName("preview_comments")
    val previewComments: List<PreviewCommentAllReels>,
    val comments: List<CommentAllReels>,
    @SerializedName("comment_count")
    val commentCount: Long,
    @SerializedName("can_view_more_preview_comments")
    val canViewMorePreviewComments: Boolean,
    @SerializedName("hide_view_all_comment_entrypoint")
    val hideViewAllCommentEntrypoint: Boolean,
    @SerializedName("has_delayed_metadata")
    val hasDelayedMetadata: Boolean,
    @SerializedName("is_auto_created")
    val isAutoCreated: Boolean,
    @SerializedName("is_cutout_sticker_allowed")
    val isCutoutStickerAllowed: Boolean,
    @SerializedName("enable_waist")
    val enableWaist: Boolean,
    val owner: OwnerAllReels,
    @SerializedName("is_dash_eligible")
    val isDashEligible: Long,
    @SerializedName("video_dash_manifest")
    val videoDashManifest: String,
    @SerializedName("video_codec")
    val videoCodec: String,
    @SerializedName("number_of_qualities")
    val numberOfQualities: Long,
    @SerializedName("video_versions")
    val videoVersions: List<VideoVersionAllReels>,
    @SerializedName("video_duration")
    val videoDuration: Double,
    @SerializedName("has_audio")
    val hasAudio: Boolean,
    @SerializedName("clips_metadata")
    val clipsMetadata: ClipsMetadataAllReels,
    @SerializedName("sponsor_tags")
    val sponsorTags: List<SponsorTagAllReels>?,
    @SerializedName("fb_like_count")
    val fbLikeCount: Long?,
    @SerializedName("fb_play_count")
    val fbPlayCount: Long?,
)

data class UsertagsAllReels(
    @SerializedName("in")
    val in_field: List<InAllReels>,
)

data class InAllReels(
    val user: UserAllReels,
    val position: List<Double>,
    @SerializedName("start_time_in_video_in_sec")
    val startTimeInVideoInSec: Any?,
    @SerializedName("duration_in_video_in_sec")
    val durationInVideoInSec: Any?,
)

data class UserAllReels(
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
    val profilePicId: String?,
    @SerializedName("profile_pic_url")
    val profilePicUrl: String,
    @SerializedName("friendship_status")
    val friendshipStatus: FriendshipStatusAllReels,
)

data class FriendshipStatusAllReels(
    val following: Boolean,
    @SerializedName("followed_by")
    val followedBy: Boolean,
    val blocking: Boolean,
    val muting: Boolean,
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

data class CaptionAllReels(
    val pk: String,
    @SerializedName("user_id")
    val userId: String,
    val user: User2AllReels,
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
    @SerializedName("has_translation")
    val hasTranslation: Boolean?,
)

data class User2AllReels(
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
    val fanClubInfo: FanClubInfoAllReels,
    @SerializedName("friendship_status")
    val friendshipStatus: FriendshipStatus2AllReels,
    @SerializedName("has_anonymous_profile_picture")
    val hasAnonymousProfilePicture: Boolean,
    @SerializedName("hd_profile_pic_url_info")
    val hdProfilePicUrlInfo: HdProfilePicUrlInfoAllReels,
    @SerializedName("hd_profile_pic_versions")
    val hdProfilePicVersions: List<HdProfilePicVersionAllReels>,
    @SerializedName("is_favorite")
    val isFavorite: Boolean,
    @SerializedName("is_verified")
    val isVerified: Boolean,
    @SerializedName("profile_pic_id")
    val profilePicId: String,
    @SerializedName("profile_pic_url")
    val profilePicUrl: String,
    @SerializedName("transparency_product_enabled")
    val transparencyProductEnabled: Boolean,
    val username: String,
    @SerializedName("reshare_xpost_deny_reasons_for_user")
    val reshareXpostDenyReasonsForUser: List<String>?,
)

data class FanClubInfoAllReels(
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

data class FriendshipStatus2AllReels(
    val following: Boolean,
    @SerializedName("is_bestie")
    val isBestie: Boolean,
    @SerializedName("is_restricted")
    val isRestricted: Boolean,
    @SerializedName("is_feed_favorite")
    val isFeedFavorite: Boolean,
)

data class HdProfilePicUrlInfoAllReels(
    val url: String,
    val width: Long,
    val height: Long,
)

data class HdProfilePicVersionAllReels(
    val width: Long,
    val height: Long,
    val url: String,
)

data class CommentInformTreatmentAllReels(
    @SerializedName("should_have_inform_treatment")
    val shouldHaveInformTreatment: Boolean,
    val text: String,
    val url: Any?,
    @SerializedName("action_type")
    val actionType: Any?,
)

data class SharingFrictionInfoAllReels(
    @SerializedName("should_have_sharing_friction")
    val shouldHaveSharingFriction: Boolean,
    @SerializedName("bloks_app_url")
    val bloksAppUrl: Any?,
    @SerializedName("sharing_friction_payload")
    val sharingFrictionPayload: Any?,
)

data class MediaAppreciationSettingsAllReels(
    @SerializedName("media_gifting_state")
    val mediaGiftingState: String,
    @SerializedName("gift_count_visibility")
    val giftCountVisibility: String,
)

data class FbUserTagsAllReels(
    @SerializedName("in")
    val in_field: List<Any?>,
)

data class CoauthorProducerAllReels(
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
    val profilePicId: String?,
    @SerializedName("profile_pic_url")
    val profilePicUrl: String,
)

data class HighlightsInfoAllReels(
    @SerializedName("added_to")
    val addedTo: List<Any?>,
)

data class MediaCroppingInfoAllReels(
    @SerializedName("square_crop")
    val squareCrop: SquareCropAllReels,
)

data class SquareCropAllReels(
    @SerializedName("crop_left")
    val cropLeft: Double,
    @SerializedName("crop_right")
    val cropRight: Double,
    @SerializedName("crop_top")
    val cropTop: Double,
    @SerializedName("crop_bottom")
    val cropBottom: Double,
)

data class User3AllReels(
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
    val fanClubInfo: FanClubInfo2AllReels,
    @SerializedName("friendship_status")
    val friendshipStatus: FriendshipStatus3AllReels,
    @SerializedName("has_anonymous_profile_picture")
    val hasAnonymousProfilePicture: Boolean,
    @SerializedName("hd_profile_pic_url_info")
    val hdProfilePicUrlInfo: HdProfilePicUrlInfo2AllReels,
    @SerializedName("hd_profile_pic_versions")
    val hdProfilePicVersions: List<HdProfilePicVersion2AllReels>,
    @SerializedName("is_favorite")
    val isFavorite: Boolean,
    @SerializedName("is_verified")
    val isVerified: Boolean,
    @SerializedName("profile_pic_id")
    val profilePicId: String,
    @SerializedName("profile_pic_url")
    val profilePicUrl: String,
    @SerializedName("transparency_product_enabled")
    val transparencyProductEnabled: Boolean,
    val username: String,
    @SerializedName("reshare_xpost_deny_reasons_for_user")
    val reshareXpostDenyReasonsForUser: List<String>?,
)

data class FanClubInfo2AllReels(
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

data class FriendshipStatus3AllReels(
    val following: Boolean,
    @SerializedName("is_bestie")
    val isBestie: Boolean,
    @SerializedName("is_restricted")
    val isRestricted: Boolean,
    @SerializedName("is_feed_favorite")
    val isFeedFavorite: Boolean,
)

data class HdProfilePicUrlInfo2AllReels(
    val url: String,
    val width: Long,
    val height: Long,
)

data class HdProfilePicVersion2AllReels(
    val width: Long,
    val height: Long,
    val url: String,
)

data class ImageVersions2AllReels(
    val candidates: List<CandidateAllReels>,
    @SerializedName("additional_candidates")
    val additionalCandidates: AdditionalCandidatesAllReels,
    @SerializedName("smart_thumbnail_enabled")
    val smartThumbnailEnabled: Boolean,
    @SerializedName("scrubber_spritesheet_info_candidates")
    val scrubberSpritesheetInfoCandidates: ScrubberSpritesheetInfoCandidatesAllReels?,
)

data class CandidateAllReels(
    val width: Long,
    val height: Long,
    val url: String,
)

data class AdditionalCandidatesAllReels(
    @SerializedName("igtv_first_frame")
    val igtvFirstFrame: IgtvFirstFrameAllReels,
    @SerializedName("first_frame")
    val firstFrame: FirstFrameAllReels,
    @SerializedName("smart_frame")
    val smartFrame: Any?,
)

data class IgtvFirstFrameAllReels(
    val width: Long,
    val height: Long,
    val url: String,
)

data class FirstFrameAllReels(
    val width: Long,
    val height: Long,
    val url: String,
)

data class ScrubberSpritesheetInfoCandidatesAllReels(
    val default: DefaultAllReels,
)

data class DefaultAllReels(
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

data class PreviewCommentAllReels(
    val pk: String,
    @SerializedName("user_id")
    val userId: String,
    val type: Long,
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
    @SerializedName("media_id")
    val mediaId: String,
    val user: User4AllReels,
    val text: String,
    @SerializedName("is_covered")
    val isCovered: Boolean,
    @SerializedName("has_translation")
    val hasTranslation: Boolean?,
    @SerializedName("parent_comment_id")
    val parentCommentId: String?,
    @SerializedName("replied_to_comment_id")
    val repliedToCommentId: String?,
)

data class User4AllReels(
    val pk: String,
    @SerializedName("pk_id")
    val pkId: String,
    @SerializedName("full_name")
    val fullName: String,
    @SerializedName("is_private")
    val isPrivate: Boolean,
    @SerializedName("strong_id__")
    val strongId: String,
    @SerializedName("fbid_v2")
    val fbidV2: String,
    val username: String,
    @SerializedName("is_verified")
    val isVerified: Boolean,
    @SerializedName("profile_pic_id")
    val profilePicId: String?,
    @SerializedName("profile_pic_url")
    val profilePicUrl: String,
)

data class CommentAllReels(
    val pk: String,
    @SerializedName("user_id")
    val userId: String,
    val type: Long,
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
    @SerializedName("media_id")
    val mediaId: String,
    val user: User5AllReels,
    val text: String,
    @SerializedName("is_covered")
    val isCovered: Boolean,
    @SerializedName("has_translation")
    val hasTranslation: Boolean?,
    @SerializedName("parent_comment_id")
    val parentCommentId: String?,
    @SerializedName("replied_to_comment_id")
    val repliedToCommentId: String?,
)

data class User5AllReels(
    val pk: String,
    @SerializedName("pk_id")
    val pkId: String,
    @SerializedName("full_name")
    val fullName: String,
    @SerializedName("is_private")
    val isPrivate: Boolean,
    @SerializedName("strong_id__")
    val strongId: String,
    @SerializedName("fbid_v2")
    val fbidV2: String,
    val username: String,
    @SerializedName("is_verified")
    val isVerified: Boolean,
    @SerializedName("profile_pic_id")
    val profilePicId: String?,
    @SerializedName("profile_pic_url")
    val profilePicUrl: String,
)

data class OwnerAllReels(
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
    val fanClubInfo: FanClubInfo3AllReels,
    @SerializedName("friendship_status")
    val friendshipStatus: FriendshipStatus4AllReels,
    @SerializedName("has_anonymous_profile_picture")
    val hasAnonymousProfilePicture: Boolean,
    @SerializedName("hd_profile_pic_url_info")
    val hdProfilePicUrlInfo: HdProfilePicUrlInfo3AllReels,
    @SerializedName("hd_profile_pic_versions")
    val hdProfilePicVersions: List<HdProfilePicVersion3AllReels>,
    @SerializedName("is_favorite")
    val isFavorite: Boolean,
    @SerializedName("is_verified")
    val isVerified: Boolean,
    @SerializedName("profile_pic_id")
    val profilePicId: String,
    @SerializedName("profile_pic_url")
    val profilePicUrl: String,
    @SerializedName("transparency_product_enabled")
    val transparencyProductEnabled: Boolean,
    val username: String,
    @SerializedName("reshare_xpost_deny_reasons_for_user")
    val reshareXpostDenyReasonsForUser: List<String>?,
)

data class FanClubInfo3AllReels(
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

data class FriendshipStatus4AllReels(
    val following: Boolean,
    @SerializedName("is_bestie")
    val isBestie: Boolean,
    @SerializedName("is_restricted")
    val isRestricted: Boolean,
    @SerializedName("is_feed_favorite")
    val isFeedFavorite: Boolean,
)

data class HdProfilePicUrlInfo3AllReels(
    val url: String,
    val width: Long,
    val height: Long,
)

data class HdProfilePicVersion3AllReels(
    val width: Long,
    val height: Long,
    val url: String,
)

data class VideoVersionAllReels(
    val type: Long,
    val width: Long,
    val height: Long,
    val url: String,
    val id: String,
)

data class ClipsMetadataAllReels(
    @SerializedName("music_info")
    val musicInfo: Any?,
    @SerializedName("original_sound_info")
    val originalSoundInfo: OriginalSoundInfoAllReels,
    @SerializedName("audio_type")
    val audioType: String,
    @SerializedName("music_canonical_id")
    val musicCanonicalId: String,
    @SerializedName("featured_label")
    val featuredLabel: Any?,
    @SerializedName("mashup_info")
    val mashupInfo: MashupInfoAllReels,
    @SerializedName("reusable_text_info")
    val reusableTextInfo: Any?,
    @SerializedName("reusable_text_attribute_string")
    val reusableTextAttributeString: Any?,
    @SerializedName("nux_info")
    val nuxInfo: Any?,
    @SerializedName("viewer_interaction_settings")
    val viewerInteractionSettings: Any?,
    @SerializedName("branded_content_tag_info")
    val brandedContentTagInfo: BrandedContentTagInfoAllReels,
    @SerializedName("shopping_info")
    val shoppingInfo: Any?,
    @SerializedName("additional_audio_info")
    val additionalAudioInfo: AdditionalAudioInfoAllReels,
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
    val audioRankingInfo: AudioRankingInfoAllReels,
    @SerializedName("template_info")
    val templateInfo: Any?,
    @SerializedName("is_fan_club_promo_video")
    val isFanClubPromoVideo: Boolean,
    @SerializedName("disable_use_in_clips_client_cache")
    val disableUseInClipsClientCache: Boolean,
    @SerializedName("content_appreciation_info")
    val contentAppreciationInfo: ContentAppreciationInfoAllReels,
    @SerializedName("achievements_info")
    val achievementsInfo: AchievementsInfoAllReels,
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

data class OriginalSoundInfoAllReels(
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
    val igArtist: IgArtistAllReels,
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
    val consumptionInfo: ConsumptionInfoAllReels,
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

data class IgArtistAllReels(
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

data class ConsumptionInfoAllReels(
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

data class MashupInfoAllReels(
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
    val nonPrivacyFilteredMashupsMediaCount: Long?,
    @SerializedName("mashup_type")
    val mashupType: Any?,
    @SerializedName("is_creator_requesting_mashup")
    val isCreatorRequestingMashup: Boolean,
    @SerializedName("has_nonmimicable_additional_audio")
    val hasNonmimicableAdditionalAudio: Boolean,
    @SerializedName("is_pivot_page_available")
    val isPivotPageAvailable: Boolean,
)

data class BrandedContentTagInfoAllReels(
    @SerializedName("can_add_tag")
    val canAddTag: Boolean,
)

data class AdditionalAudioInfoAllReels(
    @SerializedName("additional_audio_username")
    val additionalAudioUsername: Any?,
    @SerializedName("audio_reattribution_info")
    val audioReattributionInfo: AudioReattributionInfoAllReels,
)

data class AudioReattributionInfoAllReels(
    @SerializedName("should_allow_restore")
    val shouldAllowRestore: Boolean,
)

data class AudioRankingInfoAllReels(
    @SerializedName("best_audio_cluster_id")
    val bestAudioClusterId: String,
)

data class ContentAppreciationInfoAllReels(
    val enabled: Boolean,
    @SerializedName("entry_point_container")
    val entryPointContainer: Any?,
)

data class AchievementsInfoAllReels(
    @SerializedName("show_achievements")
    val showAchievements: Boolean,
    @SerializedName("num_earned_achievements")
    val numEarnedAchievements: Any?,
)

data class SponsorTagAllReels(
    val permission: Boolean,
    val sponsor: SponsorAllReels,
    @SerializedName("is_pending")
    val isPending: Boolean,
    @SerializedName("sponsor_id")
    val sponsorId: Any?,
    val username: Any?,
)

data class SponsorAllReels(
    val pk: String,
    @SerializedName("pk_id")
    val pkId: String,
    @SerializedName("full_name")
    val fullName: String,
    @SerializedName("is_private")
    val isPrivate: Boolean,
    @SerializedName("strong_id__")
    val strongId: String,
    @SerializedName("is_unpublished")
    val isUnpublished: Boolean,
    val username: String,
    @SerializedName("is_verified")
    val isVerified: Boolean,
    @SerializedName("profile_pic_id")
    val profilePicId: String,
    @SerializedName("profile_pic_url")
    val profilePicUrl: String,
)

data class PagingInfoAllReels(
    @SerializedName("max_id")
    val maxId: String,
    @SerializedName("more_available")
    val moreAvailable: Boolean,
)
