package com.commercetools.api.generated.models.customer;


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
public final class CustomerEmailVerifyImpl implements CustomerEmailVerify {

   private String tokenValue;
   
   private Long version;

   @JsonCreator
   CustomerEmailVerifyImpl(@JsonProperty("tokenValue") final String tokenValue, @JsonProperty("version") final Long version) {
      this.tokenValue = tokenValue;
      this.version = version;
   }
   public CustomerEmailVerifyImpl() {
      
   }
   
   
   public String getTokenValue(){
      return this.tokenValue;
   }
   
   
   public Long getVersion(){
      return this.version;
   }

   public void setTokenValue(final String tokenValue){
      this.tokenValue = tokenValue;
   }
   
   public void setVersion(final Long version){
      this.version = version;
   }

}