
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.LocalizedString;
import com.commercetools.history.models.common.TaxedItemPrice;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * SetLineItemTaxedPriceChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetLineItemTaxedPriceChange setLineItemTaxedPriceChange = SetLineItemTaxedPriceChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .lineItemId("{lineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetLineItemTaxedPriceChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetLineItemTaxedPriceChangeImpl.class)
public interface SetLineItemTaxedPriceChange extends Change {

    /**
     * discriminator value for SetLineItemTaxedPriceChange
     */
    String SET_LINE_ITEM_TAXED_PRICE_CHANGE = "SetLineItemTaxedPriceChange";

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
    public TaxedItemPrice getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public TaxedItemPrice getNextValue();

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the Line Item is based on.</p>
     * @return lineItem
     */
    @NotNull
    @Valid
    @JsonProperty("lineItem")
    public LocalizedString getLineItem();

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

    public void setPreviousValue(final TaxedItemPrice previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final TaxedItemPrice nextValue);

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the Line Item is based on.</p>
     * @param lineItem value to be set
     */

    public void setLineItem(final LocalizedString lineItem);

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a>.</p>
     * @param lineItemId value to be set
     */

    public void setLineItemId(final String lineItemId);

    /**
     * factory method
     * @return instance of SetLineItemTaxedPriceChange
     */
    public static SetLineItemTaxedPriceChange of() {
        return new SetLineItemTaxedPriceChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetLineItemTaxedPriceChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetLineItemTaxedPriceChange of(final SetLineItemTaxedPriceChange template) {
        SetLineItemTaxedPriceChangeImpl instance = new SetLineItemTaxedPriceChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setLineItem(template.getLineItem());
        instance.setLineItemId(template.getLineItemId());
        return instance;
    }

    public SetLineItemTaxedPriceChange copyDeep();

    /**
     * factory method to create a deep copy of SetLineItemTaxedPriceChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetLineItemTaxedPriceChange deepCopy(@Nullable final SetLineItemTaxedPriceChange template) {
        if (template == null) {
            return null;
        }
        SetLineItemTaxedPriceChangeImpl instance = new SetLineItemTaxedPriceChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.TaxedItemPrice.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.TaxedItemPrice.deepCopy(template.getNextValue()));
        instance.setLineItem(com.commercetools.history.models.common.LocalizedString.deepCopy(template.getLineItem()));
        instance.setLineItemId(template.getLineItemId());
        return instance;
    }

    /**
     * builder factory method for SetLineItemTaxedPriceChange
     * @return builder
     */
    public static SetLineItemTaxedPriceChangeBuilder builder() {
        return SetLineItemTaxedPriceChangeBuilder.of();
    }

    /**
     * create builder for SetLineItemTaxedPriceChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetLineItemTaxedPriceChangeBuilder builder(final SetLineItemTaxedPriceChange template) {
        return SetLineItemTaxedPriceChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetLineItemTaxedPriceChange(Function<SetLineItemTaxedPriceChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetLineItemTaxedPriceChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetLineItemTaxedPriceChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetLineItemTaxedPriceChange>";
            }
        };
    }
}
