package com.commercetools.importapi.models.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Maps to <code>Order.inventoryMode</code>.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public enum InventoryMode {

    
    @JsonProperty("TrackOnly")
    TRACK_ONLY("TrackOnly"),
    
    
    @JsonProperty("ReserveOnOrder")
    RESERVE_ON_ORDER("ReserveOnOrder");

    private final String jsonName;

    private InventoryMode(final String jsonName) {
        this.jsonName = jsonName;
    }

    public String getJsonName() {
        return jsonName;
    }

    public static Optional<InventoryMode> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }
}
