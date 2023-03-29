
package com.commercetools.api.models.product_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Discounts the product price by a percentage, defined by the <code>permyriad</code> field.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountValueRelative productDiscountValueRelative = ProductDiscountValueRelative.builder()
 *             .permyriad(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductDiscountValueRelativeImpl.class)
public interface ProductDiscountValueRelative extends ProductDiscountValue {

    /**
     * discriminator value for ProductDiscountValueRelative
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
     * @return instance of ProductDiscountValueRelative
     */
    public static ProductDiscountValueRelative of() {
        return new ProductDiscountValueRelativeImpl();
    }

    /**
     * factory method to create a shallow copy ProductDiscountValueRelative
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductDiscountValueRelative of(final ProductDiscountValueRelative template) {
        ProductDiscountValueRelativeImpl instance = new ProductDiscountValueRelativeImpl();
        instance.setPermyriad(template.getPermyriad());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductDiscountValueRelative
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductDiscountValueRelative deepCopy(@Nullable final ProductDiscountValueRelative template) {
        if (template == null) {
            return null;
        }
        ProductDiscountValueRelativeImpl instance = new ProductDiscountValueRelativeImpl();
        instance.setPermyriad(template.getPermyriad());
        return instance;
    }

    /**
     * builder factory method for ProductDiscountValueRelative
     * @return builder
     */
    public static ProductDiscountValueRelativeBuilder builder() {
        return ProductDiscountValueRelativeBuilder.of();
    }

    /**
     * create builder for ProductDiscountValueRelative instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductDiscountValueRelativeBuilder builder(final ProductDiscountValueRelative template) {
        return ProductDiscountValueRelativeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductDiscountValueRelative(Function<ProductDiscountValueRelative, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductDiscountValueRelative> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductDiscountValueRelative>() {
            @Override
            public String toString() {
                return "TypeReference<ProductDiscountValueRelative>";
            }
        };
    }
}
