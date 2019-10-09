package com.commercetools.models.project;

import com.commercetools.models.project.ProjectUpdateAction;
import com.commercetools.models.project.ProjectChangeMessagesEnabledActionImpl;

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
@JsonDeserialize(as = ProjectChangeMessagesEnabledActionImpl.class)
public interface ProjectChangeMessagesEnabledAction extends ProjectUpdateAction {

   
   @NotNull
   @JsonProperty("messagesEnabled")
   public Boolean getMessagesEnabled();

   public void setMessagesEnabled(final Boolean messagesEnabled);
   
   public static ProjectChangeMessagesEnabledActionImpl of(){
      return new ProjectChangeMessagesEnabledActionImpl();
   }
   

   public static ProjectChangeMessagesEnabledActionImpl of(final ProjectChangeMessagesEnabledAction template) {
      ProjectChangeMessagesEnabledActionImpl instance = new ProjectChangeMessagesEnabledActionImpl();
      instance.setMessagesEnabled(template.getMessagesEnabled());
      return instance;
   }

}