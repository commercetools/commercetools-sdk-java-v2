
package com.commercetools.api.models.order;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Indicates the shipment status of the Order.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ShipmentState extends JsonEnum {

    /**
    <p>Indicates that the Order is shipped.</p> */
    ShipmentState SHIPPED = ShipmentStateEnum.SHIPPED;
    /**
    <p>Indicates that the Order is delivered.</p> */
    ShipmentState DELIVERED = ShipmentStateEnum.DELIVERED;
    /**
    <p>Indicates that the Order is ready to be shipped.</p> */
    ShipmentState READY = ShipmentStateEnum.READY;
    /**
    <p>Indicates that the shipment of the Order is pending.</p> */
    ShipmentState PENDING = ShipmentStateEnum.PENDING;
    /**
    <p>Indicates that the shipment of the Order is delayed.</p> */
    ShipmentState DELAYED = ShipmentStateEnum.DELAYED;
    /**
    <p>Indicates that items in the Order are shipped in more than one shipment.</p> */
    ShipmentState PARTIAL = ShipmentStateEnum.PARTIAL;
    /**
    <p>Indicates that items in the Order are not in stock and will be delivered once the items are restocked.</p> */
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
         * Delivered
         */
        DELIVERED("Delivered"),

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
     * @param value the enum value to be wrapped
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
     * @param jsonName the json value to be wrapped
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
