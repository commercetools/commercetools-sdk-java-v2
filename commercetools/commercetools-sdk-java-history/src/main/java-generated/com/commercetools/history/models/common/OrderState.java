
package com.commercetools.history.models.common;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface OrderState {

    OrderState OPEN = OrderStateEnum.OPEN;

    OrderState CONFIRMED = OrderStateEnum.CONFIRMED;

    OrderState COMPLETE = OrderStateEnum.COMPLETE;

    OrderState CANCELLED = OrderStateEnum.CANCELLED;

    enum OrderStateEnum implements OrderState {
        OPEN("Open"),

        CONFIRMED("Confirmed"),

        COMPLETE("Complete"),

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

    @JsonValue
    String getJsonName();

    String name();

    String toString();

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

    public static Optional<OrderState> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static OrderState[] values() {
        return OrderStateEnum.values();
    }
}
