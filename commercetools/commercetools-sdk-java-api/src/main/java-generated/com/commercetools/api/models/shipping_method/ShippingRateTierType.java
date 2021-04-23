
package com.commercetools.api.models.shipping_method;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ShippingRateTierType {

    ShippingRateTierType CART_VALUE = ShippingRateTierTypeEnum.CART_VALUE;

    ShippingRateTierType CART_CLASSIFICATION = ShippingRateTierTypeEnum.CART_CLASSIFICATION;

    ShippingRateTierType CART_SCORE = ShippingRateTierTypeEnum.CART_SCORE;

    enum ShippingRateTierTypeEnum implements ShippingRateTierType {
        CART_VALUE("CartValue"),

        CART_CLASSIFICATION("CartClassification"),

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

    @JsonValue
    String getJsonName();

    String name();

    String toString();

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

    public static Optional<ShippingRateTierType> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static ShippingRateTierType[] values() {
        return ShippingRateTierTypeEnum.values();
    }
}
