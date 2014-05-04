package com.freethinking.beats.sdk.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class BaseJson implements Serializable {
    public abstract void fillIn(BaseJson parseJson) throws Exception;
}
