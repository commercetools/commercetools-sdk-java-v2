package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.OrderRemoveItemShippingAddressActionImpl;

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
@JsonDeserialize(as = OrderRemoveItemShippingAddressActionImpl.class)
public interface OrderRemoveItemShippingAddressAction extends OrderUpdateAction {

    
    @NotNull
    @JsonProperty("addressKey")
    public String getAddressKey();

    public void setAddressKey(final String addressKey);

    public static OrderRemoveItemShippingAddressActionImpl of(){
        return new OrderRemoveItemShippingAddressActionImpl();
    }
    

    public static OrderRemoveItemShippingAddressActionImpl of(final OrderRemoveItemShippingAddressAction template) {
        OrderRemoveItemShippingAddressActionImpl instance = new OrderRemoveItemShippingAddressActionImpl();
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    default <T extends Accessor<OrderRemoveItemShippingAddressAction>> T withOrderRemoveItemShippingAddressAction(Function<OrderRemoveItemShippingAddressAction, T> helper) {
        return helper.apply(this);
    }
}
