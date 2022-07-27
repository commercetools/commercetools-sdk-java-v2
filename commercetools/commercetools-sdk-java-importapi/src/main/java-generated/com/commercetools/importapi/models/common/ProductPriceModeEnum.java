
package com.commercetools.importapi.models.common;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductPriceModeEnum
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ProductPriceModeEnum {

    ProductPriceModeEnum EMBEDDED = ProductPriceModeEnumEnum.EMBEDDED;

    ProductPriceModeEnum STANDALONE = ProductPriceModeEnumEnum.STANDALONE;

    enum ProductPriceModeEnumEnum implements ProductPriceModeEnum {
        EMBEDDED("Embedded"),

        STANDALONE("Standalone");
        private final String jsonName;

        private ProductPriceModeEnumEnum(final String jsonName) {
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
    public static ProductPriceModeEnum findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new ProductPriceModeEnum() {
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

    public static Optional<ProductPriceModeEnum> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static ProductPriceModeEnum[] values() {
        return ProductPriceModeEnumEnum.values();
    }
}
