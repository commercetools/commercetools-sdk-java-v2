
package com.commercetools.api.models.cart;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ProductPublishScope {

    ProductPublishScope ALL = ProductPublishScopeEnum.ALL;

    ProductPublishScope PRICES = ProductPublishScopeEnum.PRICES;

    enum ProductPublishScopeEnum implements ProductPublishScope {
        ALL("All"),

        PRICES("Prices");
        private final String jsonName;

        private ProductPublishScopeEnum(final String jsonName) {
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
    public static ProductPublishScope findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new ProductPublishScope() {
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

    public static Optional<ProductPublishScope> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static ProductPublishScope[] values() {
        return ProductPublishScopeEnum.values();
    }
}
