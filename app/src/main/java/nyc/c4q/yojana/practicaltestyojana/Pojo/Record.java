package nyc.c4q.yojana.practicaltestyojana.Pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by yojanasharma on 12/10/16.
 */

public class Record {

    @SerializedName("liked")
    @Expose
    private int liked;
    @SerializedName("videoDashUrl")
    @Expose
    private String videoDashUrl;
    @SerializedName("foursquareVenueId")
    @Expose
    private String foursquareVenueId;
    @SerializedName("remixDisabled")
    @Expose
    private int remixDisabled;
    @SerializedName("userId")
    @Expose
    private int userId;
    @SerializedName("private")
    @Expose
    private int _private;
    @SerializedName("videoWebmUrl")
    @Expose
    private Object videoWebmUrl;
    @SerializedName("loops")
    @Expose
    private Loops loops;
    @SerializedName("thumbnailUrl")
    @Expose
    private String thumbnailUrl;
    @SerializedName("explicitContent")
    @Expose
    private int explicitContent;
    @SerializedName("repost")
    @Expose
    private Repost repost;
    @SerializedName("verified")
    @Expose
    private int verified;
    @SerializedName("avatarUrl")
    @Expose
    private String avatarUrl;
    @SerializedName("comments")
    @Expose
    private Comments comments;
    @SerializedName("entities")
    @Expose
    private List<Object> entities = null;
    @SerializedName("videoLowURL")
    @Expose
    private String videoLowURL;
    @SerializedName("vanityUrls")
    @Expose
    private List<String> vanityUrls = null;
    @SerializedName("blocked")
    @Expose
    private int blocked;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("tags")
    @Expose
    private List<Object> tags = null;
    @SerializedName("permalinkUrl")
    @Expose
    private String permalinkUrl;
    @SerializedName("promoted")
    @Expose
    private int promoted;
    @SerializedName("postId")
    @Expose
    private int postId;
    @SerializedName("profileBackground")
    @Expose
    private String profileBackground;
    @SerializedName("videoUrl")
    @Expose
    private String videoUrl;
    @SerializedName("followRequested")
    @Expose
    private int followRequested;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("hasSimilarPosts")
    @Expose
    private int hasSimilarPosts;
    @SerializedName("shareUrl")
    @Expose
    private String shareUrl;
    @SerializedName("myRepostId")
    @Expose
    private int myRepostId;
    @SerializedName("following")
    @Expose
    private int following;
    @SerializedName("reposts")
    @Expose
    private Reposts reposts;
    @SerializedName("likes")
    @Expose
    private Likes likes;
    @SerializedName("hasRemixes")
    @Expose
    private int hasRemixes;
    @SerializedName("venueCategoryId")
    @Expose
    private String venueCategoryId;
    @SerializedName("venueName")
    @Expose
    private String venueName;
    @SerializedName("venueCategoryShortName")
    @Expose
    private String venueCategoryShortName;
    @SerializedName("venueCity")
    @Expose
    private String venueCity;
    @SerializedName("venueCountryCode")
    @Expose
    private String venueCountryCode;
    @SerializedName("venueState")
    @Expose
    private String venueState;
    @SerializedName("venueAddress")
    @Expose
    private String venueAddress;
    @SerializedName("venueCategoryIconUrl")
    @Expose
    private String venueCategoryIconUrl;
    @SerializedName("audio_tracks")
    @Expose
    private List<AudioTrack> audioTracks = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public Record() {
    }

