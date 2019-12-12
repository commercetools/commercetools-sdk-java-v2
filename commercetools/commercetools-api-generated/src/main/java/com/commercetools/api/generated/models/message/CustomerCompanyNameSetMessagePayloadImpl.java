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
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerCompanyNameSetMessagePayloadImpl implements CustomerCompanyNameSetMessagePayload {

   private String type;
   
   private String companyName;

   @JsonCreator
   CustomerCompanyNameSetMessagePayloadImpl(@JsonProperty("companyName") final String companyName) {
      this.companyName = companyName;
      this.type = "CustomerCompanyNameSet";
   }
   public CustomerCompanyNameSetMessagePayloadImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public String getCompanyName(){
      return this.companyName;
   }

   public void setCompanyName(final String companyName){
      this.companyName = companyName;
   }

}