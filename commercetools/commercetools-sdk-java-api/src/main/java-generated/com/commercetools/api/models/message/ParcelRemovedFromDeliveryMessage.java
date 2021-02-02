
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.Parcel;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ParcelRemovedFromDeliveryMessageImpl.class)
public interface ParcelRemovedFromDeliveryMessage extends Message {

    String PARCEL_REMOVED_FROM_DELIVERY = "ParcelRemovedFromDelivery";

    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    @NotNull
    @Valid
    @JsonProperty("parcel")
    public Parcel getParcel();

    public void setDeliveryId(final String deliveryId);

    public void setParcel(final Parcel parcel);

    public static ParcelRemovedFromDeliveryMessage of() {
        return new ParcelRemovedFromDeliveryMessageImpl();
    }

    public static ParcelRemovedFromDeliveryMessage of(final ParcelRemovedFromDeliveryMessage template) {
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

    public static ParcelRemovedFromDeliveryMessageBuilder builder() {
        return ParcelRemovedFromDeliveryMessageBuilder.of();
    }

    public static ParcelRemovedFromDeliveryMessageBuilder builder(final ParcelRemovedFromDeliveryMessage template) {
        return ParcelRemovedFromDeliveryMessageBuilder.of(template);
    }

    default <T> T withParcelRemovedFromDeliveryMessage(Function<ParcelRemovedFromDeliveryMessage, T> helper) {
        return helper.apply(this);
    }
}
