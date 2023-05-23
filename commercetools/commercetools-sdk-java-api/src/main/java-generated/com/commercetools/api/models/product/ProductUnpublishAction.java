
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Removes the current projection of the Product. The staged projection is unaffected. To retrieve unpublished Products, the <code>staged</code> parameter must be set to <code>false</code> when querying/searching Product Projections. Produces the ProductUnpublished Message.</p>
 *  <p>Unpublished Products cannot be added to a Cart. However, if a Cart contains Line Items for Products that were added before the Product was unpublished, the Cart is unaffected and can still be used to create an Order. To prevent this, in addition to unpublishing the Product you should remove the Prices from the Product using Remove Price for Embedded Prices or Delete StandalonePrice for Standalone Prices.</p>
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
