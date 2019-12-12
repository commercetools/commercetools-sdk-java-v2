package com.commercetools.api.generated.models.project;

import com.commercetools.api.generated.models.project.ProjectUpdateAction;
import com.commercetools.api.generated.models.project.ProjectUpdateImpl;

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
@JsonDeserialize(as = ProjectUpdateImpl.class)
public interface ProjectUpdate  {

   
   @NotNull
   @JsonProperty("version")
   public Long getVersion();
   
   @NotNull
   @Valid
   @JsonProperty("actions")
   public List<ProjectUpdateAction> getActions();

   public void setVersion(final Long version);
   
   public void setActions(final List<ProjectUpdateAction> actions);
   
   public static ProjectUpdateImpl of(){
      return new ProjectUpdateImpl();
   }
   

   public static ProjectUpdateImpl of(final ProjectUpdate template) {
      ProjectUpdateImpl instance = new ProjectUpdateImpl();
      instance.setActions(template.getActions());
      instance.setVersion(template.getVersion());
      return instance;
   }

}