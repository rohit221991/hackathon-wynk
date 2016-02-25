package constants;

/**
 * Created by rohit on 2/25/16.
 */

public class ApiConstants {
    public static final String TYPE_GENRE       = "genre";

    public static final String TYPE_MOOD        = "mood";

    public static final String SUBTYPE_FEATURED = "Featured";

    public static final String HEADER_BSY_TKN   = "x-bsy-utkn";

    public static final String HEADER_BSY_NET   = "x-bsy-net";

    public static final String HEADER_BSY_SNET  = "x-bsy-snet";

    public static final String HEADER_BSY_DID   = "x-bsy-did";

    public static final String HEADER_ENCODING  = "Content-Encoding";

    public static final String ENCODING_GZIP    = "gzip";

    public static final String HEADER_BSY_CID   = "x-bsy-cid";

    public static final String SALT_DEVICE_ID   = "zo2W0qBjxUDpktqUAoaL4A==";

    public interface Common {
        public static final String ID   = "id";
        public static final String LANG = "lang";
        public static final String TYPE = "type";
    }

    public interface Pagination {
        public static final String TOTAL  = "total";
        public static final String LIMIT  = "count";
        public static final String OFFSET = "offset";
    }

    public interface Image {
        public static final String THUMBNAIL        = "thumbnailUrl";
        public static final String SMALL_IMAGE_URL  = "smallImage";
        public static final String MEDIUM_IMAGE_URL = "mediumImage";
        public static final String LARGE_IMAGE_URL  = "largeImage";
    }

    public interface ItemMetrics {
        public static final String PLAYS        = "plays";
        public static final String LIKES        = "likes";
        public static final String SHARES       = "shares";
        public static final String PLAYS_LABEL  = "playsLabel";
        public static final String LIKES_LABEL  = "likesLabel";
        public static final String SHARES_LABEL = "sharesLabel";
    }

    public interface ItemAttributes {
        public static final String TITLE          = "title";
        public static final String EXCLUSIVE      = "exclusive";
        public static final String GENRE          = "genre";
        public static final String MOOD           = "mood";
        public static final String DURATION       = "duration";
        public static final String SHORT_URL      = "shortUrl";
        public static final String SUBTTITLE_TYPE = "subtitleType";
        public static final String SUBTTITLE_ID   = "subtitleId";
        public static final String SUBTTITLE      = "subtitle";
        public static final String ITEM_TYPES     = "itemTypes";
        public static final String AUTO_CREATED   = "autoCreated";
        public static final String KEYWORDS       = "keywords";
        public static final String LABEL          = "label";
        public static final String REFERENCE_ID   = "referenceId";
    }

    public interface UserActions {
        public static final String LIKED = "liked";
    }

    public interface ArtistAttributes {
        public static final String ARTISTS  = "singers";
        public static final String CAST     = "actors";
        public static final String LYRICIST = "lyricists";
        public static final String COMPOSER = "composer";
    }

    public interface Error {
        public static final String ERROR_CODE = "error_code";
    }

    public interface Collection {
        public static final String COUNT      = "count";
        public static final String ITEMS      = "items";
        public static final String ALBUM      = "album";
        public static final String PLAYLIST   = "playlist";
        public static final String SONG       = "song";
        public static final String ARTIST     = "artist";
        public static final String COMPOSERS  = "composers";
        public static final String MOODS      = "moods";
        public static final String RADIO      = "radio";
        public static final String ITEM_TYPES = "itemTypes";
        public static final String IDS        = "ids";
    }

    public interface UserPlaylistAttributes {
        public static final String VISIBILITY = "visibility";
        public static final String OFFSET     = "offset";
        public static final String END_INDEX  = "endIndex";
    }

    public static final class Songs implements Common, Pagination {
        public static final String SONGS = "songs";
    }

