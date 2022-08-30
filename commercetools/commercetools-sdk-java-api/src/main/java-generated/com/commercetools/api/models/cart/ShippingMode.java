
package com.commercetools.api.models.cart;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMode
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ShippingMode {

    /**
    	<p>Cart can contain only a single Shipping Method.
    	This is the default mode for backwards compatibilty.</p>

    */
    ShippingMode SINGLE = ShippingModeEnum.SINGLE;
    /**
    	<p>Cart can contain multiple Shipping Methods.</p>

    */
    ShippingMode MULTI = ShippingModeEnum.MULTI;

    enum ShippingModeEnum implements ShippingMode {
        SINGLE("Single"),

        MULTI("Multi");
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

    @JsonValue
    String getJsonName();

    String name();

    String toString();

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

    public static Optional<ShippingMode> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static ShippingMode[] values() {
        return ShippingModeEnum.values();
    }
}
