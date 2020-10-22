package com.commercetools.api.models.order;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.OrderSetDeliveryAddressActionImpl;

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
@JsonDeserialize(as = OrderSetDeliveryAddressActionImpl.class)
public interface OrderSetDeliveryAddressAction extends OrderUpdateAction {

    
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();
    
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    public void setDeliveryId(final String deliveryId);
    
    public void setAddress(final Address address);

    public static OrderSetDeliveryAddressActionImpl of(){
        return new OrderSetDeliveryAddressActionImpl();
    }
    

    public static OrderSetDeliveryAddressActionImpl of(final OrderSetDeliveryAddressAction template) {
        OrderSetDeliveryAddressActionImpl instance = new OrderSetDeliveryAddressActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setAddress(template.getAddress());
        return instance;
    }

    default <T extends Accessor<OrderSetDeliveryAddressAction>> T withOrderSetDeliveryAddressAction(Function<OrderSetDeliveryAddressAction, T> helper) {
        return helper.apply(this);
    }
}
