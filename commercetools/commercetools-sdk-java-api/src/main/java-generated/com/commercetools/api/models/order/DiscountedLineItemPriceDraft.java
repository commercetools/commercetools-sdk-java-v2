
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.DiscountedLineItemPortionDraft;
import com.commercetools.api.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountedLineItemPriceDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountedLineItemPriceDraft discountedLineItemPriceDraft = DiscountedLineItemPriceDraft.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .plusIncludedDiscounts(includedDiscountsBuilder -> includedDiscountsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountedLineItemPriceDraftImpl.class)
public interface DiscountedLineItemPriceDraft extends io.vrap.rmf.base.client.Draft<DiscountedLineItemPriceDraft> {

    /**
     *  <p>Discounted money value.</p>
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public Money getValue();

    /**
     *  <p>Discounts to be applied.</p>
     * @return includedDiscounts
     */
    @NotNull
    @Valid
    @JsonProperty("includedDiscounts")
    public List<DiscountedLineItemPortionDraft> getIncludedDiscounts();

    /**
     *  <p>Discounted money value.</p>
     * @param value value to be set
     */

    public void setValue(final Money value);

    /**
     *  <p>Discounts to be applied.</p>
     * @param includedDiscounts values to be set
     */

    @JsonIgnore
    public void setIncludedDiscounts(final DiscountedLineItemPortionDraft... includedDiscounts);

    /**
     *  <p>Discounts to be applied.</p>
     * @param includedDiscounts values to be set
     */

    public void setIncludedDiscounts(final List<DiscountedLineItemPortionDraft> includedDiscounts);

    /**
     * factory method
     * @return instance of DiscountedLineItemPriceDraft
     */
    public static DiscountedLineItemPriceDraft of() {
        return new DiscountedLineItemPriceDraftImpl();
    }

    /**
     * factory method to create a shallow copy DiscountedLineItemPriceDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountedLineItemPriceDraft of(final DiscountedLineItemPriceDraft template) {
        DiscountedLineItemPriceDraftImpl instance = new DiscountedLineItemPriceDraftImpl();
        instance.setValue(template.getValue());
        instance.setIncludedDiscounts(template.getIncludedDiscounts());
        return instance;
    }

    /**
     * factory method to create a deep copy of DiscountedLineItemPriceDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountedLineItemPriceDraft deepCopy(@Nullable final DiscountedLineItemPriceDraft template) {
        if (template == null) {
            return null;
        }
        DiscountedLineItemPriceDraftImpl instance = new DiscountedLineItemPriceDraftImpl();
        instance.setValue(com.commercetools.api.models.common.Money.deepCopy(template.getValue()));
        instance.setIncludedDiscounts(Optional.ofNullable(template.getIncludedDiscounts())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.cart.DiscountedLineItemPortionDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for DiscountedLineItemPriceDraft
     * @return builder
     */
    public static DiscountedLineItemPriceDraftBuilder builder() {
        return DiscountedLineItemPriceDraftBuilder.of();
    }

    /**
     * create builder for DiscountedLineItemPriceDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountedLineItemPriceDraftBuilder builder(final DiscountedLineItemPriceDraft template) {
        return DiscountedLineItemPriceDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountedLineItemPriceDraft(Function<DiscountedLineItemPriceDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountedLineItemPriceDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountedLineItemPriceDraft>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountedLineItemPriceDraft>";
            }
        };
    }
}
