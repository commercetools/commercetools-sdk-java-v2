
package com.commercetools.importapi.models.product_selections;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Defines how variants are selected for the product.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface VariantSelectionType extends JsonEnum {

    /**
    <p>Only the specified SKUs are included.</p> */
    VariantSelectionType INCLUDE_ONLY = VariantSelectionTypeEnum.INCLUDE_ONLY;
    /**
    <p>All variants except the specified SKUs are included.</p> */
    VariantSelectionType INCLUDE_ALL_EXCEPT = VariantSelectionTypeEnum.INCLUDE_ALL_EXCEPT;

    /**
     * possible values of VariantSelectionType
     */
    enum VariantSelectionTypeEnum implements VariantSelectionType {
        /**
         * includeOnly
         */
        INCLUDE_ONLY("includeOnly"),

        /**
         * includeAllExcept
         */
        INCLUDE_ALL_EXCEPT("includeAllExcept");
        private final String jsonName;

        private VariantSelectionTypeEnum(final String jsonName) {
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
     * factory method for a enum value of VariantSelectionType
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static VariantSelectionType findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new VariantSelectionType() {
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
    public static Optional<VariantSelectionType> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static VariantSelectionType[] values() {
        return VariantSelectionTypeEnum.values();
    }

}
