
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
@JsonDeserialize(as = SetLineItemShippingDetailsChangeImpl.class)
public interface SetLineItemShippingDetailsChange extends Change {

    String SET_LINE_ITEM_SHIPPING_DETAILS_CHANGE = "SetLineItemShippingDetailsChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>setLineItemShippingDetails</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public ItemShippingDetails getNextValue();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public ItemShippingDetails getPreviousValue();

    public void setChange(final String change);

    public void setLineItemId(final String lineItemId);

    public void setNextValue(final ItemShippingDetails nextValue);

    public void setPreviousValue(final ItemShippingDetails previousValue);

    public static SetLineItemShippingDetailsChange of() {
        return new SetLineItemShippingDetailsChangeImpl();
    }

    public static SetLineItemShippingDetailsChange of(final SetLineItemShippingDetailsChange template) {
        SetLineItemShippingDetailsChangeImpl instance = new SetLineItemShippingDetailsChangeImpl();
        instance.setChange(template.getChange());
        instance.setLineItemId(template.getLineItemId());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetLineItemShippingDetailsChangeBuilder builder() {
        return SetLineItemShippingDetailsChangeBuilder.of();
    }

    public static SetLineItemShippingDetailsChangeBuilder builder(final SetLineItemShippingDetailsChange template) {
        return SetLineItemShippingDetailsChangeBuilder.of(template);
    }

    default <T> T withSetLineItemShippingDetailsChange(Function<SetLineItemShippingDetailsChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetLineItemShippingDetailsChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetLineItemShippingDetailsChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetLineItemShippingDetailsChange>";
            }
        };
    }
}
