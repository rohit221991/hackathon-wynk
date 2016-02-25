package constants;

import utils.SparseArray;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rohit on 2/25/16.
 */
public enum ItemType {
    SONG(1, "song"), ALBUM(2, "album"), PLAYLIST(3, "playlist"), ARTIST(4, "artist"), MOOD(5, "mood"), USERPLAYLIST(6,
            "userplaylist"), GENRE(7, "genre"), MODULE(8, "package"), TOP_PAGE(9, "top_page"), SEARCH_RESULT(10,
            "search_page"), PLAYER_QUEUE(11, "player_queue"), TRENDING_ARTISTS(12, "trending_artists"), ITEM_COLLECTION(
            13, "item_collection"), FAVORITES_PACKAGE(14, "favorites_package"), RENTED_SONGS(15, "rented_songs"), BOUGHT_SONGS(
            16, "bought_songs"), RENTED_SEARCH(17, "rented_search"), BOUGHT_SEARCH(18, "bought_search"), RADIO(19,
            "radio"), TRENDING_MOODS(20, "trending_moods"), USERPLAYLISTS(21, "user_playlists"), SEARCH_PACAKGE(22,
            "SEARCH_PACKAGE"), SHORT_URL(23, "shorturl"), /* No longer supported */REQUEST(24, "request"), SEARCH_LOCAL(
            25, "search_local"), MY_MUSIC(26, "my_music");

    // TODO Separate ItemTypes should be used for SeeAll ItemCollections

    private String                       type;

    private int                          id;

    private static Map<String, ItemType> itemNameToTypeMapping = new HashMap<String, ItemType>();

    private static SparseArray<ItemType> itemIdToTypeMapping   = new SparseArray<ItemType>();

    static {
        for (ItemType type : ItemType.values()) {
            itemNameToTypeMapping.put(type.getType(), type);
            itemIdToTypeMapping.put(type.getId(), type);
        }
    }

    private ItemType(Integer id, String type) {
        this.id = id;
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public int getId() {
        return this.id;
    }

    public static ItemType getItemType(String name) {
        return itemNameToTypeMapping.get(name.toLowerCase());
    }

    public static ItemType getItemType(int id) {
        return itemIdToTypeMapping.get(id);
    }
}
