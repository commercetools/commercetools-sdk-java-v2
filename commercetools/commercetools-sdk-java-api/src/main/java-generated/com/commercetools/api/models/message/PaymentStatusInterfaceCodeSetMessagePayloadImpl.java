package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
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
public final class PaymentStatusInterfaceCodeSetMessagePayloadImpl implements PaymentStatusInterfaceCodeSetMessagePayload {

    private String type;
    
    private String paymentId;
    
    private String interfaceCode;

    @JsonCreator
    PaymentStatusInterfaceCodeSetMessagePayloadImpl(@JsonProperty("paymentId") final String paymentId, @JsonProperty("interfaceCode") final String interfaceCode) {
        this.paymentId = paymentId;
        this.interfaceCode = interfaceCode;
        this.type = "PaymentStatusInterfaceCodeSet";
    }
    public PaymentStatusInterfaceCodeSetMessagePayloadImpl() {
       
    }

    
    public String getType(){
        return this.type;
    }
    
    
    public String getPaymentId(){
        return this.paymentId;
    }
    
    
    public String getInterfaceCode(){
        return this.interfaceCode;
    }

    public void setPaymentId(final String paymentId){
        this.paymentId = paymentId;
    }
    
    public void setInterfaceCode(final String interfaceCode){
        this.interfaceCode = interfaceCode;
    }

}
