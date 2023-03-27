
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity;
import com.commercetools.history.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetLineItemDiscountedPricePerQuantityChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetLineItemDiscountedPricePerQuantityChange setLineItemDiscountedPricePerQuantityChange = SetLineItemDiscountedPricePerQuantityChange.builder()
 *             .change("{change}")
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .variant("{variant}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
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
     *  <p>Update action for <code>setLineItemDiscountedPricePerQuantity</code></p>
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
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public DiscountedLineItemPriceForQuantity getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public DiscountedLineItemPriceForQuantity getPreviousValue();

    /**
     *  <p>Update action for <code>setLineItemDiscountedPricePerQuantity</code></p>
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
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final DiscountedLineItemPriceForQuantity nextValue);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final DiscountedLineItemPriceForQuantity previousValue);

    /**
     * factory method
     * @return instance of SetLineItemDiscountedPricePerQuantityChange
     */
    public static SetLineItemDiscountedPricePerQuantityChange of() {
        return new SetLineItemDiscountedPricePerQuantityChangeImpl();
    }

    /**
     * factory method to copy an instance of SetLineItemDiscountedPricePerQuantityChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetLineItemDiscountedPricePerQuantityChange of(
            final SetLineItemDiscountedPricePerQuantityChange template) {
        SetLineItemDiscountedPricePerQuantityChangeImpl instance = new SetLineItemDiscountedPricePerQuantityChangeImpl();
        instance.setChange(template.getChange());
        instance.setLineItem(template.getLineItem());
        instance.setVariant(template.getVariant());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
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
