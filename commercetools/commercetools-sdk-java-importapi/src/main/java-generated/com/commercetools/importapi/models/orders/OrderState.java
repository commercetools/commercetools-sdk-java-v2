
package com.commercetools.importapi.models.orders;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Maps to <code>Order.orderState</code>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface OrderState extends JsonEnum {

    OrderState OPEN = OrderStateEnum.OPEN;

    OrderState CONFIRMED = OrderStateEnum.CONFIRMED;

    OrderState COMPLETE = OrderStateEnum.COMPLETE;

    OrderState CANCELLED = OrderStateEnum.CANCELLED;

    /**
     * possible values of OrderState
     */
    enum OrderStateEnum implements OrderState {
        /**
         * Open
         */
        OPEN("Open"),

        /**
         * Confirmed
         */
        CONFIRMED("Confirmed"),

        /**
         * Complete
         */
        COMPLETE("Complete"),

        /**
         * Cancelled
         */
        CANCELLED("Cancelled");
        private final String jsonName;

        private OrderStateEnum(final String jsonName) {
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
     * factory method for a enum value of OrderState
     * if no enum has been found an anonymous instance will be created
     * @return enum instance
     */
    @JsonCreator
    public static OrderState findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new OrderState() {
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
    public static Optional<OrderState> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static OrderState[] values() {
        return OrderStateEnum.values();
    }

}
