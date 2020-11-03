package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
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
public final class StagedOrderSetDeliveryAddressActionImpl implements StagedOrderSetDeliveryAddressAction {

    private String action;
    
    private String deliveryId;
    
    private com.commercetools.api.models.common.Address address;

    @JsonCreator
    StagedOrderSetDeliveryAddressActionImpl(@JsonProperty("deliveryId") final String deliveryId, @JsonProperty("address") final com.commercetools.api.models.common.Address address) {
        this.deliveryId = deliveryId;
        this.address = address;
        this.action = "setDeliveryAddress";
    }
    public StagedOrderSetDeliveryAddressActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getDeliveryId(){
        return this.deliveryId;
    }
    
    
    public com.commercetools.api.models.common.Address getAddress(){
        return this.address;
    }

    public void setDeliveryId(final String deliveryId){
        this.deliveryId = deliveryId;
    }
    
    public void setAddress(final com.commercetools.api.models.common.Address address){
        this.address = address;
    }

}
