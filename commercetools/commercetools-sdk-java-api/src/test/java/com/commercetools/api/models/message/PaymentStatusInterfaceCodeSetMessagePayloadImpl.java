package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


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
        this.type =  PAYMENT_STATUS_INTERFACE_CODE_SET;
    }
    public PaymentStatusInterfaceCodeSetMessagePayloadImpl() {
        this.type =  PAYMENT_STATUS_INTERFACE_CODE_SET;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        PaymentStatusInterfaceCodeSetMessagePayloadImpl that = (PaymentStatusInterfaceCodeSetMessagePayloadImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(paymentId, that.paymentId)
                .append(interfaceCode, that.interfaceCode)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(paymentId)
            .append(interfaceCode)
            .toHashCode();
    }

}
