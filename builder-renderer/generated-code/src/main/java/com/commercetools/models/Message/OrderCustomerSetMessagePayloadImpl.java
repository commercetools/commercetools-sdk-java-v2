package com.commercetools.models.Message;

import com.commercetools.models.Customer.CustomerReference;
import com.commercetools.models.CustomerGroup.CustomerGroupReference;
import com.commercetools.models.Message.MessagePayload;
import java.lang.String;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderCustomerSetMessagePayloadImpl implements OrderCustomerSetMessagePayload {

   private java.lang.String type;
   
   private com.commercetools.models.CustomerGroup.CustomerGroupReference oldCustomerGroup;
   
   private com.commercetools.models.CustomerGroup.CustomerGroupReference customerGroup;
   
   private com.commercetools.models.Customer.CustomerReference oldCustomer;
   
   private com.commercetools.models.Customer.CustomerReference customer;

   @JsonCreator
   OrderCustomerSetMessagePayloadImpl(@JsonProperty("oldCustomerGroup") final com.commercetools.models.CustomerGroup.CustomerGroupReference oldCustomerGroup, @JsonProperty("customerGroup") final com.commercetools.models.CustomerGroup.CustomerGroupReference customerGroup, @JsonProperty("oldCustomer") final com.commercetools.models.Customer.CustomerReference oldCustomer, @JsonProperty("customer") final com.commercetools.models.Customer.CustomerReference customer) {
      this.oldCustomerGroup = oldCustomerGroup;
      this.customerGroup = customerGroup;
      this.oldCustomer = oldCustomer;
      this.customer = customer;
      this.type = "OrderCustomerSet";
   }
   public OrderCustomerSetMessagePayloadImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public com.commercetools.models.CustomerGroup.CustomerGroupReference getOldCustomerGroup(){
      return this.oldCustomerGroup;
   }
   
   
   public com.commercetools.models.CustomerGroup.CustomerGroupReference getCustomerGroup(){
      return this.customerGroup;
   }
   
   
   public com.commercetools.models.Customer.CustomerReference getOldCustomer(){
      return this.oldCustomer;
   }
   
   
   public com.commercetools.models.Customer.CustomerReference getCustomer(){
      return this.customer;
   }

   public void setOldCustomerGroup(final com.commercetools.models.CustomerGroup.CustomerGroupReference oldCustomerGroup){
      this.oldCustomerGroup = oldCustomerGroup;
   }
   
   public void setCustomerGroup(final com.commercetools.models.CustomerGroup.CustomerGroupReference customerGroup){
      this.customerGroup = customerGroup;
   }
   
   public void setOldCustomer(final com.commercetools.models.Customer.CustomerReference oldCustomer){
      this.oldCustomer = oldCustomer;
   }
   
   public void setCustomer(final com.commercetools.models.Customer.CustomerReference customer){
      this.customer = customer;
   }

}