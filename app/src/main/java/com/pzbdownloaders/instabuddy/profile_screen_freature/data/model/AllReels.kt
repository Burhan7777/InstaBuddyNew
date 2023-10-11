package com.pzbdownloaders.instabuddy.profile_screen_freature.data.model

import com.google.gson.annotations.SerializedName

data class AllReels(
    val items: List<Item>,
    @SerializedName("paging_info")
    val pagingInfo: PagingInfo,
    val status: String,
    @SerializedName("unrelated_data")
    val unrelatedData: UnrelatedDataVideo,
)

data class Item(
    val media: Media,
)

data class Media(
    @SerializedName("taken_at")
    val takenAt: Long,
    val pk: Long,
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
    @SerializedName("enable_waist")
    val enableWaist: Boolean,
    @SerializedName("view_state_item_type")
    val viewStateItemType: Long?,
    @SerializedName("logging_info_token")
    val loggingInfoToken: String,
    @SerializedName("shop_routing_user_id")
    val shopRoutingUserId: Any?,
    @SerializedName("can_see_insights_as_brand")
    val canSeeInsightsAsBrand: Boolean,
    @SerializedName("is_organic_product_tagging_eligible")
    val isOrganicProductTaggingEligible: Boolean,
    @SerializedName("has_liked")
    val hasLiked: Boolean,
    @SerializedName("like_count")
    val likeCount: Long,
    @SerializedName("top_likers")
    val topLikers: List<String>,
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
    @SerializedName("fundraiser_tag")
    val fundraiserTag: FundraiserTag,
    @SerializedName("sharing_friction_info")
    val sharingFrictionInfoVideo: SharingFrictionInfo,
    @SerializedName("play_count")
    val playCount: Long?,
    @SerializedName("media_appreciation_settings")
    val mediaAppreciationSettings: MediaAppreciationSettings?,
    @SerializedName("original_media_has_visual_reply_media")
    val originalMediaHasVisualReplyMedia: Boolean,
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
   /* @SerializedName("media_cropping_info")
    val mediaCroppingInfo: MediaCroppingInfo?,*/
    @SerializedName("product_suggestions")
    val productSuggestions: List<Any?>,
    val user: User2Video,
    @SerializedName("image_versions2")
    val imageVersions2: ImageVersions2,
    @SerializedName("original_width")
    val originalWidth: Long,
    @SerializedName("original_height")
    val originalHeight: Long,
    @SerializedName("is_artist_pick")
    val isArtistPick: Boolean?,
    @SerializedName("product_type")
    val productType: String,
    @SerializedName("is_paid_partnership")
    val isPaidPartnership: Boolean,
    val location: LocationVideo,
    @SerializedName("reshare_count")
    val reshareCount: Long?,
    @SerializedName("music_metadata")
    val musicMetadata: MusicMetadata?,
    @SerializedName("social_context")
    val socialContext: List<Any?>,
    @SerializedName("organic_tracking_token")
    val organicTrackingToken: String,
    @SerializedName("is_third_party_downloads_eligible")
    val isThirdPartyDownloadsEligible: Boolean?,
    @SerializedName("ig_media_sharing_disabled")
    val igMediaSharingDisabled: Boolean,
    val lng: Double?,
    val lat: Double?,
    @SerializedName("is_open_to_public_submission")
    val isOpenToPublicSubmission: Boolean,
    @SerializedName("comment_threading_enabled")
    val commentThreadingEnabled: Boolean,
    @SerializedName("max_num_visible_preview_comments")
    val maxNumVisiblePreviewComments: Long,
    @SerializedName("has_more_comments")
    val hasMoreComments: Boolean,
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
    @SerializedName("clips_metadata")
    val clipsMetadata: ClipsMetadata?,
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
    @SerializedName("has_audio")
    val hasAudio: Boolean,
    @SerializedName("video_duration")
    val videoDuration: Double,
    @SerializedName("video_subtitles_confidence")
    val videoSubtitlesConfidence: Double?,
    @SerializedName("view_count")
    val viewCount: Long?,
    @SerializedName("mashup_info")
    val mashupInfo: MashupInfo2?,
)

