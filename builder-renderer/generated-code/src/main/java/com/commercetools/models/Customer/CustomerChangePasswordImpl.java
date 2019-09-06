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
public final class CustomerChangePasswordImpl implements CustomerChangePassword {

   private java.lang.String newPassword;
   
   private java.lang.String id;
   
   private java.lang.Long version;
   
   private java.lang.String currentPassword;

   @JsonCreator
   CustomerChangePasswordImpl(@JsonProperty("newPassword") final java.lang.String newPassword, @JsonProperty("id") final java.lang.String id, @JsonProperty("version") final java.lang.Long version, @JsonProperty("currentPassword") final java.lang.String currentPassword) {
      this.newPassword = newPassword;
      this.id = id;
      this.version = version;
      this.currentPassword = currentPassword;
   }
   public CustomerChangePasswordImpl() {
      
   }
   
   
   public java.lang.String getNewPassword(){
      return this.newPassword;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }
   
   
   public java.lang.String getCurrentPassword(){
      return this.currentPassword;
   }

   public void setNewPassword(final java.lang.String newPassword){
      this.newPassword = newPassword;
   }
   
   public void setId(final java.lang.String id){
      this.id = id;
   }
   
   public void setVersion(final java.lang.Long version){
      this.version = version;
   }
   
   public void setCurrentPassword(final java.lang.String currentPassword){
      this.currentPassword = currentPassword;
   }

}