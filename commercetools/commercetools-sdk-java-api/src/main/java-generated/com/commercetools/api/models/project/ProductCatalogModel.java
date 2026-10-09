
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
    <p>Product Variants are embedded in the Product. This is the default model.</p> */
    ProductCatalogModel CLASSIC = ProductCatalogModelEnum.CLASSIC;
    /**
    <p>This temporary model supports migration from <code>Classic</code> to <code>Modular</code>. Product Variants remain embedded, and Product API Variant update actions remain supported. Other resources that resolve Variants default to standalone Variants, while Product Search defaults to embedded Variants. See the <span>migration guide</span> for details.</p> */
    ProductCatalogModel IN_MIGRATION = ProductCatalogModelEnum.IN_MIGRATION;
    /**
    <p>Product Variants are standalone resources managed through the <span>Variants API</span>. Pricing uses <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrices</a>. Embedded Prices and Product API Variant update actions are unsupported.</p>
    <ul>
     <li>Variant-related update actions on Products return a <code>400</code> error.</li>
     <li>Products must be created without <code>masterVariant</code> and <code>variants</code>.</li>
     <li>Products cannot be deleted while Variants reference them.</li>
     <li>Products cannot be unpublished while they have published Variants.</li>
     <li><span>Carts</span> read variant data from the Variant API instead of embedded Product Variants.</li>
     <li><code>priceMode</code> on Products is set to <code>Standalone</code>.</li>
    </ul> */
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
         * InMigration
         */
        IN_MIGRATION("InMigration"),

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
