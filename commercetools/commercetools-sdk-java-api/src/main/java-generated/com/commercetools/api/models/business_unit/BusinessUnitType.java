
package com.commercetools.api.models.business_unit;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>The type of the Business Unit indicating its position in a hierarchy.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface BusinessUnitType extends JsonEnum {

    /**
    <p>Top-level Business Unit. Must not have a <code>parentUnit</code> defined.</p> */
    BusinessUnitType COMPANY = BusinessUnitTypeEnum.COMPANY;
    /**
    <p>Business Unit with a <code>parentUnit</code> reference to a Company or another Division.</p> */
    BusinessUnitType DIVISION = BusinessUnitTypeEnum.DIVISION;

    /**
     * possible values of BusinessUnitType
     */
    enum BusinessUnitTypeEnum implements BusinessUnitType {
        /**
         * Company
         */
        COMPANY("Company"),

        /**
         * Division
         */
        DIVISION("Division");
        private final String jsonName;

        private BusinessUnitTypeEnum(final String jsonName) {
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
     * factory method for a enum value of BusinessUnitType
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static BusinessUnitType findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new BusinessUnitType() {
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
    public static Optional<BusinessUnitType> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static BusinessUnitType[] values() {
        return BusinessUnitTypeEnum.values();
    }

}
