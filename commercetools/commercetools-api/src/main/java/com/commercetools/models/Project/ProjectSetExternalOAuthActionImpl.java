package com.commercetools.models.Project;

import com.commercetools.models.Project.ExternalOAuth;
import com.commercetools.models.Project.ProjectUpdateAction;
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
public final class ProjectSetExternalOAuthActionImpl implements ProjectSetExternalOAuthAction {

   private java.lang.String action;
   
   private com.commercetools.models.Project.ExternalOAuth externalOAuth;

   @JsonCreator
   ProjectSetExternalOAuthActionImpl(@JsonProperty("externalOAuth") final com.commercetools.models.Project.ExternalOAuth externalOAuth) {
      this.externalOAuth = externalOAuth;
      this.action = "setExternalOAuth";
   }
   public ProjectSetExternalOAuthActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.Project.ExternalOAuth getExternalOAuth(){
      return this.externalOAuth;
   }

   public void setExternalOAuth(final com.commercetools.models.Project.ExternalOAuth externalOAuth){
      this.externalOAuth = externalOAuth;
   }

}