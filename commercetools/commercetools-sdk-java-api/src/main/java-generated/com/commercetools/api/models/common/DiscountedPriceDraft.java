
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.product_discount.ProductDiscountReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * DiscountedPriceDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountedPriceDraft discountedPriceDraft = DiscountedPriceDraft.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .discount(discountBuilder -> discountBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountedPriceDraftImpl.class)
public interface DiscountedPriceDraft extends io.vrap.rmf.base.client.Draft<DiscountedPriceDraft> {

    /**
     *  <p>Sets the money value for the discounted price.</p>
     *  <p>To set the money value in high precision, use HighPrecisionMoneyDraft.</p>
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public Money getValue();

    /**
     *  <p>Relates the referenced ProductDiscount to the discounted price.</p>
     * @return discount
     */
    @NotNull
    @Valid
    @JsonProperty("discount")
    public ProductDiscountReference getDiscount();

    /**
     *  <p>Sets the money value for the discounted price.</p>
     *  <p>To set the money value in high precision, use HighPrecisionMoneyDraft.</p>
     * @param value value to be set
     */

    public void setValue(final Money value);

    /**
     *  <p>Relates the referenced ProductDiscount to the discounted price.</p>
     * @param discount value to be set
     */

    public void setDiscount(final ProductDiscountReference discount);

    /**
     * factory method
     * @return instance of DiscountedPriceDraft
     */
    public static DiscountedPriceDraft of() {
        return new DiscountedPriceDraftImpl();
    }

    /**
     * factory method to create a shallow copy DiscountedPriceDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountedPriceDraft of(final DiscountedPriceDraft template) {
        DiscountedPriceDraftImpl instance = new DiscountedPriceDraftImpl();
        instance.setValue(template.getValue());
        instance.setDiscount(template.getDiscount());
        return instance;
    }

    /**
     * factory method to create a deep copy of DiscountedPriceDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountedPriceDraft deepCopy(@Nullable final DiscountedPriceDraft template) {
        if (template == null) {
            return null;
        }
        DiscountedPriceDraftImpl instance = new DiscountedPriceDraftImpl();
        instance.setValue(com.commercetools.api.models.common.Money.deepCopy(template.getValue()));
        instance.setDiscount(
            com.commercetools.api.models.product_discount.ProductDiscountReference.deepCopy(template.getDiscount()));
        return instance;
    }

    /**
     * builder factory method for DiscountedPriceDraft
     * @return builder
     */
    public static DiscountedPriceDraftBuilder builder() {
        return DiscountedPriceDraftBuilder.of();
    }

    /**
     * create builder for DiscountedPriceDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountedPriceDraftBuilder builder(final DiscountedPriceDraft template) {
        return DiscountedPriceDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountedPriceDraft(Function<DiscountedPriceDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountedPriceDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountedPriceDraft>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountedPriceDraft>";
            }
        };
    }
}
