
package com.commercetools.api.models.product_selection;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>The following types of Product Selections are supported:</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ProductSelectionTypeEnum {

    /**
    	<p>For this type of Product Selection, the Products are to be assigned individually by using the <a href="/projects/product-selections#add-product">Add Product</a> update action.</p>

    */
    ProductSelectionTypeEnum INDIVIDUAL = ProductSelectionTypeEnumEnum.INDIVIDUAL;
    /**
    	<p>Defines the Product Selection to contain Products that are excluded from the catalog.
    	For this type of Product Selection, the Products are to be excluded individually by using the <a href="/projects/product-selections#exclude-product">Exclude Product</a> update action.</p>

    */
    ProductSelectionTypeEnum INDIVIDUAL_EXCLUSION = ProductSelectionTypeEnumEnum.INDIVIDUAL_EXCLUSION;

    enum ProductSelectionTypeEnumEnum implements ProductSelectionTypeEnum {
        INDIVIDUAL("individual"),

        INDIVIDUAL_EXCLUSION("individualExclusion");
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
