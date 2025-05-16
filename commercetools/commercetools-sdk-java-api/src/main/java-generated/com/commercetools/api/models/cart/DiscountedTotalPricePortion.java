
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.common.TypedMoney;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * DiscountedTotalPricePortion
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountedTotalPricePortion discountedTotalPricePortion = DiscountedTotalPricePortion.builder()
 *             .discount(discountBuilder -> discountBuilder)
 *             .discountedAmount(discountedAmountBuilder -> discountedAmountBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountedTotalPricePortionImpl.class)
public interface DiscountedTotalPricePortion {

    /**
     *  <p>A CartDiscountReference or DirectDiscountReference to the discount applied on the Cart <code>totalPrice</code>.</p>
     * @return discount
     */
    @NotNull
    @Valid
    @JsonProperty("discount")
    public Reference getDiscount();

    /**
     *  <p>Money value of the discount.</p>
     * @return discountedAmount
     */
    @NotNull
    @Valid
    @JsonProperty("discountedAmount")
    public TypedMoney getDiscountedAmount();

    /**
     *  <p>A CartDiscountReference or DirectDiscountReference to the discount applied on the Cart <code>totalPrice</code>.</p>
     * @param discount value to be set
     */

    public void setDiscount(final Reference discount);

    /**
     *  <p>Money value of the discount.</p>
     * @param discountedAmount value to be set
     */

    public void setDiscountedAmount(final TypedMoney discountedAmount);

    /**
     * factory method
     * @return instance of DiscountedTotalPricePortion
     */
    public static DiscountedTotalPricePortion of() {
        return new DiscountedTotalPricePortionImpl();
    }

    /**
     * factory method to create a shallow copy DiscountedTotalPricePortion
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountedTotalPricePortion of(final DiscountedTotalPricePortion template) {
        DiscountedTotalPricePortionImpl instance = new DiscountedTotalPricePortionImpl();
        instance.setDiscount(template.getDiscount());
        instance.setDiscountedAmount(template.getDiscountedAmount());
        return instance;
    }

    public DiscountedTotalPricePortion copyDeep();

    /**
     * factory method to create a deep copy of DiscountedTotalPricePortion
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountedTotalPricePortion deepCopy(@Nullable final DiscountedTotalPricePortion template) {
        if (template == null) {
            return null;
        }
        DiscountedTotalPricePortionImpl instance = new DiscountedTotalPricePortionImpl();
        instance.setDiscount(com.commercetools.api.models.common.Reference.deepCopy(template.getDiscount()));
        instance.setDiscountedAmount(
            com.commercetools.api.models.common.TypedMoney.deepCopy(template.getDiscountedAmount()));
        return instance;
    }

    /**
     * builder factory method for DiscountedTotalPricePortion
     * @return builder
     */
    public static DiscountedTotalPricePortionBuilder builder() {
        return DiscountedTotalPricePortionBuilder.of();
    }

    /**
     * create builder for DiscountedTotalPricePortion instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountedTotalPricePortionBuilder builder(final DiscountedTotalPricePortion template) {
        return DiscountedTotalPricePortionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountedTotalPricePortion(Function<DiscountedTotalPricePortion, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountedTotalPricePortion> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountedTotalPricePortion>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountedTotalPricePortion>";
            }
        };
    }
}
