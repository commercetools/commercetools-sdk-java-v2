
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.DiscountedLineItemPrice;
import com.commercetools.history.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * SetLineItemDiscountedPriceChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetLineItemDiscountedPriceChange setLineItemDiscountedPriceChange = SetLineItemDiscountedPriceChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .variant("{variant}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetLineItemDiscountedPriceChangeImpl.class)
public interface SetLineItemDiscountedPriceChange extends Change {

    /**
     * discriminator value for SetLineItemDiscountedPriceChange
     */
    String SET_LINE_ITEM_DISCOUNTED_PRICE_CHANGE = "SetLineItemDiscountedPriceChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

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
     *  <p>Name of the Product the Line Item is based on.</p>
     * @return lineItem
     */
    @NotNull
    @Valid
    @JsonProperty("lineItem")
    public LocalizedString getLineItem();

    /**
     *  <p><code>sku</code> or <code>key</code> of the updated ProductVariant.</p>
     * @return variant
     */
    @NotNull
    @JsonProperty("variant")
    public String getVariant();

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
     *  <p>Name of the Product the Line Item is based on.</p>
     * @param lineItem value to be set
     */

    public void setLineItem(final LocalizedString lineItem);

    /**
     *  <p><code>sku</code> or <code>key</code> of the updated ProductVariant.</p>
     * @param variant value to be set
     */

    public void setVariant(final String variant);

    /**
     * factory method
     * @return instance of SetLineItemDiscountedPriceChange
     */
    public static SetLineItemDiscountedPriceChange of() {
        return new SetLineItemDiscountedPriceChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetLineItemDiscountedPriceChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetLineItemDiscountedPriceChange of(final SetLineItemDiscountedPriceChange template) {
        SetLineItemDiscountedPriceChangeImpl instance = new SetLineItemDiscountedPriceChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setLineItem(template.getLineItem());
        instance.setVariant(template.getVariant());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetLineItemDiscountedPriceChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetLineItemDiscountedPriceChange deepCopy(@Nullable final SetLineItemDiscountedPriceChange template) {
        if (template == null) {
            return null;
        }
        SetLineItemDiscountedPriceChangeImpl instance = new SetLineItemDiscountedPriceChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.DiscountedLineItemPrice.deepCopy(template.getPreviousValue()));
        instance.setNextValue(
            com.commercetools.history.models.common.DiscountedLineItemPrice.deepCopy(template.getNextValue()));
        instance.setLineItem(com.commercetools.history.models.common.LocalizedString.deepCopy(template.getLineItem()));
        instance.setVariant(template.getVariant());
        return instance;
    }

    /**
     * builder factory method for SetLineItemDiscountedPriceChange
     * @return builder
     */
    public static SetLineItemDiscountedPriceChangeBuilder builder() {
        return SetLineItemDiscountedPriceChangeBuilder.of();
    }

    /**
     * create builder for SetLineItemDiscountedPriceChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetLineItemDiscountedPriceChangeBuilder builder(final SetLineItemDiscountedPriceChange template) {
        return SetLineItemDiscountedPriceChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetLineItemDiscountedPriceChange(Function<SetLineItemDiscountedPriceChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetLineItemDiscountedPriceChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetLineItemDiscountedPriceChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetLineItemDiscountedPriceChange>";
            }
        };
    }
}
