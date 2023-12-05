package com.pzbdownloaders.instabuddy.main_screen.data.model

import com.google.gson.annotations.SerializedName


// ILLUSION API
/*
data class Posts(
    val display_resources: List<DisplayResource>
)

data class DisplayResource(
    val src: String,
    val config_width: String,
    val config_height: String
)
*/


// ILLUSION API STOPS

// ROCKET API STARTS HERE


data class Root(
    val status: String,
    val response: Response,
)

data class Response(
    @SerializedName("status_code")
    val statusCode: Long,
    @SerializedName("content_type")
    val contentType: String,
    val body: Body,
)

data class Body(
    val items: List<Item>,
    @SerializedName("num_results")
    val numResults: Long,
    @SerializedName("more_available")
    val moreAvailable: Boolean,
    @SerializedName("auto_load_more_enabled")
    val autoLoadMoreEnabled: Boolean,
    val status: String,
)

data class Item(
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
    val usertags: Usertags,
    @SerializedName("photo_of_you")
    val photoOfYou: Boolean,
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
    @SerializedName("media_type")
    val mediaType: Long,
    val code: String,
    @SerializedName("can_viewer_reshare")
    val canViewerReshare: Boolean,
    val caption: Caption,
    @SerializedName("clips_tab_pinned_user_ids")
    val clipsTabPinnedUserIds: List<Any?>,
    @SerializedName("comment_inform_treatment")
    val commentInformTreatment: CommentInformTreatment,
    @SerializedName("sharing_friction_info")
    val sharingFrictionInfo: SharingFrictionInfo,
    @SerializedName("original_media_has_visual_reply_media")
    val originalMediaHasVisualReplyMedia: Boolean,
    @SerializedName("fb_user_tags")
    val fbUserTags: FbUserTags,
    @SerializedName("invited_coauthor_producers")
    val invitedCoauthorProducers: List<Any?>,
    @SerializedName("all_previous_submitters")
    val allPreviousSubmitters: List<Any?>,
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
    val highlightsInfo: HighlightsInfo,
    @SerializedName("product_suggestions")
    val productSuggestions: List<Any?>,
    val user: User3,
    @SerializedName("image_versions2")
    val imageVersions2: ImageVersions2,
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
    val musicMetadata: MusicMetadata,
    @SerializedName("organic_tracking_token")
    val organicTrackingToken: String,
    @SerializedName("ig_media_sharing_disabled")
    val igMediaSharingDisabled: Boolean,
    @SerializedName("open_carousel_submission_state")
    val openCarouselSubmissionState: String,
    @SerializedName("is_open_to_public_submission")
    val isOpenToPublicSubmission: Boolean,
    @SerializedName("carousel_media_count")
    val carouselMediaCount: Long,
    @SerializedName("carousel_media")
    val carouselMedia: List<CarouselMedum>,
    @SerializedName("carousel_media_ids")
    val carouselMediaIds: List<String>,
    @SerializedName("carousel_media_pending_post_count")
    val carouselMediaPendingPostCount: Long,
    @SerializedName("comment_likes_enabled")
    val commentLikesEnabled: Boolean,
    @SerializedName("comment_threading_enabled")
    val commentThreadingEnabled: Boolean,
    @SerializedName("max_num_visible_preview_comments")
    val maxNumVisiblePreviewComments: Long,
    @SerializedName("has_more_comments")
    val hasMoreComments: Boolean,
    @SerializedName("next_max_id")
    val nextMaxId: String,
    @SerializedName("preview_comments")
    val previewComments: List<PreviewComment>,
    val comments: List<Comment>,
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
    val owner: Owner,
)

data class Usertags(
    @SerializedName("in")
    val in_field: List<In>,
)

data class In(
    val user: User1,
    val position: List<Double>,
    @SerializedName("start_time_in_video_in_sec")
    val startTimeInVideoInSec: Any?,
    @SerializedName("duration_in_video_in_sec")
    val durationInVideoInSec: Any?,
)

