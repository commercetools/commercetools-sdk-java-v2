
package com.commercetools.api.models.product_search;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchSortMode
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ProductSearchSortMode extends JsonEnum {

    ProductSearchSortMode MIN = ProductSearchSortModeEnum.MIN;

    ProductSearchSortMode MAX = ProductSearchSortModeEnum.MAX;

    ProductSearchSortMode AVG = ProductSearchSortModeEnum.AVG;

    ProductSearchSortMode SUM = ProductSearchSortModeEnum.SUM;

    /**
     * possible values of ProductSearchSortMode
     */
    enum ProductSearchSortModeEnum implements ProductSearchSortMode {
        /**
         * min
         */
        MIN("min"),

        /**
         * max
         */
        MAX("max"),

        /**
         * avg
         */
        AVG("avg"),

        /**
         * sum
         */
        SUM("sum");
        private final String jsonName;

        private ProductSearchSortModeEnum(final String jsonName) {
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
     * factory method for a enum value of ProductSearchSortMode
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static ProductSearchSortMode findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new ProductSearchSortMode() {
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
    public static Optional<ProductSearchSortMode> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static ProductSearchSortMode[] values() {
        return ProductSearchSortModeEnum.values();
    }

}
