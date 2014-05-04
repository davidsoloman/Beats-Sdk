package com.freethinking.beats.sdk.network;


import android.net.Uri;

import java.util.HashMap;

public class UrlFactory {
    public static final String BASE_URL = "https://partner.api.beatsmusic.com/v1";
    public static final String SEARCH_PREDICTIVE = "/api/search/predictive";

    public final int OFFSET_DEFAULT = 0;
    public final int LIMIT_DEFAULT = 20;
    public final String[] FIELDS_DEFAULT = new String[0];
    public final String[] REFS_DEFAULT = new String[0];
    public final String ORDER_BY_DEFAULT = "popularity desc";
    public final HashMap<String, Boolean> STREAMABILITY_FILTERS_DEFAULT = new HashMap<String, Boolean>();
    public final HashMap<String, String> FILTERS_DEFAULT = new HashMap<String, String>();
    public final String[] IDS_DEFAULT = new String[0];

    @SuppressWarnings("SpellCheckingInspection")
    public static String clientID() {
        return "frksnm8edw2t8ddebhkqkjwk";
    }

    @SuppressWarnings("SpellCheckingInspection")
    public static String clientSecret() {
        return "2vZyUjhnmgqpVRmkNYKuw285";
    }

    // Requires Auth
    public static String obtainToken() {
        return "https://partner.api.beatsmusic.com/oauth2/token";
    }

    // Requires Auth
    public static String me() {
        return BASE_URL + "/api/me";
    }

    // Requires Auth
    public static String profile(String id) {
        return BASE_URL + "/api/users/" + id;
    }

    public static String artistList() {
        return BASE_URL + "/api/artists" + "?client_id=" + clientID();
    }

    public static String artistList(CollectionQueryParams params) {
        return BASE_URL + "/api/artists" + "?client_id=" + clientID() + '&' + params.toString();
    }

    public static String artist(String id) {
        return BASE_URL + "/api/artists/" + id + "?client_id=" + clientID();
    }

    public static String artist(String id, LookupQueryParams params) {
        return BASE_URL + "/api/artists/" + id + "?client_id=" + clientID() + '&' + params.toString();
    }

    public static String artistBio(String id) {
        return BASE_URL + "/api/artists/" + id + "/bios" + "?client_id=" + clientID();
    }

    public static String artistBio(String id, LookupQueryParams params) {
        return BASE_URL + "/api/artists/" + id + "/bios" + "?client_id=" + clientID() + '&' + params.toString();
    }

    public static String artistAlbums(String id) {
        return BASE_URL + "/api/artists/" + id + "/albums" + "?client_id=" + clientID();
    }

    public static String artistAlbums(String id, CollectionQueryParams params) {
        return BASE_URL + "/api/artists/" + id + "/albums" + "?client_id=" + clientID() + '&' + params.toString();
    }

    public static String artistEssentialAlbums(String id) {
        return BASE_URL + "/api/artists/" + id + "/essential_albums" + "?client_id=" + clientID();
    }

    public static String artistEssentialAlbums(String id, CollectionQueryParams params) {
        return BASE_URL + "/api/artists/" + id + "/essential_albums" + "?client_id=" + clientID() + '&' + params.toString();
    }

    public static String artistTracks(String id) {
        return BASE_URL + "/api/artists/" + id + "/tracks" + "?client_id=" + clientID();
    }

    public static String artistTracks(String id, CollectionQueryParams params) {
        return BASE_URL + "/api/artists/" + id + "/tracks" + "?client_id=" + clientID() + '&' + params.toString();
    }

    public static String artistPlaylists(String id) {
        return BASE_URL + "/api/artists/" + id + "/playlists" + "?client_id=" + clientID();
    }

    public static String artistPlaylists(String id, CollectionQueryParams params) {
        return BASE_URL + "/api/artists/" + id + "/playlists" + "?client_id=" + clientID() + '&' + params.toString();
    }

    public static String activitiesList() {
        return BASE_URL + "/api/activities" + "?client_id=" + clientID();
    }

    public static String activitiesList(CollectionQueryParams params) {
        return BASE_URL + "/api/activities" + "?client_id=" + clientID() + '&' + params.toString();
    }

