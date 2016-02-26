package utils;

/**
 * Created by rohit on 2/26/16.
 */
public class ResponseUtil {

   static String json ="{\n" +
           "\t\"total\": 1,\n" +
           "\t\"count\": 1,\n" +
           "\t\"items\": [{\n" +
           "\t\t\"total\": 1,\n" +
           "\t\t\"likedTimestamp\": 0,\n" +
           "\t\t\"localizedTitles\": {},\n" +
           "\t\t\"count\": 15,\n" +
           "\t\t\"exclusive\": false,\n" +
           "\t\t\"downloaded\": 0,\n" +
           "\t\t\"type\": \"PACKAGE\",\n" +
           "\t\t\"id\": \"srch_bsb_1404393019358\",\n" +
           "\t\t\"title\": \"Latest Hindi\",\n" +
           "\t\t\"originalImage\": \"http:\\/\\/s3-ap-southeast-1.amazonaws.com\\/bsbcms\\/music\\/package\\/new-releases1-generic.png\",\n" +
           "\t\t\"mediumImage\": \"http:\\/\\/img.wynk.in\\/unsafe\\/240x240\\/top\\/http:\\/\\/d2n2xdxvkri1jk.cloudfront.net\\/music\\/package\\/new-releases1-generic.png\",\n" +
           "\t\t\"thumbnailUrl\": \"http:\\/\\/img.wynk.in\\/unsafe\\/50x50\\/top\\/http:\\/\\/d2n2xdxvkri1jk.cloudfront.net\\/music\\/package\\/new-releases1-generic.png\",\n" +
           "\t\t\"shortUrl\": \"http:\\/\\/wynk.in\\/u\\/107koXui4QFUzG\",\n" +
           "\t\t\"smallImage\": \"http:\\/\\/img.wynk.in\\/unsafe\\/120x120\\/top\\/http:\\/\\/d2n2xdxvkri1jk.cloudfront.net\\/music\\/package\\/new-releases1-generic.png\",\n" +
           "\t\t\"rented\": 0,\n" +
           "\t\t\"offset\": 0,\n" +
           "\t\t\"rentedTimestamp\": 0,\n" +
           "\t\t\"musicPackageType\": \"NEW_RELEASES\",\n" +
           "\t\t\"liked\": false,\n" +
           "\t\t\"largeImage\": \"http:\\/\\/img.wynk.in\\/unsafe\\/320x180\\/top\\/http:\\/\\/d2n2xdxvkri1jk.cloudfront.net\\/music\\/package\\/new-releases1-generic.png\",\n" +
           "\t\t\"lastUpdated\": 1456476546939,\n" +
           "\t\t\"deleted\": false,\n" +
           "\t\t\"downloadedTimestamp\": 0,\n" +
           "\t\t\"contentToProviderCount\": {\n" +
           "\t\t\t\"EROS\": 2,\n" +
           "\t\t\t\"HUNGAMA\": 29,\n" +
           "\t\t\t\"UNIVERSAL\": 2,\n" +
           "\t\t\t\"PPL_MUMBAI\": 1,\n" +
           "\t\t\t\"SAREGAMA\": 5,\n" +
           "\t\t\t\"SONY\": 4,\n" +
           "\t\t\t\"UNISYS\": 10,\n" +
           "\t\t\t\"OTHERS\": 4\n" +
           "\t\t},\n" +
           "\t\t\"subtype\": \"New Releases\",\n" +
           "\t\t\"itemTypes\": [\"SONG\"]\n" +
           "\t}],\n" +
           "\t\"offset\": 0,\n" +
           "\t\"lang\": \"en\"\n" +
           "}";

    public static String getResponse(){return json;}

}