data class User1(
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

data class Caption(
    val pk: String,
    @SerializedName("user_id")
    val userId: String,
    val user: User2,
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

data class User2(
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
    val fanClubInfo: FanClubInfo,
    @SerializedName("friendship_status")
    val friendshipStatus: FriendshipStatus,
    @SerializedName("has_anonymous_profile_picture")
    val hasAnonymousProfilePicture: Boolean,
    @SerializedName("hd_profile_pic_url_info")
    val hdProfilePicUrlInfo: HdProfilePicUrlInfo,
    @SerializedName("hd_profile_pic_versions")
    val hdProfilePicVersions: List<HdProfilePicVersion>,
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

data class FanClubInfo(
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

data class FriendshipStatus(
    val following: Boolean,
    @SerializedName("is_bestie")
    val isBestie: Boolean,
    @SerializedName("is_restricted")
    val isRestricted: Boolean,
    @SerializedName("is_feed_favorite")
    val isFeedFavorite: Boolean,
)

data class HdProfilePicUrlInfo(
    val url: String,
    val width: Long,
    val height: Long,
)

data class HdProfilePicVersion(
    val width: Long,
    val height: Long,
    val url: String,
)

data class CommentInformTreatment(
    @SerializedName("should_have_inform_treatment")
    val shouldHaveInformTreatment: Boolean,
    val text: String,
    val url: Any?,
    @SerializedName("action_type")
    val actionType: Any?,
)

data class SharingFrictionInfo(
    @SerializedName("should_have_sharing_friction")
    val shouldHaveSharingFriction: Boolean,
    @SerializedName("bloks_app_url")
    val bloksAppUrl: Any?,
    @SerializedName("sharing_friction_payload")
    val sharingFrictionPayload: Any?,
)

data class FbUserTags(
    @SerializedName("in")
    val in_field: List<Any?>,
)

data class HighlightsInfo(
    @SerializedName("added_to")
    val addedTo: List<Any?>,
)

data class User3(
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
    val fanClubInfo: FanClubInfo2,
    @SerializedName("friendship_status")
    val friendshipStatus: FriendshipStatus2,
    @SerializedName("has_anonymous_profile_picture")
    val hasAnonymousProfilePicture: Boolean,
    @SerializedName("hd_profile_pic_url_info")
    val hdProfilePicUrlInfo: HdProfilePicUrlInfo2,
    @SerializedName("hd_profile_pic_versions")
    val hdProfilePicVersions: List<HdProfilePicVersion2>,
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

data class FanClubInfo2(
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

data class FriendshipStatus2(
    val following: Boolean,
    @SerializedName("is_bestie")
    val isBestie: Boolean,
    @SerializedName("is_restricted")
    val isRestricted: Boolean,
    @SerializedName("is_feed_favorite")
    val isFeedFavorite: Boolean,
)

data class HdProfilePicUrlInfo2(
    val url: String,
    val width: Long,
    val height: Long,
)

data class HdProfilePicVersion2(
    val width: Long,
    val height: Long,
    val url: String,
)

data class ImageVersions2(
    val candidates: List<Candidate>,
)

data class Candidate(
    val width: Long,
    val height: Long,
    val url: String,
    @SerializedName("scans_profile")
    val scansProfile: String,
)

data class MusicMetadata(
    @SerializedName("music_canonical_id")
    val musicCanonicalId: String,
    @SerializedName("audio_type")
    val audioType: Any?,
    @SerializedName("music_info")
    val musicInfo: Any?,
    @SerializedName("original_sound_info")
    val originalSoundInfo: Any?,
    @SerializedName("pinned_media_ids")
    val pinnedMediaIds: Any?,
)

data class CarouselMedum(
    val id: String,
    @SerializedName("explore_pivot_grid")
    val explorePivotGrid: Boolean,
    @SerializedName("product_type")
    val productType: String,
    @SerializedName("media_type")
    val mediaType: Long,
    @SerializedName("accessibility_caption")
    val accessibilityCaption: String,
    @SerializedName("image_versions2")
    val imageVersions2: ImageVersions22,
    @SerializedName("original_width")
    val originalWidth: Long,
    @SerializedName("original_height")
    val originalHeight: Long,
    @SerializedName("carousel_parent_id")
    val carouselParentId: String,
    @SerializedName("strong_id__")
    val strongId: String,
    val pk: String,
    @SerializedName("commerciality_status")
    val commercialityStatus: String,
    @SerializedName("taken_at")
    val takenAt: Long,
    val preview: String,
    val usertags: Usertags2?,
    @SerializedName("featured_products")
    val featuredProducts: List<Any?>,
    @SerializedName("fb_user_tags")
    val fbUserTags: FbUserTags2,
    @SerializedName("shop_routing_user_id")
    val shopRoutingUserId: Any?,
    @SerializedName("sharing_friction_info")
    val sharingFrictionInfo: SharingFrictionInfo2,
    @SerializedName("product_suggestions")
    val productSuggestions: List<Any?>,
    @SerializedName("highlights_info")
    val highlightsInfo: HighlightsInfo2,
)

data class ImageVersions22(
    val candidates: List<Candidate2>,
)

data class Candidate2(
    val width: Long,
    val height: Long,
    val url: String,
)

data class Usertags2(
    @SerializedName("in")
    val in_field: List<In2>,
)

data class In2(
    val user: User4,
    val position: List<Double>,
    @SerializedName("start_time_in_video_in_sec")
    val startTimeInVideoInSec: Any?,
    @SerializedName("duration_in_video_in_sec")
    val durationInVideoInSec: Any?,
)

data class User4(
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

data class FbUserTags2(
    @SerializedName("in")
    val in_field: List<Any?>,
)

data class SharingFrictionInfo2(
    @SerializedName("should_have_sharing_friction")
    val shouldHaveSharingFriction: Boolean,
    @SerializedName("bloks_app_url")
    val bloksAppUrl: Any?,
    @SerializedName("sharing_friction_payload")
    val sharingFrictionPayload: Any?,
)

data class HighlightsInfo2(
    @SerializedName("added_to")
    val addedTo: List<Any?>,
)

data class PreviewComment(
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
    val user: User5,
    val text: String,
    @SerializedName("is_covered")
    val isCovered: Boolean,
    @SerializedName("has_liked_comment")
    val hasLikedComment: Boolean,
    @SerializedName("comment_like_count")
    val commentLikeCount: Long,
    @SerializedName("has_translation")
    val hasTranslation: Boolean?,
)

data class User5(
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
    val profilePicId: String,
    @SerializedName("profile_pic_url")
    val profilePicUrl: String,
)

data class Comment(
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
    val user: User6,
    val text: String,
    @SerializedName("is_covered")
    val isCovered: Boolean,
    @SerializedName("has_liked_comment")
    val hasLikedComment: Boolean,
    @SerializedName("comment_like_count")
    val commentLikeCount: Long,
    @SerializedName("has_translation")
    val hasTranslation: Boolean?,
)

data class User6(
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
    val profilePicId: String,
    @SerializedName("profile_pic_url")
    val profilePicUrl: String,
)

data class Owner(
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
    val fanClubInfo: FanClubInfo3,
    @SerializedName("friendship_status")
    val friendshipStatus: FriendshipStatus3,
    @SerializedName("has_anonymous_profile_picture")
    val hasAnonymousProfilePicture: Boolean,
    @SerializedName("hd_profile_pic_url_info")
    val hdProfilePicUrlInfo: HdProfilePicUrlInfo3,
    @SerializedName("hd_profile_pic_versions")
    val hdProfilePicVersions: List<HdProfilePicVersion3>,
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

data class FanClubInfo3(
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

data class FriendshipStatus3(
    val following: Boolean,
    @SerializedName("is_bestie")
    val isBestie: Boolean,
    @SerializedName("is_restricted")
    val isRestricted: Boolean,
    @SerializedName("is_feed_favorite")
    val isFeedFavorite: Boolean,
)

data class HdProfilePicUrlInfo3(
    val url: String,
    val width: Long,
    val height: Long,
)

data class HdProfilePicVersion3(
    val width: Long,
    val height: Long,
    val url: String,
)

