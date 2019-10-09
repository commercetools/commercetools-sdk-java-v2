package com.commercetools.models.project;

import com.commercetools.models.project.ProjectUpdateAction;
import com.commercetools.models.project.ProjectChangeMessagesEnabledAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProjectChangeMessagesEnabledActionBuilder {
   
   
   private Boolean messagesEnabled;
   
   public ProjectChangeMessagesEnabledActionBuilder messagesEnabled( final Boolean messagesEnabled) {
      this.messagesEnabled = messagesEnabled;
      return this;
   }
   
   
   public Boolean getMessagesEnabled(){
      return this.messagesEnabled;
   }

   public ProjectChangeMessagesEnabledAction build() {
       return new ProjectChangeMessagesEnabledActionImpl(messagesEnabled);
   }
   
   public static ProjectChangeMessagesEnabledActionBuilder of() {
      return new ProjectChangeMessagesEnabledActionBuilder();
   }
   
   public static ProjectChangeMessagesEnabledActionBuilder of(final ProjectChangeMessagesEnabledAction template) {
      ProjectChangeMessagesEnabledActionBuilder builder = new ProjectChangeMessagesEnabledActionBuilder();
      builder.messagesEnabled = template.getMessagesEnabled();
      return builder;
   }
   
}