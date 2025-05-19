
package com.commercetools.api.models.product_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Discounts the Product Price by a percentage, defined by the <code>permyriad</code> field.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountValueRelativeDraft productDiscountValueRelativeDraft = ProductDiscountValueRelativeDraft.builder()
 *             .permyriad(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("relative")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductDiscountValueRelativeDraftImpl.class)
public interface ProductDiscountValueRelativeDraft
        extends ProductDiscountValueDraft, io.vrap.rmf.base.client.Draft<ProductDiscountValueRelativeDraft> {

    /**
     * discriminator value for ProductDiscountValueRelativeDraft
     */
    String RELATIVE = "relative";

    /**
     *  <p>Fraction (per ten thousand) the price is reduced by. For example, <code>1000</code> will result in a 10% price reduction.</p>
     * @return permyriad
     */
    @NotNull
    @JsonProperty("permyriad")
    public Long getPermyriad();

    /**
     *  <p>Fraction (per ten thousand) the price is reduced by. For example, <code>1000</code> will result in a 10% price reduction.</p>
     * @param permyriad value to be set
     */

    public void setPermyriad(final Long permyriad);

    /**
     * factory method
     * @return instance of ProductDiscountValueRelativeDraft
     */
    public static ProductDiscountValueRelativeDraft of() {
        return new ProductDiscountValueRelativeDraftImpl();
    }

    /**
     * factory method to create a shallow copy ProductDiscountValueRelativeDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductDiscountValueRelativeDraft of(final ProductDiscountValueRelativeDraft template) {
        ProductDiscountValueRelativeDraftImpl instance = new ProductDiscountValueRelativeDraftImpl();
        instance.setPermyriad(template.getPermyriad());
        return instance;
    }

    public ProductDiscountValueRelativeDraft copyDeep();

    /**
     * factory method to create a deep copy of ProductDiscountValueRelativeDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductDiscountValueRelativeDraft deepCopy(
            @Nullable final ProductDiscountValueRelativeDraft template) {
        if (template == null) {
            return null;
        }
        ProductDiscountValueRelativeDraftImpl instance = new ProductDiscountValueRelativeDraftImpl();
        instance.setPermyriad(template.getPermyriad());
        return instance;
    }

    /**
     * builder factory method for ProductDiscountValueRelativeDraft
     * @return builder
     */
    public static ProductDiscountValueRelativeDraftBuilder builder() {
        return ProductDiscountValueRelativeDraftBuilder.of();
    }

    /**
     * create builder for ProductDiscountValueRelativeDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductDiscountValueRelativeDraftBuilder builder(final ProductDiscountValueRelativeDraft template) {
        return ProductDiscountValueRelativeDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductDiscountValueRelativeDraft(Function<ProductDiscountValueRelativeDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductDiscountValueRelativeDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductDiscountValueRelativeDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ProductDiscountValueRelativeDraft>";
            }
        };
    }
}
