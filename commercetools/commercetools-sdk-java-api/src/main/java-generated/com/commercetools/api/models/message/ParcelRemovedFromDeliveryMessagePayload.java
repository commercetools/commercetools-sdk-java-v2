package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.order.Parcel;
import com.commercetools.api.models.message.ParcelRemovedFromDeliveryMessagePayloadImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ParcelRemovedFromDeliveryMessagePayloadImpl.class)
public interface ParcelRemovedFromDeliveryMessagePayload extends MessagePayload {

    
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();
    
    @NotNull
    @Valid
    @JsonProperty("parcel")
    public Parcel getParcel();

    public void setDeliveryId(final String deliveryId);
    
    public void setParcel(final Parcel parcel);

    public static ParcelRemovedFromDeliveryMessagePayloadImpl of(){
        return new ParcelRemovedFromDeliveryMessagePayloadImpl();
    }
    

    public static ParcelRemovedFromDeliveryMessagePayloadImpl of(final ParcelRemovedFromDeliveryMessagePayload template) {
        ParcelRemovedFromDeliveryMessagePayloadImpl instance = new ParcelRemovedFromDeliveryMessagePayloadImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setParcel(template.getParcel());
        return instance;
    }

    default <T> T withParcelRemovedFromDeliveryMessagePayload(Function<ParcelRemovedFromDeliveryMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
