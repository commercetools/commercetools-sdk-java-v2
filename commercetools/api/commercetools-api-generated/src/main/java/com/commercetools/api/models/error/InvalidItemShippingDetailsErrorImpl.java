package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
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
public final class InvalidItemShippingDetailsErrorImpl implements InvalidItemShippingDetailsError {

   private String code;
   
   private String message;
   
   private String subject;
   
   private String itemId;

   @JsonCreator
   InvalidItemShippingDetailsErrorImpl(@JsonProperty("message") final String message, @JsonProperty("subject") final String subject, @JsonProperty("itemId") final String itemId) {
      this.message = message;
      this.subject = subject;
      this.itemId = itemId;
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
   
   
   public String getSubject(){
      return this.subject;
   }
   
   
   public String getItemId(){
      return this.itemId;
   }

   public void setMessage(final String message){
      this.message = message;
   }
   
   public void setSubject(final String subject){
      this.subject = subject;
   }
   
   public void setItemId(final String itemId){
      this.itemId = itemId;
   }

}
