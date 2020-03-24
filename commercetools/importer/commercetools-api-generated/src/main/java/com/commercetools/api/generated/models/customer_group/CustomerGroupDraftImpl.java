package com.commercetools.api.generated.models.customer_group;

import com.commercetools.api.generated.models.type.CustomFields;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerGroupDraftImpl implements CustomerGroupDraft {

   private String groupName;
   
   private com.commercetools.api.generated.models.type.CustomFields custom;
   
   private String key;

   @JsonCreator
   CustomerGroupDraftImpl(@JsonProperty("groupName") final String groupName, @JsonProperty("custom") final com.commercetools.api.generated.models.type.CustomFields custom, @JsonProperty("key") final String key) {
      this.groupName = groupName;
      this.custom = custom;
      this.key = key;
   }
   public CustomerGroupDraftImpl() {
      
   }
   
   
   public String getGroupName(){
      return this.groupName;
   }
   
   
   public com.commercetools.api.generated.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   /**
   *  <p>User-specific unique identifier for the customer group.</p>
   */
   public String getKey(){
      return this.key;
   }

   public void setGroupName(final String groupName){
      this.groupName = groupName;
   }
   
   public void setCustom(final com.commercetools.api.generated.models.type.CustomFields custom){
      this.custom = custom;
   }
   
   public void setKey(final String key){
      this.key = key;
   }

}