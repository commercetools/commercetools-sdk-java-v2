
package com.commercetools.api.models.project;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Defines how Product Discounts and Cart Discounts are combined for every Line Item in a Cart.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface DiscountCombinationMode extends JsonEnum {

    /**
    <p>Either Product Discounts or Cart Discounts are chosen based on best deal for the customer. Only one type applies per Line Item in a Cart.</p> */
    DiscountCombinationMode BEST_DEAL = DiscountCombinationModeEnum.BEST_DEAL;
    /**
    <p>Product Discounts and Cart Discounts are both applied to the Line Item in a Cart, potentially increasing the total discount.</p> */
    DiscountCombinationMode STACKING = DiscountCombinationModeEnum.STACKING;

    /**
     * possible values of DiscountCombinationMode
     */
    enum DiscountCombinationModeEnum implements DiscountCombinationMode {
        /**
         * BestDeal
         */
        BEST_DEAL("BestDeal"),

        /**
         * Stacking
         */
        STACKING("Stacking");
        private final String jsonName;

        private DiscountCombinationModeEnum(final String jsonName) {
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
     * factory method for a enum value of DiscountCombinationMode
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static DiscountCombinationMode findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new DiscountCombinationMode() {
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
    public static Optional<DiscountCombinationMode> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static DiscountCombinationMode[] values() {
        return DiscountCombinationModeEnum.values();
    }

}
