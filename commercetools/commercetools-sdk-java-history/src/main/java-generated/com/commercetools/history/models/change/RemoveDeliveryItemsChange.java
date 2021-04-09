
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Delivery;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = RemoveDeliveryItemsChangeImpl.class)
public interface RemoveDeliveryItemsChange extends Change {

    String REMOVE_DELIVERY_ITEMS_CHANGE = "RemoveDeliveryItemsChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>removeDelivery</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Delivery getPreviousValue();

    public void setChange(final String change);

    public void setPreviousValue(final Delivery previousValue);

    public static RemoveDeliveryItemsChange of() {
        return new RemoveDeliveryItemsChangeImpl();
    }

    public static RemoveDeliveryItemsChange of(final RemoveDeliveryItemsChange template) {
        RemoveDeliveryItemsChangeImpl instance = new RemoveDeliveryItemsChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static RemoveDeliveryItemsChangeBuilder builder() {
        return RemoveDeliveryItemsChangeBuilder.of();
    }

    public static RemoveDeliveryItemsChangeBuilder builder(final RemoveDeliveryItemsChange template) {
        return RemoveDeliveryItemsChangeBuilder.of(template);
    }

    default <T> T withRemoveDeliveryItemsChange(Function<RemoveDeliveryItemsChange, T> helper) {
        return helper.apply(this);
    }
}
