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
public final class CustomerResetPasswordImpl implements CustomerResetPassword {

   private String newPassword;
   
   private Long version;
   
   private String tokenValue;

   @JsonCreator
   CustomerResetPasswordImpl(@JsonProperty("newPassword") final String newPassword, @JsonProperty("version") final Long version, @JsonProperty("tokenValue") final String tokenValue) {
      this.newPassword = newPassword;
      this.version = version;
      this.tokenValue = tokenValue;
   }
   public CustomerResetPasswordImpl() {
      
   }
   
   
   public String getNewPassword(){
      return this.newPassword;
   }
   
   
   public Long getVersion(){
      return this.version;
   }
   
   
   public String getTokenValue(){
      return this.tokenValue;
   }

   public void setNewPassword(final String newPassword){
      this.newPassword = newPassword;
   }
   
   public void setVersion(final Long version){
      this.version = version;
   }
   
   public void setTokenValue(final String tokenValue){
      this.tokenValue = tokenValue;
   }

}