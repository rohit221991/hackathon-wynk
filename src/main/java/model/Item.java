package model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import constants.ApiConstants;
import constants.ItemType;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * Created by rohit on 2/25/16.
 */
@JsonSerialize
public class Item {

    private String mId;

    private ItemType mType;

    private String mLang;

    private String mTitle;

    private String mThumbnailUrl;

    private String mSmallImageUrl;

    private String mMediumImageUrl;

    private String mLargeImageUrl;

    private List<Item> mItems;

    private boolean mLiked;

    private DownloadState mOfflineState = DownloadState.NONE;

    private DownloadState mBuyState = DownloadState.NONE;

    private String mStreamingUrl;

    private String mOStreamingUrl;

    private String mRentUrl;

    private List<Item> mArtists;

    private String mParentTitle;

    private String mParentId;

    private List<Item> mGenres;

    private List<Item> mMoods;

    private String mDownloadUrl;

    private String mPurchaseUrl;

    private int mCount;

    private String mLikesLabel;

    private String mSharesLabel;

    private String mPlaysLabel;

    private boolean mExclusive;

    private int mPlays;

    private int mLikes;

    private int mShares;

    private List<Item> mCast;

    private List<Item> mLyricist;

    private List<Item> mComposers;

    private String mShortUrl;

    private String mSubType;

    private boolean mSponsored;

    private String mLyrics;

    private String mLabel;

    private String mDownloadPrice;

    List<String> mVideoUrls;

    List<HelloTune> mHelloTunes;

    private int mDuration;

    private int mTotal;

    private int mOffset;

    private long mLastUpdatedTime;

    private long mDownloadedTime;

    private long mRentedTime;

    private long mLikedTime;

    private boolean mRadioEnabled;

    private Visibility mVisibility;

    private List<ItemType> mItemTypes;

    private ItemType mSubTitleType;

    private String mSubTitle;

    private String mSubTitleId;

    private boolean mAutoCreated;

    private String mKeywords;

    private List<SongQuality> mAvailableSongQualities;

    private boolean mUserStatesAvailable;

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    public ItemType getmType() {
        return mType;
    }

    public void setmType(ItemType mType) {
        this.mType = mType;
    }

    public String getmLang() {
        return mLang;
    }

