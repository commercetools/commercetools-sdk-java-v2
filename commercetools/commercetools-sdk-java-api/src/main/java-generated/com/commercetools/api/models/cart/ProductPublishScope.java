
package com.commercetools.api.models.cart;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>The scope controls which part of the product information is published.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ProductPublishScope {

    /**
    	<p>Publishes a Product that causes the <em>staged</em> projection of the Product to override the <em>current</em> projection. If the Product is published for the first time, the <em>current</em> projection is created. This is the default scope.</p>

    */
    ProductPublishScope ALL = ProductPublishScopeEnum.ALL;
    /**
    	<p>Publishes the Prices of the Product (only if the Product is already published). All Product Variants' Prices in the <em>staged</em> projection are published into the <em>current</em> projection with the same <code>id</code>. Prices in a <em>staged</em> Product Variant that has no <em>current</em> projection are not published. Prices in a <em>current</em> Product Variant that has no <em>staged</em> projection are unchanged. The <code>hasStagedChanges</code> <a href="ctp:api:type:ProductCatalogData">flag</a> is updated according to whether the <em>staged</em> and <em>current</em> projections still differ after the prices are published.</p>

    */
    ProductPublishScope PRICES = ProductPublishScopeEnum.PRICES;

    enum ProductPublishScopeEnum implements ProductPublishScope {
        ALL("All"),

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

    @JsonValue
    String getJsonName();

    String name();

    String toString();

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

    public static Optional<ProductPublishScope> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static ProductPublishScope[] values() {
        return ProductPublishScopeEnum.values();
    }

}
