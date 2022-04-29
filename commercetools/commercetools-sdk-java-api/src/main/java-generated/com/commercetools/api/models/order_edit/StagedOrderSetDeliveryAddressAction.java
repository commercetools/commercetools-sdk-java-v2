
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.BaseAddress;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetDeliveryAddressActionImpl.class)
public interface StagedOrderSetDeliveryAddressAction extends StagedOrderUpdateAction {

    String SET_DELIVERY_ADDRESS = "setDeliveryAddress";

    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    @Valid
    @JsonProperty("address")
    public BaseAddress getAddress();

    public void setDeliveryId(final String deliveryId);

    public void setAddress(final BaseAddress address);

    public static StagedOrderSetDeliveryAddressAction of() {
        return new StagedOrderSetDeliveryAddressActionImpl();
    }

    public static StagedOrderSetDeliveryAddressAction of(final StagedOrderSetDeliveryAddressAction template) {
        StagedOrderSetDeliveryAddressActionImpl instance = new StagedOrderSetDeliveryAddressActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static StagedOrderSetDeliveryAddressActionBuilder builder() {
        return StagedOrderSetDeliveryAddressActionBuilder.of();
    }

    public static StagedOrderSetDeliveryAddressActionBuilder builder(
            final StagedOrderSetDeliveryAddressAction template) {
        return StagedOrderSetDeliveryAddressActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetDeliveryAddressAction(Function<StagedOrderSetDeliveryAddressAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetDeliveryAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetDeliveryAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetDeliveryAddressAction>";
            }
        };
    }
}