    public static final class Song implements Common, Image, ItemAttributes, ItemMetrics, UserActions, ArtistAttributes {
        public static final String ALBUM                  = "album";
        public static final String ALBUM_ID               = "albumId";
        public static final String STREAMING_URL          = "streamingUrl";
        public static final String ORIGINAL_STREAMING_URL = "ostreamingUrl";
        public static final String DOWNLOAD_URL           = "downloadUrl";
        public static final String RENT_URL               = "rentUrl";
        public static final String DOWNLOADED             = "downloaded";
        public static final String RENTED                 = "rented";
        public static final String OFFLINE                = "offline";
        public static final String PURCHASED              = "purchased";
        public static final String LYRICS                 = "lyrics";
        public static final String DOWNLOAD_PRICE         = "downloadPrice";
        public static final String STREAMING_PRICE        = "streamingPrice";
        public static final String VIDEO_URLS             = "videos";
        public static final String HELLOTUNES             = "hellotunes";
        public static final String ALBUM_REF              = "albumRef";
        public static final String RADIO                  = "radio";
        public static final String PURCHASE_URL           = "purchaseUrl";
        public static final String FORMATS                = "formats";
    }

    public static final class Album implements Common, Image, ItemAttributes, Collection, ItemMetrics, UserActions,
            ArtistAttributes {
        public static final String DOWNLOAD_URL = "downloadUrl";
    }

    public static final class Playlist implements Common, Image, ItemAttributes, Collection, ItemMetrics, UserActions,
            ArtistAttributes {
    }

    public static final class Page implements Common, ItemAttributes, Pagination, Collection {
    }

    public static final class Module implements Common, ItemAttributes, Collection {
        public static final String SUBTYPE = "subtype";
    }

    public static final class Genre implements Common, ItemAttributes, Image, UserActions, Collection {

    }

    public static final class Mood implements Common, ItemAttributes, Image, UserActions, Collection {

    }

    public static final class Artist implements Common, Image, ItemMetrics, ItemAttributes, UserActions, Collection {
    }

    public static final class Radio implements Common, ItemAttributes, Image, UserActions, Collection {
        public static final String EXCLUSIVE     = "exclusive";
        public static final String SPONSORED     = "sponsored";
        public static final String RADIO_ENABLED = "radioEnabled";
    }

    public static final class Account implements Common {
        public static final String CIRCLE_LANG            = "circleLang";
        public static final String UID                    = "uid";
        public static final String CONTENT_LANG           = "contentLang";
        public static final String SELECTED_CONTENT_LANGS = "selectedContentLangs";
        public static final String TOKEN                  = "token";
        public static final String MSISDN                 = "msisdn";
        public static final String DUPD                   = "dupd";
        public static final String DEVICE_ID              = "deviceid";
        public static final String OTP                    = "otp";
        public static final String APP_VERSION            = "appversion";
        public static final String OS                     = "osystem";
        public static final String PRE_INSTALLED_OEM      = "preinstallOem";
        public static final String OS_VERSION             = "osversion";
        public static final String DEVICE_TYPE            = "devicetype";
        public static final String DEVICE_VERSION         = "deviceversion";
        public static final String DEVICE_RESOLUTION      = "resolution";
        public static final String CARRIER                = "carrier";
        public static final String OPERATOR_NAME          = "operatorName";
        public static final String DEVICE_KEY             = "devicekey";
        public static final String MSISDN_DETECTED        = "md";
        public static final String AVATAR                 = "avatar";
        public static final String NAME                   = "name";
        public static final String NOTIFICATIONS          = "notifications";
        public static final String EMAIL                  = "email";
        public static final String GENDER                 = "gender";
        public static final String DOB                    = "dob";
        public static final String SONG_QUALITY           = "songQuality";
        public static final String DOWNLOAD_QUALITY       = "downloadQuality";
        public static final String ERROR_TITLE            = "errorTitle";
        public static final String ERROR_MESSAGE          = "error";
        public static final String AUTO_PLAYLISTS         = "autoPlaylists";
        public static final String FACEBOOK_ID            = "fbtoken";
        public static final String STATUS                 = "status";
        public static final String BUILD_NUMBER           = "buildNumber";
        public static final String NOW_TOKEN              = "authCode";
        public static final String IS_REGISTERED          = "isRegistered";
        public static final String IMEI_NUMBER            = "imeiNumber";

