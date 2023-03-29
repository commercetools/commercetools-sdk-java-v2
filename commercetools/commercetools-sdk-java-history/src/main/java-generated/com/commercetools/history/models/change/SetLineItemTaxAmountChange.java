
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
 * SetLineItemTaxAmountChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetLineItemTaxAmountChange setLineItemTaxAmountChange = SetLineItemTaxAmountChange.builder()
 *             .change("{change}")
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .variant("{variant}")
 *             .taxMode(TaxMode.PLATFORM)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetLineItemTaxAmountChangeImpl.class)
public interface SetLineItemTaxAmountChange extends Change {

    /**
     * discriminator value for SetLineItemTaxAmountChange
     */
    String SET_LINE_ITEM_TAX_AMOUNT_CHANGE = "SetLineItemTaxAmountChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for <code>setLineItemTaxAmount</code></p>
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
     *  <p>Update action for <code>setLineItemTaxAmount</code></p>
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
     * @return instance of SetLineItemTaxAmountChange
     */
    public static SetLineItemTaxAmountChange of() {
        return new SetLineItemTaxAmountChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetLineItemTaxAmountChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetLineItemTaxAmountChange of(final SetLineItemTaxAmountChange template) {
        SetLineItemTaxAmountChangeImpl instance = new SetLineItemTaxAmountChangeImpl();
        instance.setChange(template.getChange());
        instance.setLineItem(template.getLineItem());
        instance.setVariant(template.getVariant());
        instance.setTaxMode(template.getTaxMode());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetLineItemTaxAmountChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetLineItemTaxAmountChange deepCopy(@Nullable final SetLineItemTaxAmountChange template) {
        if (template == null) {
            return null;
        }
        SetLineItemTaxAmountChangeImpl instance = new SetLineItemTaxAmountChangeImpl();
        instance.setChange(template.getChange());
        instance.setLineItem(Optional.ofNullable(template.getLineItem())
                .map(com.commercetools.history.models.common.LocalizedString::deepCopy)
                .orElse(null));
        instance.setVariant(template.getVariant());
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
     * builder factory method for SetLineItemTaxAmountChange
     * @return builder
     */
    public static SetLineItemTaxAmountChangeBuilder builder() {
        return SetLineItemTaxAmountChangeBuilder.of();
    }

    /**
     * create builder for SetLineItemTaxAmountChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetLineItemTaxAmountChangeBuilder builder(final SetLineItemTaxAmountChange template) {
        return SetLineItemTaxAmountChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetLineItemTaxAmountChange(Function<SetLineItemTaxAmountChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetLineItemTaxAmountChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetLineItemTaxAmountChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetLineItemTaxAmountChange>";
            }
        };
    }
}
