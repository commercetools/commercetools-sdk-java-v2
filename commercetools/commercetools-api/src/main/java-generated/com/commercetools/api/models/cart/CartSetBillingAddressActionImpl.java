package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.common.Address;
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
public final class CartSetBillingAddressActionImpl implements CartSetBillingAddressAction {

    private String action;
    
    private com.commercetools.api.models.common.Address address;

    @JsonCreator
    CartSetBillingAddressActionImpl(@JsonProperty("address") final com.commercetools.api.models.common.Address address) {
        this.address = address;
        this.action = "setBillingAddress";
    }
    public CartSetBillingAddressActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public com.commercetools.api.models.common.Address getAddress(){
        return this.address;
    }

    public void setAddress(final com.commercetools.api.models.common.Address address){
        this.address = address;
    }

}
