package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.payment.Payment;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class PaymentCreatedMessagePayloadImpl implements PaymentCreatedMessagePayload {

    private String type;
    
    private com.commercetools.api.models.payment.Payment payment;

    @JsonCreator
    PaymentCreatedMessagePayloadImpl(@JsonProperty("payment") final com.commercetools.api.models.payment.Payment payment) {
        this.payment = payment;
        this.type = "PaymentCreated";
    }
    public PaymentCreatedMessagePayloadImpl() {
        this.type = "PaymentCreated";
    }

    
    public String getType(){
        return this.type;
    }
    
    
    public com.commercetools.api.models.payment.Payment getPayment(){
        return this.payment;
    }

    public void setPayment(final com.commercetools.api.models.payment.Payment payment){
        this.payment = payment;
    }

}
