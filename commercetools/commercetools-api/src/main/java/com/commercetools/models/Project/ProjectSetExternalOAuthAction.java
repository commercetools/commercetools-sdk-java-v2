package com.commercetools.models.Project;

import com.commercetools.models.Project.ExternalOAuth;
import com.commercetools.models.Project.ProjectUpdateAction;
import java.lang.String;
import com.commercetools.models.Project.ProjectSetExternalOAuthActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
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