        public static interface SongQuality {
            public static final String AUTO = "a";
            public static final String HD   = "hd";
            public static final String HIGH = "h";
            public static final String MID  = "m";
            public static final String LOW  = "l";
        }
    }

    public static final class HelloTune {
        public static final String TITLE        = "title";
        public static final String PRICE        = "price";
        public static final String PURCHASE_URL = "purchaseUrl";
        public static final String OPERATOR     = "operator";
        public static final String PREVIEW_URL  = "previewUrl";
        public static final String VCODE        = "vcode";
    }

    public static final class HTProvision {
        public static final String CODE        = "code";
        public static final String INTERIM_URL = "intrimUrl";
        public static final String MESSAGE     = "responseMessage";
    }

    public static final class Analytics {
        public static final String ID                       = Common.ID;
        public static final String TYPE                     = Common.TYPE;
        public static final String DISTRIBUTION_CHANNEL     = "channel";
        public static final String SHARE_CHANNEL            = "channel";
        public static final String SCREEN_ID                = "screen_id";
        public static final String MODULE_ID                = "module_id";
        public static final String KEYWORD                  = "keyword";
        public static final String CAST                     = "cast";
        public static final String EVENT_TYPE               = "event_type";
        public static final String TIMESTAMP                = "timestamp";
        public static final String LANG                     = "lang";
        public static final String META                     = "meta";
        public static final String DATA                     = "data";
        public static final String EVENTS                   = "events";
        public static final String PRIORITY                 = "priority";
        public static final String STATUS                   = "status";
        public static final String STREAM                   = "stream";
        public static final String METHOD                   = "method";
        public static final String ACTION_BAR               = "HEADER";
        public static final String HOME_BUTTON              = "BACK";
        public static final String NAVIGATION_BAR           = "NAV_BAR";
        public static final String SEARCH_BUTTON            = "SEARCH";
        public static final String MINI_PLAYER              = "MINI_PLAYER";
        public static final String EXPAND_PLAYER            = "EXPAND_PLAYER";
        public static final String TOGGLE_PLAY              = "TOGGLE_PLAY";
        public static final String REFERRER                 = "referrer";
        public static final String RATE_DIALOG              = "RATE_APP_DIALOG";
        public static final String FEEDBACK_DIALOG          = "FEEDBACK_DIALOG";
        public static final String GLOBAL_NOTIFICATION      = "GLOBAL_NOTIFICATION";
        public static final String DIALOG_OK                = "OK";
        public static final String DIALOG_CANCEL            = "CANCEL";
        public static final String MUSIC_CHOICE_DIALOG      = "MUSIC_CHOICE_DIALOG";
        public static final String MUSIC_CHOICE_HEADER      = "MUSIC_CHOICE_HEADER";
        public static final String RATE_MODULE              = "RATE_APP_MODULE";
        public static final String FEEDBACK_MODULE          = "FEEDBACK_MODULE";
        public static final String MODULE_NO_THANKS         = "NO_THANKS";
        public static final String MODULE_LATER             = "LATER";
        public static final String MODULE_SURE              = "SURE";
        public static final String CACHE                    = "cache";
        public static final String REQUESTED                = "requested";
        public static final String NOTIFICATION_ACTION      = "action";
        public static final String RECENT_SEARCH_ITEM       = "RECENT_SEARCH_ITEM";
        public static final String RECENT_SEARCH_CLEARED    = "CLEAR_RECENT_SEARCHES";
        public static final String ITEM_RANK                = "item_rank";
        public static final String SEE_ALL_RESULTS          = "SEE_ALL_RESULTS";
        public static final String RESULTS_ID               = "results_id";
        public static final String MODULE_APP_TOUR          = "APP_TOUR";
        public static final String MODULE_RECENT_SEARCH     = "RECENT_SEARCH";
        public static final String SKIP_TOUR                = "SKIP_TOUR";
        public static final String GET_STARTED              = "GET_STARTED";
        public static final String NUMBER_ENTERED           = "NUMBER_ENTERED";
        public static final String OTP_ENTERED              = "OTP_ENTERED";
        public static final String REQUEST_RESEND_OTP       = "REQUEST_RESEND_OTP";
        public static final String REQUEST_CALL_OTP         = "REQUEST_CALL_OTP";
        public static final String CHANGE_NUMBER            = "CHANGE_NUMBER";
        public static final String NUMBER_MODIFIED          = "number_modified";
        public static final String MODULE_NOW_PLAYING       = "NOW_PLAYING";
        public static final String PLAYER_NEXT              = "PLAYER_NEXT";
        public static final String PLAYER_PREVIOUS          = "PLAYER_PREVIOUS";
        public static final String PLAYER_TOGGLE            = "PLAYER_TOGGLE";
        public static final String PLAYER_SHUFFLE           = "PLAYER_SHUFFLE";
        public static final String PLAYER_REPEAT            = "PLAYER_REPEAT";
        public static final String PLAYER_SONG_ID           = "PLAYER_SONG_ID";
        public static final String SHUFFLE_STATUS           = "shuffle_status";
        public static final String REPEAT_STATUS            = "repeat_status";
        public static final String REPEAT_ALL               = "REPEAT_ALL";
        public static final String REPEAT_ONE               = "REPEAT_ONE";
        public static final String REPEAT_NONE              = "REPEAT_NONE";
        public static final String PLAYER_STATUS            = "player_status";
        public static final String PLAYER_PLAYING           = "PLAYING";
        public static final String PLAYER_PAUSED            = "PAUSED";
        public static final String PLAYER_DURATION          = "played_duration";
        public static final String CLICK_SOURCE             = "source";
        public static final String ROW_INDEX                = "row";
        public static final String COLUMN_INDEX             = "column";
        public static final String FILE_SIZE                = "fileSize";
        public static final String AUTO_RECOVERED           = "autoRecovered";
        public static final String REASON                   = "reason";
        public static final String MY_MUSIC                 = "MY_MUSIC";
        public static final String AUTO_PLAY_BANNER         = "auto_play_banner";
        public static final String AUTO_PLAY_LABEL          = "auto_play_label";
        public static final String AUTO_PLAY_DISMISS        = "auto_play_dismiss";
        public static final String ACTION                   = "action";
        public static final String SOURCE                   = "source";
        public static final String AUTO_PLAYED              = "auto_played";
        public static final String UA_CHANNEL               = "urban_airship_channel";
        public static final String DOWNLOAD_ALL             = "download_all";
        public static final String STOP_ALL                 = "stop_all";
        public static final String PLAY_ALL                 = "play_all";
        public static final String NET                      = "net";
        public static final String SNET                     = "snet";
        public static final String SUCCESS                  = "success";
        public static final String SEARCHED_STRING          = "searchedString";
        public static final String LIMITED_AD_TRACKING      = "limitedAdTracking";
        public static final String STORAGE                  = "storage";
        public static final String TOTAL                    = "total";
        public static final String FREE                     = "free";
        public static final String CURRENT_QUEUE_SIZE       = "currentQueueSize";

