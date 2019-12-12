package com.commercetools.api.generated.models.category;

import com.commercetools.api.generated.models.category.CategoryUpdateAction;
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
public final class CategorySetAssetCustomFieldActionImpl implements CategorySetAssetCustomFieldAction {

   private String action;
   
   private String assetId;
   
   private String name;
   
   private JsonNode value;
   
   private String assetKey;

   @JsonCreator
   CategorySetAssetCustomFieldActionImpl(@JsonProperty("assetId") final String assetId, @JsonProperty("name") final String name, @JsonProperty("value") final JsonNode value, @JsonProperty("assetKey") final String assetKey) {
      this.assetId = assetId;
      this.name = name;
      this.value = value;
      this.assetKey = assetKey;
      this.action = "setAssetCustomField";
   }
   public CategorySetAssetCustomFieldActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getAssetId(){
      return this.assetId;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   
   public JsonNode getValue(){
      return this.value;
   }
   
   
   public String getAssetKey(){
      return this.assetKey;
   }

   public void setAssetId(final String assetId){
      this.assetId = assetId;
   }
   
   public void setName(final String name){
      this.name = name;
   }
   
   public void setValue(final JsonNode value){
      this.value = value;
   }
   
   public void setAssetKey(final String assetKey){
      this.assetKey = assetKey;
   }

}