
package com.commercetools.checkout.models.application;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApplicationAgreementStatus
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ApplicationAgreementStatus extends JsonEnum {

    /**
    <p>The application agreement is active and can be used for processing payments.</p> */
    ApplicationAgreementStatus ACTIVE = ApplicationAgreementStatusEnum.ACTIVE;
    /**
    <p>The application agreement is inactive and cannot be used for processing payments.</p> */
    ApplicationAgreementStatus INACTIVE = ApplicationAgreementStatusEnum.INACTIVE;

    /**
     * possible values of ApplicationAgreementStatus
     */
    enum ApplicationAgreementStatusEnum implements ApplicationAgreementStatus {
        /**
         * Active
         */
        ACTIVE("Active"),

        /**
         * Inactive
         */
        INACTIVE("Inactive");
        private final String jsonName;

        private ApplicationAgreementStatusEnum(final String jsonName) {
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
     * factory method for a enum value of ApplicationAgreementStatus
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static ApplicationAgreementStatus findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new ApplicationAgreementStatus() {
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
    public static Optional<ApplicationAgreementStatus> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static ApplicationAgreementStatus[] values() {
        return ApplicationAgreementStatusEnum.values();
    }

}
