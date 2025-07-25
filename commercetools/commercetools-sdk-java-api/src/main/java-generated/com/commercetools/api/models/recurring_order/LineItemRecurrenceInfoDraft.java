
package com.commercetools.api.models.recurring_order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Information about recurring orders and frequencies.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LineItemRecurrenceInfoDraft lineItemRecurrenceInfoDraft = LineItemRecurrenceInfoDraft.builder()
 *             .recurrencePolicy(recurrencePolicyBuilder -> recurrencePolicyBuilder)
 *             .priceSelectionMode(PriceSelectionMode.FIXED)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = LineItemRecurrenceInfoDraftImpl.class)
public interface LineItemRecurrenceInfoDraft extends io.vrap.rmf.base.client.Draft<LineItemRecurrenceInfoDraft> {

    /**
     *  <p>ResourceIdentifier to a RecurrencePolicy.</p>
     * @return recurrencePolicy
     */
    @NotNull
    @Valid
    @JsonProperty("recurrencePolicy")
    public RecurrencePolicyResourceIdentifier getRecurrencePolicy();

    /**
     *  <p>Determines how the price of a line item will be selected during order creation.</p>
     * @return priceSelectionMode
     */
    @NotNull
    @JsonProperty("priceSelectionMode")
    public PriceSelectionMode getPriceSelectionMode();

    /**
     *  <p>ResourceIdentifier to a RecurrencePolicy.</p>
     * @param recurrencePolicy value to be set
     */

    public void setRecurrencePolicy(final RecurrencePolicyResourceIdentifier recurrencePolicy);

    /**
     *  <p>Determines how the price of a line item will be selected during order creation.</p>
     * @param priceSelectionMode value to be set
     */

    public void setPriceSelectionMode(final PriceSelectionMode priceSelectionMode);

    /**
     * factory method
     * @return instance of LineItemRecurrenceInfoDraft
     */
    public static LineItemRecurrenceInfoDraft of() {
        return new LineItemRecurrenceInfoDraftImpl();
    }

    /**
     * factory method to create a shallow copy LineItemRecurrenceInfoDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static LineItemRecurrenceInfoDraft of(final LineItemRecurrenceInfoDraft template) {
        LineItemRecurrenceInfoDraftImpl instance = new LineItemRecurrenceInfoDraftImpl();
        instance.setRecurrencePolicy(template.getRecurrencePolicy());
        instance.setPriceSelectionMode(template.getPriceSelectionMode());
        return instance;
    }

    public LineItemRecurrenceInfoDraft copyDeep();

    /**
     * factory method to create a deep copy of LineItemRecurrenceInfoDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static LineItemRecurrenceInfoDraft deepCopy(@Nullable final LineItemRecurrenceInfoDraft template) {
        if (template == null) {
            return null;
        }
        LineItemRecurrenceInfoDraftImpl instance = new LineItemRecurrenceInfoDraftImpl();
        instance.setRecurrencePolicy(com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifier
                .deepCopy(template.getRecurrencePolicy()));
        instance.setPriceSelectionMode(template.getPriceSelectionMode());
        return instance;
    }

    /**
     * builder factory method for LineItemRecurrenceInfoDraft
     * @return builder
     */
    public static LineItemRecurrenceInfoDraftBuilder builder() {
        return LineItemRecurrenceInfoDraftBuilder.of();
    }

    /**
     * create builder for LineItemRecurrenceInfoDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static LineItemRecurrenceInfoDraftBuilder builder(final LineItemRecurrenceInfoDraft template) {
        return LineItemRecurrenceInfoDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withLineItemRecurrenceInfoDraft(Function<LineItemRecurrenceInfoDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<LineItemRecurrenceInfoDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<LineItemRecurrenceInfoDraft>() {
            @Override
            public String toString() {
                return "TypeReference<LineItemRecurrenceInfoDraft>";
            }
        };
    }
}
