
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Address;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = DeliveryAddressSetMessageImpl.class)
public interface DeliveryAddressSetMessage extends Message {

    String DELIVERY_ADDRESS_SET = "DeliveryAddressSet";

    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    @Valid
    @JsonProperty("address")
    public Address getAddress();

    @Valid
    @JsonProperty("oldAddress")
    public Address getOldAddress();

    public void setDeliveryId(final String deliveryId);

    public void setAddress(final Address address);

    public void setOldAddress(final Address oldAddress);

    public static DeliveryAddressSetMessage of() {
        return new DeliveryAddressSetMessageImpl();
    }

    public static DeliveryAddressSetMessage of(final DeliveryAddressSetMessage template) {
        DeliveryAddressSetMessageImpl instance = new DeliveryAddressSetMessageImpl();
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
        instance.setAddress(template.getAddress());
        instance.setOldAddress(template.getOldAddress());
        return instance;
    }

    public static DeliveryAddressSetMessageBuilder builder() {
        return DeliveryAddressSetMessageBuilder.of();
    }

    public static DeliveryAddressSetMessageBuilder builder(final DeliveryAddressSetMessage template) {
        return DeliveryAddressSetMessageBuilder.of(template);
    }

    default <T> T withDeliveryAddressSetMessage(Function<DeliveryAddressSetMessage, T> helper) {
        return helper.apply(this);
    }
}
