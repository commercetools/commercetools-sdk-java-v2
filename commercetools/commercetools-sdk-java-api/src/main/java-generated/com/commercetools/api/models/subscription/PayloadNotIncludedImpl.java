package com.commercetools.api.models.subscription;


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
public final class PayloadNotIncludedImpl implements PayloadNotIncluded {

    private String reason;
    
    private String payloadType;

    @JsonCreator
    PayloadNotIncludedImpl(@JsonProperty("reason") final String reason, @JsonProperty("payloadType") final String payloadType) {
        this.reason = reason;
        this.payloadType = payloadType;
    }
    public PayloadNotIncludedImpl() {
       
    }

    
    public String getReason(){
        return this.reason;
    }
    
    
    public String getPayloadType(){
        return this.payloadType;
    }

    public void setReason(final String reason){
        this.reason = reason;
    }
    
    public void setPayloadType(final String payloadType){
        this.payloadType = payloadType;
    }

}
