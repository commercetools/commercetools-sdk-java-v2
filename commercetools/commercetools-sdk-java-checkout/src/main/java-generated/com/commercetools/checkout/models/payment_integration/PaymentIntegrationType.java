
package com.commercetools.checkout.models.payment_integration;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentIntegrationType
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface PaymentIntegrationType extends JsonEnum {

    /**
    <p>The integration is with a Payment provider.</p> */
    PaymentIntegrationType PSP = PaymentIntegrationTypeEnum.PSP;
    /**
    <p>The integration is with a Gift card provider.</p> */
    PaymentIntegrationType GIFT_CARD = PaymentIntegrationTypeEnum.GIFT_CARD;

    /**
     * possible values of PaymentIntegrationType
     */
    enum PaymentIntegrationTypeEnum implements PaymentIntegrationType {
        /**
         * Psp
         */
        PSP("Psp"),

        /**
         * GiftCard
         */
        GIFT_CARD("GiftCard");
        private final String jsonName;

        private PaymentIntegrationTypeEnum(final String jsonName) {
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
     * factory method for a enum value of PaymentIntegrationType
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static PaymentIntegrationType findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new PaymentIntegrationType() {
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
    public static Optional<PaymentIntegrationType> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static PaymentIntegrationType[] values() {
        return PaymentIntegrationTypeEnum.values();
    }

}
