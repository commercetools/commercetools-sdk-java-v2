
package com.commercetools.api.models.product_search;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchFacetEnumCount
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ProductSearchFacetEnumCount extends JsonEnum {

    /**
    	<p>The query should count Products.</p>

    */
    ProductSearchFacetEnumCount PRODUCTS = ProductSearchFacetEnumCountEnum.PRODUCTS;
    /**
    	<p>The query should count Product Variants.</p>

    */
    ProductSearchFacetEnumCount VARIANTS = ProductSearchFacetEnumCountEnum.VARIANTS;

    /**
     * possible values of ProductSearchFacetEnumCount
     */
    enum ProductSearchFacetEnumCountEnum implements ProductSearchFacetEnumCount {
        /**
         * products
         */
        PRODUCTS("products"),

        /**
         * variants
         */
        VARIANTS("variants");
        private final String jsonName;

        private ProductSearchFacetEnumCountEnum(final String jsonName) {
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
     * factory method for a enum value of ProductSearchFacetEnumCount
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static ProductSearchFacetEnumCount findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new ProductSearchFacetEnumCount() {
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
    public static Optional<ProductSearchFacetEnumCount> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static ProductSearchFacetEnumCount[] values() {
        return ProductSearchFacetEnumCountEnum.values();
    }

}
