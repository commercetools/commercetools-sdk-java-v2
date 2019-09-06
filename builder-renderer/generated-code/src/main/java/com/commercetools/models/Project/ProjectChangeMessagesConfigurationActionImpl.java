package com.commercetools.models.Project;

import com.commercetools.models.Message.MessageConfigurationDraft;
import com.commercetools.models.Project.ProjectUpdateAction;
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

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProjectChangeMessagesConfigurationActionImpl implements ProjectChangeMessagesConfigurationAction {

   private java.lang.String action;
   
   private com.commercetools.models.Message.MessageConfigurationDraft messagesConfiguration;

   @JsonCreator
   ProjectChangeMessagesConfigurationActionImpl(@JsonProperty("messagesConfiguration") final com.commercetools.models.Message.MessageConfigurationDraft messagesConfiguration) {
      this.messagesConfiguration = messagesConfiguration;
      this.action = "changeMessagesConfiguration";
   }
   public ProjectChangeMessagesConfigurationActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.Message.MessageConfigurationDraft getMessagesConfiguration(){
      return this.messagesConfiguration;
   }

   public void setMessagesConfiguration(final com.commercetools.models.Message.MessageConfigurationDraft messagesConfiguration){
      this.messagesConfiguration = messagesConfiguration;
   }

}