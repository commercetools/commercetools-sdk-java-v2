
package com.commercetools.api.models.product_search;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchFacetCountLevelEnum
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ProductSearchFacetCountLevelEnum extends JsonEnum {

    /**
    <p>The query should count Products.</p> */
    ProductSearchFacetCountLevelEnum PRODUCTS = ProductSearchFacetCountLevelEnumEnum.PRODUCTS;
    /**
    <p>The query should count Product Variants.</p> */
    ProductSearchFacetCountLevelEnum VARIANTS = ProductSearchFacetCountLevelEnumEnum.VARIANTS;

    /**
     * possible values of ProductSearchFacetCountLevelEnum
     */
    enum ProductSearchFacetCountLevelEnumEnum implements ProductSearchFacetCountLevelEnum {
        /**
         * products
         */
        PRODUCTS("products"),

        /**
         * variants
         */
        VARIANTS("variants");
        private final String jsonName;

        private ProductSearchFacetCountLevelEnumEnum(final String jsonName) {
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
     * factory method for a enum value of ProductSearchFacetCountLevelEnum
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static ProductSearchFacetCountLevelEnum findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new ProductSearchFacetCountLevelEnum() {
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
    public static Optional<ProductSearchFacetCountLevelEnum> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static ProductSearchFacetCountLevelEnum[] values() {
        return ProductSearchFacetCountLevelEnumEnum.values();
    }

}
