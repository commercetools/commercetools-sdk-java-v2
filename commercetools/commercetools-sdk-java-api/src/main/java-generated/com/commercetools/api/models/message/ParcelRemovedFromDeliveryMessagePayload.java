
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
@JsonDeserialize(as = ParcelRemovedFromDeliveryMessagePayloadImpl.class)
public interface ParcelRemovedFromDeliveryMessagePayload extends OrderMessagePayload {

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

    public static ParcelRemovedFromDeliveryMessagePayload of() {
        return new ParcelRemovedFromDeliveryMessagePayloadImpl();
    }

    public static ParcelRemovedFromDeliveryMessagePayload of(final ParcelRemovedFromDeliveryMessagePayload template) {
        ParcelRemovedFromDeliveryMessagePayloadImpl instance = new ParcelRemovedFromDeliveryMessagePayloadImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setParcel(template.getParcel());
        return instance;
    }

    public static ParcelRemovedFromDeliveryMessagePayloadBuilder builder() {
        return ParcelRemovedFromDeliveryMessagePayloadBuilder.of();
    }

    public static ParcelRemovedFromDeliveryMessagePayloadBuilder builder(
            final ParcelRemovedFromDeliveryMessagePayload template) {
        return ParcelRemovedFromDeliveryMessagePayloadBuilder.of(template);
    }

    default <T> T withParcelRemovedFromDeliveryMessagePayload(
            Function<ParcelRemovedFromDeliveryMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ParcelRemovedFromDeliveryMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ParcelRemovedFromDeliveryMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ParcelRemovedFromDeliveryMessagePayload>";
            }
        };
    }
}
