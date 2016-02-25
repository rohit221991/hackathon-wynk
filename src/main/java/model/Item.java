package model;

import constants.ApiConstants;
import constants.ItemType;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * Created by rohit on 2/25/16.
 */
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
