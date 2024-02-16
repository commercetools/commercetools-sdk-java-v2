
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.common.TypedMoneyDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountedLineItemPortionDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountedLineItemPortionDraft discountedLineItemPortionDraft = DiscountedLineItemPortionDraft.builder()
 *             .discount(discountBuilder -> discountBuilder)
 *             .discountedAmount(discountedAmountBuilder -> discountedAmountBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountedLineItemPortionDraftImpl.class)
public interface DiscountedLineItemPortionDraft extends io.vrap.rmf.base.client.Draft<DiscountedLineItemPortionDraft> {

    /**
     *  <p>A CartDiscountReference or DirectDiscountReference for the discount applicable on the Line Item.</p>
     * @return discount
     */
    @NotNull
    @Valid
    @JsonProperty("discount")
    public Reference getDiscount();

    /**
     *  <p>Money value for the discount applicable.</p>
     * @return discountedAmount
     */
    @NotNull
    @Valid
    @JsonProperty("discountedAmount")
    public TypedMoneyDraft getDiscountedAmount();

    /**
     *  <p>A CartDiscountReference or DirectDiscountReference for the discount applicable on the Line Item.</p>
     * @param discount value to be set
     */

    public void setDiscount(final Reference discount);

    /**
     *  <p>Money value for the discount applicable.</p>
     * @param discountedAmount value to be set
     */

    public void setDiscountedAmount(final TypedMoneyDraft discountedAmount);

    /**
     * factory method
     * @return instance of DiscountedLineItemPortionDraft
     */
    public static DiscountedLineItemPortionDraft of() {
        return new DiscountedLineItemPortionDraftImpl();
    }

    /**
     * factory method to create a shallow copy DiscountedLineItemPortionDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountedLineItemPortionDraft of(final DiscountedLineItemPortionDraft template) {
        DiscountedLineItemPortionDraftImpl instance = new DiscountedLineItemPortionDraftImpl();
        instance.setDiscount(template.getDiscount());
        instance.setDiscountedAmount(template.getDiscountedAmount());
        return instance;
    }

    /**
     * factory method to create a deep copy of DiscountedLineItemPortionDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountedLineItemPortionDraft deepCopy(@Nullable final DiscountedLineItemPortionDraft template) {
        if (template == null) {
            return null;
        }
        DiscountedLineItemPortionDraftImpl instance = new DiscountedLineItemPortionDraftImpl();
        instance.setDiscount(com.commercetools.api.models.common.Reference.deepCopy(template.getDiscount()));
        instance.setDiscountedAmount(
            com.commercetools.api.models.common.TypedMoneyDraft.deepCopy(template.getDiscountedAmount()));
        return instance;
    }

    /**
     * builder factory method for DiscountedLineItemPortionDraft
     * @return builder
     */
    public static DiscountedLineItemPortionDraftBuilder builder() {
        return DiscountedLineItemPortionDraftBuilder.of();
    }

    /**
     * create builder for DiscountedLineItemPortionDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountedLineItemPortionDraftBuilder builder(final DiscountedLineItemPortionDraft template) {
        return DiscountedLineItemPortionDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountedLineItemPortionDraft(Function<DiscountedLineItemPortionDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountedLineItemPortionDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountedLineItemPortionDraft>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountedLineItemPortionDraft>";
            }
        };
    }
}
