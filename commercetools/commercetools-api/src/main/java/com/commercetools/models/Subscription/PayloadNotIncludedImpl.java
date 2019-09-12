package com.commercetools.models.Subscription;

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
public final class PayloadNotIncludedImpl implements PayloadNotIncluded {

   private java.lang.String reason;
   
   private java.lang.String payloadType;

   @JsonCreator
   PayloadNotIncludedImpl(@JsonProperty("reason") final java.lang.String reason, @JsonProperty("payloadType") final java.lang.String payloadType) {
      this.reason = reason;
      this.payloadType = payloadType;
   }
   public PayloadNotIncludedImpl() {
      
   }
   
   
   public java.lang.String getReason(){
      return this.reason;
   }
   
   
   public java.lang.String getPayloadType(){
      return this.payloadType;
   }

   public void setReason(final java.lang.String reason){
      this.reason = reason;
   }
   
   public void setPayloadType(final java.lang.String payloadType){
      this.payloadType = payloadType;
   }

}