package com.commercetools.importapi.models.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import io.vrap.rmf.base.client.utils.Generated;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public enum RoundingMode {


    @JsonProperty("HalfEven")
    HALF_EVEN("HalfEven"),


    @JsonProperty("HalfUp")
    HALF_UP("HalfUp"),


    @JsonProperty("HalfDown")
    HALF_DOWN("HalfDown");

    private final String jsonName;

    private RoundingMode(final String jsonName) {
        this.jsonName = jsonName;
    }

    public String getJsonName() {
        return jsonName;
    }

    public static Optional<RoundingMode> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }
}
