package com.commercetools.api.generated.models.category;

import com.commercetools.api.generated.models.category.CategoryUpdateAction;
import com.commercetools.api.generated.models.type.TypeResourceIdentifier;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CategorySetAssetCustomTypeActionImpl implements CategorySetAssetCustomTypeAction {

   private String action;
   
   private String assetId;
   
   private JsonNode fields;
   
   private com.commercetools.api.generated.models.type.TypeResourceIdentifier type;
   
   private String assetKey;

   @JsonCreator
   CategorySetAssetCustomTypeActionImpl(@JsonProperty("assetId") final String assetId, @JsonProperty("fields") final JsonNode fields, @JsonProperty("type") final com.commercetools.api.generated.models.type.TypeResourceIdentifier type, @JsonProperty("assetKey") final String assetKey) {
      this.assetId = assetId;
      this.fields = fields;
      this.type = type;
      this.assetKey = assetKey;
      this.action = "setAssetCustomType";
   }
   public CategorySetAssetCustomTypeActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getAssetId(){
      return this.assetId;
   }
   
   /**
   *  <p>If set, the custom fields are set to this new value.</p>
   */
   public JsonNode getFields(){
      return this.fields;
   }
   
   /**
   *  <p>If set, the custom type is set to this new value.
   *  If absent, the custom type and any existing custom fields are removed.</p>
   */
   public com.commercetools.api.generated.models.type.TypeResourceIdentifier getType(){
      return this.type;
   }
   
   
   public String getAssetKey(){
      return this.assetKey;
   }

   public void setAssetId(final String assetId){
      this.assetId = assetId;
   }
   
   public void setFields(final JsonNode fields){
      this.fields = fields;
   }
   
   public void setType(final com.commercetools.api.generated.models.type.TypeResourceIdentifier type){
      this.type = type;
   }
   
   public void setAssetKey(final String assetKey){
      this.assetKey = assetKey;
   }

}