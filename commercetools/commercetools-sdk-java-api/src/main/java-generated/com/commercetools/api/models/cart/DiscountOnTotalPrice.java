
package com.commercetools.api.models.cart;

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
 * DiscountOnTotalPrice
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountOnTotalPrice discountOnTotalPrice = DiscountOnTotalPrice.builder()
 *             .discountedAmount(discountedAmountBuilder -> discountedAmountBuilder)
 *             .plusIncludedDiscounts(includedDiscountsBuilder -> includedDiscountsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountOnTotalPriceImpl.class)
public interface DiscountOnTotalPrice {

    /**
     *  <p>Money value of the discount on the total price of the Cart or Order.</p>
     * @return discountedAmount
     */
    @NotNull
    @Valid
    @JsonProperty("discountedAmount")
    public TypedMoney getDiscountedAmount();

    /**
     *  <p>Discounts that impact the total price of the Cart or Order.</p>
     * @return includedDiscounts
     */
    @NotNull
    @Valid
    @JsonProperty("includedDiscounts")
    public List<DiscountedTotalPricePortion> getIncludedDiscounts();

    /**
     *  <p>Money value of the discount on the total net price of the Cart or Order.</p>
     *  <p>The same percentage of discount applies as on the <code>discountedAmount</code>. Present only when <code>taxedPrice</code> of the Cart or Order exists.</p>
     * @return discountedNetAmount
     */
    @Valid
    @JsonProperty("discountedNetAmount")
    public TypedMoney getDiscountedNetAmount();

    /**
     *  <p>Money value of the discount on the total gross price of the Cart or Order.</p>
     *  <p>The same percentage of discount applies as on the <code>discountedAmount</code>. Present only when <code>taxedPrice</code> of the Cart or Order exists.</p>
     * @return discountedGrossAmount
     */
    @Valid
    @JsonProperty("discountedGrossAmount")
    public TypedMoney getDiscountedGrossAmount();

    /**
     *  <p>Money value of the discount on the total price of the Cart or Order.</p>
     * @param discountedAmount value to be set
     */

    public void setDiscountedAmount(final TypedMoney discountedAmount);

    /**
     *  <p>Discounts that impact the total price of the Cart or Order.</p>
     * @param includedDiscounts values to be set
     */

    @JsonIgnore
    public void setIncludedDiscounts(final DiscountedTotalPricePortion... includedDiscounts);

    /**
     *  <p>Discounts that impact the total price of the Cart or Order.</p>
     * @param includedDiscounts values to be set
     */

    public void setIncludedDiscounts(final List<DiscountedTotalPricePortion> includedDiscounts);

    /**
     *  <p>Money value of the discount on the total net price of the Cart or Order.</p>
     *  <p>The same percentage of discount applies as on the <code>discountedAmount</code>. Present only when <code>taxedPrice</code> of the Cart or Order exists.</p>
     * @param discountedNetAmount value to be set
     */

    public void setDiscountedNetAmount(final TypedMoney discountedNetAmount);

    /**
     *  <p>Money value of the discount on the total gross price of the Cart or Order.</p>
     *  <p>The same percentage of discount applies as on the <code>discountedAmount</code>. Present only when <code>taxedPrice</code> of the Cart or Order exists.</p>
     * @param discountedGrossAmount value to be set
     */

    public void setDiscountedGrossAmount(final TypedMoney discountedGrossAmount);

    /**
     * factory method
     * @return instance of DiscountOnTotalPrice
     */
    public static DiscountOnTotalPrice of() {
        return new DiscountOnTotalPriceImpl();
    }

    /**
     * factory method to create a shallow copy DiscountOnTotalPrice
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountOnTotalPrice of(final DiscountOnTotalPrice template) {
        DiscountOnTotalPriceImpl instance = new DiscountOnTotalPriceImpl();
        instance.setDiscountedAmount(template.getDiscountedAmount());
        instance.setIncludedDiscounts(template.getIncludedDiscounts());
        instance.setDiscountedNetAmount(template.getDiscountedNetAmount());
        instance.setDiscountedGrossAmount(template.getDiscountedGrossAmount());
        return instance;
    }

    public DiscountOnTotalPrice copyDeep();

    /**
     * factory method to create a deep copy of DiscountOnTotalPrice
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountOnTotalPrice deepCopy(@Nullable final DiscountOnTotalPrice template) {
        if (template == null) {
            return null;
        }
        DiscountOnTotalPriceImpl instance = new DiscountOnTotalPriceImpl();
        instance.setDiscountedAmount(
            com.commercetools.api.models.common.TypedMoney.deepCopy(template.getDiscountedAmount()));
        instance.setIncludedDiscounts(Optional.ofNullable(template.getIncludedDiscounts())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.cart.DiscountedTotalPricePortion::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setDiscountedNetAmount(
            com.commercetools.api.models.common.TypedMoney.deepCopy(template.getDiscountedNetAmount()));
        instance.setDiscountedGrossAmount(
            com.commercetools.api.models.common.TypedMoney.deepCopy(template.getDiscountedGrossAmount()));
        return instance;
    }

    /**
     * builder factory method for DiscountOnTotalPrice
     * @return builder
     */
    public static DiscountOnTotalPriceBuilder builder() {
        return DiscountOnTotalPriceBuilder.of();
    }

    /**
     * create builder for DiscountOnTotalPrice instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountOnTotalPriceBuilder builder(final DiscountOnTotalPrice template) {
        return DiscountOnTotalPriceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountOnTotalPrice(Function<DiscountOnTotalPrice, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountOnTotalPrice> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountOnTotalPrice>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountOnTotalPrice>";
            }
        };
    }
}
