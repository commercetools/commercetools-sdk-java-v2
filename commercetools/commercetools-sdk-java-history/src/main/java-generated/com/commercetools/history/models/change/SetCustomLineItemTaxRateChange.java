
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.LocalizedString;
import com.commercetools.history.models.common.TaxMode;
import com.commercetools.history.models.common.TaxRate;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the Set CustomLineItem TaxRate update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCustomLineItemTaxRateChange setCustomLineItemTaxRateChange = SetCustomLineItemTaxRateChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .customLineItem(customLineItemBuilder -> customLineItemBuilder)
 *             .customLineItemId("{customLineItemId}")
 *             .taxMode(TaxMode.PLATFORM)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetCustomLineItemTaxRateChange")
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
    public TaxRate getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public TaxRate getNextValue();

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
     *  <p><code>"External"</code></p>
     * @return taxMode
     */
    @NotNull
    @JsonProperty("taxMode")
    public TaxMode getTaxMode();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final TaxRate previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final TaxRate nextValue);

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
     *  <p><code>"External"</code></p>
     * @param taxMode value to be set
     */

    public void setTaxMode(final TaxMode taxMode);

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
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setCustomLineItem(template.getCustomLineItem());
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setTaxMode(template.getTaxMode());
        return instance;
    }

    public SetCustomLineItemTaxRateChange copyDeep();

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
        instance.setPreviousValue(
            com.commercetools.history.models.common.TaxRate.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.TaxRate.deepCopy(template.getNextValue()));
        instance.setCustomLineItem(
            com.commercetools.history.models.common.LocalizedString.deepCopy(template.getCustomLineItem()));
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setTaxMode(template.getTaxMode());
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
