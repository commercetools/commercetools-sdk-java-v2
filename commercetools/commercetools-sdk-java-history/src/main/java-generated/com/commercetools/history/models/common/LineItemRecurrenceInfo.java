
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
 *  <p>Information about recurring orders and frequencies.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LineItemRecurrenceInfo lineItemRecurrenceInfo = LineItemRecurrenceInfo.builder()
 *             .recurrencePolicy(recurrencePolicyBuilder -> recurrencePolicyBuilder)
 *             .priceSelectionMode(PriceSelectionMode.FIXED)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = LineItemRecurrenceInfoImpl.class)
public interface LineItemRecurrenceInfo {

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a RecurrencePolicy.</p>
     * @return recurrencePolicy
     */
    @NotNull
    @Valid
    @JsonProperty("recurrencePolicy")
    public RecurrencePolicyReference getRecurrencePolicy();

    /**
     *  <p>Indicates how the price of a line item will be selected during order creation.</p>
     * @return priceSelectionMode
     */
    @NotNull
    @JsonProperty("priceSelectionMode")
    public PriceSelectionMode getPriceSelectionMode();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a RecurrencePolicy.</p>
     * @param recurrencePolicy value to be set
     */

    public void setRecurrencePolicy(final RecurrencePolicyReference recurrencePolicy);

    /**
     *  <p>Indicates how the price of a line item will be selected during order creation.</p>
     * @param priceSelectionMode value to be set
     */

    public void setPriceSelectionMode(final PriceSelectionMode priceSelectionMode);

    /**
     * factory method
     * @return instance of LineItemRecurrenceInfo
     */
    public static LineItemRecurrenceInfo of() {
        return new LineItemRecurrenceInfoImpl();
    }

    /**
     * factory method to create a shallow copy LineItemRecurrenceInfo
     * @param template instance to be copied
     * @return copy instance
     */
    public static LineItemRecurrenceInfo of(final LineItemRecurrenceInfo template) {
        LineItemRecurrenceInfoImpl instance = new LineItemRecurrenceInfoImpl();
        instance.setRecurrencePolicy(template.getRecurrencePolicy());
        instance.setPriceSelectionMode(template.getPriceSelectionMode());
        return instance;
    }

    public LineItemRecurrenceInfo copyDeep();

    /**
     * factory method to create a deep copy of LineItemRecurrenceInfo
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static LineItemRecurrenceInfo deepCopy(@Nullable final LineItemRecurrenceInfo template) {
        if (template == null) {
            return null;
        }
        LineItemRecurrenceInfoImpl instance = new LineItemRecurrenceInfoImpl();
        instance.setRecurrencePolicy(
            com.commercetools.history.models.common.RecurrencePolicyReference.deepCopy(template.getRecurrencePolicy()));
        instance.setPriceSelectionMode(template.getPriceSelectionMode());
        return instance;
    }

    /**
     * builder factory method for LineItemRecurrenceInfo
     * @return builder
     */
    public static LineItemRecurrenceInfoBuilder builder() {
        return LineItemRecurrenceInfoBuilder.of();
    }

    /**
     * create builder for LineItemRecurrenceInfo instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static LineItemRecurrenceInfoBuilder builder(final LineItemRecurrenceInfo template) {
        return LineItemRecurrenceInfoBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withLineItemRecurrenceInfo(Function<LineItemRecurrenceInfo, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<LineItemRecurrenceInfo> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<LineItemRecurrenceInfo>() {
            @Override
            public String toString() {
                return "TypeReference<LineItemRecurrenceInfo>";
            }
        };
    }
}
