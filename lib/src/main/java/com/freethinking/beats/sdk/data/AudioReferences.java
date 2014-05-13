package com.freethinking.beats.sdk.data;

public class AudioReferences extends BaseJson {
    protected ReferenceLink track;

    public AudioReferences() {
        this.track = new ReferenceLink();
    }

    @Override
    public void fillIn(BaseJson parseJson) throws Exception {
        if (parseJson instanceof AudioReferences) {
            track = ((AudioReferences) parseJson).track;
        } else {
            throw new Exception();
        }
    }

    public ReferenceLink getTrack() {
        return track;
    }
}
