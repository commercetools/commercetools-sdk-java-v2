
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.TypedMoney;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Sets the DiscountedLineItemPrice of the CartDiscountLineItemsTarget or CartDiscountCustomLineItemsTarget to the value specified in the <code>money</code> field, if it is lower than the current Line Item price for the same currency. If the Line Item price is already discounted to a price equal to or lower than the respective price in the <code>money</code> field, this Discount is not applied. If the <code>quantity</code> of the Line Item eligible for the Discount is greater than <code>1</code>, the fixed price discount is only applied to the Line Item portion for which the <code>money</code> value is lesser than their current price.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountValueFixed cartDiscountValueFixed = CartDiscountValueFixed.builder()
 *             .plusMoney(moneyBuilder -> moneyBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountValueFixedImpl.class)
public interface CartDiscountValueFixed extends CartDiscountValue, CartDiscountValueFixedMixin {

    /**
     * discriminator value for CartDiscountValueFixed
     */
    String FIXED = "fixed";

    /**
     *  <p>Money values in cent precision or high precision of different currencies.</p>
     * @return money
     */
    @NotNull
    @Valid
    @JsonProperty("money")
    public List<TypedMoney> getMoney();

    /**
     *  <p>Money values in cent precision or high precision of different currencies.</p>
     * @param money values to be set
     */

    @JsonIgnore
    public void setMoney(final TypedMoney... money);

    /**
     *  <p>Money values in cent precision or high precision of different currencies.</p>
     * @param money values to be set
     */

    public void setMoney(final List<TypedMoney> money);

    /**
     * factory method
     * @return instance of CartDiscountValueFixed
     */
    public static CartDiscountValueFixed of() {
        return new CartDiscountValueFixedImpl();
    }

    /**
     * factory method to create a shallow copy CartDiscountValueFixed
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartDiscountValueFixed of(final CartDiscountValueFixed template) {
        CartDiscountValueFixedImpl instance = new CartDiscountValueFixedImpl();
        instance.setMoney(template.getMoney());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartDiscountValueFixed
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartDiscountValueFixed deepCopy(@Nullable final CartDiscountValueFixed template) {
        if (template == null) {
            return null;
        }
        CartDiscountValueFixedImpl instance = new CartDiscountValueFixedImpl();
        instance.setMoney(Optional.ofNullable(template.getMoney())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.TypedMoney::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for CartDiscountValueFixed
     * @return builder
     */
    public static CartDiscountValueFixedBuilder builder() {
        return CartDiscountValueFixedBuilder.of();
    }

    /**
     * create builder for CartDiscountValueFixed instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountValueFixedBuilder builder(final CartDiscountValueFixed template) {
        return CartDiscountValueFixedBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDiscountValueFixed(Function<CartDiscountValueFixed, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountValueFixed> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountValueFixed>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountValueFixed>";
            }
        };
    }
}
