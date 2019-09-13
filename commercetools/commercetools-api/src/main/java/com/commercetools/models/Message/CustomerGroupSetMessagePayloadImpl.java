package com.commercetools.models.message;

import com.commercetools.models.customer_group.CustomerGroupReference;
import com.commercetools.models.message.MessagePayload;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerGroupSetMessagePayloadImpl implements CustomerGroupSetMessagePayload {

   private java.lang.String type;
   
   private com.commercetools.models.customer_group.CustomerGroupReference customerGroup;

   @JsonCreator
   CustomerGroupSetMessagePayloadImpl(@JsonProperty("customerGroup") final com.commercetools.models.customer_group.CustomerGroupReference customerGroup) {
      this.customerGroup = customerGroup;
      this.type = "CustomerGroupSet";
   }
   public CustomerGroupSetMessagePayloadImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public com.commercetools.models.customer_group.CustomerGroupReference getCustomerGroup(){
      return this.customerGroup;
   }

   public void setCustomerGroup(final com.commercetools.models.customer_group.CustomerGroupReference customerGroup){
      this.customerGroup = customerGroup;
   }

}