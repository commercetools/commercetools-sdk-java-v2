package com.commercetools.models.customer;

import com.commercetools.models.customer.AnonymousCartSignInMode;
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
public final class CustomerSigninImpl implements CustomerSignin {

   private java.lang.String anonymousId;
   
   private java.lang.String password;
   
   private com.commercetools.models.customer.AnonymousCartSignInMode anonymousCartSignInMode;
   
   private java.lang.String anonymousCartId;
   
   private java.lang.String email;

   @JsonCreator
   CustomerSigninImpl(@JsonProperty("anonymousId") final java.lang.String anonymousId, @JsonProperty("password") final java.lang.String password, @JsonProperty("anonymousCartSignInMode") final com.commercetools.models.customer.AnonymousCartSignInMode anonymousCartSignInMode, @JsonProperty("anonymousCartId") final java.lang.String anonymousCartId, @JsonProperty("email") final java.lang.String email) {
      this.anonymousId = anonymousId;
      this.password = password;
      this.anonymousCartSignInMode = anonymousCartSignInMode;
      this.anonymousCartId = anonymousCartId;
      this.email = email;
   }
   public CustomerSigninImpl() {
      
   }
   
   
   public java.lang.String getAnonymousId(){
      return this.anonymousId;
   }
   
   
   public java.lang.String getPassword(){
      return this.password;
   }
   
   
   public com.commercetools.models.customer.AnonymousCartSignInMode getAnonymousCartSignInMode(){
      return this.anonymousCartSignInMode;
   }
   
   
   public java.lang.String getAnonymousCartId(){
      return this.anonymousCartId;
   }
   
   
   public java.lang.String getEmail(){
      return this.email;
   }

   public void setAnonymousId(final java.lang.String anonymousId){
      this.anonymousId = anonymousId;
   }
   
   public void setPassword(final java.lang.String password){
      this.password = password;
   }
   
   public void setAnonymousCartSignInMode(final com.commercetools.models.customer.AnonymousCartSignInMode anonymousCartSignInMode){
      this.anonymousCartSignInMode = anonymousCartSignInMode;
   }
   
   public void setAnonymousCartId(final java.lang.String anonymousCartId){
      this.anonymousCartId = anonymousCartId;
   }
   
   public void setEmail(final java.lang.String email){
      this.email = email;
   }

}