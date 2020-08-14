package com.commercetools.api.models.me;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.me.MyCustomerUpdateAction;
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
public final class MyCustomerChangeAddressActionImpl implements MyCustomerChangeAddressAction {

    private String action;
    
    private String addressId;
    
    private com.commercetools.api.models.common.Address address;

    @JsonCreator
    MyCustomerChangeAddressActionImpl(@JsonProperty("addressId") final String addressId, @JsonProperty("address") final com.commercetools.api.models.common.Address address) {
        this.addressId = addressId;
        this.address = address;
        this.action = "changeAddress";
    }
    public MyCustomerChangeAddressActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getAddressId(){
        return this.addressId;
    }
    
    
    public com.commercetools.api.models.common.Address getAddress(){
        return this.address;
    }

    public void setAddressId(final String addressId){
        this.addressId = addressId;
    }
    
    public void setAddress(final com.commercetools.api.models.common.Address address){
        this.address = address;
    }

}
