
package com.commercetools.api.models.project;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Determines how Product Variants are managed in the Project.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ProductCatalogModel extends JsonEnum {

    /**
    <p>Product Variants are embedded in the Product. This is the default behavior.</p> */
    ProductCatalogModel CLASSIC = ProductCatalogModelEnum.CLASSIC;
    /**
    <p>Product Variants are managed as standalone entities through the Variants endpoint. Variant-related update actions on Products are not available in this mode. Pricing is exclusively handled through <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrices</a>; <a href="https://docs.commercetools.com/apis/ctp:api:type:Price" rel="nofollow">Embedded Prices</a> are not supported.</p> */
    ProductCatalogModel MODULAR = ProductCatalogModelEnum.MODULAR;

    /**
     * possible values of ProductCatalogModel
     */
    enum ProductCatalogModelEnum implements ProductCatalogModel {
        /**
         * Classic
         */
        CLASSIC("Classic"),

        /**
         * Modular
         */
        MODULAR("Modular");
        private final String jsonName;

        private ProductCatalogModelEnum(final String jsonName) {
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
     * factory method for a enum value of ProductCatalogModel
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static ProductCatalogModel findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new ProductCatalogModel() {
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
    public static Optional<ProductCatalogModel> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static ProductCatalogModel[] values() {
        return ProductCatalogModelEnum.values();
    }

}
