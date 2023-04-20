
package com.commercetools.api.models.product;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>This mode determines the type of Prices used for Product Price Selection and for LineItem Price selection.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ProductPriceModeEnum extends JsonEnum {

    /**
    	<p>Composable Commerce uses the <a href="ctp:api:type:Price">Embedded Prices</a> located inside the <code>prices</code> field in <a href="ctp:api:type:ProductVariant">ProductVariant</a>.</p>

    */
    ProductPriceModeEnum EMBEDDED = ProductPriceModeEnumEnum.EMBEDDED;
    /**
    	<p>Composable Commerce uses <a href="ctp:api:type:StandalonePrice">StandalonePrices</a>, which are associated with the <a href="ctp:api:type:ProductVariant">ProductVariant</a> through the <code>sku</code> field.</p>

    */
    ProductPriceModeEnum STANDALONE = ProductPriceModeEnumEnum.STANDALONE;

    /**
     * possible values of ProductPriceModeEnum
     */
    enum ProductPriceModeEnumEnum implements ProductPriceModeEnum {
        /**
         * Embedded
         */
        EMBEDDED("Embedded"),

        /**
         * Standalone
         */
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
     * factory method for a enum value of ProductPriceModeEnum
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
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

    /**
     * method to find enum using the JSON value
     * @param value the json value to be wrapped
     * @return optional of enum instance
     */
    public static Optional<ProductPriceModeEnum> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static ProductPriceModeEnum[] values() {
        return ProductPriceModeEnumEnum.values();
    }

}
