
package com.commercetools.api.models.product_tailoring;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Unpublishes the <code>current</code> data of the ProductTailoring. Sets the <code>published</code> field to <code>false</code>. Generates the ProductTailoringUnpublished Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringUnpublishAction productTailoringUnpublishAction = ProductTailoringUnpublishAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTailoringUnpublishActionImpl.class)
public interface ProductTailoringUnpublishAction extends ProductTailoringUpdateAction {

    /**
     * discriminator value for ProductTailoringUnpublishAction
     */
    String UNPUBLISH = "unpublish";

    /**
     * factory method
     * @return instance of ProductTailoringUnpublishAction
     */
    public static ProductTailoringUnpublishAction of() {
        return new ProductTailoringUnpublishActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductTailoringUnpublishAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTailoringUnpublishAction of(final ProductTailoringUnpublishAction template) {
        ProductTailoringUnpublishActionImpl instance = new ProductTailoringUnpublishActionImpl();
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductTailoringUnpublishAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTailoringUnpublishAction deepCopy(@Nullable final ProductTailoringUnpublishAction template) {
        if (template == null) {
            return null;
        }
        ProductTailoringUnpublishActionImpl instance = new ProductTailoringUnpublishActionImpl();
        return instance;
    }

    /**
     * builder factory method for ProductTailoringUnpublishAction
     * @return builder
     */
    public static ProductTailoringUnpublishActionBuilder builder() {
        return ProductTailoringUnpublishActionBuilder.of();
    }

    /**
     * create builder for ProductTailoringUnpublishAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringUnpublishActionBuilder builder(final ProductTailoringUnpublishAction template) {
        return ProductTailoringUnpublishActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTailoringUnpublishAction(Function<ProductTailoringUnpublishAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTailoringUnpublishAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTailoringUnpublishAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTailoringUnpublishAction>";
            }
        };
    }
}
