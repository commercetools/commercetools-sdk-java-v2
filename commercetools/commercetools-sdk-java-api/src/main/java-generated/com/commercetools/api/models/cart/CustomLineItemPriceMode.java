
package com.commercetools.api.models.cart;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Determines if Cart Discounts can be applied to a Custom Line Item in the Cart.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface CustomLineItemPriceMode {

    /**
    	<p>Allows application of <a href="/../api/projects/cartDiscounts">Cart Discounts</a> for the Custom Line Item.</p>
    	<p>This is the default mode for backwards compatibility.</p>

    */
    CustomLineItemPriceMode STANDARD = CustomLineItemPriceModeEnum.STANDARD;
    /**
    	<p>Deactivates application of Cart Discounts for the Custom Line Item despite a matching <a href="ctp:api:type:CartDiscountCustomLineItemsTarget">CartDiscountCustomLineItemsTarget</a>.</p>

    */
    CustomLineItemPriceMode EXTERNAL = CustomLineItemPriceModeEnum.EXTERNAL;

    enum CustomLineItemPriceModeEnum implements CustomLineItemPriceMode {
        STANDARD("Standard"),

        EXTERNAL("External");
        private final String jsonName;

        private CustomLineItemPriceModeEnum(final String jsonName) {
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
    public static CustomLineItemPriceMode findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new CustomLineItemPriceMode() {
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

    public static Optional<CustomLineItemPriceMode> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static CustomLineItemPriceMode[] values() {
        return CustomLineItemPriceModeEnum.values();
    }
}
