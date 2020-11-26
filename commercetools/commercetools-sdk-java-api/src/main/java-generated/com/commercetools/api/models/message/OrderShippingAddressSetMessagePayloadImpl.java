package com.commercetools.api.models.message;

import com.commercetools.api.models.common.Address;
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
public final class OrderShippingAddressSetMessagePayloadImpl implements OrderShippingAddressSetMessagePayload {

    private String type;
    
    private com.commercetools.api.models.common.Address address;
    
    private com.commercetools.api.models.common.Address oldAddress;

    @JsonCreator
    OrderShippingAddressSetMessagePayloadImpl(@JsonProperty("address") final com.commercetools.api.models.common.Address address, @JsonProperty("oldAddress") final com.commercetools.api.models.common.Address oldAddress) {
        this.address = address;
        this.oldAddress = oldAddress;
        this.type = "OrderShippingAddressSet";
    }
    public OrderShippingAddressSetMessagePayloadImpl() {
        this.type = "OrderShippingAddressSet";
    }

    
    public String getType(){
        return this.type;
    }
    
    
    public com.commercetools.api.models.common.Address getAddress(){
        return this.address;
    }
    
    
    public com.commercetools.api.models.common.Address getOldAddress(){
        return this.oldAddress;
    }

    public void setAddress(final com.commercetools.api.models.common.Address address){
        this.address = address;
    }
    
    public void setOldAddress(final com.commercetools.api.models.common.Address oldAddress){
        this.oldAddress = oldAddress;
    }

}
