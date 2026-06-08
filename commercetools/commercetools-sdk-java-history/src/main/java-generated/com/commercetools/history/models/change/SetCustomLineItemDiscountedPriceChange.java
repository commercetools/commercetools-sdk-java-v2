
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
 *  <p>Change triggered after a recalculation of discount on a <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">Custom Line Item</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCustomLineItemDiscountedPriceChange setCustomLineItemDiscountedPriceChange = SetCustomLineItemDiscountedPriceChange.builder()
 *             .change("{change}")
 *             .customLineItem(customLineItemBuilder -> customLineItemBuilder)
 *             .customLineItemId("{customLineItemId}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetCustomLineItemDiscountedPriceChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetCustomLineItemDiscountedPriceChangeImpl.class)
public interface SetCustomLineItemDiscountedPriceChange extends Change {

    /**
     * discriminator value for SetCustomLineItemDiscountedPriceChange
     */
    String SET_CUSTOM_LINE_ITEM_DISCOUNTED_PRICE_CHANGE = "SetCustomLineItemDiscountedPriceChange";

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
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a>.</p>
     * @return customLineItem
     */
    @NotNull
    @Valid
    @JsonProperty("customLineItem")
    public LocalizedString getCustomLineItem();

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a>.</p>
     * @return customLineItemId
     */
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

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
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a>.</p>
     * @param customLineItem value to be set
     */

    public void setCustomLineItem(final LocalizedString customLineItem);

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a>.</p>
     * @param customLineItemId value to be set
     */

    public void setCustomLineItemId(final String customLineItemId);

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
     * @return instance of SetCustomLineItemDiscountedPriceChange
     */
    public static SetCustomLineItemDiscountedPriceChange of() {
        return new SetCustomLineItemDiscountedPriceChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetCustomLineItemDiscountedPriceChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetCustomLineItemDiscountedPriceChange of(final SetCustomLineItemDiscountedPriceChange template) {
        SetCustomLineItemDiscountedPriceChangeImpl instance = new SetCustomLineItemDiscountedPriceChangeImpl();
        instance.setChange(template.getChange());
        instance.setCustomLineItem(template.getCustomLineItem());
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetCustomLineItemDiscountedPriceChange copyDeep();

    /**
     * factory method to create a deep copy of SetCustomLineItemDiscountedPriceChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetCustomLineItemDiscountedPriceChange deepCopy(
            @Nullable final SetCustomLineItemDiscountedPriceChange template) {
        if (template == null) {
            return null;
        }
        SetCustomLineItemDiscountedPriceChangeImpl instance = new SetCustomLineItemDiscountedPriceChangeImpl();
        instance.setChange(template.getChange());
        instance.setCustomLineItem(
            com.commercetools.history.models.common.LocalizedString.deepCopy(template.getCustomLineItem()));
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setPreviousValue(
            com.commercetools.history.models.common.DiscountedLineItemPrice.deepCopy(template.getPreviousValue()));
        instance.setNextValue(
            com.commercetools.history.models.common.DiscountedLineItemPrice.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for SetCustomLineItemDiscountedPriceChange
     * @return builder
     */
    public static SetCustomLineItemDiscountedPriceChangeBuilder builder() {
        return SetCustomLineItemDiscountedPriceChangeBuilder.of();
    }

    /**
     * create builder for SetCustomLineItemDiscountedPriceChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetCustomLineItemDiscountedPriceChangeBuilder builder(
            final SetCustomLineItemDiscountedPriceChange template) {
        return SetCustomLineItemDiscountedPriceChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetCustomLineItemDiscountedPriceChange(
            Function<SetCustomLineItemDiscountedPriceChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetCustomLineItemDiscountedPriceChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetCustomLineItemDiscountedPriceChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetCustomLineItemDiscountedPriceChange>";
            }
        };
    }
}
