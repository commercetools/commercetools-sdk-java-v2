package com.commercetools.api.generated.models.project;

import com.commercetools.api.generated.models.project.ExternalOAuth;
import com.commercetools.api.generated.models.project.ProjectUpdateAction;
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
public final class ProjectSetExternalOAuthActionImpl implements ProjectSetExternalOAuthAction {

   private String action;
   
   private com.commercetools.api.generated.models.project.ExternalOAuth externalOAuth;

   @JsonCreator
   ProjectSetExternalOAuthActionImpl(@JsonProperty("externalOAuth") final com.commercetools.api.generated.models.project.ExternalOAuth externalOAuth) {
      this.externalOAuth = externalOAuth;
      this.action = "setExternalOAuth";
   }
   public ProjectSetExternalOAuthActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   /**
   *  <p>If you do not provide the <code>externalOAuth</code> field or provide a value
   *  of <code>null</code>, the update action unsets the External OAuth provider.</p>
   */
   public com.commercetools.api.generated.models.project.ExternalOAuth getExternalOAuth(){
      return this.externalOAuth;
   }

   public void setExternalOAuth(final com.commercetools.api.generated.models.project.ExternalOAuth externalOAuth){
      this.externalOAuth = externalOAuth;
   }

}