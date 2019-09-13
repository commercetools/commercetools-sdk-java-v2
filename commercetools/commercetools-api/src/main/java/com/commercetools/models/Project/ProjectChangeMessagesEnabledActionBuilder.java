package com.commercetools.models.project;

import com.commercetools.models.project.ProjectUpdateAction;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.project.ProjectChangeMessagesEnabledAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProjectChangeMessagesEnabledActionBuilder {
   
   
   private java.lang.Boolean messagesEnabled;
   
   public ProjectChangeMessagesEnabledActionBuilder messagesEnabled( final java.lang.Boolean messagesEnabled) {
      this.messagesEnabled = messagesEnabled;
      return this;
   }
   
   
   public java.lang.Boolean getMessagesEnabled(){
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