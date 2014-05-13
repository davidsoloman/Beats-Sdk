package com.freethinking.beats.sdk.player;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;

import com.freethinking.beats.sdk.data.Audio;
import com.freethinking.beats.sdk.mappers.AudioMapper;
import com.freethinking.beats.sdk.network.NetworkAdapter;
import com.freethinking.beats.sdk.network.NetworkParts;
import com.freethinking.beats.sdk.network.UrlFactory;

import java.io.IOException;
import java.util.HashMap;

public class Player extends MediaPlayer implements MediaPlayer.OnPreparedListener {

    protected Context context;
    protected String trackId;
    protected String mediaUrl;

    // Audio to stream
    protected Audio audio;

    public Player(Context context) {
        this.context = context;
        this.audio = new Audio();
        setAudioStreamType(AudioManager.STREAM_MUSIC);
    }

    public Player(Context context, String trackId) {
        this(context);
        this.trackId = trackId;
        this.mediaUrl = UrlFactory.audioUrl(trackId);
    }

    public String getTrackId() {
        return trackId;
    }

    public void setTrackId(String trackId) {
        this.trackId = trackId;
        this.mediaUrl = UrlFactory.audioUrl(trackId);
    }

    @Override
    public void prepare() throws IOException, IllegalStateException {
        NetworkParts parts = new NetworkParts(context, new AudioMapper(), NetworkParts.RequestType.GET, new HashMap<String, String>(), audio);
        parts.before();
        String response = parts.during(mediaUrl);
        parts.after(response);
        setDataSource(UrlFactory.audioResourceUrl(audio.getResource()));
        super.prepare();
    }

    @Override
    public void prepareAsync() {
        this.audio = new Audio();
        TrackAudioUrlRequest request = new TrackAudioUrlRequest(context);
        request.execute(mediaUrl);
    }

    private void finishPreparingAsync() throws IllegalStateException {
        try {
            setDataSource(UrlFactory.audioResourceUrl(audio.getResource()));
            super.prepareAsync();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onPrepared(MediaPlayer mp) {
        mp.start();
    }

    private class TrackAudioUrlRequest extends NetworkAdapter {

        public TrackAudioUrlRequest(Context context) {
            super(context, new AudioMapper(), NetworkParts.RequestType.GET, new HashMap<String, String>(), audio);
        }

        @Override
        public Boolean authRequired() {
            return true;
        }

        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);
            finishPreparingAsync();
        }
    }
}
