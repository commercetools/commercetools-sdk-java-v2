
package com.commercetools.api.models.project;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Specifies the status of the <span>Business Unit Search</span> index. You can change the status using the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProjectChangeBusinessUnitSearchStatusAction" rel="nofollow">Change Business Unit Search Status</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface BusinessUnitSearchStatus extends JsonEnum {

    /**
    <p>indicates that the Business Unit Search feature is fully operational.</p> */
    BusinessUnitSearchStatus ACTIVATED = BusinessUnitSearchStatusEnum.ACTIVATED;
    /**
    <p>indicates that the Business Unit Search feature is currently not active.</p> */
    BusinessUnitSearchStatus DEACTIVATED = BusinessUnitSearchStatusEnum.DEACTIVATED;

    /**
     * possible values of BusinessUnitSearchStatus
     */
    enum BusinessUnitSearchStatusEnum implements BusinessUnitSearchStatus {
        /**
         * Activated
         */
        ACTIVATED("Activated"),

        /**
         * Deactivated
         */
        DEACTIVATED("Deactivated");
        private final String jsonName;

        private BusinessUnitSearchStatusEnum(final String jsonName) {
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
     * factory method for a enum value of BusinessUnitSearchStatus
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static BusinessUnitSearchStatus findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new BusinessUnitSearchStatus() {
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
    public static Optional<BusinessUnitSearchStatus> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static BusinessUnitSearchStatus[] values() {
        return BusinessUnitSearchStatusEnum.values();
    }

}
