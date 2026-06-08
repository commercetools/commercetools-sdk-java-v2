
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Sets the <code>published</code> flag on the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductCatalogData" rel="nofollow">ProductCatalogData</a> to <code>false</code>. This makes the <span>current</span> representation of a Product unavailable in <span>Product Projection</span> endpoints by default, and excludes it from <span>Product Search</span>. To retrieve unpublished Products on Product Projection endpoints, set parameter <code>staged=true</code>.</p>
 *  <p>Produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductUnpublishedMessage" rel="nofollow">ProductUnpublished</a> Message.</p>
 *  <p>When a Product is unpublished, any associated Line Items already present in a Cart remain unaffected and can still be ordered. To prevent this, do the following:</p>
 *  <ul>
 *   <li>If the Product uses Embedded Prices, <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductRemovePriceAction" rel="nofollow">remove the Embedded Prices</a> from the unpublished Product.</li>
 *   <li>If the Product uses Standalone Prices, <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceChangeActiveAction" rel="nofollow">inactivate</a> or <span>delete</span> the Standalone Prices.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductUnpublishAction productUnpublishAction = ProductUnpublishAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("unpublish")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductUnpublishActionImpl.class)
public interface ProductUnpublishAction extends ProductUpdateAction {

    /**
     * discriminator value for ProductUnpublishAction
     */
    String UNPUBLISH = "unpublish";

    /**
     * factory method
     * @return instance of ProductUnpublishAction
     */
    public static ProductUnpublishAction of() {
        return new ProductUnpublishActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductUnpublishAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductUnpublishAction of(final ProductUnpublishAction template) {
        ProductUnpublishActionImpl instance = new ProductUnpublishActionImpl();
        return instance;
    }

    public ProductUnpublishAction copyDeep();

    /**
     * factory method to create a deep copy of ProductUnpublishAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductUnpublishAction deepCopy(@Nullable final ProductUnpublishAction template) {
        if (template == null) {
            return null;
        }
        ProductUnpublishActionImpl instance = new ProductUnpublishActionImpl();
        return instance;
    }

    /**
     * builder factory method for ProductUnpublishAction
     * @return builder
     */
    public static ProductUnpublishActionBuilder builder() {
        return ProductUnpublishActionBuilder.of();
    }

    /**
     * create builder for ProductUnpublishAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductUnpublishActionBuilder builder(final ProductUnpublishAction template) {
        return ProductUnpublishActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductUnpublishAction(Function<ProductUnpublishAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductUnpublishAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductUnpublishAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductUnpublishAction>";
            }
        };
    }
}
