package com.commercetools.importapi.models.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Provides a visual representation type for this field. It is only relevant for string-based field types like CustomFieldStringType and CustomFieldLocalizedStringType.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public interface TypeTextInputHint extends JsonEnum {

    /**
    	<p>Hint for GUIs to display the field's content in a single line of text.</p>
    	
    */
    TypeTextInputHint SINGLE_LINE = TypeTextInputHintEnum.SINGLE_LINE;
    /**
    	<p>Hint for GUIs to display the field's content over multiple lines of text.</p>
    	
    */
    TypeTextInputHint MULTI_LINE = TypeTextInputHintEnum.MULTI_LINE;
    
    /**
     * possible values of TypeTextInputHint
     */
    enum TypeTextInputHintEnum implements TypeTextInputHint {
        /**
         * SingleLine
         */
        SINGLE_LINE("SingleLine"),
        
        /**
         * MultiLine
         */
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
     * factory method for a enum value of TypeTextInputHint
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
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

    /**
     * method to find enum using the JSON value
     * @param jsonName the json value to be wrapped
     * @return optional of enum instance
     */
    public static Optional<TypeTextInputHint> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }
    
    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static TypeTextInputHint[] values() {
        return TypeTextInputHintEnum.values();
    }
    
}
