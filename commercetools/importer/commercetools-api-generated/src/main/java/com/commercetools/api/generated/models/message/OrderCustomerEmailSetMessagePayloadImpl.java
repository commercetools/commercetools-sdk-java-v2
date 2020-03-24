package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
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
public final class OrderCustomerEmailSetMessagePayloadImpl implements OrderCustomerEmailSetMessagePayload {

   private String type;
   
   private String oldEmail;
   
   private String email;

   @JsonCreator
   OrderCustomerEmailSetMessagePayloadImpl(@JsonProperty("oldEmail") final String oldEmail, @JsonProperty("email") final String email) {
      this.oldEmail = oldEmail;
      this.email = email;
      this.type = "OrderCustomerEmailSet";
   }
   public OrderCustomerEmailSetMessagePayloadImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public String getOldEmail(){
      return this.oldEmail;
   }
   
   
   public String getEmail(){
      return this.email;
   }

   public void setOldEmail(final String oldEmail){
      this.oldEmail = oldEmail;
   }
   
   public void setEmail(final String email){
      this.email = email;
   }

}