
package com.commercetools.api.models.product_selection;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>The following type of Product Selections is supported:</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ProductSelectionTypeEnum {

    /**
    	<p>For this type of Product Selections the Products are to be assigned individually by using the <a href="/projects/product-selections#add-product">Add Product</a> update action.</p>

    */
    ProductSelectionTypeEnum INDIVIDUAL = ProductSelectionTypeEnumEnum.INDIVIDUAL;

    enum ProductSelectionTypeEnumEnum implements ProductSelectionTypeEnum {
        INDIVIDUAL("individual");
        private final String jsonName;

        private ProductSelectionTypeEnumEnum(final String jsonName) {
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
    public static ProductSelectionTypeEnum findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new ProductSelectionTypeEnum() {
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

    public static Optional<ProductSelectionTypeEnum> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static ProductSelectionTypeEnum[] values() {
        return ProductSelectionTypeEnumEnum.values();
    }
}
