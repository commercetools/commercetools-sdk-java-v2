
package com.commercetools.api.models.product_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Discounts the Product Price by allowing the client to explicitly set a discounted value. Use this when setting discounts using an external service.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountValueExternalDraft productDiscountValueExternalDraft = ProductDiscountValueExternalDraft.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductDiscountValueExternalDraftImpl.class)
public interface ProductDiscountValueExternalDraft
        extends ProductDiscountValueDraft, io.vrap.rmf.base.client.Draft<ProductDiscountValueExternalDraft> {

    /**
     * discriminator value for ProductDiscountValueExternalDraft
     */
    String EXTERNAL = "external";

    /**
     * factory method
     * @return instance of ProductDiscountValueExternalDraft
     */
    public static ProductDiscountValueExternalDraft of() {
        return new ProductDiscountValueExternalDraftImpl();
    }

    /**
     * factory method to create a shallow copy ProductDiscountValueExternalDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductDiscountValueExternalDraft of(final ProductDiscountValueExternalDraft template) {
        ProductDiscountValueExternalDraftImpl instance = new ProductDiscountValueExternalDraftImpl();
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductDiscountValueExternalDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductDiscountValueExternalDraft deepCopy(
            @Nullable final ProductDiscountValueExternalDraft template) {
        if (template == null) {
            return null;
        }
        ProductDiscountValueExternalDraftImpl instance = new ProductDiscountValueExternalDraftImpl();
        return instance;
    }

    /**
     * builder factory method for ProductDiscountValueExternalDraft
     * @return builder
     */
    public static ProductDiscountValueExternalDraftBuilder builder() {
        return ProductDiscountValueExternalDraftBuilder.of();
    }

    /**
     * create builder for ProductDiscountValueExternalDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductDiscountValueExternalDraftBuilder builder(final ProductDiscountValueExternalDraft template) {
        return ProductDiscountValueExternalDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductDiscountValueExternalDraft(Function<ProductDiscountValueExternalDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductDiscountValueExternalDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductDiscountValueExternalDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ProductDiscountValueExternalDraft>";
            }
        };
    }
}
