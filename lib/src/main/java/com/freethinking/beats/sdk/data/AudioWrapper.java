package com.freethinking.beats.sdk.data;

public class AudioWrapper extends BaseJson {
    protected Audio data;
    protected String code;

    public AudioWrapper() {
        this.data = new Audio();
    }

    public String getCode() {
        return code;
    }

    public Audio getData() {
        return data;
    }

    public Audio getAudio() {
        return data;
    }

    @Override
    public void fillIn(BaseJson parseJson) throws Exception {
        if (parseJson instanceof AudioWrapper) {
            data = ((AudioWrapper) parseJson).data;
            code = ((AudioWrapper) parseJson).code;
        } else {
            throw new Exception();
        }
    }
}
