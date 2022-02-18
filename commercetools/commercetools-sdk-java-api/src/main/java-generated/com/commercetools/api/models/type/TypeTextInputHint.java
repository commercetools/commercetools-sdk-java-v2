
package com.commercetools.api.models.type;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Provides a visual representation type for this field. It is only relevant for string-based field types like <a href="ctp:api:type:CustomFieldStringType">CustomFieldStringType</a> and <a href="ctp:api:type:CustomFieldLocalizedStringType">CustomFieldLocalizedStringType</a>. Following values are supported:</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface TypeTextInputHint {

    /**
    	<p>Hint for GUIs to display the field's content in a single line of text.</p>

    */
    TypeTextInputHint SINGLE_LINE = TypeTextInputHintEnum.SINGLE_LINE;
    /**
    	<p>Hint for GUIs to display the field's content over multiple lines of text.</p>

    */
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

        public String toString() {
            return jsonName;
        }
    }

    @JsonValue
    String getJsonName();

    String name();

    String toString();

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

            public String toString() {
                return value;
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
