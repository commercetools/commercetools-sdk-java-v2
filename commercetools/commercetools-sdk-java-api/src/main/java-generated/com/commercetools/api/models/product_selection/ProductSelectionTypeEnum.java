
package com.commercetools.api.models.product_selection;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>The following types of Product Selections are supported:</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ProductSelectionTypeEnum extends JsonEnum {

    /**
    	<p>For this type of Product Selection, the Products are to be assigned individually by using the <a href="/projects/product-selections#add-product">Add Product</a> update action.</p>

    */
    ProductSelectionTypeEnum INDIVIDUAL = ProductSelectionTypeEnumEnum.INDIVIDUAL;
    /**
    	<p>Defines the Product Selection to contain Products that are excluded from the catalog (<a href="/../offering/api-contract#public-beta">BETA</a>).
    	For this type of Product Selection, the Products are to be excluded individually by using the <a href="/projects/product-selections#exclude-product">Exclude Product</a> update action.</p>

    */
    ProductSelectionTypeEnum INDIVIDUAL_EXCLUSION = ProductSelectionTypeEnumEnum.INDIVIDUAL_EXCLUSION;

    /**
     * possible values of ProductSelectionTypeEnum
     */
    enum ProductSelectionTypeEnumEnum implements ProductSelectionTypeEnum {
        /**
         * individual
         */
        INDIVIDUAL("individual"),

        /**
         * individualExclusion
         */
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
     * factory method for a enum value of ProductSelectionTypeEnum
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
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

    /**
     * method to find enum using the JSON value
     * @param jsonName the json value to be wrapped
     * @return optional of enum instance
     */
    public static Optional<ProductSelectionTypeEnum> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static ProductSelectionTypeEnum[] values() {
        return ProductSelectionTypeEnumEnum.values();
    }

}
