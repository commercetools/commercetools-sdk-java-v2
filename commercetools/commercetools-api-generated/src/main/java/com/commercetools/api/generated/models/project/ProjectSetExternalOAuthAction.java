package com.commercetools.api.generated.models.project;

import com.commercetools.api.generated.models.project.ExternalOAuth;
import com.commercetools.api.generated.models.project.ProjectUpdateAction;
import com.commercetools.api.generated.models.project.ProjectSetExternalOAuthActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProjectSetExternalOAuthActionImpl.class)
public interface ProjectSetExternalOAuthAction extends ProjectUpdateAction {

   
   @Valid
   @JsonProperty("externalOAuth")
   public ExternalOAuth getExternalOAuth();

   public void setExternalOAuth(final ExternalOAuth externalOAuth);
   
   public static ProjectSetExternalOAuthActionImpl of(){
      return new ProjectSetExternalOAuthActionImpl();
   }
   

   public static ProjectSetExternalOAuthActionImpl of(final ProjectSetExternalOAuthAction template) {
      ProjectSetExternalOAuthActionImpl instance = new ProjectSetExternalOAuthActionImpl();
      instance.setExternalOAuth(template.getExternalOAuth());
      return instance;
   }

}