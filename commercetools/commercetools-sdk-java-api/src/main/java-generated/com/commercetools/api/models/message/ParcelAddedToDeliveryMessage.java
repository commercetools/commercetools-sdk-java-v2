
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.Delivery;
import com.commercetools.api.models.order.Parcel;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ParcelAddedToDeliveryMessageImpl.class)
public interface ParcelAddedToDeliveryMessage extends Message {

    String PARCEL_ADDED_TO_DELIVERY = "ParcelAddedToDelivery";

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

    public static ParcelAddedToDeliveryMessage of() {
        return new ParcelAddedToDeliveryMessageImpl();
    }

    public static ParcelAddedToDeliveryMessage of(final ParcelAddedToDeliveryMessage template) {
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

    public static ParcelAddedToDeliveryMessageBuilder builder() {
        return ParcelAddedToDeliveryMessageBuilder.of();
    }

    public static ParcelAddedToDeliveryMessageBuilder builder(final ParcelAddedToDeliveryMessage template) {
        return ParcelAddedToDeliveryMessageBuilder.of(template);
    }

    default <T> T withParcelAddedToDeliveryMessage(Function<ParcelAddedToDeliveryMessage, T> helper) {
        return helper.apply(this);
    }
}
