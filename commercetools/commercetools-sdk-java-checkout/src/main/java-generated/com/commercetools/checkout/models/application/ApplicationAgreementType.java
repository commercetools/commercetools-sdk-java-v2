
package com.commercetools.checkout.models.application;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApplicationAgreementType
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ApplicationAgreementType extends JsonEnum {

    /**
    <p>Display a 'text only' agreement without a checkbox.</p> */
    ApplicationAgreementType TEXT = ApplicationAgreementTypeEnum.TEXT;
    /**
    <p>Display an agreement text with a mandatory checkbox.</p> */
    ApplicationAgreementType MANDATORY_CHECKBOX = ApplicationAgreementTypeEnum.MANDATORY_CHECKBOX;

    /**
     * possible values of ApplicationAgreementType
     */
    enum ApplicationAgreementTypeEnum implements ApplicationAgreementType {
        /**
         * Text
         */
        TEXT("Text"),

        /**
         * MandatoryCheckbox
         */
        MANDATORY_CHECKBOX("MandatoryCheckbox");
        private final String jsonName;

        private ApplicationAgreementTypeEnum(final String jsonName) {
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
     * factory method for a enum value of ApplicationAgreementType
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static ApplicationAgreementType findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new ApplicationAgreementType() {
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
    public static Optional<ApplicationAgreementType> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static ApplicationAgreementType[] values() {
        return ApplicationAgreementTypeEnum.values();
    }

}