data class Caption(
    val pk: String,
    @SerializedName("user_id")
    val userId: Long,
    val user: UserVideo,
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
    val mediaId: Long,
)

data class UserVideo(
    val pk: Long,
    @SerializedName("pk_id")
    val pkId: String,
    @SerializedName("full_name")
    val fullName: String,
    @SerializedName("is_private")
    val isPrivate: Boolean,
    @SerializedName("fbid_v2")
    val fbidV2: String,
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

data class CommentInformTreatment(
    @SerializedName("should_have_inform_treatment")
    val shouldHaveInformTreatment: Boolean,
    val text: String,
    val url: Any?,
    @SerializedName("action_type")
    val actionType: Any?,
)

data class FundraiserTag(
    @SerializedName("has_standalone_fundraiser")
    val hasStandaloneFundraiser: Boolean,
)

data class SharingFrictionInfoVideo(
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

/*data class MediaCroppingInfo(
    @SerializedName("square_crop")
    val squareCrop: SquareCrop,
)*/

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

data class User2Video(
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
    val pk: Long,
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
    @SerializedName("is_favorite")
    val isFavorite: Boolean,
    @SerializedName("is_verified")
    val isVerified: Boolean,
    @SerializedName("profile_pic_id")
    val profilePicId: String,
    @SerializedName("profile_pic_url")
    val profilePicUrl: String,
    @SerializedName("reshare_xpost_deny_reasons_for_user")
    val reshareXpostDenyReasonsForUser: List<String>?,
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
    @SerializedName("outgoing_request")
    val outgoingRequest: Boolean,
    @SerializedName("is_bestie")
    val isBestie: Boolean,
    @SerializedName("is_restricted")
    val isRestricted: Boolean,
    @SerializedName("is_feed_favorite")
    val isFeedFavorite: Boolean,
)

data class ImageVersions2(
    val candidates: List<Candidate>,
    @SerializedName("additional_candidates")
    val additionalCandidates: AdditionalCandidates?,
    @SerializedName("smart_thumbnail_enabled")
    val smartThumbnailEnabled: Boolean?,
    @SerializedName("scrubber_spritesheet_info_candidates")
    val scrubberSpritesheetInfoCandidates: ScrubberSpritesheetInfoCandidates?,
)

data class Candidate(
    val width: Long,
    val height: Long,
    val url: String,
    @SerializedName("scans_profile")
    val scansProfile: String,
    @SerializedName("estimated_scans_sizes")
    val estimatedScansSizes: List<Long>?,
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
    @SerializedName("scans_profile")
    val scansProfile: String,
    @SerializedName("estimated_scans_sizes")
    val estimatedScansSizes: List<Long>?,
)

data class FirstFrame(
    val width: Long,
    val height: Long,
    val url: String,
    @SerializedName("scans_profile")
    val scansProfile: String,
    @SerializedName("estimated_scans_sizes")
    val estimatedScansSizes: List<Long>?,
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

data class LocationVideo(
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
    val lng: Double?,
    val lat: Double?,
    @SerializedName("is_eligible_for_guides")
    val isEligibleForGuides: Boolean,
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

data class ClipsMetadata(
    @SerializedName("music_info")
    val musicInfo: MusicInfo?,
    @SerializedName("original_sound_info")
    val originalSoundInfo: OriginalSoundInfo?,
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
    val assetRecommendationInfo: AssetRecommendationInfo?,
    @SerializedName("contextual_highlight_info")
    val contextualHighlightInfo: Any?,
    @SerializedName("clips_creation_entry_point")
    val clipsCreationEntryPoint: String,
    @SerializedName("audio_ranking_info")
   // val audioRankingInfo: AudioRankingInfo,
   // @SerializedName("template_info")
    val templateInfo: Any?,
    @SerializedName("is_fan_club_promo_video")
    val isFanClubPromoVideo: Boolean,
    @SerializedName("disable_use_in_clips_client_cache")
    val disableUseInClipsClientCache: Boolean,
    @SerializedName("content_appreciation_info")
    val contentAppreciationInfo: Any?,
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
)

data class MusicInfo(
    @SerializedName("music_asset_info")
    val musicAssetInfo: MusicAssetInfo,
    @SerializedName("music_consumption_info")
    val musicConsumptionInfo: MusicConsumptionInfo,
    @SerializedName("music_canonical_id")
    val musicCanonicalId: Any?,
)

data class MusicAssetInfo(
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
    val artistId: String?,
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
    @SerializedName("is_explicit")
    val isExplicit: Boolean,
    @SerializedName("dash_manifest")
    val dashManifest: String,
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
    val igUsername: String?,
    @SerializedName("is_eligible_for_audio_effects")
    val isEligibleForAudioEffects: Boolean,
)

data class MusicConsumptionInfo(
    @SerializedName("ig_artist")
    val igArtist: IgArtist?,
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
    val audioMutingInfo: AudioMutingInfo,
)

data class IgArtist(
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
    val profilePicId: String?,
    @SerializedName("profile_pic_url")
    val profilePicUrl: String,
)

data class AudioMutingInfo(
    @SerializedName("mute_audio")
    val muteAudio: Boolean,
    @SerializedName("mute_reason_str")
    val muteReasonStr: String,
    @SerializedName("allow_audio_editing")
    val allowAudioEditing: Boolean,
    @SerializedName("show_muted_audio_toast")
    val showMutedAudioToast: Boolean,
)

data class OriginalSoundInfo(
    @SerializedName("audio_asset_id")
    val audioAssetId: Long,
    @SerializedName("music_canonical_id")
    val musicCanonicalId: Any?,
    @SerializedName("progressive_download_url")
    val progressiveDownloadUrl: String,
    @SerializedName("duration_in_ms")
    val durationInMs: Long,
    @SerializedName("dash_manifest")
    val dashManifest: String,
    @SerializedName("ig_artist")
    val igArtist: IgArtist2,
    @SerializedName("should_mute_audio")
    val shouldMuteAudio: Boolean,
    @SerializedName("hide_remixing")
    val hideRemixing: Boolean,
    @SerializedName("original_media_id")
    val originalMediaId: Long,
    @SerializedName("time_created")
    val timeCreated: Long,
    @SerializedName("original_audio_title")
    val originalAudioTitle: String,
    @SerializedName("consumption_info")
    val consumptionInfo: ConsumptionInfo,
    @SerializedName("can_remix_be_shared_to_fb")
    val canRemixBeSharedToFb: Boolean,
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
)

data class IgArtist2(
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

data class AssetRecommendationInfo(
    @SerializedName("asset_recommendations")
    val assetRecommendations: List<AssetRecommendation>,
)

data class AssetRecommendation(
    @SerializedName("asset_id")
    val assetId: String,
    @SerializedName("asset_type")
    val assetType: String,
    @SerializedName("asset_name")
    val assetName: String,
    val extra: String,
    @SerializedName("cover_artwork_thumbnail_uri")
    val coverArtworkThumbnailUri: String,
)

/*data class AudioRankingInfo(
    @SerializedName("best_audio_cluster_id")
    val bestAudioClusterId: String,
)*/

data class AchievementsInfo(
    @SerializedName("show_achievements")
    val showAchievements: Boolean,
    @SerializedName("num_earned_achievements")
    val numEarnedAchievements: Any?,
)

data class VideoVersion(
    val type: Long,
    val width: Long,
    val height: Long,
    val url: String,
    val id: String,
)

data class MashupInfo2(
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
    val nonPrivacyFilteredMashupsMediaCount: Any?,
    @SerializedName("mashup_type")
    val mashupType: Any?,
    @SerializedName("is_creator_requesting_mashup")
    val isCreatorRequestingMashup: Boolean,
    @SerializedName("has_nonmimicable_additional_audio")
    val hasNonmimicableAdditionalAudio: Boolean,
    @SerializedName("is_pivot_page_available")
    val isPivotPageAvailable: Boolean,
)

data class PagingInfo(
    @SerializedName("max_id")
    val maxId: String,
    @SerializedName("more_available")
    val moreAvailable: Boolean,
)

data class UnrelatedDataVideo(
    val retry: Long,
    @SerializedName("id_acc")
    val idAcc: String,
    @SerializedName("proxy_id")
    val proxyId: String,
    @SerializedName("time_gen")
    val timeGen: Double,
)
