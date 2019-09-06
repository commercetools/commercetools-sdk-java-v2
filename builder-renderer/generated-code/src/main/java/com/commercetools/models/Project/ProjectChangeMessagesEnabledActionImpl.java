package com.commercetools.models.Project;

import com.commercetools.models.Project.ProjectUpdateAction;
import java.lang.Boolean;
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
public final class ProjectChangeMessagesEnabledActionImpl implements ProjectChangeMessagesEnabledAction {

   private java.lang.String action;
   
   private java.lang.Boolean messagesEnabled;

   @JsonCreator
   ProjectChangeMessagesEnabledActionImpl(@JsonProperty("messagesEnabled") final java.lang.Boolean messagesEnabled) {
      this.messagesEnabled = messagesEnabled;
      this.action = "changeMessagesEnabled";
   }
   public ProjectChangeMessagesEnabledActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.Boolean getMessagesEnabled(){
      return this.messagesEnabled;
   }

   public void setMessagesEnabled(final java.lang.Boolean messagesEnabled){
      this.messagesEnabled = messagesEnabled;
   }

}