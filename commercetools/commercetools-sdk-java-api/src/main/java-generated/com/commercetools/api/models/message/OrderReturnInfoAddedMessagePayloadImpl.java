package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.order.ReturnInfo;
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
public final class OrderReturnInfoAddedMessagePayloadImpl implements OrderReturnInfoAddedMessagePayload {

    private String type;
    
    private com.commercetools.api.models.order.ReturnInfo returnInfo;

    @JsonCreator
    OrderReturnInfoAddedMessagePayloadImpl(@JsonProperty("returnInfo") final com.commercetools.api.models.order.ReturnInfo returnInfo) {
        this.returnInfo = returnInfo;
        this.type = "ReturnInfoAdded";
    }
    public OrderReturnInfoAddedMessagePayloadImpl() {
       
    }

    
    public String getType(){
        return this.type;
    }
    
    
    public com.commercetools.api.models.order.ReturnInfo getReturnInfo(){
        return this.returnInfo;
    }

    public void setReturnInfo(final com.commercetools.api.models.order.ReturnInfo returnInfo){
        this.returnInfo = returnInfo;
    }

}