    public static String activity(String id) {
        return BASE_URL + "/api/activities/" + id + "?client_id=" + clientID();
    }

    public static String activity(String id, LookupQueryParams params) {
        return BASE_URL + "/api/activities/" + id + "?client_id=" + clientID() + '&' + params.toString();
    }

    public static String activityEditorialPlaylists(String id) {
        return BASE_URL + "/api/activities/" + id + "/editorial_playlists" + "?client_id=" + clientID();
    }

    public static String activityEditorialPlaylists(String id, CollectionQueryParams params) {
        return BASE_URL + "/api/activities/" + id + "/editorial_playlists" + "?client_id=" + clientID() + '&' + params.toString();
    }

    public static String albumList() {
        return BASE_URL + "/api/albums" + "?client_id=" + clientID();
    }

    public static String albumList(CollectionQueryParams params) {
        return BASE_URL + "/api/albums" + "?client_id=" + clientID() + '&' + params.toString();
    }

    public static String album(String id) {
        return BASE_URL + "/api/albums/" + id + "?client_id=" + clientID();
    }

    public static String album(String id, LookupQueryParams params) {
        return BASE_URL + "/api/albums/" + id + "?client_id=" + clientID() + '&' + params.toString();
    }

    public static String albumArtists(String id) {
        return BASE_URL + "/api/albums/" + id + "/artists" + "?client_id=" + clientID();
    }

    public static String albumArtists(String id, CollectionQueryParams params) {
        return BASE_URL + "/api/albums/" + id + "/artists" + "?client_id=" + clientID() + '&' + params.toString();
    }

    public static String albumTracks(String id) {
        return BASE_URL + "/api/albums/" + id + "/tracks" + "?client_id=" + clientID();
    }

    public static String albumTracks(String id, CollectionQueryParams params) {
        return BASE_URL + "/api/albums/" + id + "/tracks" + "?client_id=" + clientID() + '&' + params.toString();
    }

    public static String albumReview(String id) {
        return BASE_URL + "/api/albums/" + id + "/review" + "?client_id=" + clientID();
    }

    public static String albumReviews(String id, CollectionQueryParams params) {
        return BASE_URL + "/api/albums/" + id + "/reviews" + "?client_id=" + clientID() + '&' + params.toString();
    }

    public static String albumCompanionAlbums(String id) {
        return BASE_URL + "/api/albums/" + id + "/companion_albums" + "?client_id=" + clientID();
    }

    public static String albumCompanionAlbums(String id, CollectionQueryParams params) {
        return BASE_URL + "/api/albums/" + id + "/companion_albums" + "?client_id=" + clientID() + '&' + params.toString();
    }

    public static String imageUrl(String id, EntityType entity, ImageType type) {
        return imageUrl(id, entity, type, ImageSize.MEDIUM);
    }

    public static String imageUrl(String id, EntityType entity, ImageType type, ImageSize size) {
        if (!imageTypeEntityValidation(type, entity)) {
            throw new IllegalArgumentException(entity + " does not have image type of " + type);
        } else {
            return BASE_URL + "/api/" + entity.toString() + "/" + id + "/images/" + type.toString() + "?client_id=" + clientID() + "&size=" + size.toString();
        }
    }

    private static boolean imageTypeEntityValidation(ImageType type, EntityType entity) {
        if (ImageType.COVER.equals(type)) {
            if (EntityType.GENRE.equals(entity) || EntityType.USER.equals(entity)) {
                return true;
            } else {
                return false;
            }
        } else {
            return true;
        }
    }

    public static String highlightsFeatured() {
        return BASE_URL + "/api/discoveries/featured" + "?client_id=" + clientID();
    }

    public static String highlightsFeatured(CollectionQueryParams params) {
        return BASE_URL + "/api/discoveries/featured" + "?client_id=" + clientID() + '&' + params.toString();
    }

    public static String highlightsEditorPicks() {
        return BASE_URL + "/api/discoveries/editor_picks" + "?client_id=" + clientID();
    }

    public static String highlightsEditorPicks(CollectionQueryParams params) {
        return BASE_URL + "/api/discoveries/editor_picks" + "?client_id=" + clientID() + '&' + params.toString();
    }

    public static String trackList() {
        return BASE_URL + "/api/tracks" + "?client_id=" + clientID();
    }

