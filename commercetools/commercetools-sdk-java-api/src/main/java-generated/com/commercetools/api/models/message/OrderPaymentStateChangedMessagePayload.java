package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.order.PaymentState;
import com.commercetools.api.models.message.OrderPaymentStateChangedMessagePayloadImpl;

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
@JsonDeserialize(as = OrderPaymentStateChangedMessagePayloadImpl.class)
public interface OrderPaymentStateChangedMessagePayload extends MessagePayload {

    
    @NotNull
    @JsonProperty("paymentState")
    public PaymentState getPaymentState();
    
    
    @JsonProperty("oldPaymentState")
    public PaymentState getOldPaymentState();

    public void setPaymentState(final PaymentState paymentState);
    
    public void setOldPaymentState(final PaymentState oldPaymentState);

    public static OrderPaymentStateChangedMessagePayloadImpl of(){
        return new OrderPaymentStateChangedMessagePayloadImpl();
    }
    

    public static OrderPaymentStateChangedMessagePayloadImpl of(final OrderPaymentStateChangedMessagePayload template) {
        OrderPaymentStateChangedMessagePayloadImpl instance = new OrderPaymentStateChangedMessagePayloadImpl();
        instance.setPaymentState(template.getPaymentState());
        instance.setOldPaymentState(template.getOldPaymentState());
        return instance;
    }

    default <T> T withOrderPaymentStateChangedMessagePayload(Function<OrderPaymentStateChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
