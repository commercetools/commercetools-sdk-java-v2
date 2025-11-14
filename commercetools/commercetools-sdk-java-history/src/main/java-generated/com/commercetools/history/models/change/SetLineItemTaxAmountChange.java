
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
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetLineItemTaxAmountAction" rel="nofollow">Set LineItem TaxAmount</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetLineItemTaxAmountChange setLineItemTaxAmountChange = SetLineItemTaxAmountChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .variant("{variant}")
 *             .taxMode(TaxMode.PLATFORM)
 *             .lineItemId("{lineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetLineItemTaxAmountChange")
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
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the Line Item is based on.</p>
     * @return lineItem
     */
    @NotNull
    @Valid
    @JsonProperty("lineItem")
    public LocalizedString getLineItem();

    /**
     *  <p>Identifier of the updated Product Variant.</p>
     *  <p>This field holds the SKU, if defined; otherwise the key; otherwise the ID.</p>
     * @return variant
     */
    @NotNull
    @JsonProperty("variant")
    public String getVariant();

    /**
     *  <p><code>"ExternalAmount"</code></p>
     * @return taxMode
     */
    @NotNull
    @JsonProperty("taxMode")
    public TaxMode getTaxMode();

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a>.</p>
     * @return lineItemId
     */
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

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
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the Line Item is based on.</p>
     * @param lineItem value to be set
     */

    public void setLineItem(final LocalizedString lineItem);

    /**
     *  <p>Identifier of the updated Product Variant.</p>
     *  <p>This field holds the SKU, if defined; otherwise the key; otherwise the ID.</p>
     * @param variant value to be set
     */

    public void setVariant(final String variant);

    /**
     *  <p><code>"ExternalAmount"</code></p>
     * @param taxMode value to be set
     */

    public void setTaxMode(final TaxMode taxMode);

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a>.</p>
     * @param lineItemId value to be set
     */

    public void setLineItemId(final String lineItemId);

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
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setLineItem(template.getLineItem());
        instance.setVariant(template.getVariant());
        instance.setTaxMode(template.getTaxMode());
        instance.setLineItemId(template.getLineItemId());
        return instance;
    }

    public SetLineItemTaxAmountChange copyDeep();

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
        instance.setPreviousValue(
            com.commercetools.history.models.common.TaxRate.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.TaxRate.deepCopy(template.getNextValue()));
        instance.setLineItem(com.commercetools.history.models.common.LocalizedString.deepCopy(template.getLineItem()));
        instance.setVariant(template.getVariant());
        instance.setTaxMode(template.getTaxMode());
        instance.setLineItemId(template.getLineItemId());
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
