
package com.commercetools.api.models.product_type;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>A text input hint is a string with one of the following values:</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface TextInputHint {

    /**
    	<p>Hint for GUIs to display the field's content in a single line of text.</p>

    */
    TextInputHint SINGLE_LINE = TextInputHintEnum.SINGLE_LINE;
    /**
    	<p>Hint for GUIs to display the field's content over multiple lines of text.</p>

    */
    TextInputHint MULTI_LINE = TextInputHintEnum.MULTI_LINE;

    enum TextInputHintEnum implements TextInputHint {
        SINGLE_LINE("SingleLine"),

        MULTI_LINE("MultiLine");
        private final String jsonName;

        private TextInputHintEnum(final String jsonName) {
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
    public static TextInputHint findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new TextInputHint() {
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

    public static Optional<TextInputHint> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static TextInputHint[] values() {
        return TextInputHintEnum.values();
    }
}
