
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetLineItemDiscountedPricePerQuantityChangeImpl.class)
public interface SetLineItemDiscountedPricePerQuantityChange extends Change {

    String SET_LINE_ITEM_DISCOUNTED_PRICE_PER_QUANTITY_CHANGE = "SetLineItemDiscountedPricePerQuantityChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>setLineItemDiscountedPricePerQuantity</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("lineItem")
    public LocalizedString getLineItem();

    @NotNull
    @JsonProperty("variant")
    public String getVariant();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public DiscountedLineItemPriceForQuantity getNextValue();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public DiscountedLineItemPriceForQuantity getPreviousValue();

    public void setChange(final String change);

    public void setLineItem(final LocalizedString lineItem);

    public void setVariant(final String variant);

    public void setNextValue(final DiscountedLineItemPriceForQuantity nextValue);

    public void setPreviousValue(final DiscountedLineItemPriceForQuantity previousValue);

    public static SetLineItemDiscountedPricePerQuantityChange of() {
        return new SetLineItemDiscountedPricePerQuantityChangeImpl();
    }

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

    public static SetLineItemDiscountedPricePerQuantityChangeBuilder builder() {
        return SetLineItemDiscountedPricePerQuantityChangeBuilder.of();
    }

    public static SetLineItemDiscountedPricePerQuantityChangeBuilder builder(
            final SetLineItemDiscountedPricePerQuantityChange template) {
        return SetLineItemDiscountedPricePerQuantityChangeBuilder.of(template);
    }

    default <T> T withSetLineItemDiscountedPricePerQuantityChange(
            Function<SetLineItemDiscountedPricePerQuantityChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetLineItemDiscountedPricePerQuantityChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetLineItemDiscountedPricePerQuantityChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetLineItemDiscountedPricePerQuantityChange>";
            }
        };
    }
}
