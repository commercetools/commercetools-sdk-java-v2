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
public final class CustomerAddressRemovedMessagePayloadImpl implements CustomerAddressRemovedMessagePayload {

    private String type;
    
    private com.commercetools.api.models.common.Address address;

    @JsonCreator
    CustomerAddressRemovedMessagePayloadImpl(@JsonProperty("address") final com.commercetools.api.models.common.Address address) {
        this.address = address;
        this.type = "CustomerAddressRemoved";
    }
    public CustomerAddressRemovedMessagePayloadImpl() {
       
    }

    
    public String getType(){
        return this.type;
    }
    
    
    public com.commercetools.api.models.common.Address getAddress(){
        return this.address;
    }

    public void setAddress(final com.commercetools.api.models.common.Address address){
        this.address = address;
    }

}
