
package com.commercetools.api.models.order;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ShipmentState {

    ShipmentState SHIPPED = ShipmentStateEnum.SHIPPED;

    ShipmentState READY = ShipmentStateEnum.READY;

    ShipmentState PENDING = ShipmentStateEnum.PENDING;

    ShipmentState DELAYED = ShipmentStateEnum.DELAYED;

    ShipmentState PARTIAL = ShipmentStateEnum.PARTIAL;

    ShipmentState BACKORDER = ShipmentStateEnum.BACKORDER;

    enum ShipmentStateEnum implements ShipmentState {
        SHIPPED("Shipped"),

        READY("Ready"),

        PENDING("Pending"),

        DELAYED("Delayed"),

        PARTIAL("Partial"),

        BACKORDER("Backorder");
        private final String jsonName;

        private ShipmentStateEnum(final String jsonName) {
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
    public static ShipmentState findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new ShipmentState() {
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

    public static Optional<ShipmentState> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static ShipmentState[] values() {
        return ShipmentStateEnum.values();
    }
}
