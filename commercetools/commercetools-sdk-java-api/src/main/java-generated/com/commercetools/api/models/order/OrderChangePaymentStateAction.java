package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.PaymentState;
import com.commercetools.api.models.order.OrderChangePaymentStateActionImpl;

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
@JsonDeserialize(as = OrderChangePaymentStateActionImpl.class)
public interface OrderChangePaymentStateAction extends OrderUpdateAction {

    
    
    @JsonProperty("paymentState")
    public PaymentState getPaymentState();

    public void setPaymentState(final PaymentState paymentState);

    public static OrderChangePaymentStateActionImpl of(){
        return new OrderChangePaymentStateActionImpl();
    }
    

    public static OrderChangePaymentStateActionImpl of(final OrderChangePaymentStateAction template) {
        OrderChangePaymentStateActionImpl instance = new OrderChangePaymentStateActionImpl();
        instance.setPaymentState(template.getPaymentState());
        return instance;
    }

    default <T extends Accessor<OrderChangePaymentStateAction>> T withOrderChangePaymentStateAction(Function<OrderChangePaymentStateAction, T> helper) {
        return helper.apply(this);
    }
}
