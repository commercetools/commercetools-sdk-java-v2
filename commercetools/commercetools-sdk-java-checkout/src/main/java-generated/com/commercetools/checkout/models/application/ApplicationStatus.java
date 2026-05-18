
package com.commercetools.checkout.models.application;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApplicationStatus
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ApplicationStatus extends JsonEnum {

    /**
    <p>The application status is active and can be used for processing payments.</p> */
    ApplicationStatus ACTIVE = ApplicationStatusEnum.ACTIVE;
    /**
    <p>The application status is inactive and cannot be used for processing payments.</p> */
    ApplicationStatus INACTIVE = ApplicationStatusEnum.INACTIVE;

    /**
     * possible values of ApplicationStatus
     */
    enum ApplicationStatusEnum implements ApplicationStatus {
        /**
         * Active
         */
        ACTIVE("Active"),

        /**
         * Inactive
         */
        INACTIVE("Inactive");
        private final String jsonName;

        private ApplicationStatusEnum(final String jsonName) {
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
     * factory method for a enum value of ApplicationStatus
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static ApplicationStatus findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new ApplicationStatus() {
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
    public static Optional<ApplicationStatus> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static ApplicationStatus[] values() {
        return ApplicationStatusEnum.values();
    }

}
