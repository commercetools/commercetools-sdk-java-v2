package com.commercetools.models.Error;

import com.commercetools.models.Error.ErrorObject;
import java.lang.Long;
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
public final class ConcurrentModificationErrorImpl implements ConcurrentModificationError {

   private java.lang.String code;
   
   private java.lang.String message;
   
   private java.lang.Long currentVersion;

   @JsonCreator
   ConcurrentModificationErrorImpl(@JsonProperty("message") final java.lang.String message, @JsonProperty("currentVersion") final java.lang.Long currentVersion) {
      this.message = message;
      this.currentVersion = currentVersion;
      this.code = "ConcurrentModification";
   }
   public ConcurrentModificationErrorImpl() {
      
   }
   
   
   public java.lang.String getCode(){
      return this.code;
   }
   
   
   public java.lang.String getMessage(){
      return this.message;
   }
   
   
   public java.lang.Long getCurrentVersion(){
      return this.currentVersion;
   }

   public void setMessage(final java.lang.String message){
      this.message = message;
   }
   
   public void setCurrentVersion(final java.lang.Long currentVersion){
      this.currentVersion = currentVersion;
   }

}