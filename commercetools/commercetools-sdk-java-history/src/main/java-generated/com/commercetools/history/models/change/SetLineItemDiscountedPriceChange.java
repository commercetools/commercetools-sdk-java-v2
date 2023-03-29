
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.DiscountedLineItemPrice;
import com.commercetools.history.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetLineItemDiscountedPriceChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetLineItemDiscountedPriceChange setLineItemDiscountedPriceChange = SetLineItemDiscountedPriceChange.builder()
 *             .change("{change}")
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .variant("{variant}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
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
     *  <p>Update action for <code>setLineItemDiscountedPrice</code></p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return lineItem
     */
    @NotNull
    @Valid
    @JsonProperty("lineItem")
    public LocalizedString getLineItem();

    /**
     *
     * @return variant
     */
    @NotNull
    @JsonProperty("variant")
    public String getVariant();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public DiscountedLineItemPrice getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public DiscountedLineItemPrice getPreviousValue();

    /**
     *  <p>Update action for <code>setLineItemDiscountedPrice</code></p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set lineItem
     * @param lineItem value to be set
     */

    public void setLineItem(final LocalizedString lineItem);

    /**
     * set variant
     * @param variant value to be set
     */

    public void setVariant(final String variant);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final DiscountedLineItemPrice nextValue);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final DiscountedLineItemPrice previousValue);

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
        instance.setLineItem(template.getLineItem());
        instance.setVariant(template.getVariant());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
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
        instance.setLineItem(com.commercetools.history.models.common.LocalizedString.deepCopy(template.getLineItem()));
        instance.setVariant(template.getVariant());
        instance.setNextValue(
            com.commercetools.history.models.common.DiscountedLineItemPrice.deepCopy(template.getNextValue()));
        instance.setPreviousValue(
            com.commercetools.history.models.common.DiscountedLineItemPrice.deepCopy(template.getPreviousValue()));
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
