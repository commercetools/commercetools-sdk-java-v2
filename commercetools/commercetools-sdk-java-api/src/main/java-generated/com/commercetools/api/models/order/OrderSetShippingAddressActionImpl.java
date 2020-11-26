package com.commercetools.api.models.order;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.order.OrderUpdateAction;
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
public final class OrderSetShippingAddressActionImpl implements OrderSetShippingAddressAction {

    private String action;
    
    private com.commercetools.api.models.common.Address address;

    @JsonCreator
    OrderSetShippingAddressActionImpl(@JsonProperty("address") final com.commercetools.api.models.common.Address address) {
        this.address = address;
        this.action = "setShippingAddress";
    }
    public OrderSetShippingAddressActionImpl() {
        this.action = "setShippingAddress";
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
