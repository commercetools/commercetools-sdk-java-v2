package com.commercetools.models.ApiClient;

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
public final class ApiClientDraftImpl implements ApiClientDraft {

   private java.lang.Long deleteDaysAfterCreation;
   
   private java.lang.String scope;
   
   private java.lang.String name;

   @JsonCreator
   ApiClientDraftImpl(@JsonProperty("deleteDaysAfterCreation") final java.lang.Long deleteDaysAfterCreation, @JsonProperty("scope") final java.lang.String scope, @JsonProperty("name") final java.lang.String name) {
      this.deleteDaysAfterCreation = deleteDaysAfterCreation;
      this.scope = scope;
      this.name = name;
   }
   public ApiClientDraftImpl() {
      
   }
   
   
   public java.lang.Long getDeleteDaysAfterCreation(){
      return this.deleteDaysAfterCreation;
   }
   
   
   public java.lang.String getScope(){
      return this.scope;
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }

   public void setDeleteDaysAfterCreation(final java.lang.Long deleteDaysAfterCreation){
      this.deleteDaysAfterCreation = deleteDaysAfterCreation;
   }
   
   public void setScope(final java.lang.String scope){
      this.scope = scope;
   }
   
   public void setName(final java.lang.String name){
      this.name = name;
   }

}