
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
 *  <p>Change triggered by the Set LineItemTaxRate update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetLineItemTaxRateChange setLineItemTaxRateChange = SetLineItemTaxRateChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .variant("{variant}")
 *             .taxMode(TaxMode.PLATFORM)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetLineItemTaxRateChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetLineItemTaxRateChangeImpl.class)
public interface SetLineItemTaxRateChange extends Change {

    /**
     * discriminator value for SetLineItemTaxRateChange
     */
    String SET_LINE_ITEM_TAX_RATE_CHANGE = "SetLineItemTaxRateChange";

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
     *  <p>Name of the Product the Line Item is based on.</p>
     * @return lineItem
     */
    @NotNull
    @Valid
    @JsonProperty("lineItem")
    public LocalizedString getLineItem();

    /**
     *  <p><code>sku</code> or <code>key</code> of the ProductVariant.</p>
     * @return variant
     */
    @NotNull
    @JsonProperty("variant")
    public String getVariant();

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
     *  <p>Name of the Product the Line Item is based on.</p>
     * @param lineItem value to be set
     */

    public void setLineItem(final LocalizedString lineItem);

    /**
     *  <p><code>sku</code> or <code>key</code> of the ProductVariant.</p>
     * @param variant value to be set
     */

    public void setVariant(final String variant);

    /**
     *  <p><code>"External"</code></p>
     * @param taxMode value to be set
     */

    public void setTaxMode(final TaxMode taxMode);

    /**
     * factory method
     * @return instance of SetLineItemTaxRateChange
     */
    public static SetLineItemTaxRateChange of() {
        return new SetLineItemTaxRateChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetLineItemTaxRateChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetLineItemTaxRateChange of(final SetLineItemTaxRateChange template) {
        SetLineItemTaxRateChangeImpl instance = new SetLineItemTaxRateChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setLineItem(template.getLineItem());
        instance.setVariant(template.getVariant());
        instance.setTaxMode(template.getTaxMode());
        return instance;
    }

    public SetLineItemTaxRateChange copyDeep();

    /**
     * factory method to create a deep copy of SetLineItemTaxRateChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetLineItemTaxRateChange deepCopy(@Nullable final SetLineItemTaxRateChange template) {
        if (template == null) {
            return null;
        }
        SetLineItemTaxRateChangeImpl instance = new SetLineItemTaxRateChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.TaxRate.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.TaxRate.deepCopy(template.getNextValue()));
        instance.setLineItem(com.commercetools.history.models.common.LocalizedString.deepCopy(template.getLineItem()));
        instance.setVariant(template.getVariant());
        instance.setTaxMode(template.getTaxMode());
        return instance;
    }

    /**
     * builder factory method for SetLineItemTaxRateChange
     * @return builder
     */
    public static SetLineItemTaxRateChangeBuilder builder() {
        return SetLineItemTaxRateChangeBuilder.of();
    }

    /**
     * create builder for SetLineItemTaxRateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetLineItemTaxRateChangeBuilder builder(final SetLineItemTaxRateChange template) {
        return SetLineItemTaxRateChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetLineItemTaxRateChange(Function<SetLineItemTaxRateChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetLineItemTaxRateChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetLineItemTaxRateChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetLineItemTaxRateChange>";
            }
        };
    }
}
