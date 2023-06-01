package com.commercetools.api.models.cart;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>The scope controls which part of the product information is published.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public interface ProductPublishScope extends JsonEnum {

    /**
    	<p>Publishes a Product that causes the <em>staged</em> projection of the Product to override the <em>current</em> projection. If the Product is published for the first time, the <em>current</em> projection is created. This is the default scope.</p>
    	
    */
    ProductPublishScope ALL = ProductPublishScopeEnum.ALL;
    /**
    	<p>Publishes the Prices of the Product (only if the Product is already published). All Product Variants' Prices in the <em>staged</em> projection are published into the <em>current</em> projection with the same <code>id</code>. Prices in a <em>staged</em> Product Variant that has no <em>current</em> projection are not published. Prices in a <em>current</em> Product Variant that has no <em>staged</em> projection are unchanged. The <code>hasStagedChanges</code> <a href="ctp:api:type:ProductCatalogData">flag</a> is updated according to whether the <em>staged</em> and <em>current</em> projections still differ after the prices are published.</p>
    	
    */
    ProductPublishScope PRICES = ProductPublishScopeEnum.PRICES;
    
    /**
     * possible values of ProductPublishScope
     */
    enum ProductPublishScopeEnum implements ProductPublishScope {
        /**
         * All
         */
        ALL("All"),
        
        /**
         * Prices
         */
        PRICES("Prices");
        private final String jsonName;

        private ProductPublishScopeEnum(final String jsonName) {
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
     * factory method for a enum value of ProductPublishScope
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static ProductPublishScope findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new ProductPublishScope() {
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
    public static Optional<ProductPublishScope> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }
    
    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static ProductPublishScope[] values() {
        return ProductPublishScopeEnum.values();
    }
    
}
