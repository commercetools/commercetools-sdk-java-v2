
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.LocalizedString;
import com.commercetools.history.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetCustomLineItemTaxedPriceChangeImpl.class)
public interface SetCustomLineItemTaxedPriceChange extends Change {

    String SET_CUSTOM_LINE_ITEM_TAXED_PRICE_CHANGE = "SetCustomLineItemTaxedPriceChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>setCustomLineItemTaxedPrice</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("customLineItem")
    public LocalizedString getCustomLineItem();

    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Money getNextValue();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Money getPreviousValue();

    public void setChange(final String change);

    public void setCustomLineItem(final LocalizedString customLineItem);

    public void setCustomLineItemId(final String customLineItemId);

    public void setNextValue(final Money nextValue);

    public void setPreviousValue(final Money previousValue);

    public static SetCustomLineItemTaxedPriceChange of() {
        return new SetCustomLineItemTaxedPriceChangeImpl();
    }

    public static SetCustomLineItemTaxedPriceChange of(final SetCustomLineItemTaxedPriceChange template) {
        SetCustomLineItemTaxedPriceChangeImpl instance = new SetCustomLineItemTaxedPriceChangeImpl();
        instance.setChange(template.getChange());
        instance.setCustomLineItem(template.getCustomLineItem());
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetCustomLineItemTaxedPriceChangeBuilder builder() {
        return SetCustomLineItemTaxedPriceChangeBuilder.of();
    }

    public static SetCustomLineItemTaxedPriceChangeBuilder builder(final SetCustomLineItemTaxedPriceChange template) {
        return SetCustomLineItemTaxedPriceChangeBuilder.of(template);
    }

    default <T> T withSetCustomLineItemTaxedPriceChange(Function<SetCustomLineItemTaxedPriceChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetCustomLineItemTaxedPriceChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetCustomLineItemTaxedPriceChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetCustomLineItemTaxedPriceChange>";
            }
        };
    }
}
