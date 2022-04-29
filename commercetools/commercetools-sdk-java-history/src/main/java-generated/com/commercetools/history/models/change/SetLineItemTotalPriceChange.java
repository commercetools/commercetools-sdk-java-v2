
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
@JsonDeserialize(as = SetLineItemTotalPriceChangeImpl.class)
public interface SetLineItemTotalPriceChange extends Change {

    String SET_LINE_ITEM_TOTAL_PRICE_CHANGE = "SetLineItemTotalPriceChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>setLineItemTotalPrice</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("lineItem")
    public LocalizedString getLineItem();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Money getNextValue();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Money getPreviousValue();

    public void setChange(final String change);

    public void setLineItem(final LocalizedString lineItem);

    public void setNextValue(final Money nextValue);

    public void setPreviousValue(final Money previousValue);

    public static SetLineItemTotalPriceChange of() {
        return new SetLineItemTotalPriceChangeImpl();
    }

    public static SetLineItemTotalPriceChange of(final SetLineItemTotalPriceChange template) {
        SetLineItemTotalPriceChangeImpl instance = new SetLineItemTotalPriceChangeImpl();
        instance.setChange(template.getChange());
        instance.setLineItem(template.getLineItem());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetLineItemTotalPriceChangeBuilder builder() {
        return SetLineItemTotalPriceChangeBuilder.of();
    }

    public static SetLineItemTotalPriceChangeBuilder builder(final SetLineItemTotalPriceChange template) {
        return SetLineItemTotalPriceChangeBuilder.of(template);
    }

    default <T> T withSetLineItemTotalPriceChange(Function<SetLineItemTotalPriceChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetLineItemTotalPriceChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetLineItemTotalPriceChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetLineItemTotalPriceChange>";
            }
        };
    }
}