    /**
     *
     * @param venueCategoryIconUrl
     * @param hasSimilarPosts
     * @param videoLowURL
     * @param profileBackground
     * @param videoWebmUrl
     * @param vanityUrls
     * @param venueAddress
     * @param loops
     * @param following
     * @param username
     * @param permalinkUrl
     * @param reposts
     * @param created
     * @param _private
     * @param verified
     * @param description
     * @param promoted
     * @param thumbnailUrl
     * @param userId
     * @param avatarUrl
     * @param hasRemixes
     * @param blocked
     * @param audioTracks
     * @param venueCity
     * @param venueName
     * @param venueCategoryShortName
     * @param tags
     * @param videoUrl
     * @param explicitContent
     * @param foursquareVenueId
     * @param liked
     * @param followRequested
     * @param entities
     * @param videoDashUrl
     * @param postId
     * @param venueCountryCode
     * @param remixDisabled
     * @param venueCategoryId
     * @param likes
     * @param myRepostId
     * @param shareUrl
     * @param repost
     * @param venueState
     * @param comments
     */
    public Record(int liked, String videoDashUrl, String foursquareVenueId, int remixDisabled, int userId, int _private, Object videoWebmUrl, Loops loops, String thumbnailUrl, int explicitContent, Repost repost, int verified, String avatarUrl, Comments comments, List<Object> entities, String videoLowURL, List<String> vanityUrls, int blocked, String username, String description, List<Object> tags, String permalinkUrl, int promoted, int postId, String profileBackground, String videoUrl, int followRequested, String created, int hasSimilarPosts, String shareUrl, int myRepostId, int following, Reposts reposts, Likes likes, int hasRemixes, String venueCategoryId, String venueName, String venueCategoryShortName, String venueCity, String venueCountryCode, String venueState, String venueAddress, String venueCategoryIconUrl, List<AudioTrack> audioTracks) {
        super();
        this.liked = liked;
        this.videoDashUrl = videoDashUrl;
        this.foursquareVenueId = foursquareVenueId;
        this.remixDisabled = remixDisabled;
        this.userId = userId;
        this._private = _private;
        this.videoWebmUrl = videoWebmUrl;
        this.loops = loops;
        this.thumbnailUrl = thumbnailUrl;
        this.explicitContent = explicitContent;
        this.repost = repost;
        this.verified = verified;
        this.avatarUrl = avatarUrl;
        this.comments = comments;
        this.entities = entities;
        this.videoLowURL = videoLowURL;
        this.vanityUrls = vanityUrls;
        this.blocked = blocked;
        this.username = username;
        this.description = description;
        this.tags = tags;
        this.permalinkUrl = permalinkUrl;
        this.promoted = promoted;
        this.postId = postId;
        this.profileBackground = profileBackground;
        this.videoUrl = videoUrl;
        this.followRequested = followRequested;
        this.created = created;
        this.hasSimilarPosts = hasSimilarPosts;
        this.shareUrl = shareUrl;
        this.myRepostId = myRepostId;
        this.following = following;
        this.reposts = reposts;
        this.likes = likes;
        this.hasRemixes = hasRemixes;
        this.venueCategoryId = venueCategoryId;
        this.venueName = venueName;
        this.venueCategoryShortName = venueCategoryShortName;
        this.venueCity = venueCity;
        this.venueCountryCode = venueCountryCode;
        this.venueState = venueState;
        this.venueAddress = venueAddress;
        this.venueCategoryIconUrl = venueCategoryIconUrl;
        this.audioTracks = audioTracks;
    }

    /**
     *
     * @return
     * The liked
     */
    public int getLiked() {
        return liked;
    }

    /**
     *
     * @param liked
     * The liked
     */
    public void setLiked(int liked) {
        this.liked = liked;
    }

    /**
     *
     * @return
     * The videoDashUrl
     */
    public String getVideoDashUrl() {
        return videoDashUrl;
    }

    /**
     *
     * @param videoDashUrl
     * The videoDashUrl
     */
    public void setVideoDashUrl(String videoDashUrl) {
        this.videoDashUrl = videoDashUrl;
    }

    /**
     *
     * @return
     * The foursquareVenueId
     */
    public String getFoursquareVenueId() {
        return foursquareVenueId;
    }

    /**
     *
     * @param foursquareVenueId
     * The foursquareVenueId
     */
    public void setFoursquareVenueId(String foursquareVenueId) {
        this.foursquareVenueId = foursquareVenueId;
    }

    /**
     *
     * @return
     * The remixDisabled
     */
    public int getRemixDisabled() {
        return remixDisabled;
    }

    /**
     *
     * @param remixDisabled
     * The remixDisabled
     */
    public void setRemixDisabled(int remixDisabled) {
        this.remixDisabled = remixDisabled;
    }

    /**
     *
     * @return
     * The userId
     */
    public int getUserId() {
        return userId;
    }

    /**
     *
     * @param userId
     * The userId
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     *
     * @return
     * The _private
     */
    public int getPrivate() {
        return _private;
    }

    /**
     *
     * @param _private
     * The private
     */
    public void setPrivate(int _private) {
        this._private = _private;
    }

    /**
     *
     * @return
     * The videoWebmUrl
     */
    public Object getVideoWebmUrl() {
        return videoWebmUrl;
    }

    /**
     *
     * @param videoWebmUrl
     * The videoWebmUrl
     */
    public void setVideoWebmUrl(Object videoWebmUrl) {
        this.videoWebmUrl = videoWebmUrl;
    }

    /**
     *
     * @return
     * The loops
     */
    public Loops getLoops() {
        return loops;
    }

    /**
     *
     * @param loops
     * The loops
     */
    public void setLoops(Loops loops) {
        this.loops = loops;
    }

