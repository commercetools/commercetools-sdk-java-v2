package com.commercetools.api.generated.models.project;

import com.commercetools.api.generated.models.message.MessageConfigurationDraft;
import com.commercetools.api.generated.models.project.ProjectUpdateAction;
import com.commercetools.api.generated.models.project.ProjectChangeMessagesConfigurationAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProjectChangeMessagesConfigurationActionBuilder {
   
   
   private com.commercetools.api.generated.models.message.MessageConfigurationDraft messagesConfiguration;
   
   public ProjectChangeMessagesConfigurationActionBuilder messagesConfiguration( final com.commercetools.api.generated.models.message.MessageConfigurationDraft messagesConfiguration) {
      this.messagesConfiguration = messagesConfiguration;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.message.MessageConfigurationDraft getMessagesConfiguration(){
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