        public static final String SWITCH_NEW_VALUE         = "value";
        // DS = DATA_SAVE
        public static final String DS_NAV_DRAWER_SWITCH     = "DS_NAV_DRAWER_SWITCH";
        public static final String DS_CROUTON               = "DS_CROUTON";
        public static final String DS_DIALOG                = "DS_DIALOG";
        public static final String DS_DIALOG_TURN_IT_ON     = "DS_DIALOG_TURN_IT_ON";
        public static final String DS_DIALOG_NO_THANKS      = "DS_DIALOG_NO_THANKS";
        public static final String DS_NOTIFICATION          = "DS_NOTIFICATION";
        public static final String DS_NOTIFICATION_TURN_ON  = "DS_NOTIFICATION_TURN_ON";
        public static final String DS_NOTIFICATION_TURN_OFF = "DS_NOTIFICATION_TURN_OFF";
        public static final String DS_AUTO_SWITCH           = "DS_AUTO_SWITCH";
        public static final String DS_GLOBAL_SETTING        = "DS_GLOBAL_SETTING";
        public static final String DS_DOW_SETTING           = "DS_DOW_SETTING";
        public static final String DS_MSQ_SETTING           = "DS_MSQ_SETTING";
        public static final String QUEUED                   = "queued";
        public static final String DATA_SAVE                = "ds";
        public static final String DS_STATE                 = "value";
        public static final String DS_IS_AUTO               = "auto";

