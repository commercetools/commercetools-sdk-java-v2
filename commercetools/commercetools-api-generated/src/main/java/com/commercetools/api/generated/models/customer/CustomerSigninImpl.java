package com.commercetools.api.generated.models.customer;

import com.commercetools.api.generated.models.customer.AnonymousCartSignInMode;
import io.vrap.rmf.base.client.utils.Generated;
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

   private Boolean updateProductData;
   
   private String anonymousId;
   
   private String password;
   
   private com.commercetools.api.generated.models.customer.AnonymousCartSignInMode anonymousCartSignInMode;
   
   private String anonymousCartId;
   
   private String email;

   @JsonCreator
   CustomerSigninImpl(@JsonProperty("updateProductData") final Boolean updateProductData, @JsonProperty("anonymousId") final String anonymousId, @JsonProperty("password") final String password, @JsonProperty("anonymousCartSignInMode") final com.commercetools.api.generated.models.customer.AnonymousCartSignInMode anonymousCartSignInMode, @JsonProperty("anonymousCartId") final String anonymousCartId, @JsonProperty("email") final String email) {
      this.updateProductData = updateProductData;
      this.anonymousId = anonymousId;
      this.password = password;
      this.anonymousCartSignInMode = anonymousCartSignInMode;
      this.anonymousCartId = anonymousCartId;
      this.email = email;
   }
   public CustomerSigninImpl() {
      
   }
   
   
   public Boolean getUpdateProductData(){
      return this.updateProductData;
   }
   
   
   public String getAnonymousId(){
      return this.anonymousId;
   }
   
   
   public String getPassword(){
      return this.password;
   }
   
   
   public com.commercetools.api.generated.models.customer.AnonymousCartSignInMode getAnonymousCartSignInMode(){
      return this.anonymousCartSignInMode;
   }
   
   
   public String getAnonymousCartId(){
      return this.anonymousCartId;
   }
   
   
   public String getEmail(){
      return this.email;
   }

   public void setUpdateProductData(final Boolean updateProductData){
      this.updateProductData = updateProductData;
   }
   
   public void setAnonymousId(final String anonymousId){
      this.anonymousId = anonymousId;
   }
   
   public void setPassword(final String password){
      this.password = password;
   }
   
   public void setAnonymousCartSignInMode(final com.commercetools.api.generated.models.customer.AnonymousCartSignInMode anonymousCartSignInMode){
      this.anonymousCartSignInMode = anonymousCartSignInMode;
   }
   
   public void setAnonymousCartId(final String anonymousCartId){
      this.anonymousCartId = anonymousCartId;
   }
   
   public void setEmail(final String email){
      this.email = email;
   }

}