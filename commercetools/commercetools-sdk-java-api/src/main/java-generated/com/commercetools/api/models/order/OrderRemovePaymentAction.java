package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.payment.PaymentResourceIdentifier;
import com.commercetools.api.models.order.OrderRemovePaymentActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = OrderRemovePaymentActionImpl.class)
public interface OrderRemovePaymentAction extends OrderUpdateAction {

    String REMOVE_PAYMENT = "removePayment";

    
    @NotNull
    @Valid
    @JsonProperty("payment")
    public PaymentResourceIdentifier getPayment();

    
    public void setPayment(final PaymentResourceIdentifier payment);
    

    public static OrderRemovePaymentAction of(){
        return new OrderRemovePaymentActionImpl();
    }
    

    public static OrderRemovePaymentAction of(final OrderRemovePaymentAction template) {
        OrderRemovePaymentActionImpl instance = new OrderRemovePaymentActionImpl();
        instance.setPayment(template.getPayment());
        return instance;
    }

    public static OrderRemovePaymentActionBuilder builder(){
        return OrderRemovePaymentActionBuilder.of();
    }
    
    public static OrderRemovePaymentActionBuilder builder(final OrderRemovePaymentAction template){
        return OrderRemovePaymentActionBuilder.of(template);
    }
    

    default <T> T withOrderRemovePaymentAction(Function<OrderRemovePaymentAction, T> helper) {
        return helper.apply(this);
    }
}
