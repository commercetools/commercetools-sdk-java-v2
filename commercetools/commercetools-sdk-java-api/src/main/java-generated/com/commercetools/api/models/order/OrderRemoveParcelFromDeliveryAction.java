
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderRemoveParcelFromDeliveryActionImpl.class)
public interface OrderRemoveParcelFromDeliveryAction extends OrderUpdateAction {

    String REMOVE_PARCEL_FROM_DELIVERY = "removeParcelFromDelivery";

    @NotNull
    @JsonProperty("parcelId")
    public String getParcelId();

    public void setParcelId(final String parcelId);

    public static OrderRemoveParcelFromDeliveryAction of() {
        return new OrderRemoveParcelFromDeliveryActionImpl();
    }

    public static OrderRemoveParcelFromDeliveryAction of(final OrderRemoveParcelFromDeliveryAction template) {
        OrderRemoveParcelFromDeliveryActionImpl instance = new OrderRemoveParcelFromDeliveryActionImpl();
        instance.setParcelId(template.getParcelId());
        return instance;
    }

    public static OrderRemoveParcelFromDeliveryActionBuilder builder() {
        return OrderRemoveParcelFromDeliveryActionBuilder.of();
    }

    public static OrderRemoveParcelFromDeliveryActionBuilder builder(
            final OrderRemoveParcelFromDeliveryAction template) {
        return OrderRemoveParcelFromDeliveryActionBuilder.of(template);
    }

    default <T> T withOrderRemoveParcelFromDeliveryAction(Function<OrderRemoveParcelFromDeliveryAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderRemoveParcelFromDeliveryAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderRemoveParcelFromDeliveryAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderRemoveParcelFromDeliveryAction>";
            }
        };
    }
}
