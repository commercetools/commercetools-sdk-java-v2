package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.order.Delivery;
import com.commercetools.api.models.order.Parcel;
import com.commercetools.api.models.message.ParcelAddedToDeliveryMessagePayloadImpl;

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
@JsonDeserialize(as = ParcelAddedToDeliveryMessagePayloadImpl.class)
public interface ParcelAddedToDeliveryMessagePayload extends MessagePayload {

    
    @NotNull
    @Valid
    @JsonProperty("delivery")
    public Delivery getDelivery();
    
    @NotNull
    @Valid
    @JsonProperty("parcel")
    public Parcel getParcel();

    public void setDelivery(final Delivery delivery);
    
    public void setParcel(final Parcel parcel);

    public static ParcelAddedToDeliveryMessagePayloadImpl of(){
        return new ParcelAddedToDeliveryMessagePayloadImpl();
    }
    

    public static ParcelAddedToDeliveryMessagePayloadImpl of(final ParcelAddedToDeliveryMessagePayload template) {
        ParcelAddedToDeliveryMessagePayloadImpl instance = new ParcelAddedToDeliveryMessagePayloadImpl();
        instance.setDelivery(template.getDelivery());
        instance.setParcel(template.getParcel());
        return instance;
    }

    default <T> T withParcelAddedToDeliveryMessagePayload(Function<ParcelAddedToDeliveryMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
