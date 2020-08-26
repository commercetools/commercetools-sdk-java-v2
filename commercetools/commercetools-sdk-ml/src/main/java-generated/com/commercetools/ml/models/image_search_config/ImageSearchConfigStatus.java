package com.commercetools.ml.models.image_search_config;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import io.vrap.rmf.base.client.utils.Generated;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public enum ImageSearchConfigStatus {

    
    @JsonProperty("on")
    ON("on"),
    
    
    @JsonProperty("off")
    OFF("off");

    private final String jsonName;

    private ImageSearchConfigStatus(final String jsonName) {
        this.jsonName = jsonName;
    }

    public String getJsonName() {
        return jsonName;
    }

    public static Optional<ImageSearchConfigStatus> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }
}
