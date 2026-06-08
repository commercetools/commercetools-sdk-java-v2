
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity;
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
 *     SetCustomLineItemDiscountedPricePerQuantityChange setCustomLineItemDiscountedPricePerQuantityChange = SetCustomLineItemDiscountedPricePerQuantityChange.builder()
 *             .change("{change}")
 *             .customLineItem(customLineItemBuilder -> customLineItemBuilder)
 *             .customLineItemId("{customLineItemId}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetCustomLineItemDiscountedPricePerQuantityChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetCustomLineItemDiscountedPricePerQuantityChangeImpl.class)
public interface SetCustomLineItemDiscountedPricePerQuantityChange extends Change {

    /**
     * discriminator value for SetCustomLineItemDiscountedPricePerQuantityChange
     */
    String SET_CUSTOM_LINE_ITEM_DISCOUNTED_PRICE_PER_QUANTITY_CHANGE = "SetCustomLineItemDiscountedPricePerQuantityChange";

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
    public DiscountedLineItemPriceForQuantity getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public DiscountedLineItemPriceForQuantity getNextValue();

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

    public void setPreviousValue(final DiscountedLineItemPriceForQuantity previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final DiscountedLineItemPriceForQuantity nextValue);

    /**
     * factory method
     * @return instance of SetCustomLineItemDiscountedPricePerQuantityChange
     */
    public static SetCustomLineItemDiscountedPricePerQuantityChange of() {
        return new SetCustomLineItemDiscountedPricePerQuantityChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetCustomLineItemDiscountedPricePerQuantityChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetCustomLineItemDiscountedPricePerQuantityChange of(
            final SetCustomLineItemDiscountedPricePerQuantityChange template) {
        SetCustomLineItemDiscountedPricePerQuantityChangeImpl instance = new SetCustomLineItemDiscountedPricePerQuantityChangeImpl();
        instance.setChange(template.getChange());
        instance.setCustomLineItem(template.getCustomLineItem());
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetCustomLineItemDiscountedPricePerQuantityChange copyDeep();

    /**
     * factory method to create a deep copy of SetCustomLineItemDiscountedPricePerQuantityChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetCustomLineItemDiscountedPricePerQuantityChange deepCopy(
            @Nullable final SetCustomLineItemDiscountedPricePerQuantityChange template) {
        if (template == null) {
            return null;
        }
        SetCustomLineItemDiscountedPricePerQuantityChangeImpl instance = new SetCustomLineItemDiscountedPricePerQuantityChangeImpl();
        instance.setChange(template.getChange());
        instance.setCustomLineItem(
            com.commercetools.history.models.common.LocalizedString.deepCopy(template.getCustomLineItem()));
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setPreviousValue(com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity
                .deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity
                .deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for SetCustomLineItemDiscountedPricePerQuantityChange
     * @return builder
     */
    public static SetCustomLineItemDiscountedPricePerQuantityChangeBuilder builder() {
        return SetCustomLineItemDiscountedPricePerQuantityChangeBuilder.of();
    }

    /**
     * create builder for SetCustomLineItemDiscountedPricePerQuantityChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetCustomLineItemDiscountedPricePerQuantityChangeBuilder builder(
            final SetCustomLineItemDiscountedPricePerQuantityChange template) {
        return SetCustomLineItemDiscountedPricePerQuantityChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetCustomLineItemDiscountedPricePerQuantityChange(
            Function<SetCustomLineItemDiscountedPricePerQuantityChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetCustomLineItemDiscountedPricePerQuantityChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetCustomLineItemDiscountedPricePerQuantityChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetCustomLineItemDiscountedPricePerQuantityChange>";
            }
        };
    }
}