        public interface Reason {
            public static final String FILE_NOT_FOUND    = "file_not_found";
            public static final String DECRYPTION_FAILED = "decryption_failed";
            public static final String INAVLID_FILE      = "invalid_file";
        }

        public interface AutoPlayHideReason {
            public static final String COUNTDOWN_OVER    = "countdown_over";
            public static final String BANNER_TAPPED     = "banner_tapped";
            public static final String DISMISS_TAPPED    = "dismiss_tapped";
            public static final String PLAY_ANOTHER_SONG = "play_another_song";
            public static final String APP_BACKGROUND    = "app_background";
        }

        public interface NotConsumedType {
            public static final String SEARCH = "search";
        }

        public interface ExternalIdType {
            public static final String ADVERTISING_ID = "advertising_id";
        }

        public interface StorageType {
            public static final String INTERNAL = "internal";
            public static final String EXTERNAL = "external";
        }
    }

    public static final String TRENDING_ARTIST_MODULE_ID = "bsb_artists";

    public static final String TRENDING_MOODS_MODULE_ID  = "bsb_moods";

    public static final String TRENDING_RADIOS_MODULE_ID = "Radio";

    public static final String WYNK_TOP_100_MODULE_ID    = "Airtel Top 25";

    public static final class PackUsage {
        public static final String DESCRIPTION         = "description";
        public static final String DATA_LIMIT          = "dataLimit";
        public static final String DATA_CONSUMED       = "dataComsumed";
        public static final String PERCENTAGE_CONSUMED = "percentageConsumed";
        public static final String DATA_BALANCE        = "dataBalance";
        public static final String VALID_UPTO          = "validUpto";
        public static final String ERROR_MESSAGE       = "errorMessage";
    }

    public interface Urls {
        public static final String FAQ            = "http://www.twangmusic.in/music/faq.html";
        public static final String FAQ_DOWNLOAD   = "http://www.twangmusic.in/music/faq.html#download";
        public static final String FAQ_PAYMENT    = "http://www.twangmusic.in/music/faq.html#payment";
        public static final String PRIVACY_POLICY = "http://www.twangmusic.in/music/privacyPolicy.html";
        public static final String TERMS_OF_USE   = "http://www.twangmusic.in/music/terms.html";
        public static final String URL            = "url";
        public static final String SUCCESS        = "success";
        public static final String CODE           = "code";
        public static final String TITLE          = "line1";
        public static final String DESCRIPTION    = "line2";
        public static final String RD_URL         = "rdUrl";
        public static final String FORMAT         = "format";
    }

    public interface PushNotification {
        public static final String ID                 = "id";
        public static final String ACTION_OPEN        = "ao";
        public static final String ACTION_CLOSE       = "ac";
        public static final String TARGET             = "tgt";
        public static final String SCREEN             = "scr";
        public static final String META               = "meta";
        public static final String MESSAGE            = "msg";
        public static final String ALERT_OK           = "aok";
        public static final String ALERT_CANCEL       = "acncl";
        public static final String ALERT_TITLE        = "attl";
        public static final String TITLE              = "title";
        public static final String URL                = "url";
        public static final String FUP_LIMIT_DIALOG   = "fup_limit_exceeded";
        public static final String LOW_SPACE_DIALOG   = "low_space";
        public static final String FORCE_UPDATE       = "force_update";
        public static final String BIG_PICTURE        = "img";
        public static final String ACTION             = "action";

