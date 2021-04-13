
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Parcel;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = RemoveParcelFromDeliveryChangeImpl.class)
public interface RemoveParcelFromDeliveryChange extends Change {

    String REMOVE_PARCEL_FROM_DELIVERY_CHANGE = "RemoveParcelFromDeliveryChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>removeParcelFromDelivery</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Parcel getPreviousValue();

    public void setChange(final String change);

    public void setDeliveryId(final String deliveryId);

    public void setPreviousValue(final Parcel previousValue);

    public static RemoveParcelFromDeliveryChange of() {
        return new RemoveParcelFromDeliveryChangeImpl();
    }

    public static RemoveParcelFromDeliveryChange of(final RemoveParcelFromDeliveryChange template) {
        RemoveParcelFromDeliveryChangeImpl instance = new RemoveParcelFromDeliveryChangeImpl();
        instance.setChange(template.getChange());
        instance.setDeliveryId(template.getDeliveryId());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static RemoveParcelFromDeliveryChangeBuilder builder() {
        return RemoveParcelFromDeliveryChangeBuilder.of();
    }

    public static RemoveParcelFromDeliveryChangeBuilder builder(final RemoveParcelFromDeliveryChange template) {
        return RemoveParcelFromDeliveryChangeBuilder.of(template);
    }

    default <T> T withRemoveParcelFromDeliveryChange(Function<RemoveParcelFromDeliveryChange, T> helper) {
        return helper.apply(this);
    }
}
