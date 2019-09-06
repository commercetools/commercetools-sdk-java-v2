package com.commercetools.models.Project;

import com.commercetools.models.Message.MessageConfigurationDraft;
import com.commercetools.models.Project.ProjectUpdateAction;
import java.lang.String;
import com.commercetools.models.Project.ProjectChangeMessagesConfigurationAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProjectChangeMessagesConfigurationActionBuilder {
   
   
   private com.commercetools.models.Message.MessageConfigurationDraft messagesConfiguration;
   
   public ProjectChangeMessagesConfigurationActionBuilder messagesConfiguration( final com.commercetools.models.Message.MessageConfigurationDraft messagesConfiguration) {
      this.messagesConfiguration = messagesConfiguration;
      return this;
   }
   
   
   public com.commercetools.models.Message.MessageConfigurationDraft getMessagesConfiguration(){
      return this.messagesConfiguration;
   }

   public ProjectChangeMessagesConfigurationAction build() {
       return new ProjectChangeMessagesConfigurationActionImpl(messagesConfiguration);
   }
   
   public static ProjectChangeMessagesConfigurationActionBuilder of() {
      return new ProjectChangeMessagesConfigurationActionBuilder();
   }
   
   public static ProjectChangeMessagesConfigurationActionBuilder of(final ProjectChangeMessagesConfigurationAction template) {
      ProjectChangeMessagesConfigurationActionBuilder builder = new ProjectChangeMessagesConfigurationActionBuilder();
      builder.messagesConfiguration = template.getMessagesConfiguration();
      return builder;
   }
   
}