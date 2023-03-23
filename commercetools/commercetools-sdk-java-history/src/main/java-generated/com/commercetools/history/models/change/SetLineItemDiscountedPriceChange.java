
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.DiscountedLineItemPrice;
import com.commercetools.history.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetLineItemDiscountedPriceChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetLineItemDiscountedPriceChange setLineItemDiscountedPriceChange = SetLineItemDiscountedPriceChange.builder()
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
@JsonDeserialize(as = SetLineItemDiscountedPriceChangeImpl.class)
public interface SetLineItemDiscountedPriceChange extends Change {

    String SET_LINE_ITEM_DISCOUNTED_PRICE_CHANGE = "SetLineItemDiscountedPriceChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for <code>setLineItemDiscountedPrice</code></p>
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
    public DiscountedLineItemPrice getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public DiscountedLineItemPrice getPreviousValue();

    public void setChange(final String change);

    public void setLineItem(final LocalizedString lineItem);

    public void setVariant(final String variant);

    public void setNextValue(final DiscountedLineItemPrice nextValue);

    public void setPreviousValue(final DiscountedLineItemPrice previousValue);

    public static SetLineItemDiscountedPriceChange of() {
        return new SetLineItemDiscountedPriceChangeImpl();
    }

    public static SetLineItemDiscountedPriceChange of(final SetLineItemDiscountedPriceChange template) {
        SetLineItemDiscountedPriceChangeImpl instance = new SetLineItemDiscountedPriceChangeImpl();
        instance.setChange(template.getChange());
        instance.setLineItem(template.getLineItem());
        instance.setVariant(template.getVariant());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetLineItemDiscountedPriceChangeBuilder builder() {
        return SetLineItemDiscountedPriceChangeBuilder.of();
    }

    public static SetLineItemDiscountedPriceChangeBuilder builder(final SetLineItemDiscountedPriceChange template) {
        return SetLineItemDiscountedPriceChangeBuilder.of(template);
    }

    default <T> T withSetLineItemDiscountedPriceChange(Function<SetLineItemDiscountedPriceChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetLineItemDiscountedPriceChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetLineItemDiscountedPriceChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetLineItemDiscountedPriceChange>";
            }
        };
    }
}
