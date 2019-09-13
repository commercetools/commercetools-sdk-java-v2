package com.commercetools.models.project;

import com.commercetools.models.message.MessageConfigurationDraft;
import com.commercetools.models.project.ProjectUpdateAction;
import java.lang.String;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProjectChangeMessagesConfigurationActionImpl implements ProjectChangeMessagesConfigurationAction {

   private java.lang.String action;
   
   private com.commercetools.models.message.MessageConfigurationDraft messagesConfiguration;

   @JsonCreator
   ProjectChangeMessagesConfigurationActionImpl(@JsonProperty("messagesConfiguration") final com.commercetools.models.message.MessageConfigurationDraft messagesConfiguration) {
      this.messagesConfiguration = messagesConfiguration;
      this.action = "changeMessagesConfiguration";
   }
   public ProjectChangeMessagesConfigurationActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.message.MessageConfigurationDraft getMessagesConfiguration(){
      return this.messagesConfiguration;
   }

   public void setMessagesConfiguration(final com.commercetools.models.message.MessageConfigurationDraft messagesConfiguration){
      this.messagesConfiguration = messagesConfiguration;
   }

}