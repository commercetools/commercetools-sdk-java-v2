
package com.commercetools.importapi.models.orders;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Maps to <code>Order.inventoryMode</code>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface InventoryMode {

    InventoryMode TRACK_ONLY = InventoryModeEnum.TRACK_ONLY;

    InventoryMode RESERVE_ON_ORDER = InventoryModeEnum.RESERVE_ON_ORDER;

    enum InventoryModeEnum implements InventoryMode {
        TRACK_ONLY("TrackOnly"),

        RESERVE_ON_ORDER("ReserveOnOrder");
        private final String jsonName;

        private InventoryModeEnum(final String jsonName) {
            this.jsonName = jsonName;
        }

        public String getJsonName() {
            return jsonName;
        }

        public String toString() {
            return jsonName;
        }
    }

    @JsonValue
    String getJsonName();

    String name();

    String toString();

    @JsonCreator
    public static InventoryMode findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new InventoryMode() {
            @Override
            public String getJsonName() {
                return value;
            }

            @Override
            public String name() {
                return value.toUpperCase();
            }

            public String toString() {
                return value;
            }
        });
    }

    public static Optional<InventoryMode> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static InventoryMode[] values() {
        return InventoryModeEnum.values();
    }
}
