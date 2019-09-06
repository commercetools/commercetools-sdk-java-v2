package com.commercetools.models.CustomerGroup;

import com.commercetools.models.Type.CustomFields;
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
public final class CustomerGroupDraftImpl implements CustomerGroupDraft {

   private java.lang.String groupName;
   
   private com.commercetools.models.Type.CustomFields custom;
   
   private java.lang.String key;

   @JsonCreator
   CustomerGroupDraftImpl(@JsonProperty("groupName") final java.lang.String groupName, @JsonProperty("custom") final com.commercetools.models.Type.CustomFields custom, @JsonProperty("key") final java.lang.String key) {
      this.groupName = groupName;
      this.custom = custom;
      this.key = key;
   }
   public CustomerGroupDraftImpl() {
      
   }
   
   
   public java.lang.String getGroupName(){
      return this.groupName;
   }
   
   
   public com.commercetools.models.Type.CustomFields getCustom(){
      return this.custom;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }

   public void setGroupName(final java.lang.String groupName){
      this.groupName = groupName;
   }
   
   public void setCustom(final com.commercetools.models.Type.CustomFields custom){
      this.custom = custom;
   }
   
   public void setKey(final java.lang.String key){
      this.key = key;
   }

}