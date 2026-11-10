
package com.commercetools.checkout.models.payment_intents;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>The outcome returned by the payment Connector after processing a Payment Intent.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface PaymentIntentOutcome extends JsonEnum {

    /**
    <p>The Payment Intent was processed and approved by the payment service provider (PSP).</p> */
    PaymentIntentOutcome APPROVED = PaymentIntentOutcomeEnum.APPROVED;
    /**
    <p>The Payment Intent was rejected by the payment service provider (PSP).</p> */
    PaymentIntentOutcome REJECTED = PaymentIntentOutcomeEnum.REJECTED;
    /**
    <p>The Payment Intent was received and is being processed asynchronously by the payment service provider (PSP).</p> */
    PaymentIntentOutcome RECEIVED = PaymentIntentOutcomeEnum.RECEIVED;

    /**
     * possible values of PaymentIntentOutcome
     */
    enum PaymentIntentOutcomeEnum implements PaymentIntentOutcome {
        /**
         * approved
         */
        APPROVED("approved"),

        /**
         * rejected
         */
        REJECTED("rejected"),

        /**
         * received
         */
        RECEIVED("received");
        private final String jsonName;

        private PaymentIntentOutcomeEnum(final String jsonName) {
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
     * factory method for a enum value of PaymentIntentOutcome
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static PaymentIntentOutcome findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new PaymentIntentOutcome() {
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
    public static Optional<PaymentIntentOutcome> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static PaymentIntentOutcome[] values() {
        return PaymentIntentOutcomeEnum.values();
    }

}
