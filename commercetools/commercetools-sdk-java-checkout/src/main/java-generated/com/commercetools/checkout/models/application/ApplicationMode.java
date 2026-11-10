
package com.commercetools.checkout.models.application;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApplicationMode
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ApplicationMode extends JsonEnum {

    /**
    <p>Checkout will manage all the steps of a checkout process including shipping and billing address, shipping method, and payment.</p> */
    ApplicationMode COMPLETE_FLOW = ApplicationModeEnum.COMPLETE_FLOW;
    /**
    <p>Checkout will display only the payment step.</p> */
    ApplicationMode PAYMENT_ONLY = ApplicationModeEnum.PAYMENT_ONLY;

    /**
     * possible values of ApplicationMode
     */
    enum ApplicationModeEnum implements ApplicationMode {
        /**
         * CompleteFlow
         */
        COMPLETE_FLOW("CompleteFlow"),

        /**
         * PaymentOnly
         */
        PAYMENT_ONLY("PaymentOnly");
        private final String jsonName;

        private ApplicationModeEnum(final String jsonName) {
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
     * factory method for a enum value of ApplicationMode
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static ApplicationMode findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new ApplicationMode() {
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
    public static Optional<ApplicationMode> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static ApplicationMode[] values() {
        return ApplicationModeEnum.values();
    }

}
