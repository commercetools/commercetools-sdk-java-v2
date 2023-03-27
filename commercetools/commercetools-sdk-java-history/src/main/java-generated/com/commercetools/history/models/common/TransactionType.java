
package com.commercetools.history.models.common;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * TransactionType
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface TransactionType {

    TransactionType AUTHORIZATION = TransactionTypeEnum.AUTHORIZATION;

    TransactionType CANCEL_AUTHORIZATION = TransactionTypeEnum.CANCEL_AUTHORIZATION;

    TransactionType CHARGE = TransactionTypeEnum.CHARGE;

    TransactionType REFUND = TransactionTypeEnum.REFUND;

    TransactionType CHARGEBACK = TransactionTypeEnum.CHARGEBACK;

    /**
     * possible values of TransactionType
     */
    enum TransactionTypeEnum implements TransactionType {
        /**
         * Authorization
         */
        AUTHORIZATION("Authorization"),

        /**
         * CancelAuthorization
         */
        CANCEL_AUTHORIZATION("CancelAuthorization"),

        /**
         * Charge
         */
        CHARGE("Charge"),

        /**
         * Refund
         */
        REFUND("Refund"),

        /**
         * Chargeback
         */
        CHARGEBACK("Chargeback");
        private final String jsonName;

        private TransactionTypeEnum(final String jsonName) {
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
     * factory method for a enum value of TransactionType
     * if no enum has been found an anonymous instance will be created
     * @return enum instance
     */
    @JsonCreator
    public static TransactionType findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new TransactionType() {
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
    public static Optional<TransactionType> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static TransactionType[] values() {
        return TransactionTypeEnum.values();
    }

}
