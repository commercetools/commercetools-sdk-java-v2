package com.commercetools.models.message;

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
public final class OrderCustomerEmailSetMessagePayloadImpl implements OrderCustomerEmailSetMessagePayload {

   private java.lang.String type;
   
   private java.lang.String oldEmail;
   
   private java.lang.String email;

   @JsonCreator
   OrderCustomerEmailSetMessagePayloadImpl(@JsonProperty("oldEmail") final java.lang.String oldEmail, @JsonProperty("email") final java.lang.String email) {
      this.oldEmail = oldEmail;
      this.email = email;
      this.type = "OrderCustomerEmailSet";
   }
   public OrderCustomerEmailSetMessagePayloadImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public java.lang.String getOldEmail(){
      return this.oldEmail;
   }
   
   
   public java.lang.String getEmail(){
      return this.email;
   }

   public void setOldEmail(final java.lang.String oldEmail){
      this.oldEmail = oldEmail;
   }
   
   public void setEmail(final java.lang.String email){
      this.email = email;
   }

}