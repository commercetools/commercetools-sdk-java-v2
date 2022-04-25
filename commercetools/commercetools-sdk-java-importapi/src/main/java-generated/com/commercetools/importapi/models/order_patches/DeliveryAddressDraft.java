
package com.commercetools.importapi.models.order_patches;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.Address;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = DeliveryAddressDraftImpl.class)
public interface DeliveryAddressDraft {

    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    @Valid
    @JsonProperty("address")
    public Address getAddress();

    public void setDeliveryId(final String deliveryId);

    public void setAddress(final Address address);

    public static DeliveryAddressDraft of() {
        return new DeliveryAddressDraftImpl();
    }

    public static DeliveryAddressDraft of(final DeliveryAddressDraft template) {
        DeliveryAddressDraftImpl instance = new DeliveryAddressDraftImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static DeliveryAddressDraftBuilder builder() {
        return DeliveryAddressDraftBuilder.of();
    }

    public static DeliveryAddressDraftBuilder builder(final DeliveryAddressDraft template) {
        return DeliveryAddressDraftBuilder.of(template);
    }

    default <T> T withDeliveryAddressDraft(Function<DeliveryAddressDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DeliveryAddressDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DeliveryAddressDraft>() {
            @Override
            public String toString() {
                return "TypeReference<DeliveryAddressDraft>";
            }
        };
    }
}
