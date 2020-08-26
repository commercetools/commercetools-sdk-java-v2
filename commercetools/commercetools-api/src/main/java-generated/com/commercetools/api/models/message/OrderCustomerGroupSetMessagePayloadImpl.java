package com.commercetools.api.models.message;

import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.commercetools.api.models.message.MessagePayload;
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
public final class OrderCustomerGroupSetMessagePayloadImpl implements OrderCustomerGroupSetMessagePayload {

    private String type;
    
    private com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup;
    
    private com.commercetools.api.models.customer_group.CustomerGroupReference oldCustomerGroup;

    @JsonCreator
    OrderCustomerGroupSetMessagePayloadImpl(@JsonProperty("customerGroup") final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup, @JsonProperty("oldCustomerGroup") final com.commercetools.api.models.customer_group.CustomerGroupReference oldCustomerGroup) {
        this.customerGroup = customerGroup;
        this.oldCustomerGroup = oldCustomerGroup;
        this.type = "OrderCustomerGroupSet";
    }
    public OrderCustomerGroupSetMessagePayloadImpl() {
       
    }

    
    public String getType(){
        return this.type;
    }
    
    
    public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroup(){
        return this.customerGroup;
    }
    
    
    public com.commercetools.api.models.customer_group.CustomerGroupReference getOldCustomerGroup(){
        return this.oldCustomerGroup;
    }

    public void setCustomerGroup(final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup){
        this.customerGroup = customerGroup;
    }
    
    public void setOldCustomerGroup(final com.commercetools.api.models.customer_group.CustomerGroupReference oldCustomerGroup){
        this.oldCustomerGroup = oldCustomerGroup;
    }

}
