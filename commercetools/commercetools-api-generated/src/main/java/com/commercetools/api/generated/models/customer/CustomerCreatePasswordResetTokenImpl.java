package com.commercetools.api.generated.models.customer;


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
public final class CustomerCreatePasswordResetTokenImpl implements CustomerCreatePasswordResetToken {

   private Long ttlMinutes;
   
   private String email;

   @JsonCreator
   CustomerCreatePasswordResetTokenImpl(@JsonProperty("ttlMinutes") final Long ttlMinutes, @JsonProperty("email") final String email) {
      this.ttlMinutes = ttlMinutes;
      this.email = email;
   }
   public CustomerCreatePasswordResetTokenImpl() {
      
   }
   
   
   public Long getTtlMinutes(){
      return this.ttlMinutes;
   }
   
   
   public String getEmail(){
      return this.email;
   }

   public void setTtlMinutes(final Long ttlMinutes){
      this.ttlMinutes = ttlMinutes;
   }
   
   public void setEmail(final String email){
      this.email = email;
   }

}