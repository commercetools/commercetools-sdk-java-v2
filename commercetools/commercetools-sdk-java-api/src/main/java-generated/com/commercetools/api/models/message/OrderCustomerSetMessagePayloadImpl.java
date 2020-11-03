package com.commercetools.api.models.message;

import com.commercetools.api.models.customer.CustomerReference;
import com.commercetools.api.models.customer_group.CustomerGroupReference;
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
public final class OrderCustomerSetMessagePayloadImpl implements OrderCustomerSetMessagePayload {

    private String type;
    
    private com.commercetools.api.models.customer.CustomerReference customer;
    
    private com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup;
    
    private com.commercetools.api.models.customer.CustomerReference oldCustomer;
    
    private com.commercetools.api.models.customer_group.CustomerGroupReference oldCustomerGroup;

    @JsonCreator
    OrderCustomerSetMessagePayloadImpl(@JsonProperty("customer") final com.commercetools.api.models.customer.CustomerReference customer, @JsonProperty("customerGroup") final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup, @JsonProperty("oldCustomer") final com.commercetools.api.models.customer.CustomerReference oldCustomer, @JsonProperty("oldCustomerGroup") final com.commercetools.api.models.customer_group.CustomerGroupReference oldCustomerGroup) {
        this.customer = customer;
        this.customerGroup = customerGroup;
        this.oldCustomer = oldCustomer;
        this.oldCustomerGroup = oldCustomerGroup;
        this.type = "OrderCustomerSet";
    }
    public OrderCustomerSetMessagePayloadImpl() {
       
    }

    
    public String getType(){
        return this.type;
    }
    
    
    public com.commercetools.api.models.customer.CustomerReference getCustomer(){
        return this.customer;
    }
    
    
    public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroup(){
        return this.customerGroup;
    }
    
    
    public com.commercetools.api.models.customer.CustomerReference getOldCustomer(){
        return this.oldCustomer;
    }
    
    
    public com.commercetools.api.models.customer_group.CustomerGroupReference getOldCustomerGroup(){
        return this.oldCustomerGroup;
    }

    public void setCustomer(final com.commercetools.api.models.customer.CustomerReference customer){
        this.customer = customer;
    }
    
    public void setCustomerGroup(final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup){
        this.customerGroup = customerGroup;
    }
    
    public void setOldCustomer(final com.commercetools.api.models.customer.CustomerReference oldCustomer){
        this.oldCustomer = oldCustomer;
    }
    
    public void setOldCustomerGroup(final com.commercetools.api.models.customer_group.CustomerGroupReference oldCustomerGroup){
        this.oldCustomerGroup = oldCustomerGroup;
    }

}