    /**
     *
     * @return
     * The thumbnailUrl
     */
    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    /**
     *
     * @param thumbnailUrl
     * The thumbnailUrl
     */
    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    /**
     *
     * @return
     * The explicitContent
     */
    public int getExplicitContent() {
        return explicitContent;
    }

    /**
     *
     * @param explicitContent
     * The explicitContent
     */
    public void setExplicitContent(int explicitContent) {
        this.explicitContent = explicitContent;
    }

    /**
     *
     * @return
     * The repost
     */
    public Repost getRepost() {
        return repost;
    }

    /**
     *
     * @param repost
     * The repost
     */
    public void setRepost(Repost repost) {
        this.repost = repost;
    }

    /**
     *
     * @return
     * The verified
     */
    public int getVerified() {
        return verified;
    }

    /**
     *
     * @param verified
     * The verified
     */
    public void setVerified(int verified) {
        this.verified = verified;
    }

    /**
     *
     * @return
     * The avatarUrl
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     *
     * @param avatarUrl
     * The avatarUrl
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    /**
     *
     * @return
     * The comments
     */
    public Comments getComments() {
        return comments;
    }

    /**
     *
     * @param comments
     * The comments
     */
    public void setComments(Comments comments) {
        this.comments = comments;
    }

    /**
     *
     * @return
     * The entities
     */
    public List<Object> getEntities() {
        return entities;
    }

    /**
     *
     * @param entities
     * The entities
     */
    public void setEntities(List<Object> entities) {
        this.entities = entities;
    }

    /**
     *
     * @return
     * The videoLowURL
     */
    public String getVideoLowURL() {
        return videoLowURL;
    }

    /**
     *
     * @param videoLowURL
     * The videoLowURL
     */
    public void setVideoLowURL(String videoLowURL) {
        this.videoLowURL = videoLowURL;
    }

    /**
     *
     * @return
     * The vanityUrls
     */
    public List<String> getVanityUrls() {
        return vanityUrls;
    }

    /**
     *
     * @param vanityUrls
     * The vanityUrls
     */
    public void setVanityUrls(List<String> vanityUrls) {
        this.vanityUrls = vanityUrls;
    }

    /**
     *
     * @return
     * The blocked
     */
    public int getBlocked() {
        return blocked;
    }

    /**
     *
     * @param blocked
     * The blocked
     */
    public void setBlocked(int blocked) {
        this.blocked = blocked;
    }

    /**
     *
     * @return
     * The username
     */
    public String getUsername() {
        return username;
    }

    /**
     *
     * @param username
     * The username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     * The tags
     */
    public List<Object> getTags() {
        return tags;
    }

    /**
     *
     * @param tags
     * The tags
     */
    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    /**
     *
     * @return
     * The permalinkUrl
     */
    public String getPermalinkUrl() {
        return permalinkUrl;
    }

    /**
     *
     * @param permalinkUrl
     * The permalinkUrl
     */
    public void setPermalinkUrl(String permalinkUrl) {
        this.permalinkUrl = permalinkUrl;
    }

    /**
     *
     * @return
     * The promoted
     */
    public int getPromoted() {
        return promoted;
    }

    /**
     *
     * @param promoted
     * The promoted
     */
    public void setPromoted(int promoted) {
        this.promoted = promoted;
    }

    /**
     *
     * @return
     * The postId
     */
    public int getPostId() {
        return postId;
    }

    /**
     *
     * @param postId
     * The postId
     */
    public void setPostId(int postId) {
        this.postId = postId;
    }

    /**
     *
     * @return
     * The profileBackground
     */
    public String getProfileBackground() {
        return profileBackground;
    }

    /**
     *
     * @param profileBackground
     * The profileBackground
     */
    public void setProfileBackground(String profileBackground) {
        this.profileBackground = profileBackground;
    }

    /**
     *
     * @return
     * The videoUrl
     */
    public String getVideoUrl() {
        return videoUrl;
    }

    /**
     *
     * @param videoUrl
     * The videoUrl
     */
    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    /**
     *
     * @return
     * The followRequested
     */
    public int getFollowRequested() {
        return followRequested;
    }

    /**
     *
     * @param followRequested
     * The followRequested
     */
    public void setFollowRequested(int followRequested) {
        this.followRequested = followRequested;
    }

    /**
     *
     * @return
     * The created
     */
    public String getCreated() {
        return created;
    }

    /**
     *
     * @param created
     * The created
     */
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     *
     * @return
     * The hasSimilarPosts
     */
    public int getHasSimilarPosts() {
        return hasSimilarPosts;
    }

