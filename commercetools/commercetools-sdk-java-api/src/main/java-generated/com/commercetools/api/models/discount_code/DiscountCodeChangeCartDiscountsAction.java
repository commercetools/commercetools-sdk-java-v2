
package com.commercetools.api.models.discount_code;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * DiscountCodeChangeCartDiscountsAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeChangeCartDiscountsAction discountCodeChangeCartDiscountsAction = DiscountCodeChangeCartDiscountsAction.builder()
 *             .plusCartDiscounts(cartDiscountsBuilder -> cartDiscountsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountCodeChangeCartDiscountsActionImpl.class)
public interface DiscountCodeChangeCartDiscountsAction extends DiscountCodeUpdateAction {

    /**
     * discriminator value for DiscountCodeChangeCartDiscountsAction
     */
    String CHANGE_CART_DISCOUNTS = "changeCartDiscounts";

    /**
     *  <p>New value to set.</p>
     * @return cartDiscounts
     */
    @NotNull
    @Valid
    @JsonProperty("cartDiscounts")
    public List<CartDiscountResourceIdentifier> getCartDiscounts();

    /**
     *  <p>New value to set.</p>
     * @param cartDiscounts values to be set
     */

    @JsonIgnore
    public void setCartDiscounts(final CartDiscountResourceIdentifier... cartDiscounts);

    /**
     *  <p>New value to set.</p>
     * @param cartDiscounts values to be set
     */

    public void setCartDiscounts(final List<CartDiscountResourceIdentifier> cartDiscounts);

    /**
     * factory method
     * @return instance of DiscountCodeChangeCartDiscountsAction
     */
    public static DiscountCodeChangeCartDiscountsAction of() {
        return new DiscountCodeChangeCartDiscountsActionImpl();
    }

    /**
     * factory method to create a shallow copy DiscountCodeChangeCartDiscountsAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountCodeChangeCartDiscountsAction of(final DiscountCodeChangeCartDiscountsAction template) {
        DiscountCodeChangeCartDiscountsActionImpl instance = new DiscountCodeChangeCartDiscountsActionImpl();
        instance.setCartDiscounts(template.getCartDiscounts());
        return instance;
    }

    /**
     * factory method to create a deep copy of DiscountCodeChangeCartDiscountsAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountCodeChangeCartDiscountsAction deepCopy(
            @Nullable final DiscountCodeChangeCartDiscountsAction template) {
        if (template == null) {
            return null;
        }
        DiscountCodeChangeCartDiscountsActionImpl instance = new DiscountCodeChangeCartDiscountsActionImpl();
        instance.setCartDiscounts(Optional.ofNullable(template.getCartDiscounts())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifier::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for DiscountCodeChangeCartDiscountsAction
     * @return builder
     */
    public static DiscountCodeChangeCartDiscountsActionBuilder builder() {
        return DiscountCodeChangeCartDiscountsActionBuilder.of();
    }

    /**
     * create builder for DiscountCodeChangeCartDiscountsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountCodeChangeCartDiscountsActionBuilder builder(
            final DiscountCodeChangeCartDiscountsAction template) {
        return DiscountCodeChangeCartDiscountsActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountCodeChangeCartDiscountsAction(Function<DiscountCodeChangeCartDiscountsAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountCodeChangeCartDiscountsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountCodeChangeCartDiscountsAction>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountCodeChangeCartDiscountsAction>";
            }
        };
    }
}
