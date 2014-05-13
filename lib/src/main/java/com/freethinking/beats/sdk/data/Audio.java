package com.freethinking.beats.sdk.data;

public class Audio extends BaseJson {
    protected String type;
    protected Integer bitrate;
    protected String codec;
    protected String location;
    protected String resource;
    protected AudioReferences refs;

    public Audio() {
        this.refs = new AudioReferences();
    }

    @Override
    public void fillIn(BaseJson parseJson) throws Exception {
        if (parseJson instanceof Audio) {
            type = ((Audio) parseJson).type;
            bitrate = ((Audio) parseJson).bitrate;
            codec = ((Audio) parseJson).codec;
            location = ((Audio) parseJson).location;
            resource = ((Audio) parseJson).resource;
            refs = ((Audio) parseJson).refs;
        } else {
            throw new Exception();
        }
    }

    public String getType() {
        return type;
    }

    public Integer getBitrate() {
        return bitrate;
    }

    public String getCodec() {
        return codec;
    }

    public String getLocation() {
        return location;
    }

    public String getResource() {
        return resource;
    }

    public AudioReferences getRefs() {
        return refs;
    }
}
