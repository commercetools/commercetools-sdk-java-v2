
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.LocalizedString;
import com.commercetools.history.models.common.TaxMode;
import com.commercetools.history.models.common.TaxRate;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetCustomLineItemTaxAmountChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCustomLineItemTaxAmountChange setCustomLineItemTaxAmountChange = SetCustomLineItemTaxAmountChange.builder()
 *             .change("{change}")
 *             .customLineItem(customLineItemBuilder -> customLineItemBuilder)
 *             .customLineItemId("{customLineItemId}")
 *             .taxMode(TaxMode.PLATFORM)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetCustomLineItemTaxAmountChangeImpl.class)
public interface SetCustomLineItemTaxAmountChange extends Change {

    /**
     * discriminator value for SetCustomLineItemTaxAmountChange
     */
    String SET_CUSTOM_LINE_ITEM_TAX_AMOUNT_CHANGE = "SetCustomLineItemTaxAmountChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for <code>setCustomLineItemTaxAmount</code></p>
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
     * @return taxMode
     */
    @NotNull
    @JsonProperty("taxMode")
    public TaxMode getTaxMode();

    /**
     *  <p>Shape of the value for <code>addTaxRate</code> and <code>removeTaxRate</code> actions</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public TaxRate getNextValue();

    /**
     *  <p>Shape of the value for <code>addTaxRate</code> and <code>removeTaxRate</code> actions</p>
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public TaxRate getPreviousValue();

    /**
     *  <p>Update action for <code>setCustomLineItemTaxAmount</code></p>
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
     * set taxMode
     * @param taxMode value to be set
     */

    public void setTaxMode(final TaxMode taxMode);

    /**
     *  <p>Shape of the value for <code>addTaxRate</code> and <code>removeTaxRate</code> actions</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final TaxRate nextValue);

    /**
     *  <p>Shape of the value for <code>addTaxRate</code> and <code>removeTaxRate</code> actions</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final TaxRate previousValue);

    /**
     * factory method
     * @return instance of SetCustomLineItemTaxAmountChange
     */
    public static SetCustomLineItemTaxAmountChange of() {
        return new SetCustomLineItemTaxAmountChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetCustomLineItemTaxAmountChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetCustomLineItemTaxAmountChange of(final SetCustomLineItemTaxAmountChange template) {
        SetCustomLineItemTaxAmountChangeImpl instance = new SetCustomLineItemTaxAmountChangeImpl();
        instance.setChange(template.getChange());
        instance.setCustomLineItem(template.getCustomLineItem());
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setTaxMode(template.getTaxMode());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetCustomLineItemTaxAmountChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetCustomLineItemTaxAmountChange deepCopy(@Nullable final SetCustomLineItemTaxAmountChange template) {
        if (template == null) {
            return null;
        }
        SetCustomLineItemTaxAmountChangeImpl instance = new SetCustomLineItemTaxAmountChangeImpl();
        instance.setChange(template.getChange());
        instance.setCustomLineItem(Optional.ofNullable(template.getCustomLineItem())
                .map(com.commercetools.history.models.common.LocalizedString::deepCopy)
                .orElse(null));
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setTaxMode(template.getTaxMode());
        instance.setNextValue(Optional.ofNullable(template.getNextValue())
                .map(com.commercetools.history.models.common.TaxRate::deepCopy)
                .orElse(null));
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue())
                .map(com.commercetools.history.models.common.TaxRate::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for SetCustomLineItemTaxAmountChange
     * @return builder
     */
    public static SetCustomLineItemTaxAmountChangeBuilder builder() {
        return SetCustomLineItemTaxAmountChangeBuilder.of();
    }

    /**
     * create builder for SetCustomLineItemTaxAmountChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetCustomLineItemTaxAmountChangeBuilder builder(final SetCustomLineItemTaxAmountChange template) {
        return SetCustomLineItemTaxAmountChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetCustomLineItemTaxAmountChange(Function<SetCustomLineItemTaxAmountChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetCustomLineItemTaxAmountChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetCustomLineItemTaxAmountChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetCustomLineItemTaxAmountChange>";
            }
        };
    }
}
