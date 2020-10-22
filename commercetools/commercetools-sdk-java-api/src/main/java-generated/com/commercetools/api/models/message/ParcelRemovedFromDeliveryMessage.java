package com.commercetools.api.models.message;

import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.order.Parcel;
import com.commercetools.api.models.message.ParcelRemovedFromDeliveryMessageImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ParcelRemovedFromDeliveryMessageImpl.class)
public interface ParcelRemovedFromDeliveryMessage extends Message {

    
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();
    
    @NotNull
    @Valid
    @JsonProperty("parcel")
    public Parcel getParcel();

    public void setDeliveryId(final String deliveryId);
    
    public void setParcel(final Parcel parcel);

    public static ParcelRemovedFromDeliveryMessageImpl of(){
        return new ParcelRemovedFromDeliveryMessageImpl();
    }
    

    public static ParcelRemovedFromDeliveryMessageImpl of(final ParcelRemovedFromDeliveryMessage template) {
        ParcelRemovedFromDeliveryMessageImpl instance = new ParcelRemovedFromDeliveryMessageImpl();
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
        instance.setDeliveryId(template.getDeliveryId());
        instance.setParcel(template.getParcel());
        return instance;
    }

    default <T extends Accessor<ParcelRemovedFromDeliveryMessage>> T withParcelRemovedFromDeliveryMessage(Function<ParcelRemovedFromDeliveryMessage, T> helper) {
        return helper.apply(this);
    }
}
