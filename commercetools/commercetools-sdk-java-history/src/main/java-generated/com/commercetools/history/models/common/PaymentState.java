
package com.commercetools.history.models.common;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentState
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface PaymentState extends JsonEnum {

    PaymentState BALANCE_DUE = PaymentStateEnum.BALANCE_DUE;

    PaymentState FAILED = PaymentStateEnum.FAILED;

    PaymentState PENDING = PaymentStateEnum.PENDING;

    PaymentState CREDIT_OWED = PaymentStateEnum.CREDIT_OWED;

    PaymentState PAID = PaymentStateEnum.PAID;

    /**
     * possible values of PaymentState
     */
    enum PaymentStateEnum implements PaymentState {
        /**
         * BalanceDue
         */
        BALANCE_DUE("BalanceDue"),

        /**
         * Failed
         */
        FAILED("Failed"),

        /**
         * Pending
         */
        PENDING("Pending"),

        /**
         * CreditOwed
         */
        CREDIT_OWED("CreditOwed"),

        /**
         * Paid
         */
        PAID("Paid");
        private final String jsonName;

        private PaymentStateEnum(final String jsonName) {
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
     * factory method for a enum value of PaymentState
     * if no enum has been found an anonymous instance will be created
     * @return enum instance
     */
    @JsonCreator
    public static PaymentState findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new PaymentState() {
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
    public static Optional<PaymentState> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static PaymentState[] values() {
        return PaymentStateEnum.values();
    }

}
