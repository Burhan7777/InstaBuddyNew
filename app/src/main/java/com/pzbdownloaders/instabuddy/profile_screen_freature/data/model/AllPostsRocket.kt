package com.pzbdownloaders.instabuddy.profile_screen_freature.data.model

import com.google.gson.annotations.SerializedName


data class RootAllPosts(
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
    val items: List<ItemAllPosts>,
    @SerializedName("num_results")
    val numResults: Long,
    @SerializedName("more_available")
    val moreAvailable: Boolean,
    @SerializedName("next_max_id")
    val nextMaxId: String,
    val user: User7,
    @SerializedName("auto_load_more_enabled")
    val autoLoadMoreEnabled: Boolean,
    val status: String,
)

data class ItemAllPosts(
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
    val usertags: UsertagsAllPosts?,
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
    @SerializedName("media_type")
    val mediaType: Long,
    val code: String,
    @SerializedName("can_viewer_reshare")
    val canViewerReshare: Boolean,
    val caption: CaptionAllPosts,
    @SerializedName("clips_tab_pinned_user_ids")
    val clipsTabPinnedUserIds: List<Any?>,
    @SerializedName("comment_inform_treatment")
    val commentInformTreatment: CommentInformTreatmentAllPosts,
    @SerializedName("sharing_friction_info")
    val sharingFrictionInfo: SharingFrictionInfoAllPosts,
    @SerializedName("original_media_has_visual_reply_media")
    val originalMediaHasVisualReplyMedia: Boolean,
    @SerializedName("fb_user_tags")
    val fbUserTags: FbUserTagsAllPosts,
    @SerializedName("invited_coauthor_producers")
    val invitedCoauthorProducers: List<Any?>,
    @SerializedName("all_previous_submitters")
    val allPreviousSubmitters: List<Any?>?,
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
    val highlightsInfo: HighlightsInfoAllPosts,
    @SerializedName("product_suggestions")
    val productSuggestions: List<Any?>,
    val user: User3AllPosts,
    @SerializedName("image_versions2")
    val imageVersions2: ImageVersions2AllPosts,
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
    val musicMetadata: MusicMetadataAllPosts?,
    @SerializedName("organic_tracking_token")
    val organicTrackingToken: String,
    @SerializedName("ig_media_sharing_disabled")
    val igMediaSharingDisabled: Boolean,
    @SerializedName("open_carousel_submission_state")
    val openCarouselSubmissionState: String,
    @SerializedName("is_open_to_public_submission")
    val isOpenToPublicSubmission: Boolean,
    @SerializedName("carousel_media_count")
    val carouselMediaCount: Long?,
    @SerializedName("carousel_media")
    val carouselMedia: List<CarouselMedumAllPosts>?,
    @SerializedName("carousel_media_ids")
    val carouselMediaIds: List<String>?,
    @SerializedName("carousel_media_pending_post_count")
    val carouselMediaPendingPostCount: Long?,
    @SerializedName("commenting_disabled_for_viewer")
    val commentingDisabledForViewer: Boolean?,
    @SerializedName("comment_threading_enabled")
    val commentThreadingEnabled: Boolean,
    @SerializedName("max_num_visible_preview_comments")
    val maxNumVisiblePreviewComments: Long,
    @SerializedName("has_more_comments")
    val hasMoreComments: Boolean,
    @SerializedName("preview_comments")
    val previewComments: List<PreviewCommentAllPosts>,
    val comments: List<CommentAllPosts>,
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
    val owner: OwnerAllPosts,
    @SerializedName("timeline_pinned_user_ids")
    val timelinePinnedUserIds: List<Long>?,
    @SerializedName("accessibility_caption")
    val accessibilityCaption: String?,
    @SerializedName("coauthor_producers")
    val coauthorProducers: List<CoauthorProducerAllPosts>?,
    @SerializedName("commerce_integrity_review_decision")
    val commerceIntegrityReviewDecision: String?,
    val crosspost: List<String>?,
    @SerializedName("comment_likes_enabled")
    val commentLikesEnabled: Boolean?,
    @SerializedName("next_max_id")
    val nextMaxId: String?,
    @SerializedName("play_count")
    val playCount: Long?,
    @SerializedName("media_appreciation_settings")
    val mediaAppreciationSettings: MediaAppreciationSettingsAllPosts?,
    @SerializedName("media_cropping_info")
    val mediaCroppingInfo: MediaCroppingInfoAllPosts?,
    @SerializedName("is_artist_pick")
    val isArtistPick: Boolean?,
    @SerializedName("is_third_party_downloads_eligible")
    val isThirdPartyDownloadsEligible: Boolean?,
    @SerializedName("is_dash_eligible")
    val isDashEligible: Long?,
    @SerializedName("video_dash_manifest")
    val videoDashManifest: String?,
    @SerializedName("video_codec")
    val videoCodec: String?,
    @SerializedName("number_of_qualities")
    val numberOfQualities: Long?,
    @SerializedName("video_versions")
    val videoVersions: List<VideoVersionAllPosts>?,
    @SerializedName("video_duration")
    val videoDuration: Double?,
    @SerializedName("has_audio")
    val hasAudio: Boolean?,
    @SerializedName("clips_metadata")
    val clipsMetadata: ClipsMetadataAllPosts?,
)

