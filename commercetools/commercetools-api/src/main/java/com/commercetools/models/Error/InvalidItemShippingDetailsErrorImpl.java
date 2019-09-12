package com.commercetools.models.Error;

import com.commercetools.models.Error.ErrorObject;
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
public final class InvalidItemShippingDetailsErrorImpl implements InvalidItemShippingDetailsError {

   private java.lang.String code;
   
   private java.lang.String message;
   
   private java.lang.String itemId;
   
   private java.lang.String subject;

   @JsonCreator
   InvalidItemShippingDetailsErrorImpl(@JsonProperty("message") final java.lang.String message, @JsonProperty("itemId") final java.lang.String itemId, @JsonProperty("subject") final java.lang.String subject) {
      this.message = message;
      this.itemId = itemId;
      this.subject = subject;
      this.code = "InvalidItemShippingDetails";
   }
   public InvalidItemShippingDetailsErrorImpl() {
      
   }
   
   
   public java.lang.String getCode(){
      return this.code;
   }
   
   
   public java.lang.String getMessage(){
      return this.message;
   }
   
   
   public java.lang.String getItemId(){
      return this.itemId;
   }
   
   
   public java.lang.String getSubject(){
      return this.subject;
   }

   public void setMessage(final java.lang.String message){
      this.message = message;
   }
   
   public void setItemId(final java.lang.String itemId){
      this.itemId = itemId;
   }
   
   public void setSubject(final java.lang.String subject){
      this.subject = subject;
   }

}