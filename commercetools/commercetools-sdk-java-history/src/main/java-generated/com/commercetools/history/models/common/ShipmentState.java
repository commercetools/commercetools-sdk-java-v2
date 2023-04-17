
package com.commercetools.history.models.common;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShipmentState
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ShipmentState extends JsonEnum {

    ShipmentState SHIPPED = ShipmentStateEnum.SHIPPED;

    ShipmentState READY = ShipmentStateEnum.READY;

    ShipmentState PENDING = ShipmentStateEnum.PENDING;

    ShipmentState DELAYED = ShipmentStateEnum.DELAYED;

    ShipmentState PARTIAL = ShipmentStateEnum.PARTIAL;

    ShipmentState BACKORDER = ShipmentStateEnum.BACKORDER;

    /**
     * possible values of ShipmentState
     */
    enum ShipmentStateEnum implements ShipmentState {
        /**
         * Shipped
         */
        SHIPPED("Shipped"),

        /**
         * Ready
         */
        READY("Ready"),

        /**
         * Pending
         */
        PENDING("Pending"),

        /**
         * Delayed
         */
        DELAYED("Delayed"),

        /**
         * Partial
         */
        PARTIAL("Partial"),

        /**
         * Backorder
         */
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

    /**
     * the JSON value
     * @return json value
     */
    @JsonValue
    String getJsonName();

    /**
     * the enum value
     * @return name
     */
    String name();

    /**
     * convert value to string
     * @return string representation
     */
    String toString();

    /**
     * factory method for a enum value of ShipmentState
     * if no enum has been found an anonymous instance will be created
     * @return enum instance
     */
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

    /**
     * method to find enum using the JSON value
     * @return optional of enum instance
     */
    public static Optional<ShipmentState> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static ShipmentState[] values() {
        return ShipmentStateEnum.values();
    }

}
