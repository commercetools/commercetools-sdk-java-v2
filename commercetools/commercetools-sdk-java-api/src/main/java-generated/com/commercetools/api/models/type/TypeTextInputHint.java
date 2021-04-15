
package com.commercetools.api.models.type;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface TypeTextInputHint {

    TypeTextInputHint SINGLE_LINE = TypeTextInputHintEnum.SINGLE_LINE;

    TypeTextInputHint MULTI_LINE = TypeTextInputHintEnum.MULTI_LINE;

    enum TypeTextInputHintEnum implements TypeTextInputHint {
        SINGLE_LINE("SingleLine"),

        MULTI_LINE("MultiLine");
        private final String jsonName;

        private TypeTextInputHintEnum(final String jsonName) {
            this.jsonName = jsonName;
        }

        public String getJsonName() {
            return jsonName;
        }
    }

    @JsonValue
    String getJsonName();

    String name();

    @JsonCreator
    public static TypeTextInputHint findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new TypeTextInputHint() {
            @Override
            public String getJsonName() {
                return value;
            }

            @Override
            public String name() {
                return value.toUpperCase();
            }
        });
    }

    public static Optional<TypeTextInputHint> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static TypeTextInputHint[] values() {
        return TypeTextInputHintEnum.values();
    }
}
