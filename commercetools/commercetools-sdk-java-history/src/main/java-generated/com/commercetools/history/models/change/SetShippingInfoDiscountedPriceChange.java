
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.DiscountedLineItemPrice;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered when a shipping price is modified due to a discount.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetShippingInfoDiscountedPriceChange setShippingInfoDiscountedPriceChange = SetShippingInfoDiscountedPriceChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetShippingInfoDiscountedPriceChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetShippingInfoDiscountedPriceChangeImpl.class)
public interface SetShippingInfoDiscountedPriceChange extends Change {

    /**
     * discriminator value for SetShippingInfoDiscountedPriceChange
     */
    String SET_SHIPPING_INFO_DISCOUNTED_PRICE_CHANGE = "SetShippingInfoDiscountedPriceChange";

    /**
     *
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public DiscountedLineItemPrice getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public DiscountedLineItemPrice getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final DiscountedLineItemPrice previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final DiscountedLineItemPrice nextValue);

    /**
     * factory method
     * @return instance of SetShippingInfoDiscountedPriceChange
     */
    public static SetShippingInfoDiscountedPriceChange of() {
        return new SetShippingInfoDiscountedPriceChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetShippingInfoDiscountedPriceChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetShippingInfoDiscountedPriceChange of(final SetShippingInfoDiscountedPriceChange template) {
        SetShippingInfoDiscountedPriceChangeImpl instance = new SetShippingInfoDiscountedPriceChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetShippingInfoDiscountedPriceChange copyDeep();

    /**
     * factory method to create a deep copy of SetShippingInfoDiscountedPriceChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetShippingInfoDiscountedPriceChange deepCopy(
            @Nullable final SetShippingInfoDiscountedPriceChange template) {
        if (template == null) {
            return null;
        }
        SetShippingInfoDiscountedPriceChangeImpl instance = new SetShippingInfoDiscountedPriceChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.DiscountedLineItemPrice.deepCopy(template.getPreviousValue()));
        instance.setNextValue(
            com.commercetools.history.models.common.DiscountedLineItemPrice.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for SetShippingInfoDiscountedPriceChange
     * @return builder
     */
    public static SetShippingInfoDiscountedPriceChangeBuilder builder() {
        return SetShippingInfoDiscountedPriceChangeBuilder.of();
    }

    /**
     * create builder for SetShippingInfoDiscountedPriceChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetShippingInfoDiscountedPriceChangeBuilder builder(
            final SetShippingInfoDiscountedPriceChange template) {
        return SetShippingInfoDiscountedPriceChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetShippingInfoDiscountedPriceChange(Function<SetShippingInfoDiscountedPriceChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetShippingInfoDiscountedPriceChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetShippingInfoDiscountedPriceChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetShippingInfoDiscountedPriceChange>";
            }
        };
    }
}
