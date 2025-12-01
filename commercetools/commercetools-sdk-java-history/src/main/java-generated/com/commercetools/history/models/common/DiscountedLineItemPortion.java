
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * DiscountedLineItemPortion
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountedLineItemPortion discountedLineItemPortion = DiscountedLineItemPortion.builder()
 *             .discount(discountBuilder -> discountBuilder)
 *             .discountedAmount(discountedAmountBuilder -> discountedAmountBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountedLineItemPortionImpl.class)
public interface DiscountedLineItemPortion {

    /**
     *  <p>A <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountReference" rel="nofollow">CartDiscountReference</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:DirectDiscountReference" rel="nofollow">DirectDiscountReference</a> of the applicable discount on the Line Item.</p>
     * @return discount
     */
    @NotNull
    @Valid
    @JsonProperty("discount")
    public Reference getDiscount();

    /**
     *  <p>Money value of the applicable discount.</p>
     * @return discountedAmount
     */
    @NotNull
    @Valid
    @JsonProperty("discountedAmount")
    public TypedMoney getDiscountedAmount();

    /**
     *  <p>A <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountReference" rel="nofollow">CartDiscountReference</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:DirectDiscountReference" rel="nofollow">DirectDiscountReference</a> of the applicable discount on the Line Item.</p>
     * @param discount value to be set
     */

    public void setDiscount(final Reference discount);

    /**
     *  <p>Money value of the applicable discount.</p>
     * @param discountedAmount value to be set
     */

    public void setDiscountedAmount(final TypedMoney discountedAmount);

    /**
     * factory method
     * @return instance of DiscountedLineItemPortion
     */
    public static DiscountedLineItemPortion of() {
        return new DiscountedLineItemPortionImpl();
    }

    /**
     * factory method to create a shallow copy DiscountedLineItemPortion
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountedLineItemPortion of(final DiscountedLineItemPortion template) {
        DiscountedLineItemPortionImpl instance = new DiscountedLineItemPortionImpl();
        instance.setDiscount(template.getDiscount());
        instance.setDiscountedAmount(template.getDiscountedAmount());
        return instance;
    }

    public DiscountedLineItemPortion copyDeep();

    /**
     * factory method to create a deep copy of DiscountedLineItemPortion
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountedLineItemPortion deepCopy(@Nullable final DiscountedLineItemPortion template) {
        if (template == null) {
            return null;
        }
        DiscountedLineItemPortionImpl instance = new DiscountedLineItemPortionImpl();
        instance.setDiscount(com.commercetools.history.models.common.Reference.deepCopy(template.getDiscount()));
        instance.setDiscountedAmount(
            com.commercetools.history.models.common.TypedMoney.deepCopy(template.getDiscountedAmount()));
        return instance;
    }

    /**
     * builder factory method for DiscountedLineItemPortion
     * @return builder
     */
    public static DiscountedLineItemPortionBuilder builder() {
        return DiscountedLineItemPortionBuilder.of();
    }

    /**
     * create builder for DiscountedLineItemPortion instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountedLineItemPortionBuilder builder(final DiscountedLineItemPortion template) {
        return DiscountedLineItemPortionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountedLineItemPortion(Function<DiscountedLineItemPortion, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountedLineItemPortion> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountedLineItemPortion>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountedLineItemPortion>";
            }
        };
    }
}
