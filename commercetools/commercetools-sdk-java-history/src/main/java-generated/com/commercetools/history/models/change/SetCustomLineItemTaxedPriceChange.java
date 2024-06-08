
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.LocalizedString;
import com.commercetools.history.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * SetCustomLineItemTaxedPriceChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCustomLineItemTaxedPriceChange setCustomLineItemTaxedPriceChange = SetCustomLineItemTaxedPriceChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .customLineItem(customLineItemBuilder -> customLineItemBuilder)
 *             .customLineItemId("{customLineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetCustomLineItemTaxedPriceChangeImpl.class)
public interface SetCustomLineItemTaxedPriceChange extends Change {

    /**
     * discriminator value for SetCustomLineItemTaxedPriceChange
     */
    String SET_CUSTOM_LINE_ITEM_TAXED_PRICE_CHANGE = "SetCustomLineItemTaxedPriceChange";

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
    public Money getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Money getNextValue();

    /**
     *  <p>Name of the updated CustomLineItem.</p>
     * @return customLineItem
     */
    @NotNull
    @Valid
    @JsonProperty("customLineItem")
    public LocalizedString getCustomLineItem();

    /**
     *  <p><code>id</code> of the updated CustomLineItem.</p>
     * @return customLineItemId
     */
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Money previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final Money nextValue);

    /**
     *  <p>Name of the updated CustomLineItem.</p>
     * @param customLineItem value to be set
     */

    public void setCustomLineItem(final LocalizedString customLineItem);

    /**
     *  <p><code>id</code> of the updated CustomLineItem.</p>
     * @param customLineItemId value to be set
     */

    public void setCustomLineItemId(final String customLineItemId);

    /**
     * factory method
     * @return instance of SetCustomLineItemTaxedPriceChange
     */
    public static SetCustomLineItemTaxedPriceChange of() {
        return new SetCustomLineItemTaxedPriceChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetCustomLineItemTaxedPriceChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetCustomLineItemTaxedPriceChange of(final SetCustomLineItemTaxedPriceChange template) {
        SetCustomLineItemTaxedPriceChangeImpl instance = new SetCustomLineItemTaxedPriceChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setCustomLineItem(template.getCustomLineItem());
        instance.setCustomLineItemId(template.getCustomLineItemId());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetCustomLineItemTaxedPriceChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetCustomLineItemTaxedPriceChange deepCopy(
            @Nullable final SetCustomLineItemTaxedPriceChange template) {
        if (template == null) {
            return null;
        }
        SetCustomLineItemTaxedPriceChangeImpl instance = new SetCustomLineItemTaxedPriceChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(com.commercetools.history.models.common.Money.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.Money.deepCopy(template.getNextValue()));
        instance.setCustomLineItem(
            com.commercetools.history.models.common.LocalizedString.deepCopy(template.getCustomLineItem()));
        instance.setCustomLineItemId(template.getCustomLineItemId());
        return instance;
    }

    /**
     * builder factory method for SetCustomLineItemTaxedPriceChange
     * @return builder
     */
    public static SetCustomLineItemTaxedPriceChangeBuilder builder() {
        return SetCustomLineItemTaxedPriceChangeBuilder.of();
    }

    /**
     * create builder for SetCustomLineItemTaxedPriceChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetCustomLineItemTaxedPriceChangeBuilder builder(final SetCustomLineItemTaxedPriceChange template) {
        return SetCustomLineItemTaxedPriceChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetCustomLineItemTaxedPriceChange(Function<SetCustomLineItemTaxedPriceChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetCustomLineItemTaxedPriceChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetCustomLineItemTaxedPriceChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetCustomLineItemTaxedPriceChange>";
            }
        };
    }
}
