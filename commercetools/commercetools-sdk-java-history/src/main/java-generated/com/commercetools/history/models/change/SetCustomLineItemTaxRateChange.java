
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
 * SetCustomLineItemTaxRateChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCustomLineItemTaxRateChange setCustomLineItemTaxRateChange = SetCustomLineItemTaxRateChange.builder()
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
@JsonDeserialize(as = SetCustomLineItemTaxRateChangeImpl.class)
public interface SetCustomLineItemTaxRateChange extends Change {

    /**
     * discriminator value for SetCustomLineItemTaxRateChange
     */
    String SET_CUSTOM_LINE_ITEM_TAX_RATE_CHANGE = "SetCustomLineItemTaxRateChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for <code>setCustomLineItemTaxRate</code></p>
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
     *  <p>Update action for <code>setCustomLineItemTaxRate</code></p>
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
     * @return instance of SetCustomLineItemTaxRateChange
     */
    public static SetCustomLineItemTaxRateChange of() {
        return new SetCustomLineItemTaxRateChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetCustomLineItemTaxRateChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetCustomLineItemTaxRateChange of(final SetCustomLineItemTaxRateChange template) {
        SetCustomLineItemTaxRateChangeImpl instance = new SetCustomLineItemTaxRateChangeImpl();
        instance.setChange(template.getChange());
        instance.setCustomLineItem(template.getCustomLineItem());
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setTaxMode(template.getTaxMode());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetCustomLineItemTaxRateChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetCustomLineItemTaxRateChange deepCopy(@Nullable final SetCustomLineItemTaxRateChange template) {
        if (template == null) {
            return null;
        }
        SetCustomLineItemTaxRateChangeImpl instance = new SetCustomLineItemTaxRateChangeImpl();
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
     * builder factory method for SetCustomLineItemTaxRateChange
     * @return builder
     */
    public static SetCustomLineItemTaxRateChangeBuilder builder() {
        return SetCustomLineItemTaxRateChangeBuilder.of();
    }

    /**
     * create builder for SetCustomLineItemTaxRateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetCustomLineItemTaxRateChangeBuilder builder(final SetCustomLineItemTaxRateChange template) {
        return SetCustomLineItemTaxRateChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetCustomLineItemTaxRateChange(Function<SetCustomLineItemTaxRateChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetCustomLineItemTaxRateChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetCustomLineItemTaxRateChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetCustomLineItemTaxRateChange>";
            }
        };
    }
}
