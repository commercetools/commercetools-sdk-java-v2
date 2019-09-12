package com.commercetools.models.Customer;

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
public final class CustomerCreatePasswordResetTokenImpl implements CustomerCreatePasswordResetToken {

   private java.lang.Long ttlMinutes;
   
   private java.lang.String email;

   @JsonCreator
   CustomerCreatePasswordResetTokenImpl(@JsonProperty("ttlMinutes") final java.lang.Long ttlMinutes, @JsonProperty("email") final java.lang.String email) {
      this.ttlMinutes = ttlMinutes;
      this.email = email;
   }
   public CustomerCreatePasswordResetTokenImpl() {
      
   }
   
   
   public java.lang.Long getTtlMinutes(){
      return this.ttlMinutes;
   }
   
   
   public java.lang.String getEmail(){
      return this.email;
   }

   public void setTtlMinutes(final java.lang.Long ttlMinutes){
      this.ttlMinutes = ttlMinutes;
   }
   
   public void setEmail(final java.lang.String email){
      this.email = email;
   }

}