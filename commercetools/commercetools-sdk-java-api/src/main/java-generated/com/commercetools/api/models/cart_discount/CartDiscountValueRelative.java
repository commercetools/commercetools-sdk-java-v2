
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Discounts the CartDiscountTarget relative to its price.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountValueRelative cartDiscountValueRelative = CartDiscountValueRelative.builder()
 *             .permyriad(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountValueRelativeImpl.class)
public interface CartDiscountValueRelative extends CartDiscountValue {

    /**
     * discriminator value for CartDiscountValueRelative
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
     * @return instance of CartDiscountValueRelative
     */
    public static CartDiscountValueRelative of() {
        return new CartDiscountValueRelativeImpl();
    }

    /**
     * factory method to create a shallow copy CartDiscountValueRelative
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartDiscountValueRelative of(final CartDiscountValueRelative template) {
        CartDiscountValueRelativeImpl instance = new CartDiscountValueRelativeImpl();
        instance.setPermyriad(template.getPermyriad());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartDiscountValueRelative
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartDiscountValueRelative deepCopy(@Nullable final CartDiscountValueRelative template) {
        if (template == null) {
            return null;
        }
        CartDiscountValueRelativeImpl instance = new CartDiscountValueRelativeImpl();
        instance.setPermyriad(template.getPermyriad());
        return instance;
    }

    /**
     * builder factory method for CartDiscountValueRelative
     * @return builder
     */
    public static CartDiscountValueRelativeBuilder builder() {
        return CartDiscountValueRelativeBuilder.of();
    }

    /**
     * create builder for CartDiscountValueRelative instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountValueRelativeBuilder builder(final CartDiscountValueRelative template) {
        return CartDiscountValueRelativeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDiscountValueRelative(Function<CartDiscountValueRelative, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountValueRelative> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountValueRelative>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountValueRelative>";
            }
        };
    }
}
