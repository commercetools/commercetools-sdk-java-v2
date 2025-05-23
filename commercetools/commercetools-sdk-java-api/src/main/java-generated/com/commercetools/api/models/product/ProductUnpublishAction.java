
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
 *  <p>When a Product is unpublished, any associated Line Items already present in a Cart remain unaffected and can still be ordered. To prevent this, do the following:</p>
 *  <ul>
 *   <li>If the Product uses Embedded Prices, remove the Embedded Prices from the unpublished Product.</li>
 *   <li>If the Product uses Standalone Prices, inactivate or delete the Standalone Prices.</li>
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