    /**
     *
     * @param hasSimilarPosts
     * The hasSimilarPosts
     */
    public void setHasSimilarPosts(int hasSimilarPosts) {
        this.hasSimilarPosts = hasSimilarPosts;
    }

    /**
     *
     * @return
     * The shareUrl
     */
    public String getShareUrl() {
        return shareUrl;
    }

    /**
     *
     * @param shareUrl
     * The shareUrl
     */
    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }

    /**
     *
     * @return
     * The myRepostId
     */
    public int getMyRepostId() {
        return myRepostId;
    }

    /**
     *
     * @param myRepostId
     * The myRepostId
     */
    public void setMyRepostId(int myRepostId) {
        this.myRepostId = myRepostId;
    }

    /**
     *
     * @return
     * The following
     */
    public int getFollowing() {
        return following;
    }

    /**
     *
     * @param following
     * The following
     */
    public void setFollowing(int following) {
        this.following = following;
    }

    /**
     *
     * @return
     * The reposts
     */
    public Reposts getReposts() {
        return reposts;
    }

    /**
     *
     * @param reposts
     * The reposts
     */
    public void setReposts(Reposts reposts) {
        this.reposts = reposts;
    }

    /**
     *
     * @return
     * The likes
     */
    public Likes getLikes() {
        return likes;
    }

    /**
     *
     * @param likes
     * The likes
     */
    public void setLikes(Likes likes) {
        this.likes = likes;
    }

    /**
     *
     * @return
     * The hasRemixes
     */
    public int getHasRemixes() {
        return hasRemixes;
    }

    /**
     *
     * @param hasRemixes
     * The hasRemixes
     */
    public void setHasRemixes(int hasRemixes) {
        this.hasRemixes = hasRemixes;
    }

    /**
     *
     * @return
     * The venueCategoryId
     */
    public String getVenueCategoryId() {
        return venueCategoryId;
    }

    /**
     *
     * @param venueCategoryId
     * The venueCategoryId
     */
    public void setVenueCategoryId(String venueCategoryId) {
        this.venueCategoryId = venueCategoryId;
    }

    /**
     *
     * @return
     * The venueName
     */
    public String getVenueName() {
        return venueName;
    }

    /**
     *
     * @param venueName
     * The venueName
     */
    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    /**
     *
     * @return
     * The venueCategoryShortName
     */
    public String getVenueCategoryShortName() {
        return venueCategoryShortName;
    }

    /**
     *
     * @param venueCategoryShortName
     * The venueCategoryShortName
     */
    public void setVenueCategoryShortName(String venueCategoryShortName) {
        this.venueCategoryShortName = venueCategoryShortName;
    }

    /**
     *
     * @return
     * The venueCity
     */
    public String getVenueCity() {
        return venueCity;
    }

    /**
     *
     * @param venueCity
     * The venueCity
     */
    public void setVenueCity(String venueCity) {
        this.venueCity = venueCity;
    }

    /**
     *
     * @return
     * The venueCountryCode
     */
    public String getVenueCountryCode() {
        return venueCountryCode;
    }

    /**
     *
     * @param venueCountryCode
     * The venueCountryCode
     */
    public void setVenueCountryCode(String venueCountryCode) {
        this.venueCountryCode = venueCountryCode;
    }

    /**
     *
     * @return
     * The venueState
     */
    public String getVenueState() {
        return venueState;
    }

    /**
     *
     * @param venueState
     * The venueState
     */
    public void setVenueState(String venueState) {
        this.venueState = venueState;
    }

    /**
     *
     * @return
     * The venueAddress
     */
    public String getVenueAddress() {
        return venueAddress;
    }

    /**
     *
     * @param venueAddress
     * The venueAddress
     */
    public void setVenueAddress(String venueAddress) {
        this.venueAddress = venueAddress;
    }

    /**
     *
     * @return
     * The venueCategoryIconUrl
     */
    public String getVenueCategoryIconUrl() {
        return venueCategoryIconUrl;
    }

    /**
     *
     * @param venueCategoryIconUrl
     * The venueCategoryIconUrl
     */
    public void setVenueCategoryIconUrl(String venueCategoryIconUrl) {
        this.venueCategoryIconUrl = venueCategoryIconUrl;
    }

    /**
     *
     * @return
     * The audioTracks
     */
    public List<AudioTrack> getAudioTracks() {
        return audioTracks;
    }

    /**
     *
     * @param audioTracks
     * The audio_tracks
     */
    public void setAudioTracks(List<AudioTrack> audioTracks) {
        this.audioTracks = audioTracks;
    }

}
