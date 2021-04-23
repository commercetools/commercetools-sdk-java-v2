
package com.commercetools.history.models.common;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface StateType {

    StateType ORDER_STATE = StateTypeEnum.ORDER_STATE;

    StateType LINE_ITEM_STATE = StateTypeEnum.LINE_ITEM_STATE;

    StateType PRODUCT_STATE = StateTypeEnum.PRODUCT_STATE;

    StateType REVIEW_STATE = StateTypeEnum.REVIEW_STATE;

    StateType PAYMENT_STATE = StateTypeEnum.PAYMENT_STATE;

    enum StateTypeEnum implements StateType {
        ORDER_STATE("OrderState"),

        LINE_ITEM_STATE("LineItemState"),

        PRODUCT_STATE("ProductState"),

        REVIEW_STATE("ReviewState"),

        PAYMENT_STATE("PaymentState");
        private final String jsonName;

        private StateTypeEnum(final String jsonName) {
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
    public static StateType findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new StateType() {
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

    public static Optional<StateType> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static StateType[] values() {
        return StateTypeEnum.values();
    }
}
