
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
 * SetLineItemDiscountedPricePerQuantityChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetLineItemDiscountedPricePerQuantityChange setLineItemDiscountedPricePerQuantityChange = SetLineItemDiscountedPricePerQuantityChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .variant("{variant}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetLineItemDiscountedPricePerQuantityChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetLineItemDiscountedPricePerQuantityChangeImpl.class)
public interface SetLineItemDiscountedPricePerQuantityChange extends Change {

    /**
     * discriminator value for SetLineItemDiscountedPricePerQuantityChange
     */
    String SET_LINE_ITEM_DISCOUNTED_PRICE_PER_QUANTITY_CHANGE = "SetLineItemDiscountedPricePerQuantityChange";

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
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the Line Item is based on.</p>
     * @return lineItem
     */
    @NotNull
    @Valid
    @JsonProperty("lineItem")
    public LocalizedString getLineItem();

    /**
     *  <p><code>sku</code> or <code>key</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>.</p>
     * @return variant
     */
    @NotNull
    @JsonProperty("variant")
    public String getVariant();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

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
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the Line Item is based on.</p>
     * @param lineItem value to be set
     */

    public void setLineItem(final LocalizedString lineItem);

    /**
     *  <p><code>sku</code> or <code>key</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>.</p>
     * @param variant value to be set
     */

    public void setVariant(final String variant);

    /**
     * factory method
     * @return instance of SetLineItemDiscountedPricePerQuantityChange
     */
    public static SetLineItemDiscountedPricePerQuantityChange of() {
        return new SetLineItemDiscountedPricePerQuantityChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetLineItemDiscountedPricePerQuantityChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetLineItemDiscountedPricePerQuantityChange of(
            final SetLineItemDiscountedPricePerQuantityChange template) {
        SetLineItemDiscountedPricePerQuantityChangeImpl instance = new SetLineItemDiscountedPricePerQuantityChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setLineItem(template.getLineItem());
        instance.setVariant(template.getVariant());
        return instance;
    }

    public SetLineItemDiscountedPricePerQuantityChange copyDeep();

    /**
     * factory method to create a deep copy of SetLineItemDiscountedPricePerQuantityChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetLineItemDiscountedPricePerQuantityChange deepCopy(
            @Nullable final SetLineItemDiscountedPricePerQuantityChange template) {
        if (template == null) {
            return null;
        }
        SetLineItemDiscountedPricePerQuantityChangeImpl instance = new SetLineItemDiscountedPricePerQuantityChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity
                .deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity
                .deepCopy(template.getNextValue()));
        instance.setLineItem(com.commercetools.history.models.common.LocalizedString.deepCopy(template.getLineItem()));
        instance.setVariant(template.getVariant());
        return instance;
    }

    /**
     * builder factory method for SetLineItemDiscountedPricePerQuantityChange
     * @return builder
     */
    public static SetLineItemDiscountedPricePerQuantityChangeBuilder builder() {
        return SetLineItemDiscountedPricePerQuantityChangeBuilder.of();
    }

    /**
     * create builder for SetLineItemDiscountedPricePerQuantityChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetLineItemDiscountedPricePerQuantityChangeBuilder builder(
            final SetLineItemDiscountedPricePerQuantityChange template) {
        return SetLineItemDiscountedPricePerQuantityChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetLineItemDiscountedPricePerQuantityChange(
            Function<SetLineItemDiscountedPricePerQuantityChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetLineItemDiscountedPricePerQuantityChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetLineItemDiscountedPricePerQuantityChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetLineItemDiscountedPricePerQuantityChange>";
            }
        };
    }
}
