
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
@JsonDeserialize(as = AddParcelToDeliveryChangeImpl.class)
public interface AddParcelToDeliveryChange extends Change {

    String ADD_PARCEL_TO_DELIVERY_CHANGE = "AddParcelToDeliveryChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>addParcelToDelivery</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Parcel getNextValue();

    public void setChange(final String change);

    public void setDeliveryId(final String deliveryId);

    public void setNextValue(final Parcel nextValue);

    public static AddParcelToDeliveryChange of() {
        return new AddParcelToDeliveryChangeImpl();
    }

    public static AddParcelToDeliveryChange of(final AddParcelToDeliveryChange template) {
        AddParcelToDeliveryChangeImpl instance = new AddParcelToDeliveryChangeImpl();
        instance.setChange(template.getChange());
        instance.setDeliveryId(template.getDeliveryId());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static AddParcelToDeliveryChangeBuilder builder() {
        return AddParcelToDeliveryChangeBuilder.of();
    }

    public static AddParcelToDeliveryChangeBuilder builder(final AddParcelToDeliveryChange template) {
        return AddParcelToDeliveryChangeBuilder.of(template);
    }

    default <T> T withAddParcelToDeliveryChange(Function<AddParcelToDeliveryChange, T> helper) {
        return helper.apply(this);
    }
}
