package com.commercetools.api.models.order;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.OrderSetShippingAddressActionImpl;

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
@JsonDeserialize(as = OrderSetShippingAddressActionImpl.class)
public interface OrderSetShippingAddressAction extends OrderUpdateAction {

    
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    public void setAddress(final Address address);

    public static OrderSetShippingAddressActionImpl of(){
        return new OrderSetShippingAddressActionImpl();
    }
    

    public static OrderSetShippingAddressActionImpl of(final OrderSetShippingAddressAction template) {
        OrderSetShippingAddressActionImpl instance = new OrderSetShippingAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    default <T extends Accessor<OrderSetShippingAddressAction>> T withOrderSetShippingAddressAction(Function<OrderSetShippingAddressAction, T> helper) {
        return helper.apply(this);
    }
}
