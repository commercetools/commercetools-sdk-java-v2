package com.commercetools.api.models.project;

import com.commercetools.api.models.project.ProjectUpdateAction;
import com.commercetools.api.models.project.ProjectChangeMessagesEnabledActionImpl;

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