    public static String trackList(CollectionQueryParams params) {

        return BASE_URL + "/api/tracks" + "?client_id=" + clientID() + '&' + params.toString();
    }

    public static String track(String id) {
        return BASE_URL + "/api/tracks/" + id + "?client_id=" + clientID();
    }

    public static String track(String id, LookupQueryParams params) {
        return BASE_URL + "/api/tracks/" + id + "?client_id=" + clientID() + '&' + params.toString();
    }

    public static String trackArtists(String id) {
        return BASE_URL + "/api/tracks/" + id + "/artists" + "?client_id=" + clientID();
    }

    public static String trackArtists(String id, CollectionQueryParams params) {
        return BASE_URL + "/api/tracks/" + id + "/artists" + "?client_id=" + clientID() + '&' + params.toString();
    }

    public static String playlistList(CollectionQueryParams params) {
        if (params.ids == null || params.ids.length == 0) {
            throw new IllegalArgumentException("Ids are required for lookup");
        }
        return BASE_URL + "/api/playlists?" + params.toString();
    }

    public static String playlist(String id) {
        return BASE_URL + "/api/playlists/" + id;
    }

    public static String playlist(String id, LookupQueryParams params) {
        return BASE_URL + "/api/playlists/" + id + '?' + params.toString();
    }

    public static String playlistSubscribers(String id) {
        return BASE_URL + "/api/playlists/" + id + "/subscribers";
    }

    public static String playlistSubscribers(String id, CollectionQueryParams params) {
        return BASE_URL + "/api/playlists/" + id + "/subscribers" + '?' + params.toString();
    }

    public static String playlistTracks(String id) {
        return BASE_URL + "/api/playlists/" + id + "/tracks";
    }

    public static String playlistTracks(String id, CollectionQueryParams params) {
        return BASE_URL + "/api/playlists/" + id + "/tracks" + '?' + params.toString();
    }

    public static String playlistArtists(String id) {
        return BASE_URL + "/api/playlists/" + id + "/artists";
    }

    public static String playlistArtists(String id, CollectionQueryParams params) {
        return BASE_URL + "/api/playlists/" + id + "/artists" + '?' + params.toString();
    }

    public static String usersPlaylists(String id) {
        return BASE_URL + "/api/users/" + id + "/playlists";
    }

    public static String usersPlaylists(String id, CollectionQueryParams params) {
        return BASE_URL + "/api/users/" + id + "/playlists" + '?' + params.toString();
    }

    public static String usersSubscribedPlaylists(String id) {
        return BASE_URL + "/api/users/" + id + "/playlist_subscriptions";
    }

    public static String usersSubscribedPlaylists(String id, CollectionQueryParams params) {
        return BASE_URL + "/api/users/" + id + "/playlist_subscriptions" + '?' + params.toString();
    }

    public static String searchPredictive(String searchText) {
        return BASE_URL + SEARCH_PREDICTIVE + "?q=" + searchText + "&client_id=" + clientID();
    }

    public static String genre(String id) {
        return BASE_URL + "/api/genres/" + id;
    }

    public static String genre(String id, LookupQueryParams params) {
        return BASE_URL + "/api/genres/" + id + '?' + params.toString();
    }

    public static String genreEditorPicks(String id) {
        return BASE_URL + "/api/genres/" + id + "/editor_picks";
    }

    public static String genreEditorPicks(String id, CollectionQueryParams params) {
        return BASE_URL + "/api/genres/" + id + "/editor_picks" + '?' + params.toString();
    }

    public static String genreFeatured(String id) {
        return BASE_URL + "/api/genres/" + id + "/featured";
    }

    public static String genreFeatured(String id, CollectionQueryParams params) {
        return BASE_URL + "/api/genres/" + id + "/featured" + '?' + params.toString();
    }

    public static String genreNewReleases(String id) {
        return BASE_URL + "/api/genres/" + id + "/new_releases";
    }

    public static String genreNewReleases(String id, CollectionQueryParams params) {
        return BASE_URL + "/api/genres/" + id + "/new_releases" + '?' + params.toString();
    }

    public static String genreBios(String id) {
        return BASE_URL + "/api/genres/" + id + "/bios";
    }

