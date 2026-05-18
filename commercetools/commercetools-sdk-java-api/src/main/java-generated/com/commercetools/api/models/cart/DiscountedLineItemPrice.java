
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
 * DiscountedLineItemPrice
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountedLineItemPrice discountedLineItemPrice = DiscountedLineItemPrice.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .plusIncludedDiscounts(includedDiscountsBuilder -> includedDiscountsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountedLineItemPriceImpl.class)
public interface DiscountedLineItemPrice {

    /**
     *  <p>Money value of the discounted Line Item or Custom Line Item.</p>
     *  <p>When multiple discounts from <code>includedDiscounts</code> apply, they are applied sequentially based on the <code>sortOrder</code> of their associated <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">Cart Discounts</a> (discounts with higher <code>sortOrder</code> values are applied first). The Cart's <code>priceRoundingMode</code> field (<a href="https://docs.commercetools.com/apis/ctp:api:type:RoundingMode" rel="nofollow">RoundingMode</a>) is applied after each discount calculation, so rounding occurs after each discount step rather than only once on the final cumulative amount.</p>
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public TypedMoney getValue();

    /**
     *  <p>Discount applicable on the Line Item or Custom Line Item.</p>
     * @return includedDiscounts
     */
    @NotNull
    @Valid
    @JsonProperty("includedDiscounts")
    public List<DiscountedLineItemPortion> getIncludedDiscounts();

    /**
     *  <p>Money value of the discounted Line Item or Custom Line Item.</p>
     *  <p>When multiple discounts from <code>includedDiscounts</code> apply, they are applied sequentially based on the <code>sortOrder</code> of their associated <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">Cart Discounts</a> (discounts with higher <code>sortOrder</code> values are applied first). The Cart's <code>priceRoundingMode</code> field (<a href="https://docs.commercetools.com/apis/ctp:api:type:RoundingMode" rel="nofollow">RoundingMode</a>) is applied after each discount calculation, so rounding occurs after each discount step rather than only once on the final cumulative amount.</p>
     * @param value value to be set
     */

    public void setValue(final TypedMoney value);

    /**
     *  <p>Discount applicable on the Line Item or Custom Line Item.</p>
     * @param includedDiscounts values to be set
     */

    @JsonIgnore
    public void setIncludedDiscounts(final DiscountedLineItemPortion... includedDiscounts);

    /**
     *  <p>Discount applicable on the Line Item or Custom Line Item.</p>
     * @param includedDiscounts values to be set
     */

    public void setIncludedDiscounts(final List<DiscountedLineItemPortion> includedDiscounts);

    /**
     * factory method
     * @return instance of DiscountedLineItemPrice
     */
    public static DiscountedLineItemPrice of() {
        return new DiscountedLineItemPriceImpl();
    }

    /**
     * factory method to create a shallow copy DiscountedLineItemPrice
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountedLineItemPrice of(final DiscountedLineItemPrice template) {
        DiscountedLineItemPriceImpl instance = new DiscountedLineItemPriceImpl();
        instance.setValue(template.getValue());
        instance.setIncludedDiscounts(template.getIncludedDiscounts());
        return instance;
    }

    public DiscountedLineItemPrice copyDeep();

    /**
     * factory method to create a deep copy of DiscountedLineItemPrice
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountedLineItemPrice deepCopy(@Nullable final DiscountedLineItemPrice template) {
        if (template == null) {
            return null;
        }
        DiscountedLineItemPriceImpl instance = new DiscountedLineItemPriceImpl();
        instance.setValue(com.commercetools.api.models.common.TypedMoney.deepCopy(template.getValue()));
        instance.setIncludedDiscounts(Optional.ofNullable(template.getIncludedDiscounts())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.cart.DiscountedLineItemPortion::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for DiscountedLineItemPrice
     * @return builder
     */
    public static DiscountedLineItemPriceBuilder builder() {
        return DiscountedLineItemPriceBuilder.of();
    }

    /**
     * create builder for DiscountedLineItemPrice instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountedLineItemPriceBuilder builder(final DiscountedLineItemPrice template) {
        return DiscountedLineItemPriceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountedLineItemPrice(Function<DiscountedLineItemPrice, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountedLineItemPrice> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountedLineItemPrice>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountedLineItemPrice>";
            }
        };
    }
}
