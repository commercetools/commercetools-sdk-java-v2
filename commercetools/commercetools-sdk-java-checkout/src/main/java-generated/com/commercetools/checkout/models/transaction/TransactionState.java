
package com.commercetools.checkout.models.transaction;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>The state of the <span>Transaction</span>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface TransactionState extends JsonEnum {

    /**
    <p>The Transaction has started. The <span>Connector</span> is requesting the PSP or gift card management system to execute the payment for the <span>Cart</span>.</p> */
    TransactionState INITIAL = TransactionStateEnum.INITIAL;
    /**
    <p>The Transaction is in progress. The PSP or gift card management system is processing the payment.</p> */
    TransactionState PENDING = TransactionStateEnum.PENDING;
    /**
    <p>The Transaction completed successfully. The PSP or gift card management system processed the payment and Checkout created an <span>Order</span> from the Cart.</p> */
    TransactionState COMPLETED = TransactionStateEnum.COMPLETED;
    /**
    <p>The Transaction failed.</p> */
    TransactionState FAILED = TransactionStateEnum.FAILED;

    /**
     * possible values of TransactionState
     */
    enum TransactionStateEnum implements TransactionState {
        /**
         * Initial
         */
        INITIAL("Initial"),

        /**
         * Pending
         */
        PENDING("Pending"),

        /**
         * Completed
         */
        COMPLETED("Completed"),

        /**
         * Failed
         */
        FAILED("Failed");
        private final String jsonName;

        private TransactionStateEnum(final String jsonName) {
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
     * factory method for a enum value of TransactionState
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static TransactionState findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new TransactionState() {
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
    public static Optional<TransactionState> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static TransactionState[] values() {
        return TransactionStateEnum.values();
    }

}
