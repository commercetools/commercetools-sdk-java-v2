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
public final class CustomerCompanyNameSetMessagePayloadImpl implements CustomerCompanyNameSetMessagePayload {

   private java.lang.String type;
   
   private java.lang.String companyName;

   @JsonCreator
   CustomerCompanyNameSetMessagePayloadImpl(@JsonProperty("companyName") final java.lang.String companyName) {
      this.companyName = companyName;
      this.type = "CustomerCompanyNameSet";
   }
   public CustomerCompanyNameSetMessagePayloadImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public java.lang.String getCompanyName(){
      return this.companyName;
   }

   public void setCompanyName(final java.lang.String companyName){
      this.companyName = companyName;
   }

}