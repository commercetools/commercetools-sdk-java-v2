
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.LocalizedString;
import com.commercetools.history.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetCustomLineItemTotalPriceChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCustomLineItemTotalPriceChange setCustomLineItemTotalPriceChange = SetCustomLineItemTotalPriceChange.builder()
 *             .change("{change}")
 *             .customLineItem(customLineItemBuilder -> customLineItemBuilder)
 *             .customLineItemId("{customLineItemId}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetCustomLineItemTotalPriceChangeImpl.class)
public interface SetCustomLineItemTotalPriceChange extends Change {

    /**
     * discriminator value for SetCustomLineItemTotalPriceChange
     */
    String SET_CUSTOM_LINE_ITEM_TOTAL_PRICE_CHANGE = "SetCustomLineItemTotalPriceChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for <code>setCustomLineItemTotalPrice</code></p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return customLineItem
     */
    @NotNull
    @Valid
    @JsonProperty("customLineItem")
    public LocalizedString getCustomLineItem();

    /**
     *
     * @return customLineItemId
     */
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Money getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Money getPreviousValue();

    /**
     *  <p>Update action for <code>setCustomLineItemTotalPrice</code></p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set customLineItem
     * @param customLineItem value to be set
     */

    public void setCustomLineItem(final LocalizedString customLineItem);

    /**
     * set customLineItemId
     * @param customLineItemId value to be set
     */

    public void setCustomLineItemId(final String customLineItemId);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final Money nextValue);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Money previousValue);

    /**
     * factory method
     * @return instance of SetCustomLineItemTotalPriceChange
     */
    public static SetCustomLineItemTotalPriceChange of() {
        return new SetCustomLineItemTotalPriceChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetCustomLineItemTotalPriceChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetCustomLineItemTotalPriceChange of(final SetCustomLineItemTotalPriceChange template) {
        SetCustomLineItemTotalPriceChangeImpl instance = new SetCustomLineItemTotalPriceChangeImpl();
        instance.setChange(template.getChange());
        instance.setCustomLineItem(template.getCustomLineItem());
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetCustomLineItemTotalPriceChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetCustomLineItemTotalPriceChange deepCopy(
            @Nullable final SetCustomLineItemTotalPriceChange template) {
        if (template == null) {
            return null;
        }
        SetCustomLineItemTotalPriceChangeImpl instance = new SetCustomLineItemTotalPriceChangeImpl();
        instance.setChange(template.getChange());
        instance.setCustomLineItem(
            com.commercetools.history.models.common.LocalizedString.deepCopy(template.getCustomLineItem()));
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setNextValue(com.commercetools.history.models.common.Money.deepCopy(template.getNextValue()));
        instance.setPreviousValue(com.commercetools.history.models.common.Money.deepCopy(template.getPreviousValue()));
        return instance;
    }

    /**
     * builder factory method for SetCustomLineItemTotalPriceChange
     * @return builder
     */
    public static SetCustomLineItemTotalPriceChangeBuilder builder() {
        return SetCustomLineItemTotalPriceChangeBuilder.of();
    }

    /**
     * create builder for SetCustomLineItemTotalPriceChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetCustomLineItemTotalPriceChangeBuilder builder(final SetCustomLineItemTotalPriceChange template) {
        return SetCustomLineItemTotalPriceChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetCustomLineItemTotalPriceChange(Function<SetCustomLineItemTotalPriceChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetCustomLineItemTotalPriceChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetCustomLineItemTotalPriceChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetCustomLineItemTotalPriceChange>";
            }
        };
    }
}
