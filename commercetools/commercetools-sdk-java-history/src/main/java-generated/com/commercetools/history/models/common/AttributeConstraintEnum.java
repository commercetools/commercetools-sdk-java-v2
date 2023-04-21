
package com.commercetools.history.models.common;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeConstraintEnum
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface AttributeConstraintEnum extends JsonEnum {

    AttributeConstraintEnum NONE = AttributeConstraintEnumEnum.NONE;

    AttributeConstraintEnum UNIQUE = AttributeConstraintEnumEnum.UNIQUE;

    AttributeConstraintEnum COMBINATION_UNIQUE = AttributeConstraintEnumEnum.COMBINATION_UNIQUE;

    AttributeConstraintEnum SAME_FOR_ALL = AttributeConstraintEnumEnum.SAME_FOR_ALL;

    /**
     * possible values of AttributeConstraintEnum
     */
    enum AttributeConstraintEnumEnum implements AttributeConstraintEnum {
        /**
         * None
         */
        NONE("None"),

        /**
         * Unique
         */
        UNIQUE("Unique"),

        /**
         * CombinationUnique
         */
        COMBINATION_UNIQUE("CombinationUnique"),

        /**
         * SameForAll
         */
        SAME_FOR_ALL("SameForAll");
        private final String jsonName;

        private AttributeConstraintEnumEnum(final String jsonName) {
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
     * factory method for a enum value of AttributeConstraintEnum
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static AttributeConstraintEnum findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new AttributeConstraintEnum() {
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
    public static Optional<AttributeConstraintEnum> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static AttributeConstraintEnum[] values() {
        return AttributeConstraintEnumEnum.values();
    }

}