data class UsertagsAllPosts(
    @SerializedName("in")
    val in_field: List<In>,
)

data class In(
    val user: UserAllPosts,
    val position: List<Double>,
    @SerializedName("start_time_in_video_in_sec")
    val startTimeInVideoInSec: Any?,
    @SerializedName("duration_in_video_in_sec")
    val durationInVideoInSec: Any?,
)

data class UserAllPosts(
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
    val friendshipStatus: FriendshipStatusAllPosts?,
)

data class FriendshipStatusAllPosts(
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

data class CaptionAllPosts(
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

data class User2AllPosts(
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
    val fanClubInfo: FanClubInfoAllPosts,
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
    @SerializedName("profile_pic_id")
    val profilePicId: String,
    @SerializedName("profile_pic_url")
    val profilePicUrl: String,
    @SerializedName("transparency_product_enabled")
    val transparencyProductEnabled: Boolean,
    val username: String,
    @SerializedName("latest_reel_media")
    val latestReelMedia: Long,
)

data class FanClubInfoAllPosts(
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

data class CommentInformTreatmentAllPosts(
    @SerializedName("should_have_inform_treatment")
    val shouldHaveInformTreatment: Boolean,
    val text: String,
    val url: Any?,
    @SerializedName("action_type")
    val actionType: Any?,
)

data class SharingFrictionInfoAllPosts(
    @SerializedName("should_have_sharing_friction")
    val shouldHaveSharingFriction: Boolean,
    @SerializedName("bloks_app_url")
    val bloksAppUrl: Any?,
    @SerializedName("sharing_friction_payload")
    val sharingFrictionPayload: Any?,
)

data class FbUserTagsAllPosts(
    @SerializedName("in")
    val in_field: List<Any?>,
)

data class HighlightsInfoAllPosts(
    @SerializedName("added_to")
    val addedTo: List<Any?>,
)

data class User3AllPosts(
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
    @SerializedName("profile_pic_id")
    val profilePicId: String,
    @SerializedName("profile_pic_url")
    val profilePicUrl: String,
    @SerializedName("transparency_product_enabled")
    val transparencyProductEnabled: Boolean,
    val username: String,
    @SerializedName("latest_reel_media")
    val latestReelMedia: Long,
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

data class ImageVersions2AllPosts(
    val candidates: List<CandidateAllPosts>,
    @SerializedName("additional_candidates")
    val additionalCandidates: AdditionalCandidatesAllPosts?,
    @SerializedName("smart_thumbnail_enabled")
    val smartThumbnailEnabled: Boolean?,
    @SerializedName("scrubber_spritesheet_info_candidates")
    val scrubberSpritesheetInfoCandidates: ScrubberSpritesheetInfoCandidatesAllPosts?,
)

data class CandidateAllPosts(
    val width: Long,
    val height: Long,
    val url: String,
    @SerializedName("scans_profile")
    val scansProfile: String?,
)

data class AdditionalCandidatesAllPosts(
    @SerializedName("igtv_first_frame")
    val igtvFirstFrame: IgtvFirstFrameAllPosts,
    @SerializedName("first_frame")
    val firstFrame: FirstFrameAllPosts,
    @SerializedName("smart_frame")
    val smartFrame: Any?,
)

data class IgtvFirstFrameAllPosts(
    val width: Long,
    val height: Long,
    val url: String,
)

data class FirstFrameAllPosts(
    val width: Long,
    val height: Long,
    val url: String,
)

data class ScrubberSpritesheetInfoCandidatesAllPosts(
    val default: DefaultAllPosts,
)

data class DefaultAllPosts(
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

data class MusicMetadataAllPosts(
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

data class CarouselMedumAllPosts(
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
    val sharingFrictionInfo: SharingFrictionInfo2AllPosts,
    @SerializedName("product_suggestions")
    val productSuggestions: List<ProductSuggestion>,
    @SerializedName("highlights_info")
    val highlightsInfo: HighlightsInfo2,
    @SerializedName("video_versions")
    val videoVersions: List<VideoVersion2AllPosts>?
)

data class VideoVersion2AllPosts(
    val type: Long,
    val width: Long,
    val height: Long,
    val url: String,
    val id: String,
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

data class SharingFrictionInfo2AllPosts(
    @SerializedName("should_have_sharing_friction")
    val shouldHaveSharingFriction: Boolean,
    @SerializedName("bloks_app_url")
    val bloksAppUrl: Any?,
    @SerializedName("sharing_friction_payload")
    val sharingFrictionPayload: Any?,
)

data class ProductSuggestion(
    @SerializedName("product_item")
    val productItem: ProductItem,
)

data class ProductItem(
    @SerializedName("product_id")
    val productId: String,
    @SerializedName("compound_product_id")
    val compoundProductId: String,
    val merchant: Merchant,
    val name: String,
    @SerializedName("main_image")
    val mainImage: MainImage,
    @SerializedName("thumbnail_image")
    val thumbnailImage: ThumbnailImage,
    @SerializedName("review_status")
    val reviewStatus: String,
    @SerializedName("has_variants")
    val hasVariants: Boolean,
    @SerializedName("has_viewer_saved")
    val hasViewerSaved: Boolean,
    val description: String,
    @SerializedName("retailer_id")
    val retailerId: String,
    @SerializedName("external_url")
    val externalUrl: String,
    @SerializedName("checkout_style")
    val checkoutStyle: String,
    @SerializedName("checkout_info")
    val checkoutInfo: Any?,
    @SerializedName("checkout_properties")
    val checkoutProperties: Any?,
    @SerializedName("is_in_stock")
    val isInStock: Boolean,
    val price: String,
    @SerializedName("current_price")
    val currentPrice: String,
    @SerializedName("current_price_amount")
    val currentPriceAmount: String,
    @SerializedName("current_price_stripped")
    val currentPriceStripped: String,
    @SerializedName("full_price")
    val fullPrice: String,
    @SerializedName("full_price_amount")
    val fullPriceAmount: String,
    @SerializedName("full_price_stripped")
    val fullPriceStripped: String,
    @SerializedName("per_unit_price")
    val perUnitPrice: Any?,
)

data class Merchant(
    val pk: String,
    val username: String,
    @SerializedName("is_verified")
    val isVerified: Boolean,
    @SerializedName("profile_pic_url")
    val profilePicUrl: String,
)

data class MainImage(
    @SerializedName("image_versions2")
    val imageVersions2: ImageVersions23,
    val preview: String,
)

data class ImageVersions23(
    val candidates: List<Candidate3>,
)

data class Candidate3(
    val url: String,
    val width: Long,
    val height: Long,
)

data class ThumbnailImage(
    @SerializedName("image_versions2")
    val imageVersions2: ImageVersions24,
    val preview: String,
)

data class ImageVersions24(
    val candidates: List<Candidate4>,
)

data class Candidate4(
    val url: String,
    val width: Long,
    val height: Long,
)

data class HighlightsInfo2(
    @SerializedName("added_to")
    val addedTo: List<Any?>,
)

data class PreviewCommentAllPosts(
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

data class CommentAllPosts(
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

data class OwnerAllPosts(
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
    @SerializedName("profile_pic_id")
    val profilePicId: String,
    @SerializedName("profile_pic_url")
    val profilePicUrl: String,
    @SerializedName("transparency_product_enabled")
    val transparencyProductEnabled: Boolean,
    val username: String,
    @SerializedName("latest_reel_media")
    val latestReelMedia: Long,
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

data class CoauthorProducerAllPosts(
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

data class MediaAppreciationSettingsAllPosts(
    @SerializedName("media_gifting_state")
    val mediaGiftingState: String,
    @SerializedName("gift_count_visibility")
    val giftCountVisibility: String,
)

data class MediaCroppingInfoAllPosts(
    @SerializedName("square_crop")
    val squareCrop: SquareCropAllPosts,
)

data class SquareCropAllPosts(
    @SerializedName("crop_left")
    val cropLeft: Double,
    @SerializedName("crop_right")
    val cropRight: Double,
    @SerializedName("crop_top")
    val cropTop: Double,
    @SerializedName("crop_bottom")
    val cropBottom: Double,
)

data class VideoVersionAllPosts(
    val type: Long,
    val width: Long,
    val height: Long,
    val url: String,
    val id: String,
)

data class ClipsMetadataAllPosts(
    @SerializedName("music_info")
    val musicInfo: MusicInfoAllPosts?,
    @SerializedName("original_sound_info")
    val originalSoundInfo: OriginalSoundInfoAllPosts?,
    @SerializedName("audio_type")
    val audioType: String,
    @SerializedName("music_canonical_id")
    val musicCanonicalId: String,
    @SerializedName("featured_label")
    val featuredLabel: Any?,
    @SerializedName("mashup_info")
    val mashupInfo: MashupInfoAllPosts,
    @SerializedName("reusable_text_info")
    val reusableTextInfo: Any?,
    @SerializedName("reusable_text_attribute_string")
    val reusableTextAttributeString: Any?,
    @SerializedName("nux_info")
    val nuxInfo: Any?,
    @SerializedName("viewer_interaction_settings")
    val viewerInteractionSettings: Any?,
    @SerializedName("branded_content_tag_info")
    val brandedContentTagInfo: BrandedContentTagInfoAllPosts,
    @SerializedName("shopping_info")
    val shoppingInfo: Any?,
    @SerializedName("additional_audio_info")
    val additionalAudioInfo: AdditionalAudioInfoAllPosts,
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
    val contentAppreciationInfo: Any?,
    @SerializedName("achievements_info")
    val achievementsInfo: AchievementsInfoAllPosts,
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

data class MusicInfoAllPosts(
    @SerializedName("music_asset_info")
    val musicAssetInfo: MusicAssetInfoAllPosts,
    @SerializedName("music_consumption_info")
    val musicConsumptionInfo: MusicConsumptionInfoAllPosts,
    @SerializedName("music_canonical_id")
    val musicCanonicalId: Any?,
)

data class MusicAssetInfoAllPosts(
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
    val artistId: String,
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
    val web30sPreviewDownloadUrl: String,
    @SerializedName("highlight_start_times_in_ms")
    val highlightStartTimesInMs: List<Long>,
    @SerializedName("is_explicit")
    val isExplicit: Boolean,
    @SerializedName("dash_manifest")
    val dashManifest: Any?,
    @SerializedName("has_lyrics")
    val hasLyrics: Boolean,
    @SerializedName("audio_asset_id")
    val audioAssetId: String,
    @SerializedName("duration_in_ms")
    val durationInMs: Long,
    @SerializedName("dark_message")
    val darkMessage: Any?,
    @SerializedName("allows_saving")
    val allowsSaving: Boolean,
    @SerializedName("ig_username")
    val igUsername: String,
    @SerializedName("is_eligible_for_audio_effects")
    val isEligibleForAudioEffects: Boolean,
)

data class MusicConsumptionInfoAllPosts(
    @SerializedName("ig_artist")
    val igArtist: IgArtistAllPosts,
    @SerializedName("placeholder_profile_pic_url")
    val placeholderProfilePicUrl: String,
    @SerializedName("should_mute_audio")
    val shouldMuteAudio: Boolean,
    @SerializedName("should_mute_audio_reason")
    val shouldMuteAudioReason: String,
    @SerializedName("should_mute_audio_reason_type")
    val shouldMuteAudioReasonType: Any?,
    @SerializedName("is_bookmarked")
    val isBookmarked: Boolean,
    @SerializedName("overlap_duration_in_ms")
    val overlapDurationInMs: Long,
    @SerializedName("audio_asset_start_time_in_ms")
    val audioAssetStartTimeInMs: Long,
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
    @SerializedName("derived_content_id")
    val derivedContentId: Any?,
    @SerializedName("audio_filter_infos")
    val audioFilterInfos: List<Any?>,
    @SerializedName("audio_muting_info")
    val audioMutingInfo: AudioMutingInfoAllPosts,
    @SerializedName("contains_lyrics")
    val containsLyrics: Any?,
)

data class IgArtistAllPosts(
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

data class AudioMutingInfoAllPosts(
    @SerializedName("mute_audio")
    val muteAudio: Boolean,
    @SerializedName("mute_reason_str")
    val muteReasonStr: String,
    @SerializedName("allow_audio_editing")
    val allowAudioEditing: Boolean,
    @SerializedName("show_muted_audio_toast")
    val showMutedAudioToast: Boolean,
)

data class OriginalSoundInfoAllPosts(
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
    val igArtist: IgArtist2AllPosts,
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
    val consumptionInfo: ConsumptionInfoAllPosts,
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

data class IgArtist2AllPosts(
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

data class ConsumptionInfoAllPosts(
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

data class MashupInfoAllPosts(
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

data class BrandedContentTagInfoAllPosts(
    @SerializedName("can_add_tag")
    val canAddTag: Boolean,
)

data class AdditionalAudioInfoAllPosts(
    @SerializedName("additional_audio_username")
    val additionalAudioUsername: Any?,
    @SerializedName("audio_reattribution_info")
    val audioReattributionInfo: AudioReattributionInfoAllPosts,
)

data class AudioReattributionInfoAllPosts(
    @SerializedName("should_allow_restore")
    val shouldAllowRestore: Boolean,
)

data class AudioRankingInfo(
    @SerializedName("best_audio_cluster_id")
    val bestAudioClusterId: String,
)

data class AchievementsInfoAllPosts(
    @SerializedName("show_achievements")
    val showAchievements: Boolean,
    @SerializedName("num_earned_achievements")
    val numEarnedAchievements: Any?,
)

data class User7(
    val pk: String,
    @SerializedName("pk_id")
    val pkId: String,
    @SerializedName("full_name")
    val fullName: String,
    @SerializedName("is_private")
    val isPrivate: Boolean,
    @SerializedName("strong_id__")
    val strongId: String,
    @SerializedName("profile_grid_display_type")
    val profileGridDisplayType: String,
    val username: String,
    @SerializedName("is_verified")
    val isVerified: Boolean,
    @SerializedName("profile_pic_id")
    val profilePicId: String,
    @SerializedName("profile_pic_url")
    val profilePicUrl: String,
)
