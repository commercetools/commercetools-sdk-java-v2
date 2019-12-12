package com.commercetools.api.generated.models.error;

import com.commercetools.api.generated.models.error.ErrorObject;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class InvalidItemShippingDetailsErrorImpl implements InvalidItemShippingDetailsError {

   private String code;
   
   private String message;
   
   private String itemId;
   
   private String subject;

   @JsonCreator
   InvalidItemShippingDetailsErrorImpl(@JsonProperty("message") final String message, @JsonProperty("itemId") final String itemId, @JsonProperty("subject") final String subject) {
      this.message = message;
      this.itemId = itemId;
      this.subject = subject;
      this.code = "InvalidItemShippingDetails";
   }
   public InvalidItemShippingDetailsErrorImpl() {
      
   }
   
   
   public String getCode(){
      return this.code;
   }
   
   
   public String getMessage(){
      return this.message;
   }
   
   
   public String getItemId(){
      return this.itemId;
   }
   
   
   public String getSubject(){
      return this.subject;
   }

   public void setMessage(final String message){
      this.message = message;
   }
   
   public void setItemId(final String itemId){
      this.itemId = itemId;
   }
   
   public void setSubject(final String subject){
      this.subject = subject;
   }

}