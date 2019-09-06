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

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerResetPasswordImpl implements CustomerResetPassword {

   private java.lang.String newPassword;
   
   private java.lang.Long version;
   
   private java.lang.String tokenValue;

   @JsonCreator
   CustomerResetPasswordImpl(@JsonProperty("newPassword") final java.lang.String newPassword, @JsonProperty("version") final java.lang.Long version, @JsonProperty("tokenValue") final java.lang.String tokenValue) {
      this.newPassword = newPassword;
      this.version = version;
      this.tokenValue = tokenValue;
   }
   public CustomerResetPasswordImpl() {
      
   }
   
   
   public java.lang.String getNewPassword(){
      return this.newPassword;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }
   
   
   public java.lang.String getTokenValue(){
      return this.tokenValue;
   }

   public void setNewPassword(final java.lang.String newPassword){
      this.newPassword = newPassword;
   }
   
   public void setVersion(final java.lang.Long version){
      this.version = version;
   }
   
   public void setTokenValue(final java.lang.String tokenValue){
      this.tokenValue = tokenValue;
   }

}