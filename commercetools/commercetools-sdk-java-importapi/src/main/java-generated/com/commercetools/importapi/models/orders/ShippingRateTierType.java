
package com.commercetools.importapi.models.orders;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingRateTierType
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ShippingRateTierType extends JsonEnum {

    ShippingRateTierType CART_VALUE = ShippingRateTierTypeEnum.CART_VALUE;

    ShippingRateTierType CART_CLASSIFICATION = ShippingRateTierTypeEnum.CART_CLASSIFICATION;

    ShippingRateTierType CART_SCORE = ShippingRateTierTypeEnum.CART_SCORE;

    /**
     * possible values of ShippingRateTierType
     */
    enum ShippingRateTierTypeEnum implements ShippingRateTierType {
        /**
         * CartValue
         */
        CART_VALUE("CartValue"),

        /**
         * CartClassification
         */
        CART_CLASSIFICATION("CartClassification"),

        /**
         * CartScore
         */
        CART_SCORE("CartScore");
        private final String jsonName;

        private ShippingRateTierTypeEnum(final String jsonName) {
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
     * factory method for a enum value of ShippingRateTierType
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static ShippingRateTierType findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new ShippingRateTierType() {
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
    public static Optional<ShippingRateTierType> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static ShippingRateTierType[] values() {
        return ShippingRateTierTypeEnum.values();
    }

}
