
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.LocalizedString;
import com.commercetools.history.models.common.Price;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetLineItemPriceChangeImpl.class)
public interface SetLineItemPriceChange extends Change {

    String SET_LINE_ITEM_PRICE_CHANGE = "SetLineItemPriceChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>setLineItemPrice</code></p>
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
    public Price getNextValue();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Price getPreviousValue();

    public void setChange(final String change);

    public void setLineItem(final LocalizedString lineItem);

    public void setNextValue(final Price nextValue);

    public void setPreviousValue(final Price previousValue);

    public static SetLineItemPriceChange of() {
        return new SetLineItemPriceChangeImpl();
    }

    public static SetLineItemPriceChange of(final SetLineItemPriceChange template) {
        SetLineItemPriceChangeImpl instance = new SetLineItemPriceChangeImpl();
        instance.setChange(template.getChange());
        instance.setLineItem(template.getLineItem());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetLineItemPriceChangeBuilder builder() {
        return SetLineItemPriceChangeBuilder.of();
    }

    public static SetLineItemPriceChangeBuilder builder(final SetLineItemPriceChange template) {
        return SetLineItemPriceChangeBuilder.of(template);
    }

    default <T> T withSetLineItemPriceChange(Function<SetLineItemPriceChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetLineItemPriceChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetLineItemPriceChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetLineItemPriceChange>";
            }
        };
    }
}
