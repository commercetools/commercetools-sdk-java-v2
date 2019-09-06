package com.commercetools.models.Project;

import com.commercetools.models.Project.ProjectUpdateAction;
import java.lang.String;
import com.commercetools.models.Project.ProjectChangeNameActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProjectChangeNameActionImpl.class)
public interface ProjectChangeNameAction extends ProjectUpdateAction {

   
   @NotNull
   @JsonProperty("name")
   public String getName();

   public void setName(final String name);
   
   public static ProjectChangeNameActionImpl of(){
      return new ProjectChangeNameActionImpl();
   }
   

   public static ProjectChangeNameActionImpl of(final ProjectChangeNameAction template) {
      ProjectChangeNameActionImpl instance = new ProjectChangeNameActionImpl();
      instance.setName(template.getName());
      return instance;
   }

}