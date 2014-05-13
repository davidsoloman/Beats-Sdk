package com.freethinking.beats.sdk.mappers;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.freethinking.beats.sdk.data.AudioWrapper;
import com.freethinking.beats.sdk.data.BaseJson;

import java.io.IOException;

public class AudioMapper extends CommonMapper {
    @Override
    public BaseJson parseJson(String json) {
        AudioWrapper audioWrapper = new AudioWrapper();

        try {
            jsonParser = jsonFactory.createParser(json);
            audioWrapper = objMapper.readValue(jsonParser, AudioWrapper.class);
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return audioWrapper.getAudio();
    }
}
