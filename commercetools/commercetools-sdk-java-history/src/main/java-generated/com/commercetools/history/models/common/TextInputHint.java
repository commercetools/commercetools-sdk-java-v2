package com.commercetools.history.models.common;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TextInputHint
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public interface TextInputHint extends JsonEnum {

    
    TextInputHint SINGLE_LINE = TextInputHintEnum.SINGLE_LINE;
    
    TextInputHint MULTI_LINE = TextInputHintEnum.MULTI_LINE;
    
    /**
     * possible values of TextInputHint
     */
    enum TextInputHintEnum implements TextInputHint {
        /**
         * SingleLine
         */
        SINGLE_LINE("SingleLine"),
        
        /**
         * MultiLine
         */
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
     * factory method for a enum value of TextInputHint
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
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

    /**
     * method to find enum using the JSON value
     * @param jsonName the json value to be wrapped
     * @return optional of enum instance
     */
    public static Optional<TextInputHint> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }
    
    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static TextInputHint[] values() {
        return TextInputHintEnum.values();
    }
    
}
