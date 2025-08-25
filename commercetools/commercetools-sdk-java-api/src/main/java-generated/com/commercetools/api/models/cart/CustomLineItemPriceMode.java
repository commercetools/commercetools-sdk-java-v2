
package com.commercetools.api.models.cart;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Determines if Cart Discounts can be applied to a Custom Line Item in the Cart.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface CustomLineItemPriceMode extends JsonEnum {

    /**
    <p>Allows application of <span>Cart Discounts</span> for the Custom Line Item.</p>
    <p>This is the default mode for backwards compatibility.</p> */
    CustomLineItemPriceMode STANDARD = CustomLineItemPriceModeEnum.STANDARD;
    /**
    <p>Deactivates application of Cart Discounts for the Custom Line Item despite a matching <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountCustomLineItemsTarget" rel="nofollow">CartDiscountCustomLineItemsTarget</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:MultiBuyCustomLineItemsTarget" rel="nofollow">MultiBuyCustomLineItemsTarget</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountPatternTarget" rel="nofollow">CartDiscountPatternTarget</a>.</p> */
    CustomLineItemPriceMode EXTERNAL = CustomLineItemPriceModeEnum.EXTERNAL;

    /**
     * possible values of CustomLineItemPriceMode
     */
    enum CustomLineItemPriceModeEnum implements CustomLineItemPriceMode {
        /**
         * Standard
         */
        STANDARD("Standard"),

        /**
         * External
         */
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
     * factory method for a enum value of CustomLineItemPriceMode
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
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

    /**
     * method to find enum using the JSON value
     * @param jsonName the json value to be wrapped
     * @return optional of enum instance
     */
    public static Optional<CustomLineItemPriceMode> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static CustomLineItemPriceMode[] values() {
        return CustomLineItemPriceModeEnum.values();
    }

}
