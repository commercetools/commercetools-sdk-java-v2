
package com.commercetools.history.models.common;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StateType
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface StateType extends JsonEnum {

    StateType ORDER_STATE = StateTypeEnum.ORDER_STATE;

    StateType LINE_ITEM_STATE = StateTypeEnum.LINE_ITEM_STATE;

    StateType PRODUCT_STATE = StateTypeEnum.PRODUCT_STATE;

    StateType REVIEW_STATE = StateTypeEnum.REVIEW_STATE;

    StateType PAYMENT_STATE = StateTypeEnum.PAYMENT_STATE;

    /**
     * possible values of StateType
     */
    enum StateTypeEnum implements StateType {
        /**
         * OrderState
         */
        ORDER_STATE("OrderState"),

        /**
         * LineItemState
         */
        LINE_ITEM_STATE("LineItemState"),

        /**
         * ProductState
         */
        PRODUCT_STATE("ProductState"),

        /**
         * ReviewState
         */
        REVIEW_STATE("ReviewState"),

        /**
         * PaymentState
         */
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
     * factory method for a enum value of StateType
     * if no enum has been found an anonymous instance will be created
     * @return enum instance
     */
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

    /**
     * method to find enum using the JSON value
     * @return optional of enum instance
     */
    public static Optional<StateType> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static StateType[] values() {
        return StateTypeEnum.values();
    }

}
