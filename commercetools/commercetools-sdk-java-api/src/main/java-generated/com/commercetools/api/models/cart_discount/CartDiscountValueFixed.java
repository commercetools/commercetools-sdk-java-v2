
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.TypedMoney;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Sets the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountedLineItemPrice" rel="nofollow">DiscountedLineItemPrice</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountLineItemsTarget" rel="nofollow">CartDiscountLineItemsTarget</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountCustomLineItemsTarget" rel="nofollow">CartDiscountCustomLineItemsTarget</a> to the value specified in the <code>money</code> field, if it is lower than the current Line Item price for the same currency. If the Line Item price is already discounted to a price equal to or lower than the respective price in the <code>money</code> field, this Discount is not applied. If the <code>quantity</code> of the Line Item eligible for the Discount is greater than <code>1</code>, the fixed price discount is only applied to the Line Item portion for which the <code>money</code> value is lesser than their current price.</p>
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
@io.vrap.rmf.base.client.utils.json.SubType("fixed")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountValueFixedImpl.class)
public interface CartDiscountValueFixed extends CartDiscountValue, CartDiscountValueFixedMixin {

    /**
     * discriminator value for CartDiscountValueFixed
     */
    String FIXED = "fixed";

    /**
     *  <p>Money values in <a href="https://docs.commercetools.com/apis/ctp:api:type:CentPrecisionMoney" rel="nofollow">cent precision</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:HighPrecisionMoney" rel="nofollow">high precision</a> of different currencies.</p>
     * @return money
     */
    @NotNull
    @Valid
    @JsonProperty("money")
    public List<TypedMoney> getMoney();

    /**
     *  <p>Indicates how the discount is applied on <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountLineItemsTarget" rel="nofollow">CartDiscountLineItemTarget</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountCustomLineItemsTarget" rel="nofollow">CartDiscountCustomLineItemTarget</a>.</p>
     *  <p>For <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountPatternTarget" rel="nofollow">CartDiscountPatternTarget</a>, the mode can also be <code>ProportionateDistribution</code> or <code>EvenDistribution</code>.</p>
     * @return applicationMode
     */

    @JsonProperty("applicationMode")
    public DiscountApplicationMode getApplicationMode();

    /**
     *  <p>Money values in <a href="https://docs.commercetools.com/apis/ctp:api:type:CentPrecisionMoney" rel="nofollow">cent precision</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:HighPrecisionMoney" rel="nofollow">high precision</a> of different currencies.</p>
     * @param money values to be set
     */

    @JsonIgnore
    public void setMoney(final TypedMoney... money);

    /**
     *  <p>Money values in <a href="https://docs.commercetools.com/apis/ctp:api:type:CentPrecisionMoney" rel="nofollow">cent precision</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:HighPrecisionMoney" rel="nofollow">high precision</a> of different currencies.</p>
     * @param money values to be set
     */

    public void setMoney(final List<TypedMoney> money);

    /**
     *  <p>Indicates how the discount is applied on <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountLineItemsTarget" rel="nofollow">CartDiscountLineItemTarget</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountCustomLineItemsTarget" rel="nofollow">CartDiscountCustomLineItemTarget</a>.</p>
     *  <p>For <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountPatternTarget" rel="nofollow">CartDiscountPatternTarget</a>, the mode can also be <code>ProportionateDistribution</code> or <code>EvenDistribution</code>.</p>
     * @param applicationMode value to be set
     */

    public void setApplicationMode(final DiscountApplicationMode applicationMode);

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
        instance.setApplicationMode(template.getApplicationMode());
        return instance;
    }

    public CartDiscountValueFixed copyDeep();

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
        instance.setApplicationMode(template.getApplicationMode());
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
