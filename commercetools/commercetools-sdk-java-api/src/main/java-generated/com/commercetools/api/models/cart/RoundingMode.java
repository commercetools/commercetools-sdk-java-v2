package com.commercetools.api.models.cart;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Determines how monetary values are rounded.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public interface RoundingMode extends JsonEnum {

    /**
    	<p><a href="https://en.wikipedia.org/wiki/Rounding#Round_half_to_even">Round half to even</a></p>
    	<p>Default mode for a new Cart.</p>
    	
    */
    RoundingMode HALF_EVEN = RoundingModeEnum.HALF_EVEN;
    /**
    	<p><a href="https://en.wikipedia.org/wiki/Rounding#Round_half_up">Round half up</a></p>
    	
    */
    RoundingMode HALF_UP = RoundingModeEnum.HALF_UP;
    /**
    	<p><a href="https://en.wikipedia.org/wiki/Rounding#Round_half_down">Round half down</a></p>
    	
    */
    RoundingMode HALF_DOWN = RoundingModeEnum.HALF_DOWN;
    
    /**
     * possible values of RoundingMode
     */
    enum RoundingModeEnum implements RoundingMode {
        /**
         * HalfEven
         */
        HALF_EVEN("HalfEven"),
        
        /**
         * HalfUp
         */
        HALF_UP("HalfUp"),
        
        /**
         * HalfDown
         */
        HALF_DOWN("HalfDown");
        private final String jsonName;

        private RoundingModeEnum(final String jsonName) {
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
     * factory method for a enum value of RoundingMode
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static RoundingMode findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new RoundingMode() {
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
    public static Optional<RoundingMode> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }
    
    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static RoundingMode[] values() {
        return RoundingModeEnum.values();
    }
    
}
