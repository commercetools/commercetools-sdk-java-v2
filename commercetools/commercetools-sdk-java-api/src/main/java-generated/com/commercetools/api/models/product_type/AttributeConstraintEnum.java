
package com.commercetools.api.models.product_type;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface AttributeConstraintEnum {

    AttributeConstraintEnum NONE = AttributeConstraintEnumEnum.NONE;

    AttributeConstraintEnum UNIQUE = AttributeConstraintEnumEnum.UNIQUE;

    AttributeConstraintEnum COMBINATION_UNIQUE = AttributeConstraintEnumEnum.COMBINATION_UNIQUE;

    AttributeConstraintEnum SAME_FOR_ALL = AttributeConstraintEnumEnum.SAME_FOR_ALL;

    enum AttributeConstraintEnumEnum implements AttributeConstraintEnum {
        NONE("None"),

        UNIQUE("Unique"),

        COMBINATION_UNIQUE("CombinationUnique"),

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

    @JsonValue
    String getJsonName();

    String name();

    String toString();

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

    public static Optional<AttributeConstraintEnum> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static AttributeConstraintEnum[] values() {
        return AttributeConstraintEnumEnum.values();
    }
}
