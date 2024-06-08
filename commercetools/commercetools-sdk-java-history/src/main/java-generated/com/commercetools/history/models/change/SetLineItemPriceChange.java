
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.LocalizedString;
import com.commercetools.history.models.common.Price;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the Set LineItem Price update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetLineItemPriceChange setLineItemPriceChange = SetLineItemPriceChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetLineItemPriceChangeImpl.class)
public interface SetLineItemPriceChange extends Change {

    /**
     * discriminator value for SetLineItemPriceChange
     */
    String SET_LINE_ITEM_PRICE_CHANGE = "SetLineItemPriceChange";

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
    public Price getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Price getNextValue();

    /**
     *  <p>Name of the Product the updated Line Item is based on.</p>
     * @return lineItem
     */
    @NotNull
    @Valid
    @JsonProperty("lineItem")
    public LocalizedString getLineItem();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Price previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final Price nextValue);

    /**
     *  <p>Name of the Product the updated Line Item is based on.</p>
     * @param lineItem value to be set
     */

    public void setLineItem(final LocalizedString lineItem);

    /**
     * factory method
     * @return instance of SetLineItemPriceChange
     */
    public static SetLineItemPriceChange of() {
        return new SetLineItemPriceChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetLineItemPriceChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetLineItemPriceChange of(final SetLineItemPriceChange template) {
        SetLineItemPriceChangeImpl instance = new SetLineItemPriceChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setLineItem(template.getLineItem());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetLineItemPriceChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetLineItemPriceChange deepCopy(@Nullable final SetLineItemPriceChange template) {
        if (template == null) {
            return null;
        }
        SetLineItemPriceChangeImpl instance = new SetLineItemPriceChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(com.commercetools.history.models.common.Price.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.Price.deepCopy(template.getNextValue()));
        instance.setLineItem(com.commercetools.history.models.common.LocalizedString.deepCopy(template.getLineItem()));
        return instance;
    }

    /**
     * builder factory method for SetLineItemPriceChange
     * @return builder
     */
    public static SetLineItemPriceChangeBuilder builder() {
        return SetLineItemPriceChangeBuilder.of();
    }

    /**
     * create builder for SetLineItemPriceChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetLineItemPriceChangeBuilder builder(final SetLineItemPriceChange template) {
        return SetLineItemPriceChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetLineItemPriceChange(Function<SetLineItemPriceChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetLineItemPriceChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetLineItemPriceChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetLineItemPriceChange>";
            }
        };
    }
}
