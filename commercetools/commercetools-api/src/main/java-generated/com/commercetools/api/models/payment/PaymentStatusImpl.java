package com.commercetools.api.models.payment;

import com.commercetools.api.models.state.StateReference;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class PaymentStatusImpl implements PaymentStatus {

    private String interfaceCode;
    
    private String interfaceText;
    
    private com.commercetools.api.models.state.StateReference state;

    @JsonCreator
    PaymentStatusImpl(@JsonProperty("interfaceCode") final String interfaceCode, @JsonProperty("interfaceText") final String interfaceText, @JsonProperty("state") final com.commercetools.api.models.state.StateReference state) {
        this.interfaceCode = interfaceCode;
        this.interfaceText = interfaceText;
        this.state = state;
    }
    public PaymentStatusImpl() {
       
    }

    /**
    *  <p>A code describing the current status returned by the interface that processes the payment.</p>
    */
    public String getInterfaceCode(){
        return this.interfaceCode;
    }
    
    /**
    *  <p>A text describing the current status returned by the interface that processes the payment.</p>
    */
    public String getInterfaceText(){
        return this.interfaceText;
    }
    
    
    public com.commercetools.api.models.state.StateReference getState(){
        return this.state;
    }

    public void setInterfaceCode(final String interfaceCode){
        this.interfaceCode = interfaceCode;
    }
    
    public void setInterfaceText(final String interfaceText){
        this.interfaceText = interfaceText;
    }
    
    public void setState(final com.commercetools.api.models.state.StateReference state){
        this.state = state;
    }

}
