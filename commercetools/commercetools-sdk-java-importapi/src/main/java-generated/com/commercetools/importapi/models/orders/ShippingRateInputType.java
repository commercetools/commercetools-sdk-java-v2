
package com.commercetools.importapi.models.orders;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ShippingRateInputType {

    ShippingRateInputType CLASSIFICATION = ShippingRateInputTypeEnum.CLASSIFICATION;

    ShippingRateInputType SCORE = ShippingRateInputTypeEnum.SCORE;

    enum ShippingRateInputTypeEnum implements ShippingRateInputType {
        CLASSIFICATION("Classification"),

        SCORE("Score");
        private final String jsonName;

        private ShippingRateInputTypeEnum(final String jsonName) {
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
    public static ShippingRateInputType findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new ShippingRateInputType() {
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

    public static Optional<ShippingRateInputType> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static ShippingRateInputType[] values() {
        return ShippingRateInputTypeEnum.values();
    }
}