        public static final String UA_PUSH_ID         = "com.urbanairship.push.PUSH_ID";
        public static final String UA_EXTRA           = "extra";
        public static final String UA_DEV_APP_KEY     = "Srip1Pl5QOmlKFF4WvNjjA";
        public static final String UA_DEV_APP_SECRET  = "Bt3ATKSDT-mhlLDfS16f8g";
        public static final String UA_PROD_APP_KEY    = "lCpL2cRcRa-iBta8Dj00fw";
        public static final String UA_PROD_APP_SECRET = "EOfV9-NLTdiCaCw7iCY1RA";
        public static final String GCM_PROJECT_NUMBER = "537813458872";
    }

    public interface Notification {
        public static final String ID            = "id";
        public static final String TARGET        = "tgt";
        public static final String SCREEN        = "scr";
        public static final String META          = "meta";
        public static final String TITLE         = "title";
        public static final String UNREAD        = "unread";
        public static final String TIMESTAMP     = "timestamp";
        public static final String THUMBNAIL_URL = "thumbnailUrl";
    }

    public interface Screen {
        public static final String ALBUM         = "album";
        public static final String PLAYLIST      = "playlist";
        public static final String ARTIST        = "artist";
        public static final String MOOD          = "mood";
        public static final String GENRE         = "genere";
        public static final String USER_PLAYLIST = "userplaylist";
    }

    public interface Timestamp {
        public static final String DOWNLOADED_TIMESTAMP = "downloadedTimestamp";
        public static final String LAST_UPDATED         = "lastUpdated";
        public static final String RENTED_TIMESTAMP     = "rentedTimestamp";
        public static final String LIKED_TIMESTAMP      = "likedTimestamp";
    }

    public interface WebPage {
        public static final String EXIT            = "bsyext";
        public static final String STATUS          = "bsys";
        public static final String SIGNOUT         = "bsysignout";
        public static final String SUCCESS         = "success";
        public static final String FAILURE         = "failure";
        public static final String FAILURE_REASON  = "bsyrm";
        public static final String CONTENT_TYPE    = "bsytype";
        public static final String CONTENT_ID      = "bsyid";
        public static final String URL             = "url";
        public static final String RENT            = "bsyrent";
        public static final String STREAM          = "bsystream";
        public static final String FEEDBACK        = "bsyfback";
        public static final String GOTO_PLAY_STORE = "gotoPlayStore";
    }

    public interface JourneyEvent {

        public static final String ID        = "id";
        public static final String TITLE     = "title";
        public static final String ITEM      = "item";
        public static final String TIMESTAMP = "timestamp";
        public static final String TYPE      = "type";

    }

    public interface Subscription {
        public static final String SONGS_LIMIT            = "songsLimit";
        public static final String PACK_VALIDITY_IN_DAYS  = "packValidityInDays";
        public static final String PRICE                  = "price";
        public static final String EXPIRE_TIMESTAMP       = "expireTimestamp";
        public static final String DAYS_TO_EXPIRE         = "daysToExpire";
        public static final String NOTIFICATION_MESSAGE   = "notificationMessage";
        public static final String VALIDITY_TITLE         = "validityTitle";
        public static final String STATUS                 = "status";
        public static final String PURCHASE_URL           = "purchaseUrl";
        public static final String VALID_TILL             = "validTill";
        public static final String HEADER_MESSAGE         = "headerMessage";
        public static final String URL                    = "url";
        public static final String STATUS_MESSAGE         = "statusMessage";
        public static final String STATUS_MESSAGE_COLOR   = "statusMessageColor";
        public static final String MESSAGE                = "message";
        public static final String AUTO_RENEWAL_ON        = "autoRenewalOn";
        public static final String TITLE                  = "title";
        public static final String OFFER_PACK_AVAILED     = "offerPackAvailed";
        public static final String BUTTON_TEXT            = "buttonText";
        public static final String LINE_1                 = "line1";
        public static final String LINE_2                 = "line2";
        public static final String DETAIL                 = "detail";
        public static final String NOTES                  = "notes";
        public static final String IS_PRIMARY             = "isPrimary";
        public static final String SUBSCRIPTION_INFO      = "subscriptionInfo";
        public static final String SUBSCRIBE_UNSUBSCRIBE  = "subscribeUnsubscribe";
        public static final String CHANGE_PLAN            = "changePlan";
        public static final String CANCEL_TEXT            = "cancelText";
        public static final String OK_TEXT                = "okText";
        public static final String PACK_INFO_KEYS         = "packInfoKeys";
        public static final String OPEN_WEB_VIEW          = "openWebView";
        public static final String OPEN_POPUP             = "openPopUp";
        public static final String SUBSCRIPTION_PACK_INFO = "subscriptionPackInfo";
        public static final String RESPONSE_RESULTLINE1   = "resultLine1";
        public static final String RESPONSE_RESULTLINE2   = "resultLine2";
        public static final String RESPONSE_HEADERMESSAGE = "headerMessage";

