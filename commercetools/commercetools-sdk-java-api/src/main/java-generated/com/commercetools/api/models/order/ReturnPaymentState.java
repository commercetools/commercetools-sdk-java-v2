
package com.commercetools.api.models.order;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReturnPaymentState
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ReturnPaymentState extends JsonEnum {

    /**
    	<p>Initial state for Return Items for which payment cannot be refunded.</p>
    	<p>Return Items have the <code>Advised</code> <a href="ctp:api:type:ReturnShipmentState">ReturnShipmentState</a>.</p>

    */
    ReturnPaymentState NON_REFUNDABLE = ReturnPaymentStateEnum.NON_REFUNDABLE;
    /**
    	<p>Initial state for Return Items for which payment can be refunded.</p>
    	<p>Return Items have the <code>Returned</code> <a href="ctp:api:type:ReturnShipmentState">ReturnShipmentState</a>.</p>

    */
    ReturnPaymentState INITIAL = ReturnPaymentStateEnum.INITIAL;
    /**
    	<p>The payment for the Return Items is refunded.</p>

    */
    ReturnPaymentState REFUNDED = ReturnPaymentStateEnum.REFUNDED;
    /**
    	<p>The payment for the Return Items is not refunded.</p>

    */
    ReturnPaymentState NOT_REFUNDED = ReturnPaymentStateEnum.NOT_REFUNDED;

    /**
     * possible values of ReturnPaymentState
     */
    enum ReturnPaymentStateEnum implements ReturnPaymentState {
        /**
         * NonRefundable
         */
        NON_REFUNDABLE("NonRefundable"),

        /**
         * Initial
         */
        INITIAL("Initial"),

        /**
         * Refunded
         */
        REFUNDED("Refunded"),

        /**
         * NotRefunded
         */
        NOT_REFUNDED("NotRefunded");
        private final String jsonName;

        private ReturnPaymentStateEnum(final String jsonName) {
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
     * factory method for a enum value of ReturnPaymentState
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static ReturnPaymentState findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new ReturnPaymentState() {
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
    public static Optional<ReturnPaymentState> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static ReturnPaymentState[] values() {
        return ReturnPaymentStateEnum.values();
    }

}
