package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.payment.Payment;
import com.commercetools.api.models.message.PaymentCreatedMessagePayloadImpl;

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
@JsonDeserialize(as = PaymentCreatedMessagePayloadImpl.class)
public interface PaymentCreatedMessagePayload extends MessagePayload {

    
    @NotNull
    @Valid
    @JsonProperty("payment")
    public Payment getPayment();

    public void setPayment(final Payment payment);

    public static PaymentCreatedMessagePayload of(){
        return new PaymentCreatedMessagePayloadImpl();
    }
    

    public static PaymentCreatedMessagePayload of(final PaymentCreatedMessagePayload template) {
        PaymentCreatedMessagePayloadImpl instance = new PaymentCreatedMessagePayloadImpl();
        instance.setPayment(template.getPayment());
        return instance;
    }

    public static PaymentCreatedMessagePayloadBuilder builder(){
        return PaymentCreatedMessagePayloadBuilder.of();
    }
    
    public static PaymentCreatedMessagePayloadBuilder builder(final PaymentCreatedMessagePayload template){
        return PaymentCreatedMessagePayloadBuilder.of(template);
    }
    

    default <T> T withPaymentCreatedMessagePayload(Function<PaymentCreatedMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