        public static interface PromoCode {
            public static final String PROMO_CODE           = "promoCode";
            public static final String MESSAGE              = "message";
            public static final String TITLE                = "title";
            public static final String GO_TO_ACCOUNT_SCREEN = "gotoAccountScreen";
        }

    }

    public interface DataPack {
        public static final String VALIDITY      = "packValidity";
        public static final String TITLE         = "title";
        public static final String KEYWORD       = "keyword";
        public static final String PURCHASE_URL  = "purchaseUrl";
        public static final String THUMBNAIL_URL = "thumbnailUrl";
        public static final String TYPE          = "packType";
        public static final String PRICE         = "packPrice";
        public static final String DATA_LIMIT    = "packDataLimit";
    }

    public interface Collections {
        public static final String DOWNLOADED       = "rentals";

        public static final String PURCHASED        = "downloads";

        public static final String LIKED            = "favorites";

        public static final String JOURNEY          = "journey";

        public static final String USER_COLLECTIONS = "user_collections";

        public static final String USER_PLAYLISTS   = "user_playlist";
    }

    public interface Fup {
        public static final String TOTAL    = "total";

        public static final String TITLE    = "line1";

        public static final String SUBTITLE = "line2";
    }

    public interface Misc {
        public static final String RENTED_IDS = "rentedIds";
    }



    public static class QueryParameters {
        public static final String SONG_QUALITY   = "sq";
        public static final String HLS_CAPABLE    = "hlscapable";
        public static final String LANG           = "lang";
        public static final String AUTO_RECOVERED = "autoRecovered";
        public static final String DATA_SAVE      = "ds";
    }

    public static class Configuration {
        public static final String SUBSCRIPTION               = "subscription";
        public static final String PROFILE                    = "profile";
        public static final String OFFER                      = "offer";
        public static final String VERSION_CONFIG             = "versionConfig";
        public static final String VERSION_CONFIG_MIN         = "minAndroidVersion";
        public static final String VERSION_CONFIG_TARGET      = "targetAndroidVersion";
        public static final String OFFER_ID                   = "id";
        public static final String SOFT_UPDATE_TITLE          = "updateAvailableTitle";
        public static final String SOFT_UPDATE_MESSAGE        = "updateAvailableMessage";
        public static final String FORCE_UPDATE_TITLE         = "criticalUpdateTitle";
        public static final String FORCE_UPDATE_MESSAGE       = "criticalUpdateMessage";
        public static final String APK_DOWNLOAD_URL           = "apkDownloadUrl";
        public static final String DISABLE_PROACTIVE_FEEDBACK = "disableProactiveFeedback";
        public static final String DATA_SAVE_PERCENTAGE       = "dsPercentage";
        public static final String DISCARD_SOS                = "discardSOS";
    }

    public static class Now {
        public static final String IS_VALID = "isValid";
    }

    public interface Network {
        public static final int NETWORK_NOT_CONNECTED = 0;

        /* All TYPE_MOBILE* network types */
        public static final int NETWORK_TYPE_MOBILE   = 1;

        /* Could be Bluetooth, Ethernet, VPN, WiFi, WiMax */
        public static final int NETWORK_TYPE_OTHER    = 2;
    }
}
