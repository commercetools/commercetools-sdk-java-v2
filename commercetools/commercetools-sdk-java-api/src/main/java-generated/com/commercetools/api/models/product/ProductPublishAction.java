
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.cart.ProductPublishScope;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Copies the product data from the Product's staged representation to its current representation and sets the <code>published</code> flag on the resulting <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductCatalogData" rel="nofollow">ProductCatalogData</a> to <code>true</code>. This makes the current representation retrievable in <span>Product Projection</span> endpoints and indexes it for <span>Product Search</span>.</p>
 *  <p>Produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductPublishedMessage" rel="nofollow">ProductPublished</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductPublishAction productPublishAction = ProductPublishAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("publish")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductPublishActionImpl.class)
public interface ProductPublishAction extends ProductUpdateAction {

    /**
     * discriminator value for ProductPublishAction
     */
    String PUBLISH = "publish";

    /**
     *  <p><code>All</code> or <code>Prices</code></p>
     * @return scope
     */

    @JsonProperty("scope")
    public ProductPublishScope getScope();

    /**
     *  <p><code>All</code> or <code>Prices</code></p>
     * @param scope value to be set
     */

    public void setScope(final ProductPublishScope scope);

    /**
     * factory method
     * @return instance of ProductPublishAction
     */
    public static ProductPublishAction of() {
        return new ProductPublishActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductPublishAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductPublishAction of(final ProductPublishAction template) {
        ProductPublishActionImpl instance = new ProductPublishActionImpl();
        instance.setScope(template.getScope());
        return instance;
    }

    public ProductPublishAction copyDeep();

    /**
     * factory method to create a deep copy of ProductPublishAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductPublishAction deepCopy(@Nullable final ProductPublishAction template) {
        if (template == null) {
            return null;
        }
        ProductPublishActionImpl instance = new ProductPublishActionImpl();
        instance.setScope(template.getScope());
        return instance;
    }

    /**
     * builder factory method for ProductPublishAction
     * @return builder
     */
    public static ProductPublishActionBuilder builder() {
        return ProductPublishActionBuilder.of();
    }

    /**
     * create builder for ProductPublishAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductPublishActionBuilder builder(final ProductPublishAction template) {
        return ProductPublishActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductPublishAction(Function<ProductPublishAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductPublishAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductPublishAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductPublishAction>";
            }
        };
    }
}