    public void setmLang(String mLang) {
        this.mLang = mLang;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmThumbnailUrl() {
        return mThumbnailUrl;
    }

    public void setmThumbnailUrl(String mThumbnailUrl) {
        this.mThumbnailUrl = mThumbnailUrl;
    }

    public String getmSmallImageUrl() {
        return mSmallImageUrl;
    }

    public void setmSmallImageUrl(String mSmallImageUrl) {
        this.mSmallImageUrl = mSmallImageUrl;
    }

    public String getmMediumImageUrl() {
        return mMediumImageUrl;
    }

    public void setmMediumImageUrl(String mMediumImageUrl) {
        this.mMediumImageUrl = mMediumImageUrl;
    }

    public String getmLargeImageUrl() {
        return mLargeImageUrl;
    }

    public void setmLargeImageUrl(String mLargeImageUrl) {
        this.mLargeImageUrl = mLargeImageUrl;
    }

    public List<Item> getmItems() {
        return mItems;
    }

    public void setmItems(List<Item> mItems) {
        this.mItems = mItems;
    }

    public boolean ismLiked() {
        return mLiked;
    }

    public void setmLiked(boolean mLiked) {
        this.mLiked = mLiked;
    }

    public DownloadState getmOfflineState() {
        return mOfflineState;
    }

    public void setmOfflineState(DownloadState mOfflineState) {
        this.mOfflineState = mOfflineState;
    }

    public DownloadState getmBuyState() {
        return mBuyState;
    }

    public void setmBuyState(DownloadState mBuyState) {
        this.mBuyState = mBuyState;
    }

    public String getmStreamingUrl() {
        return mStreamingUrl;
    }

    public void setmStreamingUrl(String mStreamingUrl) {
        this.mStreamingUrl = mStreamingUrl;
    }

    public String getmOStreamingUrl() {
        return mOStreamingUrl;
    }

    public void setmOStreamingUrl(String mOStreamingUrl) {
        this.mOStreamingUrl = mOStreamingUrl;
    }

    public String getmRentUrl() {
        return mRentUrl;
    }

    public void setmRentUrl(String mRentUrl) {
        this.mRentUrl = mRentUrl;
    }

    public List<Item> getmArtists() {
        return mArtists;
    }

    public void setmArtists(List<Item> mArtists) {
        this.mArtists = mArtists;
    }

    public String getmParentTitle() {
        return mParentTitle;
    }

    public void setmParentTitle(String mParentTitle) {
        this.mParentTitle = mParentTitle;
    }

    public String getmParentId() {
        return mParentId;
    }

    public void setmParentId(String mParentId) {
        this.mParentId = mParentId;
    }

    public List<Item> getmGenres() {
        return mGenres;
    }

    public void setmGenres(List<Item> mGenres) {
        this.mGenres = mGenres;
    }

    public List<Item> getmMoods() {
        return mMoods;
    }

    public void setmMoods(List<Item> mMoods) {
        this.mMoods = mMoods;
    }

    public String getmDownloadUrl() {
        return mDownloadUrl;
    }

    public void setmDownloadUrl(String mDownloadUrl) {
        this.mDownloadUrl = mDownloadUrl;
    }

    public String getmPurchaseUrl() {
        return mPurchaseUrl;
    }

    public void setmPurchaseUrl(String mPurchaseUrl) {
        this.mPurchaseUrl = mPurchaseUrl;
    }

    public int getmCount() {
        return mCount;
    }

    public void setmCount(int mCount) {
        this.mCount = mCount;
    }

    public String getmLikesLabel() {
        return mLikesLabel;
    }

    public void setmLikesLabel(String mLikesLabel) {
        this.mLikesLabel = mLikesLabel;
    }

    public String getmSharesLabel() {
        return mSharesLabel;
    }

    public void setmSharesLabel(String mSharesLabel) {
        this.mSharesLabel = mSharesLabel;
    }

    public String getmPlaysLabel() {
        return mPlaysLabel;
    }

    public void setmPlaysLabel(String mPlaysLabel) {
        this.mPlaysLabel = mPlaysLabel;
    }

    public boolean ismExclusive() {
        return mExclusive;
    }

    public void setmExclusive(boolean mExclusive) {
        this.mExclusive = mExclusive;
    }

    public int getmPlays() {
        return mPlays;
    }

    public void setmPlays(int mPlays) {
        this.mPlays = mPlays;
    }

    public int getmLikes() {
        return mLikes;
    }

    public void setmLikes(int mLikes) {
        this.mLikes = mLikes;
    }

    public int getmShares() {
        return mShares;
    }

    public void setmShares(int mShares) {
        this.mShares = mShares;
    }

    public List<Item> getmCast() {
        return mCast;
    }

    public void setmCast(List<Item> mCast) {
        this.mCast = mCast;
    }

    public List<Item> getmLyricist() {
        return mLyricist;
    }

    public void setmLyricist(List<Item> mLyricist) {
        this.mLyricist = mLyricist;
    }

    public List<Item> getmComposers() {
        return mComposers;
    }

    public void setmComposers(List<Item> mComposers) {
        this.mComposers = mComposers;
    }

    public String getmShortUrl() {
        return mShortUrl;
    }

    public void setmShortUrl(String mShortUrl) {
        this.mShortUrl = mShortUrl;
    }

    public String getmSubType() {
        return mSubType;
    }

    public void setmSubType(String mSubType) {
        this.mSubType = mSubType;
    }

    public boolean ismSponsored() {
        return mSponsored;
    }

    public void setmSponsored(boolean mSponsored) {
        this.mSponsored = mSponsored;
    }

    public String getmLyrics() {
        return mLyrics;
    }

    public void setmLyrics(String mLyrics) {
        this.mLyrics = mLyrics;
    }

    public String getmLabel() {
        return mLabel;
    }

    public void setmLabel(String mLabel) {
        this.mLabel = mLabel;
    }

    public String getmDownloadPrice() {
        return mDownloadPrice;
    }

    public void setmDownloadPrice(String mDownloadPrice) {
        this.mDownloadPrice = mDownloadPrice;
    }

    public List<String> getmVideoUrls() {
        return mVideoUrls;
    }

    public void setmVideoUrls(List<String> mVideoUrls) {
        this.mVideoUrls = mVideoUrls;
    }

    public List<HelloTune> getmHelloTunes() {
        return mHelloTunes;
    }

    public void setmHelloTunes(List<HelloTune> mHelloTunes) {
        this.mHelloTunes = mHelloTunes;
    }

    public int getmDuration() {
        return mDuration;
    }

    public void setmDuration(int mDuration) {
        this.mDuration = mDuration;
    }

    public int getmTotal() {
        return mTotal;
    }

    public void setmTotal(int mTotal) {
        this.mTotal = mTotal;
    }

    public int getmOffset() {
        return mOffset;
    }

    public void setmOffset(int mOffset) {
        this.mOffset = mOffset;
    }

    public long getmLastUpdatedTime() {
        return mLastUpdatedTime;
    }

    public void setmLastUpdatedTime(long mLastUpdatedTime) {
        this.mLastUpdatedTime = mLastUpdatedTime;
    }

    public long getmDownloadedTime() {
        return mDownloadedTime;
    }

    public void setmDownloadedTime(long mDownloadedTime) {
        this.mDownloadedTime = mDownloadedTime;
    }

    public long getmRentedTime() {
        return mRentedTime;
    }

    public void setmRentedTime(long mRentedTime) {
        this.mRentedTime = mRentedTime;
    }

    public long getmLikedTime() {
        return mLikedTime;
    }

    public void setmLikedTime(long mLikedTime) {
        this.mLikedTime = mLikedTime;
    }

    public boolean ismRadioEnabled() {
        return mRadioEnabled;
    }

    public void setmRadioEnabled(boolean mRadioEnabled) {
        this.mRadioEnabled = mRadioEnabled;
    }

    public Visibility getmVisibility() {
        return mVisibility;
    }

    public void setmVisibility(Visibility mVisibility) {
        this.mVisibility = mVisibility;
    }

    public List<ItemType> getmItemTypes() {
        return mItemTypes;
    }

    public void setmItemTypes(List<ItemType> mItemTypes) {
        this.mItemTypes = mItemTypes;
    }

    public ItemType getmSubTitleType() {
        return mSubTitleType;
    }

    public void setmSubTitleType(ItemType mSubTitleType) {
        this.mSubTitleType = mSubTitleType;
    }

    public String getmSubTitle() {
        return mSubTitle;
    }

    public void setmSubTitle(String mSubTitle) {
        this.mSubTitle = mSubTitle;
    }

    public String getmSubTitleId() {
        return mSubTitleId;
    }

    public void setmSubTitleId(String mSubTitleId) {
        this.mSubTitleId = mSubTitleId;
    }

    public boolean ismAutoCreated() {
        return mAutoCreated;
    }

    public void setmAutoCreated(boolean mAutoCreated) {
        this.mAutoCreated = mAutoCreated;
    }

    public String getmKeywords() {
        return mKeywords;
    }

    public void setmKeywords(String mKeywords) {
        this.mKeywords = mKeywords;
    }

    public List<SongQuality> getmAvailableSongQualities() {
        return mAvailableSongQualities;
    }

    public void setmAvailableSongQualities(List<SongQuality> mAvailableSongQualities) {
        this.mAvailableSongQualities = mAvailableSongQualities;
    }

    public boolean ismUserStatesAvailable() {
        return mUserStatesAvailable;
    }

    public void setmUserStatesAvailable(boolean mUserStatesAvailable) {
        this.mUserStatesAvailable = mUserStatesAvailable;
    }

    public enum DownloadState {
        NONE(0), INITIALIZING(1), DOWNLOADING(2), DOWNLOADED(3), ERROR(-1), QUEUED(-2);

        private int id;

        private static Map<Integer, DownloadState> idToDownloadStateMap = new HashMap<Integer, DownloadState>();

        static {
            for (DownloadState state : DownloadState.values()) {
                idToDownloadStateMap.put(state.getId(), state);
            }
        }

        private DownloadState(int id) {
            this.id = id;
        }

        public int getId() {
            return this.id;
        }

        public static DownloadState getDownloadStateById(int id) {
            if (idToDownloadStateMap.get(id) != null) {
                return idToDownloadStateMap.get(id);
            }
            return DownloadState.NONE;
        }
    }

    public enum Visibility {
        PRIVATE(0), FRIENDS(1), PUBLIC(2);
        private int id;
        private static Map<Integer, Visibility> idToVisibliltyMap = new HashMap<Integer, Item.Visibility>();

        static {
            for (Visibility visibility : Visibility.values()) {
                idToVisibliltyMap.put(visibility.getId(), visibility);
            }
        }

        private Visibility(int id) {
            this.id = id;
        }

        public int getId() {
            return this.id;
        }

        public static Visibility getVisibility(int id) {
            return idToVisibliltyMap.get(id);
        }
    }



    public enum SongQuality {
        AUTO(ApiConstants.Account.SongQuality.AUTO), HD(ApiConstants.Account.SongQuality.HD), HIGH(
                ApiConstants.Account.SongQuality.HIGH), MID(ApiConstants.Account.SongQuality.MID), LOW(
                ApiConstants.Account.SongQuality.LOW);

        private final String                    code;

        private static Map<String, SongQuality> sCodeToSongQualityMap = new HashMap<String, SongQuality>();

        static {
            for (SongQuality songQuality : SongQuality.values()) {
                sCodeToSongQualityMap.put(songQuality.getCode(), songQuality);
            }
        }

        SongQuality(String code) {
            this.code = code;
        }

        public String getCode() {
            return this.code;
        }

        public static SongQuality getSongQualityByCode(String code) {
            code = code.toLowerCase(Locale.US).trim();
            if (sCodeToSongQualityMap.containsKey(code)) {
                return sCodeToSongQualityMap.get(code);
            }
            return null;
        }

        public static SongQuality[] getDownloadQualities() {
            SongQuality[] downloadQualities = new SongQuality[SongQuality.values().length - 1];
            for (int i = 1; i < SongQuality.values().length; i++) {
                downloadQualities[i - 1] = SongQuality.values()[i];
            }
            return downloadQualities;
        }
    }

}
