
package com.commercetools.history.models.common;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Transactions can be in one of the following States:</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface TransactionState extends JsonEnum {

    TransactionState INITIAL = TransactionStateEnum.INITIAL;

    TransactionState PENDING = TransactionStateEnum.PENDING;

    TransactionState SUCCESS = TransactionStateEnum.SUCCESS;

    TransactionState FAILURE = TransactionStateEnum.FAILURE;

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
         * Success
         */
        SUCCESS("Success"),

        /**
         * Failure
         */
        FAILURE("Failure");
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
