
package com.commercetools.api.models.product_selection;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Product Selections can have the following modes:</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ProductSelectionMode extends JsonEnum {

    /**
    	<p>For this mode of Product Selection, the Products are to be assigned individually by using the <a href="/projects/product-selections#add-product">Add Product</a> update action.</p>

    */
    ProductSelectionMode INDIVIDUAL = ProductSelectionModeEnum.INDIVIDUAL;
    /**
    	<p>Defines the Product Selection to contain Products that are excluded from the catalog.
    	For this mode of Product Selection, the Products are to be excluded individually by using the <a href="/projects/product-selections#exclude-product">Exclude Product</a> update action.</p>

    */
    ProductSelectionMode INDIVIDUAL_EXCLUSION = ProductSelectionModeEnum.INDIVIDUAL_EXCLUSION;

    /**
     * possible values of ProductSelectionMode
     */
    enum ProductSelectionModeEnum implements ProductSelectionMode {
        /**
         * Individual
         */
        INDIVIDUAL("Individual"),

        /**
         * IndividualExclusion
         */
        INDIVIDUAL_EXCLUSION("IndividualExclusion");
        private final String jsonName;

        private ProductSelectionModeEnum(final String jsonName) {
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
     * factory method for a enum value of ProductSelectionMode
     * if no enum has been found an anonymous instance will be created
     * @return enum instance
     */
    @JsonCreator
    public static ProductSelectionMode findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new ProductSelectionMode() {
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
     * @return optional of enum instance
     */
    public static Optional<ProductSelectionMode> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static ProductSelectionMode[] values() {
        return ProductSelectionModeEnum.values();
    }

}
