
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.ItemShippingDetails;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetCustomLineItemShippingDetailsChangeImpl.class)
public interface SetCustomLineItemShippingDetailsChange extends Change {

    String SET_CUSTOM_LINE_ITEM_SHIPPING_DETAILS_CHANGE = "SetCustomLineItemShippingDetailsChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>setCustomLineItemShippingDetails</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public ItemShippingDetails getNextValue();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public ItemShippingDetails getPreviousValue();

    public void setChange(final String change);

    public void setCustomLineItemId(final String customLineItemId);

    public void setNextValue(final ItemShippingDetails nextValue);

    public void setPreviousValue(final ItemShippingDetails previousValue);

    public static SetCustomLineItemShippingDetailsChange of() {
        return new SetCustomLineItemShippingDetailsChangeImpl();
    }

    public static SetCustomLineItemShippingDetailsChange of(final SetCustomLineItemShippingDetailsChange template) {
        SetCustomLineItemShippingDetailsChangeImpl instance = new SetCustomLineItemShippingDetailsChangeImpl();
        instance.setChange(template.getChange());
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetCustomLineItemShippingDetailsChangeBuilder builder() {
        return SetCustomLineItemShippingDetailsChangeBuilder.of();
    }

    public static SetCustomLineItemShippingDetailsChangeBuilder builder(
            final SetCustomLineItemShippingDetailsChange template) {
        return SetCustomLineItemShippingDetailsChangeBuilder.of(template);
    }

    default <T> T withSetCustomLineItemShippingDetailsChange(
            Function<SetCustomLineItemShippingDetailsChange, T> helper) {
        return helper.apply(this);
    }
}
