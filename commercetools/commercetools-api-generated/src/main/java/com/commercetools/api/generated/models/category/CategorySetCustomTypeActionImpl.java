package com.commercetools.api.generated.models.category;

import com.commercetools.api.generated.models.category.CategoryUpdateAction;
import com.commercetools.api.generated.models.type.FieldContainer;
import com.commercetools.api.generated.models.type.TypeResourceIdentifier;
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
public final class CategorySetCustomTypeActionImpl implements CategorySetCustomTypeAction {

   private String action;
   
   private com.commercetools.api.generated.models.type.FieldContainer fields;
   
   private com.commercetools.api.generated.models.type.TypeResourceIdentifier type;

   @JsonCreator
   CategorySetCustomTypeActionImpl(@JsonProperty("fields") final com.commercetools.api.generated.models.type.FieldContainer fields, @JsonProperty("type") final com.commercetools.api.generated.models.type.TypeResourceIdentifier type) {
      this.fields = fields;
      this.type = type;
      this.action = "setCustomType";
   }
   public CategorySetCustomTypeActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   /**
   *  <p>A valid JSON object, based on the FieldDefinitions of the Type. Sets the custom fields to this value.</p>
   */
   public com.commercetools.api.generated.models.type.FieldContainer getFields(){
      return this.fields;
   }
   
   /**
   *  <p>If absent, the custom type and any existing CustomFields are removed.</p>
   */
   public com.commercetools.api.generated.models.type.TypeResourceIdentifier getType(){
      return this.type;
   }

   public void setFields(final com.commercetools.api.generated.models.type.FieldContainer fields){
      this.fields = fields;
   }
   
   public void setType(final com.commercetools.api.generated.models.type.TypeResourceIdentifier type){
      this.type = type;
   }

}