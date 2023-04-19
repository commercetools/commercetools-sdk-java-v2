
package com.commercetools.api.models.cart;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMode
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ShippingMode extends JsonEnum {

    /**
    	<p>Cart can contain only a single Shipping Method.
    	This is the default mode for backwards compatibilty.</p>

    */
    ShippingMode SINGLE = ShippingModeEnum.SINGLE;
    /**
    	<p>Cart can contain multiple Shipping Methods.</p>

    */
    ShippingMode MULTIPLE = ShippingModeEnum.MULTIPLE;

    /**
     * possible values of ShippingMode
     */
    enum ShippingModeEnum implements ShippingMode {
        /**
         * Single
         */
        SINGLE("Single"),

        /**
         * Multiple
         */
        MULTIPLE("Multiple");
        private final String jsonName;

        private ShippingModeEnum(final String jsonName) {
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
     * factory method for a enum value of ShippingMode
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static ShippingMode findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new ShippingMode() {
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
     * @param value the json value to be wrapped
     * @return optional of enum instance
     */
    public static Optional<ShippingMode> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static ShippingMode[] values() {
        return ShippingModeEnum.values();
    }

}