    public static String genreBios(String id, CollectionQueryParams params) {
        return BASE_URL + "/api/genres/" + id + "/bios" + '?' + params.toString();
    }

    public static String genrePlaylists(String id) {
        return BASE_URL + "/api/genres/" + id + "/playlists";
    }

    public static String genrePlaylists(String id, CollectionQueryParams params) {
        return BASE_URL + "/api/genres/" + id + "/playlists" + '?' + params.toString();
    }

    public static String genresCollection() {
        return BASE_URL + "/api/genres" + "?client_id=" + clientID();
    }

    public static String genresCollection(CollectionQueryParams params) {
        return BASE_URL + "/api/genres" + "?client_id=" + clientID() + '&' + params.toString();
    }

    public enum EntityType {
        GENRE("genres"),
        ARTIST("artists"),
        PLAYLIST("playlists"),
        ALBUM("albums"),
        TRACK("tracks"),
        USER("users");

        private final String type;

        private EntityType(final String type) {
            this.type = type;
        }

        public String toString() {
            return type;
        }
    }

    public enum ImageType {
        DEFAULT("default"),
        COVER("cover");

        private final String type;

        private ImageType(final String type) {
            this.type = type;
        }

        public String toString() {
            return type;
        }
    }

    public enum ImageSize {
        THUMB("thumb"),
        SMALL("small"),
        MEDIUM("medium"),
        LARGE("large");

        private final String type;

        private ImageSize(final String type) {
            this.type = type;
        }

        public String toString() {
            return type;
        }
    }

    public class LookupQueryParams {
        protected String[] fields;
        protected String[] refs;

        public LookupQueryParams() {
            this(new String[0], new String[0]);
        }

        public LookupQueryParams(String[] fields, String[] refs) {
            this.fields = fields;
            this.refs = refs;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();

            if (fields.length > 0) {
                for (String field : fields) {
                    sb.append("fields=").append(field).append('&');
                }
            }

            if (refs.length > 0) {
                for (String ref : refs) {
                    sb.append("refs=").append(ref).append('&');
                }
            }

            return sb.toString();
        }
    }

    public class CollectionQueryParams {

        protected int offset;
        protected int limit;
        protected String[] fields;
        protected String[] refs;
        protected String orderBy;
        protected HashMap<String, Boolean> streamabilityFilters;
        protected HashMap<String, String> filters;
        protected String[] ids;

        public CollectionQueryParams() {
            this(OFFSET_DEFAULT, LIMIT_DEFAULT, FIELDS_DEFAULT, REFS_DEFAULT, ORDER_BY_DEFAULT, STREAMABILITY_FILTERS_DEFAULT, FILTERS_DEFAULT, IDS_DEFAULT);
        }

        public CollectionQueryParams(int offset, int limit, String[] fields, String[] refs, String orderBy, HashMap<String, Boolean> streamabilityFilters, HashMap<String, String> filters, String[] ids) {
            this.offset = offset;
            this.limit = limit;
            this.fields = fields;
            this.refs = refs;
            this.orderBy = orderBy;
            this.streamabilityFilters = streamabilityFilters;
            this.filters = filters;
            this.ids = ids;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();

            if (ids.length == 0) {
                sb.append("offset=").append(offset).append('&');
                sb.append("limit=").append(limit).append('&');

                if (fields.length > 0) {
                    for (String field : fields) {
                        sb.append("fields=").append(field).append('&');
                    }
                }

                if (refs.length > 0) {
                    for (String ref : refs) {
                        sb.append("refs=").append(ref).append('&');
                    }
                }

                sb.append("order_by=").append(Uri.encode(orderBy)).append('&');

                if (!streamabilityFilters.isEmpty()) {
                    for (String key : streamabilityFilters.keySet()) {
                        sb.append("filters=").append(key).append('=').append(streamabilityFilters.get(key)).append('&');
                    }
                }

                if (!filters.isEmpty()) {
                    for (String key : filters.keySet()) {
                        sb.append("filters=").append(key).append('=').append(filters.get(key)).append('&');
                    }
                }
            } else {
                for (String id : ids) {
                    sb.append("ids=").append(id).append('&');
                }
            }

            return sb.toString();
        }
    }
}