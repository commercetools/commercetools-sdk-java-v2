package com.commercetools.api.models.message;

import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.order.Delivery;
import com.commercetools.api.models.order.Parcel;
import com.commercetools.api.models.message.ParcelAddedToDeliveryMessageImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ParcelAddedToDeliveryMessageImpl.class)
public interface ParcelAddedToDeliveryMessage extends Message {

    
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

    public static ParcelAddedToDeliveryMessageImpl of(){
        return new ParcelAddedToDeliveryMessageImpl();
    }
    

    public static ParcelAddedToDeliveryMessageImpl of(final ParcelAddedToDeliveryMessage template) {
        ParcelAddedToDeliveryMessageImpl instance = new ParcelAddedToDeliveryMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setDelivery(template.getDelivery());
        instance.setParcel(template.getParcel());
        return instance;
    }

}
