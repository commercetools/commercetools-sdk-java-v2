
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.LocalizedString;
import com.commercetools.history.models.common.TaxedItemPrice;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetLineItemTaxedPriceChangeImpl.class)
public interface SetLineItemTaxedPriceChange extends Change {

    String SET_LINE_ITEM_TAXED_PRICE_CHANGE = "SetLineItemTaxedPriceChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>setLineItemTaxedPrice</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("lineItem")
    public LocalizedString getLineItem();

    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public TaxedItemPrice getNextValue();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public TaxedItemPrice getPreviousValue();

    public void setChange(final String change);

    public void setLineItem(final LocalizedString lineItem);

    public void setLineItemId(final String lineItemId);

    public void setNextValue(final TaxedItemPrice nextValue);

    public void setPreviousValue(final TaxedItemPrice previousValue);

    public static SetLineItemTaxedPriceChange of() {
        return new SetLineItemTaxedPriceChangeImpl();
    }

    public static SetLineItemTaxedPriceChange of(final SetLineItemTaxedPriceChange template) {
        SetLineItemTaxedPriceChangeImpl instance = new SetLineItemTaxedPriceChangeImpl();
        instance.setChange(template.getChange());
        instance.setLineItem(template.getLineItem());
        instance.setLineItemId(template.getLineItemId());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetLineItemTaxedPriceChangeBuilder builder() {
        return SetLineItemTaxedPriceChangeBuilder.of();
    }

    public static SetLineItemTaxedPriceChangeBuilder builder(final SetLineItemTaxedPriceChange template) {
        return SetLineItemTaxedPriceChangeBuilder.of(template);
    }

    default <T> T withSetLineItemTaxedPriceChange(Function<SetLineItemTaxedPriceChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetLineItemTaxedPriceChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetLineItemTaxedPriceChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetLineItemTaxedPriceChange>";
            }
        };
    }
}
