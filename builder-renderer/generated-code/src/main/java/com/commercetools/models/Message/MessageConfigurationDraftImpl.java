package com.commercetools.models.Message;

import java.lang.Boolean;
import java.lang.Integer;
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
public final class MessageConfigurationDraftImpl implements MessageConfigurationDraft {

   private java.lang.Integer deleteDaysAfterCreation;
   
   private java.lang.Boolean enabled;

   @JsonCreator
   MessageConfigurationDraftImpl(@JsonProperty("deleteDaysAfterCreation") final java.lang.Integer deleteDaysAfterCreation, @JsonProperty("enabled") final java.lang.Boolean enabled) {
      this.deleteDaysAfterCreation = deleteDaysAfterCreation;
      this.enabled = enabled;
   }
   public MessageConfigurationDraftImpl() {
      
   }
   
   
   public java.lang.Integer getDeleteDaysAfterCreation(){
      return this.deleteDaysAfterCreation;
   }
   
   
   public java.lang.Boolean getEnabled(){
      return this.enabled;
   }

   public void setDeleteDaysAfterCreation(final java.lang.Integer deleteDaysAfterCreation){
      this.deleteDaysAfterCreation = deleteDaysAfterCreation;
   }
   
   public void setEnabled(final java.lang.Boolean enabled){
      this.enabled = enabled;
   }

}